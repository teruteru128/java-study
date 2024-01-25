package com.twitter.teruteru128.preview;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.util.concurrent.ThreadLocalRandom;

import static com.twitter.teruteru128.preview.opencl.opencl_h.*;
import static com.twitter.teruteru128.preview.windows.Windows_h.BCryptCloseAlgorithmProvider;
import static com.twitter.teruteru128.preview.windows.Windows_h.BCryptOpenAlgorithmProvider;
import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.MemoryLayout.*;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.MemorySegment.copy;
import static java.lang.foreign.ValueLayout.*;
import static java.nio.charset.StandardCharsets.UTF_16LE;

public class Main {

    private static final String[] clMessageStrings = {      // Error Codes
            "CL_SUCCESS"                                  //   0
            , "CL_DEVICE_NOT_FOUND"                         //  -1
            , "CL_DEVICE_NOT_AVAILABLE"                     //  -2
            , "CL_COMPILER_NOT_AVAILABLE"                   //  -3
            , "CL_MEM_OBJECT_ALLOCATION_FAILURE"            //  -4
            , "CL_OUT_OF_RESOURCES"                         //  -5
            , "CL_OUT_OF_HOST_MEMORY"                       //  -6
            , "CL_PROFILING_INFO_NOT_AVAILABLE"             //  -7
            , "CL_MEM_COPY_OVERLAP"                         //  -8
            , "CL_IMAGE_FORMAT_MISMATCH"                    //  -9
            , "CL_IMAGE_FORMAT_NOT_SUPPORTED"               //  -10
            , "CL_BUILD_PROGRAM_FAILURE"                    //  -11
            , "CL_MAP_FAILURE"                              //  -12
            , ""    //  -13
            , ""    //  -14
            , ""    //  -15
            , ""    //  -16
            , ""    //  -17
            , ""    //  -18
            , ""    //  -19
            , ""    //  -20
            , ""    //  -21
            , ""    //  -22
            , ""    //  -23
            , ""    //  -24
            , ""    //  -25
            , ""    //  -26
            , ""    //  -27
            , ""    //  -28
            , ""    //  -29
            , "CL_INVALID_VALUE"                            //  -30
            , "CL_INVALID_DEVICE_TYPE"                      //  -31
            , "CL_INVALID_PLATFORM"                         //  -32
            , "CL_INVALID_DEVICE"                           //  -33
            , "CL_INVALID_CONTEXT"                          //  -34
            , "CL_INVALID_QUEUE_PROPERTIES"                 //  -35
            , "CL_INVALID_COMMAND_QUEUE"                    //  -36
            , "CL_INVALID_HOST_PTR"                         //  -37
            , "CL_INVALID_MEM_OBJECT"                       //  -38
            , "CL_INVALID_IMAGE_FORMAT_DESCRIPTOR"          //  -39
            , "CL_INVALID_IMAGE_SIZE"                       //  -40
            , "CL_INVALID_SAMPLER"                          //  -41
            , "CL_INVALID_BINARY"                           //  -42
            , "CL_INVALID_BUILD_OPTIONS"                    //  -43
            , "CL_INVALID_PROGRAM"                          //  -44
            , "CL_INVALID_PROGRAM_EXECUTABLE"               //  -45
            , "CL_INVALID_KERNEL_NAME"                      //  -46
            , "CL_INVALID_KERNEL_DEFINITION"                //  -47
            , "CL_INVALID_KERNEL"                           //  -48
            , "CL_INVALID_ARG_INDEX"                        //  -49
            , "CL_INVALID_ARG_VALUE"                        //  -50
            , "CL_INVALID_ARG_SIZE"                         //  -51
            , "CL_INVALID_KERNEL_ARGS"                      //  -52
            , "CL_INVALID_WORK_DIMENSION"                   //  -53
            , "CL_INVALID_WORK_GROUP_SIZE"                  //  -54
            , "CL_INVALID_WORK_ITEM_SIZE"                   //  -55
            , "CL_INVALID_GLOBAL_OFFSET"                    //  -56
            , "CL_INVALID_EVENT_WAIT_LIST"                  //  -57
            , "CL_INVALID_EVENT"                            //  -58
            , "CL_INVALID_OPERATION"                        //  -59
            , "CL_INVALID_GL_OBJECT"                        //  -60
            , "CL_INVALID_BUFFER_SIZE"                      //  -61
            , "CL_INVALID_MIP_LEVEL"                        //  -62
            , "CL_INVALID_GLOBAL_WORK_SIZE"                 //  -63
            , "CL_UNKNOWN_ERROR_CODE"};

    private static String clGetErrorString(int error) {
        if (error >= -63 && error <= 0) return clMessageStrings[-error];
        else return clMessageStrings[64];
    }

    public static void main(String[] args) throws Throwable {
        var main = new Main();
        main.call(args);
    }

    private static final Linker linker = Linker.nativeLinker();
    private static final SymbolLookup defaultLookup = linker.defaultLookup();

