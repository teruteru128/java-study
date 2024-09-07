package com.github.teruteru128.foreign;

import static com.github.teruteru128.foreign.opencl.opencl_h_1.CL_DEVICE_TYPE_ALL;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.CL_MEM_COPY_HOST_PTR;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.CL_MEM_READ_WRITE;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clBuildProgram;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateBuffer;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateCommandQueueWithProperties;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateContext;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateKernel;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateProgramWithSource;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clEnqueueNDRangeKernel;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clEnqueueReadBuffer;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clFinish;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clGetDeviceIDs;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clGetKernelWorkGroupInfo;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clGetPlatformIDs;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clReleaseCommandQueue;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clReleaseContext;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clReleaseDevice;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clReleaseKernel;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clReleaseProgram;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clSetKernelArg;
import static com.github.teruteru128.foreign.opencl.opencl_h_2.CL_KERNEL_WORK_GROUP_SIZE;
import static com.github.teruteru128.foreign.opencl.opencl_h_2.CL_TRUE;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.github.teruteru128.foreign.opencl.opencl_h;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class CL implements AutoCloseable {

  static final Linker linker = Linker.nativeLinker();
  private final Arena confined = Arena.ofConfined();
  private int numDevices;
  private MemorySegment deviceIds;
  private MemorySegment context;
  private MemorySegment commandQueue;
  private MemorySegment program;
  private MemorySegment kernel;

  public CL() {
    initCL();
  }

  private static void callback(MemorySegment cal, MemorySegment v) {
    System.out.printf("ウンチが漏れました！: 0x%016x, 0x%016x%n", cal.address(), v.address());
  }

  private void initCL() {
    var auto = Arena.ofAuto();
    int ret;
    var ret_ptr = auto.allocate(JAVA_INT);
    var numEntriesPtr = auto.allocate(JAVA_INT);
    // get number of platforms
    if ((ret = clGetPlatformIDs(0, NULL, numEntriesPtr)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    var numEntries = numEntriesPtr.get(JAVA_INT, 0);
    var platformIds = auto.allocate(ADDRESS, numEntries);

    // get platform ids
    if ((ret = clGetPlatformIDs(numEntries, platformIds, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // デバイス数
    var num_devices = confined.allocate(JAVA_INT);
    var platform = platformIds.get(ADDRESS, 0);
    if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), 0, NULL, num_devices)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // デバイス情報
    numDevices = Objects.requireNonNull(num_devices).get(JAVA_INT, 0);
    deviceIds = confined.allocate(ADDRESS, numDevices);
    if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), numDevices, deviceIds, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // コンテキスト
    context = clCreateContext(NULL, numDevices, deviceIds, NULL, NULL, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
    // コマンドキュー
    commandQueue = clCreateCommandQueueWithProperties(context, Objects.requireNonNull(deviceIds)
        .get(ADDRESS, 0), NULL, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
    commandQueue = Objects.requireNonNull(commandQueue).reinterpret(auto, opencl_h::clReleaseCommandQueue);
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
    final var sourceString = confined.allocateFrom(s);
    // プログラムオブジェクトを作成し、ソースコードをプログラムオブジェクトに読み込む
    // FIXME clCreateProgramWithSourceが終わったあとにsourceStringを開放してもええんか？
    program = clCreateProgramWithSource(context, 1,
        confined.allocateFrom(ADDRESS, sourceString), NULL, ret_ptr);
    if ((ret = ret_ptr.get(JAVA_INT, 0)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // プログラム実行可能ファイルをビルド(コンパイル及びリンク)する
    MethodHandle callback1;
    try {
      callback1 = MethodHandles.lookup().findStatic(CL.class, "callback",
          MethodType.methodType(void.class, MemorySegment.class, MemorySegment.class));
    } catch (NoSuchMethodException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
    var function = FunctionDescriptor.ofVoid(ADDRESS, ADDRESS);
    var callback = linker.upcallStub(callback1, function, confined);
    if ((ret = clBuildProgram(program, numDevices, deviceIds, NULL, callback, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // カーネルオブジェクトを作成する
    kernel = clCreateKernel(program, confined.allocateFrom("func"), ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
  }

  /**
   * jextractさんマジでありがとう……！ で、どれが再利用可能でどれが再利用不可能なんでしょうね？
   *
   * @return 正常に終了した場合0、異常時非ゼロ
   * @see <a
   * href="https://docs.oracle.com/javase/jp/21/core/call-native-functions-jextract.html#GUID-480A7E64-531A-4C88-800F-810FF87F24A1">jextract</a>
   */
  int cl() {
    var auto = Arena.ofAuto();
    int ret;
    var ret_ptr = auto.allocate(JAVA_INT);
    var workGroupSize = confined.allocate(JAVA_LONG);
    if ((ret = clGetKernelWorkGroupInfo(kernel, deviceIds.get(ADDRESS, 0), CL_KERNEL_WORK_GROUP_SIZE(),
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
    // FIXME これメモリリークよね？confinedがcloseされるまでの間だけど。confinedなcontextで生成したbufferはconfinedでリリースしないとダメか？autoでリリースできないか？ 順番問題が発生しそう、bufferがreleaseされる前にcontextがreleaseされると死にそう。
    outBuffer.reinterpret(auto, opencl_h::clReleaseMemObject);
    // ファイルのデータmemory-mapped file扱いで全部ぶっこめるんじゃねえの？-> 2ファイル……
    var in = confined.allocate(JAVA_BYTE, num);
    for (int i = 0; i < num; i++) {
      in.setAtIndex(JAVA_BYTE, i, (byte) ThreadLocalRandom.current().nextInt(16));
    }
    var inBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE() | CL_MEM_COPY_HOST_PTR(),
        JAVA_BYTE.byteSize() * num, in, ret_ptr);
    if (ret_ptr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
    }
    inBuffer.reinterpret(auto, opencl_h::clReleaseMemObject);
    // カーネル引数設定
    if ((ret = clSetKernelArg(kernel, 0, ADDRESS.byteSize(),
        confined.allocateFrom(ADDRESS, outBuffer))) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    if ((ret = clSetKernelArg(kernel, 1, ADDRESS.byteSize(),
        confined.allocateFrom(ADDRESS, inBuffer))) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    // カーネル実行
    var globalWorkSize = confined.allocateFrom(JAVA_LONG, 256 * 2000, 1, 1);
    var localWorkSize = confined.allocateFrom(JAVA_LONG, 256, 1, 1);
    long start = System.nanoTime();
    if ((ret = clEnqueueNDRangeKernel(commandQueue, kernel, 3, NULL, globalWorkSize, localWorkSize,
        0, NULL, NULL)) != 0) {
      System.err.printf("error!: %s%n", CLMessage.clGetErrorString(ret));
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    clFinish(commandQueue);
    long end = System.nanoTime();
    var out = confined.allocate(JAVA_BYTE, num);
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
    clReleaseCommandQueue(commandQueue);
    clReleaseKernel(kernel);
    clReleaseProgram(program);
    clReleaseContext(context);
    return 0;
  }

  @Override
  public void close() {
    confined.close();
  }
}
