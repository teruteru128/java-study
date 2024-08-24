package com.github.teruteru128.foreign;

import static com.github.teruteru128.foreign.opencl.opencl_h.CL_DEVICE_TYPE_ALL;
import static com.github.teruteru128.foreign.opencl.opencl_h.CL_KERNEL_WORK_GROUP_SIZE;
import static com.github.teruteru128.foreign.opencl.opencl_h.CL_MEM_READ_WRITE;
import static com.github.teruteru128.foreign.opencl.opencl_h.CL_MEM_COPY_HOST_PTR;
import static com.github.teruteru128.foreign.opencl.opencl_h.CL_TRUE;
import static com.github.teruteru128.foreign.opencl.opencl_h.clBuildProgram;
import static com.github.teruteru128.foreign.opencl.opencl_h.clCreateBuffer;
import static com.github.teruteru128.foreign.opencl.opencl_h.clCreateCommandQueueWithProperties;
import static com.github.teruteru128.foreign.opencl.opencl_h.clCreateContext;
import static com.github.teruteru128.foreign.opencl.opencl_h.clCreateKernel;
import static com.github.teruteru128.foreign.opencl.opencl_h.clCreateProgramWithSource;
import static com.github.teruteru128.foreign.opencl.opencl_h.clEnqueueNDRangeKernel;
import static com.github.teruteru128.foreign.opencl.opencl_h.clEnqueueReadBuffer;
import static com.github.teruteru128.foreign.opencl.opencl_h.clEnqueueWriteBuffer;
import static com.github.teruteru128.foreign.opencl.opencl_h.clFinish;
import static com.github.teruteru128.foreign.opencl.opencl_h.clGetDeviceIDs;
import static com.github.teruteru128.foreign.opencl.opencl_h.clGetKernelWorkGroupInfo;
import static com.github.teruteru128.foreign.opencl.opencl_h.clGetPlatformIDs;
import static com.github.teruteru128.foreign.opencl.opencl_h.clReleaseCommandQueue;
import static com.github.teruteru128.foreign.opencl.opencl_h.clReleaseContext;
import static com.github.teruteru128.foreign.opencl.opencl_h.clReleaseDevice;
import static com.github.teruteru128.foreign.opencl.opencl_h.clReleaseKernel;
import static com.github.teruteru128.foreign.opencl.opencl_h.clReleaseMemObject;
import static com.github.teruteru128.foreign.opencl.opencl_h.clReleaseProgram;
import static com.github.teruteru128.foreign.opencl.opencl_h.clSetKernelArg;
import static com.github.teruteru128.foreign.windows.Windows_h.CloseHandle;
import static com.github.teruteru128.foreign.windows.Windows_h.CreateMutexExA;
import static com.github.teruteru128.foreign.windows.Windows_h.strlen;
import static java.lang.foreign.MemoryLayout.sequenceLayout;
import static java.lang.foreign.MemoryLayout.structLayout;
import static java.lang.foreign.MemoryLayout.unionLayout;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.security.Provider;
import java.security.Security;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Main implements Callable<Void> {

  static final Linker linker = Linker.nativeLinker();
  static final SymbolLookup defaultLookup = linker.defaultLookup();
  private final String[] args;

  public Main(String[] args) {
    this.args = args;
  }

  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, IOException {
    for (var provider : ServiceLoader.load(Provider.class)) {
      if (Security.getProvider(provider.getName()) == null) {
        Security.addProvider(provider);
      }
    }
    var main = new Main(args);
    main.call();
  }

  private static void callback(MemorySegment cal, MemorySegment v) {
    System.out.printf("ウンチが漏れました！: 0x%016x, 0x%016x%n", cal.address(), v.address());
  }

  @Override
  public Void call() throws NoSuchMethodException, IllegalAccessException, IOException {
    // でも本当にほしいのはSocketとかファイルとかMessageDigestとかの連携なんだよね……
    // もしかしてネイティブライブラリにアクセスできるならOpenSSLにアクセスもできる……？
    // OpenCLもアクセスできるっぽい
    var s = args.length >= 1 ? args[0] : "\uD83D\uDCA9";
    var sequenceLayout = sequenceLayout(32, JAVA_BYTE);
    var structLayout = structLayout(JAVA_BYTE.withName("prefix"), sequenceLayout.withName("x"),
        sequenceLayout.withName("y")).withName("b");
    var publicKeyLayout = unionLayout(sequenceLayout(65, JAVA_BYTE).withName("a"), structLayout);
    System.out.println(publicKeyLayout);
    System.loadLibrary("BCrypt");
    ValueLayout.ADDRESS.targetLayout()
        .ifPresent(memoryLayout -> System.out.printf("address value layout: %s%n", memoryLayout));
    try (var arena = Arena.ofConfined()) {
      System.out.printf("strlen(arena.allocateFrom(s)) = %s%n", strlen(arena.allocateFrom(s)));
      int ret;
      if ((ret = cl(arena)) != 0) {
        throw new RuntimeException("cl:" + ret);
      }
      var locale = Locale.setlocale(0, arena.allocateFrom("Japanese_Japan.65001"));
      var len = strlen(locale);
      var loc = locale.reinterpret(len + 1);
      System.out.println(loc.getString(0));
      if ((ret = BCrypt.SHA256(arena, s)) != 0) {
        throw new RuntimeException("BCrypt.SHA256:" + ret);
      }
      if ((ret = mutexSample(arena)) != 0) {
        throw new RuntimeException("mutexSample:" + ret);
      }
    }
    return null;
  }

  public int mutexSample(Arena arena) {
    System.loadLibrary("Kernel32");
    var name = arena.allocateFrom("munchie");
    var mutexHandle = CreateMutexExA(NULL, name, 0, 0);
    if (mutexHandle.equals(NULL)) {
      return 1;
    }
    System.out.println("mutex create test:ok");
    CloseHandle(mutexHandle);
    return 0;
  }

  /**
   * jextractさんマジでありがとう……！ で、どれが再利用可能でどれが再利用不可能なんでしょうね？
   *
   * @param arena メモリ割当
   * @return 正常に終了した場合0、異常時非ゼロ
   * @see <a
   * href="https://docs.oracle.com/javase/jp/21/core/call-native-functions-jextract.html#GUID-480A7E64-531A-4C88-800F-810FF87F24A1">jextract</a>
   */
  private int cl(Arena arena) throws NoSuchMethodException, IllegalAccessException {
    var numEntriesPtr = arena.allocate(JAVA_INT);
    int ret;
    // get number of platforms
    if ((ret = clGetPlatformIDs(0, NULL, numEntriesPtr)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    var numEntries = numEntriesPtr.get(JAVA_INT, 0);
    var platformIds = arena.allocate(ADDRESS, numEntries);

    // get platform ids
    if ((ret = clGetPlatformIDs(numEntries, platformIds, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // デバイス数
    var num_devices = arena.allocate(JAVA_INT);
    var platform = platformIds.get(ADDRESS, 0);
    if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), 0, NULL, num_devices)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // デバイス情報
    var numDevices = num_devices.get(JAVA_INT, 0);
    var deviceIds = arena.allocate(ADDRESS, numDevices);
    if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), numDevices, deviceIds, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // コンテキスト
    var ret_ptr = arena.allocate(JAVA_INT);
    var context = clCreateContext(NULL, numDevices, deviceIds, NULL, NULL, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
    // コマンドキュー
    var device = deviceIds.get(ADDRESS, 0);
    var commandQueue = clCreateCommandQueueWithProperties(context, device, NULL, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
    // ソースコード読み込み
    // ファイルシステムを読み込んでリソースから文字列を読み込む
    // 面倒くさい
    String s;
    try {
      var uri = Objects.requireNonNull(Main.class.getResource("sample.cl")).toURI();
      try (var jarFS = FileSystems.newFileSystem(uri, Map.of("create", "true"))) {
        s = Files.readString(jarFS.provider().getPath(uri));
      }
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
    final var sourceString = arena.allocateFrom(s);
    // プログラムオブジェクトを作成し、ソースコードをプログラムオブジェクトに読み込む
    var program = clCreateProgramWithSource(context, 1, arena.allocateFrom(ADDRESS, sourceString),
        NULL, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      return 1;
    }
    // プログラム実行可能ファイルをビルド(コンパイル及びリンク)する
    var lookup = MethodHandles.lookup();
    var type = MethodType.methodType(void.class, MemorySegment.class, MemorySegment.class);
    var callback1 = lookup.findStatic(getClass(), "callback", type);
    var function = FunctionDescriptor.ofVoid(ADDRESS, ADDRESS);
    var callback = linker.upcallStub(callback1, function, arena);
    if ((ret = clBuildProgram(program, numDevices, deviceIds, NULL, callback, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // カーネルオブジェクトを作成する
    var kernel = clCreateKernel(program, arena.allocateFrom("func"), ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    var workGroupSize = arena.allocate(JAVA_LONG);
    if ((ret = clGetKernelWorkGroupInfo(kernel, device, CL_KERNEL_WORK_GROUP_SIZE(),
        JAVA_LONG.byteSize(), workGroupSize, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    System.out.printf("kernel work group size: %d%n", workGroupSize.get(JAVA_LONG, 0));
    // device オブジェクトをリリースする
    for (int i = 0; i < numDevices; i++) {
      if ((ret = clReleaseDevice(deviceIds.getAtIndex(ADDRESS, i))) != 0) {
        throw new RuntimeException(CLMessage.clGetErrorString(ret));
      }
    }
    // 入出力引数準備
    var num = 1000000;
    var outBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL,
        ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
    // ファイルのデータmemory-mapped file扱いで全部ぶっこめるんじゃねえの？-> 2ファイル……
    var in = arena.allocate(JAVA_BYTE, num);
    for (int i = 0; i < num; i++) {
      in.setAtIndex(JAVA_BYTE, i, (byte) ThreadLocalRandom.current().nextInt(16));
    }
    var inBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE() | CL_MEM_COPY_HOST_PTR(), JAVA_BYTE.byteSize() * num, in,
        ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
    // カーネル引数設定
    if ((ret = clSetKernelArg(kernel, 0, ADDRESS.byteSize(),
        arena.allocateFrom(ADDRESS, outBuffer))) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    if ((ret = clSetKernelArg(kernel, 1, ADDRESS.byteSize(), arena.allocateFrom(ADDRESS, inBuffer)))
        != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // カーネル実行
    var globalWorkSize = arena.allocateFrom(JAVA_LONG, 256*2000, 1, 1);
    var localWorkSize = arena.allocateFrom(JAVA_LONG, 256, 1, 1);
    long start = System.nanoTime();
    if ((ret = clEnqueueNDRangeKernel(commandQueue, kernel, 3, NULL, globalWorkSize, localWorkSize,
        0, NULL, NULL)) != 0) {
      System.err.printf("error!: %s%n", CLMessage.clGetErrorString(ret));
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    clFinish(commandQueue);
    long end = System.nanoTime();
    var out = arena.allocate(JAVA_BYTE, num);
    if ((ret = clEnqueueReadBuffer(commandQueue, outBuffer, CL_TRUE(), 0,
        JAVA_BYTE.byteSize() * num, out, 0, NULL, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    boolean eq = true;
    // チェック
    for (int i = 0; i < num; i++) {
      eq &= (in.getAtIndex(JAVA_BYTE, i) * 3) + 1 == out.getAtIndex(JAVA_BYTE, i);
    }
    System.out.printf("CL: status: %s%n", eq ? "ok" : "ng");
    System.out.printf("CL: %f seconds%n", (end - start) / 1e9);
    clFinish(commandQueue);
    clReleaseMemObject(outBuffer);
    clReleaseMemObject(inBuffer);
    clReleaseCommandQueue(commandQueue);
    clReleaseKernel(kernel);
    clReleaseProgram(program);
    clReleaseContext(context);
    return 0;
  }

}