    public void call(String[] args) throws Throwable {
        // でも本当にほしいのはSocketとかファイルとかMessageDigestとかの連携なんだよね……
        // もしかしてネイティブライブラリにアクセスできるならOpenSSLにアクセスもできる……？
        // OpenCLもアクセスできるっぽい
        var s = args.length >= 1 ? args[0] : "\uD83D\uDCA9";
        int ret;
        var publicKeyLayout = unionLayout(sequenceLayout(65, JAVA_BYTE), structLayout(JAVA_BYTE.withName("prefix"), sequenceLayout(32, JAVA_BYTE).withName("x"), sequenceLayout(32, JAVA_BYTE).withName("y")));
        System.out.println(publicKeyLayout);
        System.loadLibrary("BCrypt");
        try (var arena = Arena.ofConfined()) {
            callStrlen(s, arena);
            ret = extracted(arena);
            if (ret != 0) {
                System.out.printf("何かしらのエラーが発生しました: %s%n", clGetErrorString(ret));
                return;
            }
            ret = extracted2(arena);
            if (ret != 0) {
                System.out.printf("何かしらのエラーが発生しました: %d%n", ret);
            }
        }
    }

    private int extracted2(Arena arena) {
        var hAlg = arena.allocate(ADDRESS);
        var algo = "SHA256".getBytes(UTF_16LE);
        var BCRYPT_SHA256_ALGORITHM = arena.allocateArray(JAVA_BYTE, algo.length + 2);
        BCRYPT_SHA256_ALGORITHM.fill((byte) 0);
        copy(algo, 0, BCRYPT_SHA256_ALGORITHM, JAVA_BYTE, 0, algo.length);
        int status;
        // wchar_tの中身がUTF-16だったりUTF-32だったりSHIFT-JISだったりしろ
        // FIXME Windows_h.BCRYPT_SHA256_ALGORITHM()は"S"しか返さないので注意
        if (!((status = BCryptOpenAlgorithmProvider(hAlg, BCRYPT_SHA256_ALGORITHM, NULL, 0)) >= 0)) {
            System.err.printf("**** Error 0x%1$08x(%1$d) returned by BCryptOpenAlgorithmProvider%n", status);
            return status;
        }
        status = BCryptCloseAlgorithmProvider(hAlg.get(ADDRESS, 0), 0);
        return status;
    }

