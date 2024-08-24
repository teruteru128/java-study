package com.github.teruteru128.foreign;

import static com.github.teruteru128.foreign.opencl.opencl_h.CL_DEVICE_TYPE_ALL;
import static com.github.teruteru128.foreign.opencl.opencl_h.CL_KERNEL_WORK_GROUP_SIZE;
import static com.github.teruteru128.foreign.opencl.opencl_h.CL_MEM_READ_WRITE;
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

  private static void callback() {
    System.out.println("ウンチが漏れました！");
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
      if ((ret = BCrypt.BCryptSHA256(arena, s)) != 0) {
        throw new RuntimeException("BCryptSHA256:" + ret);
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
   * jextractさんマジでありがとう……！
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
    var num_devices = arena.allocate(JAVA_INT);
    var platform = platformIds.get(ADDRESS, 0);
    if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), 0, NULL, num_devices)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    var numDevices = num_devices.get(JAVA_INT, 0);
    var deviceIds = arena.allocate(ADDRESS, numDevices);
    if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), numDevices, deviceIds, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    var ret_ptr = arena.allocate(JAVA_INT);
    var context = clCreateContext(NULL, numDevices, deviceIds, NULL, NULL, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
    var device = deviceIds.get(ADDRESS, 0);
    var commandQueue = clCreateCommandQueueWithProperties(context, device, NULL, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
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
    var program = clCreateProgramWithSource(context, 1, arena.allocateFrom(ADDRESS, sourceString),
        NULL, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      return 1;
    }
    System.out.println("main:" + Thread.currentThread());
    var lookup = MethodHandles.lookup();
    var type = MethodType.methodType(void.class);
    var callback1 = lookup.findStatic(getClass(), "callback", type);
    var function = FunctionDescriptor.ofVoid();
    var callback = linker.upcallStub(callback1, function, arena);
    if ((ret = clBuildProgram(program, 0, NULL, NULL, callback, NULL)) != 0) {
      return ret;
    }
    var kernel = clCreateKernel(program, arena.allocateFrom("func"), ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      return ret_ptr.get(JAVA_INT, 0);
    }
    var workGroupSize = arena.allocate(JAVA_LONG);
    if ((ret = clGetKernelWorkGroupInfo(kernel, device, CL_KERNEL_WORK_GROUP_SIZE(),
        JAVA_LONG.byteSize(), workGroupSize, NULL)) != 0) {
      return ret;
    }
    // device オブジェクトをリリースする
    for (int i = 0; i < numDevices; i++) {
      if ((ret = clReleaseDevice(deviceIds.getAtIndex(ADDRESS, i))) != 0) {
        return ret;
      }
    }
    var num = 1000;
    var outBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL,
        ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      return 1;
    }
    var inBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL,
        ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      return 1;
    }
    var in = arena.allocate(JAVA_BYTE, num);
    for (int i = 0; i < num; i++) {
      in.setAtIndex(JAVA_BYTE, i, (byte) ThreadLocalRandom.current().nextInt(16));
    }
    if ((ret = clEnqueueWriteBuffer(commandQueue, inBuffer, CL_TRUE(), 0,
        JAVA_BYTE.byteSize() * num, in, 0, NULL, NULL)) != 0) {
      return 1;
    }
    if ((ret = clSetKernelArg(kernel, 0, ADDRESS.byteSize(),
        arena.allocateFrom(ADDRESS, outBuffer))) != 0) {
      return 1;
    }
    if ((ret = clSetKernelArg(kernel, 1, ADDRESS.byteSize(), arena.allocateFrom(ADDRESS, inBuffer)))
        != 0) {
      return 1;
    }
    var globalWorkSize = arena.allocateFrom(JAVA_LONG, 10, 10, 10);
    var localWorkSize = arena.allocateFrom(JAVA_LONG, 1, 1, 1);
    long start = System.nanoTime();
    if ((ret = clEnqueueNDRangeKernel(commandQueue, kernel, 3, NULL, globalWorkSize, localWorkSize,
        0, NULL, NULL)) != 0) {
      return 1;
    }
    clFinish(commandQueue);
    long end = System.nanoTime();
    var out = arena.allocate(JAVA_BYTE, num);
    if ((ret = clEnqueueReadBuffer(commandQueue, outBuffer, CL_TRUE(), 0,
        JAVA_BYTE.byteSize() * num, out, 0, NULL, NULL)) != 0) {
      return 1;
    }
    boolean eq = true;
    // チェック
    for (int i = 0; i < num; i++) {
      eq &= (in.getAtIndex(JAVA_BYTE, i) << 2) == out.getAtIndex(JAVA_BYTE, i);
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
