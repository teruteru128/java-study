package com.github.teruteru128.foreign;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.HexFormat;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

import static com.github.teruteru128.foreign.opencl.opencl_h.*;
import static com.github.teruteru128.foreign.windows.Windows_h.*;
import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.MemoryLayout.*;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.*;

public class Main implements Callable<Void> {

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
    private static final Linker linker = Linker.nativeLinker();
    private static final SymbolLookup defaultLookup = linker.defaultLookup();
    private final String[] args;

    public Main(String[] args) {
        this.args = args;
    }

    private static String clGetErrorString(int error) {
        if (error >= -63 && error <= 0) {
            return clMessageStrings[-error];
        } else {
            return clMessageStrings[64];
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException {
        var main = new Main(args);
        main.call();
    }

    private static void callback(MemorySegment program, MemorySegment user_data) {
        System.out.println("ウンチが漏れました！");
        System.err.println("callback:" + Thread.currentThread());
    }

    @Override
    public Void call() throws NoSuchMethodException, IllegalAccessException {
        // でも本当にほしいのはSocketとかファイルとかMessageDigestとかの連携なんだよね……
        // もしかしてネイティブライブラリにアクセスできるならOpenSSLにアクセスもできる……？
        // OpenCLもアクセスできるっぽい
        var s = args.length >= 1 ? args[0] : "\uD83D\uDCA9";
        var sequenceLayout = sequenceLayout(32, JAVA_BYTE);
        var structLayout = structLayout(JAVA_BYTE.withName("prefix"), sequenceLayout.withName("x"), sequenceLayout.withName("y")).withName("b");
        var publicKeyLayout = unionLayout(sequenceLayout(65, JAVA_BYTE).withName("a"), structLayout);
        System.out.println(publicKeyLayout);
        System.loadLibrary("BCrypt");
        ValueLayout.ADDRESS.targetLayout().ifPresent(memoryLayout -> System.out.printf("address value layout: %s%n", memoryLayout));
        try (var arena = Arena.ofConfined()) {
            System.out.printf("strlen(arena.allocateFrom(s)) = %s%n", strlen(arena.allocateFrom(s)));
            cl(arena);
            BCryptSHA256(arena, s);
            mutexSample(arena);
            var k = System.mapLibraryName("opengl32");
            SymbolLookup.libraryLookup(k, arena);
            System.err.println("opengl32 looked up");
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
        CloseHandle(mutexHandle);
        return 0;
    }

    private int BCryptSHA256(Arena arena, String str) {
        var locale = setlocale(0, arena.allocateFrom("Japanese_Japan.65001"));
        var len = strlen(locale);
        var loc = locale.reinterpret(len + 1);
        System.err.println(loc.getString(0));

        //プロバイダーハンドルを作成
        int status;
        // wchar_tの中身がUTF-16だったりUTF-32だったりSHIFT-JISだったりしろ
        var algorithmHandler = arena.allocate(ADDRESS);
        if (!((status = BCryptOpenAlgorithmProvider(algorithmHandler, BCRYPT_SHA1_ALGORITHM(), NULL, 0)) >= 0)) {
            return status;
        }
        var handle = algorithmHandler.get(ADDRESS, 0);
        if (handle.equals(NULL)) {
            return 1;
        }
        // オブジェクトの大きさを取得
        var re = arena.allocate(JAVA_INT);
        var i5 = BCryptGetProperty(handle, BCRYPT_OBJECT_LENGTH(), NULL, 0, re, 0);
        if (i5 != 0) {
            throw new IllegalStateException(String.format("BCryptGetProperty 1: %08x", i5));
        }
        var byteSize = re.get(JAVA_INT, 0);
        var bufferSize = arena.allocate(byteSize);
        var i4 = BCryptGetProperty(handle, BCRYPT_OBJECT_LENGTH(), bufferSize, byteSize, re, 0);
        if (i4 != 0) {
            throw new IllegalStateException(String.format("BCryptGetProperty 2: %08x", i4));
        }
        var size1 = bufferSize.get(JAVA_INT, 0);
        // hashオブジェクトを作成
        var buffer = arena.allocate(size1, 1);
        var hash = arena.allocate(ADDRESS);
        var i = BCryptCreateHash(handle, hash, buffer, size1, NULL, 0, BCRYPT_HASH_REUSABLE_FLAG());
        if (i != 0) {
            throw new IllegalStateException(String.format("BCryptCreateHash: %08x", i));
        }
        // hash開始
        var rawStr = arena.allocateFrom(str);
        var strLength = strlen(rawStr);
        var hHash = hash.get(ADDRESS, 0);
        // hash終了
        var hashBuffer = arena.allocate(JAVA_BYTE, 32);
        long[] s = new long[1];
        var hashBuffer1 = new byte[20];
        long start = System.nanoTime();
        i = BCryptHashData(hHash, rawStr, (int) strLength, 0);
        if (i != 0) {
            return i;
        }
        i = BCryptFinishHash(hHash, hashBuffer, 20, 0);
        if (i != 0) {
            return i;
        }
        s[0] = System.nanoTime() - start;
        Arrays.stream(s).average().ifPresent(a -> System.out.println(a / 1e9));
        // javaのbyte配列にコピーして出力
        MemorySegment.copy(hashBuffer, JAVA_BYTE, 0, hashBuffer1, 0, 20);
        System.out.printf("hash: %s%n", HexFormat.of().formatHex(hashBuffer1));
        // hashオブジェクトを破棄
        var i3 = BCryptDestroyHash(hHash);
        if (i3 != 0) {
            throw new RuntimeException("BCryptDestroyHash: " + i3);
        }
        var j6 = BCryptCloseAlgorithmProvider(handle, 0);
        if (j6 != 0) {
            throw new RuntimeException(String.format("**** Error 0x%1$08x(%1$d) returned by BCryptCloseAlgorithmProvider", j6));
        }
        return 0;
    }

    /**
     * jextractさんマジでありがとう……！
     *
     * @param arena メモリ割当
     * @return 正常に終了した場合0、異常時非ゼロ
     * @see <a href="https://docs.oracle.com/javase/jp/21/core/call-native-functions-jextract.html#GUID-480A7E64-531A-4C88-800F-810FF87F24A1">jextract</a>
     */
    private int cl(Arena arena) throws NoSuchMethodException, IllegalAccessException {
        var numEntriesPtr = arena.allocate(JAVA_INT);
        int ret;
        if ((ret = clGetPlatformIDs(0, NULL, numEntriesPtr)) != 0) {
            throw new RuntimeException(clGetErrorString(ret));
        }
        var numEntries = numEntriesPtr.get(JAVA_INT, 0);
        var platformIds = arena.allocate(ADDRESS, numEntries);

        if ((ret = clGetPlatformIDs(numEntries, platformIds, NULL)) != 0) {
            throw new RuntimeException(clGetErrorString(ret));
        }
        var num_devices = arena.allocate(JAVA_INT);
        var platform = platformIds.get(ADDRESS, 0);
        if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), 0, NULL, num_devices)) != 0) {
            throw new RuntimeException(clGetErrorString(ret));
        }
        var numDevices = num_devices.get(JAVA_INT, 0);
        var deviceIds = arena.allocate(ADDRESS, numDevices);
        if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), numDevices, deviceIds, NULL)) != 0) {
            throw new RuntimeException(clGetErrorString(ret));
        }
        var ret_ptr = arena.allocate(JAVA_INT);
        var context = clCreateContext(NULL, numDevices, deviceIds, NULL, NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            throw new RuntimeException(clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
        }
        var device = deviceIds.get(ADDRESS, 0);
        var commandQueue = clCreateCommandQueueWithProperties(context, device, NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            throw new RuntimeException(clGetErrorString(ret_ptr.get(JAVA_INT, 0)));
        }
        // 実際にやるならリソースとしてファイルに出すんかな、動的に生成とかロードとかしてみたいな
        final var sourceString = arena.allocateFrom("""
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
        var program = clCreateProgramWithSource(context, 1, arena.allocateFrom(ADDRESS, sourceString), NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            return 1;
        }
        System.err.println("main:" + Thread.currentThread());
        var callbackHandle = MethodHandles.lookup().findStatic(getClass(), "callback", MethodType.methodType(void.class, MemorySegment.class, MemorySegment.class));
        var callbackDesc = FunctionDescriptor.ofVoid(ADDRESS, ADDRESS);
        var callback = linker.upcallStub(callbackHandle, callbackDesc, arena);
        if ((ret = clBuildProgram(program, 0, NULL, NULL, callback, NULL)) != 0) {
            return ret;
        }
        var kernel = clCreateKernel(program, arena.allocateFrom("func"), ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            return ret_ptr.get(JAVA_INT, 0);
        }
        var workGroupSize = arena.allocate(JAVA_LONG);
        if ((ret = clGetKernelWorkGroupInfo(kernel, device, CL_KERNEL_WORK_GROUP_SIZE(), JAVA_LONG.byteSize(), workGroupSize, NULL)) != 0) {
            return ret;
        }
        // device オブジェクトをリリースする
        for (int i = 0; i < numDevices; i++) {
            if ((ret = clReleaseDevice(deviceIds.getAtIndex(ADDRESS, i))) != 0) {
                return ret;
            }
        }
        var num = 1000;
        var outBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            return 1;
        }
        var inBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL, ret_ptr);
        if (ret_ptr.get(JAVA_INT, 0) != 0) {
            return 1;
        }
        var in = arena.allocate(JAVA_BYTE, num);
        for (int i = 0; i < num; i++) {
            in.setAtIndex(JAVA_BYTE, i, (byte) ThreadLocalRandom.current().nextInt(16));
        }
        if ((ret = clEnqueueWriteBuffer(commandQueue, inBuffer, CL_TRUE(), 0, JAVA_BYTE.byteSize() * num, in, 0, NULL, NULL)) != 0) {
            return 1;
        }
        if ((ret = clSetKernelArg(kernel, 0, ADDRESS.byteSize(), arena.allocateFrom(ADDRESS, outBuffer))) != 0) {
            return 1;
        }
        if ((ret = clSetKernelArg(kernel, 1, ADDRESS.byteSize(), arena.allocateFrom(ADDRESS, inBuffer))) != 0) {
            return 1;
        }
        var globalWorkSize = arena.allocateFrom(JAVA_LONG, 10, 10, 10);
        var localWorkSize = arena.allocateFrom(JAVA_LONG, 1, 1, 1);
        long start = System.nanoTime();
        if ((ret = clEnqueueNDRangeKernel(commandQueue, kernel, 3, NULL, globalWorkSize, localWorkSize, 0, NULL, NULL)) != 0) {
            return 1;
        }
        clFinish(commandQueue);
        long end = System.nanoTime();
        var out = arena.allocate(JAVA_BYTE, num);
        if ((ret = clEnqueueReadBuffer(commandQueue, outBuffer, CL_TRUE(), 0, JAVA_BYTE.byteSize() * num, out, 0, NULL, NULL)) != 0) {
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

    public MemorySegment setlocale(int category, final MemorySegment locale) {
        var setlocale = Objects.requireNonNull(defaultLookup.find("setlocale").map(addr -> linker.downcallHandle(addr, of(ADDRESS, JAVA_INT, ADDRESS))).orElse(null), "setlocale");
        try {
            return (MemorySegment) setlocale.invokeExact(category, locale);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