    /**
     * jextractさんマジでありがとう……！
     *
     * @param arena メモリ割当
     * @return 正常に終了した場合0、異常時非ゼロ
     * @see <a href="https://docs.oracle.com/javase/jp/21/core/call-native-functions-jextract.html#GUID-480A7E64-531A-4C88-800F-810FF87F24A1">jextract</a>
     */
    private int extracted(Arena arena) {
        var ret_ptr = arena.allocate(JAVA_INT);
        var numEntriesPtr = arena.allocate(JAVA_INT);
        int ret;
        if ((ret = clGetPlatformIDs(0, NULL, numEntriesPtr)) != 0) {
            System.err.printf("clGetPlatformIDs: %s%n", clGetErrorString(ret));
            return ret;
        }
        int platformCount = numEntriesPtr.get(JAVA_INT, 0);
        var platformIds = arena.allocateArray(ADDRESS, platformCount);

        if ((ret = clGetPlatformIDs(platformCount, platformIds, NULL)) != 0) {
            System.err.printf("clGetPlatformIDs: %s%n", clGetErrorString(ret));
            return ret;
        }
        var num_devices = arena.allocate(JAVA_INT);
        var platform = platformIds.get(ADDRESS, 0);
        if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), 0, NULL, num_devices)) != 0) {
            System.err.printf("clGetDeviceIDs: %s%n", clGetErrorString(ret));
            return ret;
        }
        int deviceNumber = num_devices.get(JAVA_INT, 0);
        var deviceIds = arena.allocateArray(ADDRESS, deviceNumber);
        if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), deviceNumber, deviceIds, NULL)) != 0) {
            System.err.printf("clGetDeviceIDs: %s%n", clGetErrorString(ret));
            return ret;
        }
        var context = clCreateContext(NULL, deviceNumber, deviceIds, NULL, NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            System.out.printf("clCreateContext: %s%n", clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
            return 1;
        }
        var commandQueue = clCreateCommandQueueWithProperties(context, deviceIds.get(ADDRESS, 0), NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            System.out.printf("clCreateCommandQueueWithProperties: %s%n", clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
            return 1;
        }
        // 実際にやるならリソースとしてファイルに出すんかな、動的に生成とかロードとかしてみたいな
        final var sourceString = arena.allocateUtf8String("""
                __kernel void func(global char* a, global char* b) {
                    size_t x = get_global_id(0);
                    size_t sizeX = get_global_size(0);
                    size_t y = get_global_id(1);
                    size_t sizeY = get_global_size(1);
                    size_t z = get_global_id(2);
                    size_t sizeZ = get_global_size(2);
                    a[((z * sizeY) + y) * sizeX + x] = b[((z * sizeY) + y) * sizeX + x] << 2;
                }
                """);
        var program = clCreateProgramWithSource(context, 1, arena.allocate(ADDRESS, sourceString), NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateProgramWithSource: %s%n", clGetErrorString(ret));
            return 1;
        }
        if ((ret = clBuildProgram(program, 1, deviceIds, NULL, NULL, NULL)) != 0) {
            System.err.printf("clBuildProgram: %s%n", clGetErrorString(ret));
            return 1;
        }
        var kernel = clCreateKernel(program, arena.allocateUtf8String("func"), ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateKernel: %s%n", clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
            return 1;
        }
        var workGroupSize = arena.allocate(JAVA_LONG);
        if ((ret = clGetKernelWorkGroupInfo(kernel, deviceIds.get(ADDRESS, 0), CL_KERNEL_WORK_GROUP_SIZE(), JAVA_LONG.byteSize(), workGroupSize, NULL)) != 0) {
            System.err.printf("clGetKernelWorkGroupInfo: %s%n", clGetErrorString(ret));
            return 1;
        }
        // device オブジェクトをリリースする
        if ((ret = clReleaseDevice(deviceIds.get(ADDRESS, 0))) != 0) {
            System.err.printf("clReleaseDevice: %s%n", clGetErrorString(ret));
            return 1;
        }
        var num = 1000;
        var outBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateBuffer outBuffer: %s%n", clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
            return 1;
        }
        var inBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateBuffer inBuffer: %s%n", clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
            return 1;
        }
        var in = arena.allocateArray(JAVA_BYTE, num);
        for (int i = 0; i < num; i++) {
            in.setAtIndex(JAVA_BYTE, i, (byte) ThreadLocalRandom.current().nextInt(16));
        }
        if ((ret = clEnqueueWriteBuffer(commandQueue, inBuffer, CL_TRUE(), 0, JAVA_BYTE.byteSize() * num, in, 0, NULL, NULL)) != 0) {
            System.err.printf("clEnqueueWriteBuffer: %s%n", clGetErrorString(ret));
            return 1;
        }
        if ((ret = clSetKernelArg(kernel, 0, ADDRESS.byteSize(), arena.allocate(ADDRESS, outBuffer))) != 0) {
            System.err.printf("clSetKernelArg 0: %s%n", clGetErrorString(ret));
            return 1;
        }
        if ((ret = clSetKernelArg(kernel, 1, ADDRESS.byteSize(), arena.allocate(ADDRESS, inBuffer))) != 0) {
            System.err.printf("clSetKernelArg 1: %s%n", clGetErrorString(ret));
            return 1;
        }
        var globalWorkSize = arena.allocateArray(JAVA_LONG, 10, 10, 10);
        var localWorkSize = arena.allocateArray(JAVA_LONG, workGroupSize.get(JAVA_LONG, 0), 1, 1);
        long start = System.nanoTime();
        if ((ret = clEnqueueNDRangeKernel(commandQueue, kernel, 3, NULL, globalWorkSize, localWorkSize, 0, NULL, NULL)) != 0) {
            System.err.printf("clEnqueueNDRangeKernel: %s%n", clGetErrorString(ret));
            return 1;
        }
        clFinish(commandQueue);
        long end = System.nanoTime();
        var out = arena.allocateArray(JAVA_BYTE, num);
        if ((ret = clEnqueueReadBuffer(commandQueue, outBuffer, CL_TRUE(), 0, JAVA_BYTE.byteSize() * num, out, 0, NULL, NULL)) != 0) {
            System.err.printf("clEnqueueReadBuffer: %s%n", clGetErrorString(ret));
            return 1;
        }
        boolean eq = true;
        // チェック
        for (int i = 0; i < num; i++) {
            eq &= (in.getAtIndex(JAVA_BYTE, i) << 2) == out.getAtIndex(JAVA_BYTE, i);
        }
        System.out.printf("status: %s%n", eq ? "ok" : "ng");
        System.out.printf("%f seconds%n", (end - start) / 1e9);
        clFinish(commandQueue);
        clReleaseMemObject(outBuffer);
        clReleaseMemObject(inBuffer);
        clReleaseCommandQueue(commandQueue);
        clReleaseKernel(kernel);
        clReleaseProgram(program);
        clReleaseContext(context);
        return 0;
    }

    private void callStrlen(String s, Arena arena) throws Throwable {
        var segment = arena.allocateUtf8String(s);
        var opt = defaultLookup.find("strlen");
        if (opt.isEmpty()) {
            return;
        }
        var strlen1 = opt.get();
        var strlen = Main.linker.downcallHandle(strlen1, of(JAVA_LONG, ADDRESS));

        System.out.printf("strlen: %d%n", (long) strlen.invokeExact(segment));
    }
}
