package com.twitter.teruteru128.preview;

import static com.twitter.teruteru128.preview.opencl.opencl_h.*;
import static com.twitter.teruteru128.preview.windows.Windows_h.*;
import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.MemoryLayout.*;
import static java.lang.foreign.MemorySegment.*;
import static java.lang.foreign.ValueLayout.*;
import static java.nio.charset.StandardCharsets.*;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

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
        var s = args.length >= 1 ? args[0] : "yattaze.";
        int ret = 0;
        var publicKeyLayout = unionLayout(sequenceLayout(65, JAVA_BYTE),
                structLayout(JAVA_BYTE.withName("prefix"), sequenceLayout(32, JAVA_BYTE).withName("x"),
                        sequenceLayout(32, JAVA_BYTE).withName("y")));
        System.out.println(publicKeyLayout);
        System.loadLibrary("BCrypt");
        try (var arena = Arena.ofConfined()) {
            callStrlen(s, arena, linker);
            ret = extracted(arena, linker);
            if (ret != 0) {
                System.out.printf("何かしらのエラーが発生しました: %d%n", ret);
            }
            ret = extracted2(arena, linker);
            if (ret != 0) {
                System.out.printf("何かしらのエラーが発生しました: %d%n", ret);
            }
        }
    }

    private int extracted2(Arena arena, Linker linker) {
        var hAlg = arena.allocate(ADDRESS);
        var algo = "SHA256".getBytes(UTF_16LE);
        var BCRYPT_SHA256_ALGORITHM = arena.allocateArray(JAVA_BYTE, algo.length + 2);
        BCRYPT_SHA256_ALGORITHM.fill((byte) 0);
        copy(algo, 0, BCRYPT_SHA256_ALGORITHM, JAVA_BYTE, 0, algo.length);
        int status = 0;
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
     * @see https://docs.oracle.com/javase/jp/21/core/call-native-functions-jextract.html#GUID-480A7E64-531A-4C88-800F-810FF87F24A1
     *      jextract
     * @param arena
     * @param linker
     * @return
     * @throws Throwable
     */
    private int extracted(Arena arena, Linker linker) throws Throwable {
        int errcode;
        var errcode_ret = arena.allocate(JAVA_INT);
        var numEntriesPtr = arena.allocate(JAVA_INT);
        if ((errcode = clGetPlatformIDs(0, NULL, numEntriesPtr)) != 0) {
            System.err.printf("err: %d%n", errcode);
            return errcode;
        }
        int platformCount = numEntriesPtr.get(JAVA_INT, 0);
        var platformIds = arena.allocateArray(ADDRESS, platformCount);

        if ((errcode = clGetPlatformIDs(platformCount, platformIds, NULL)) != 0) {
            System.err.printf("err: %d%n", errcode);
            return errcode;
        }
        var num_devices = arena.allocate(JAVA_INT);
        var platform = platformIds.get(ADDRESS, 0);
        if ((errcode = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), 0, NULL, num_devices)) != 0) {
            System.err.printf("err: %d%n", errcode);
            return errcode;
        }
        int deviceNumber = num_devices.get(JAVA_INT, 0);
        var deviceIds = arena.allocateArray(ADDRESS, deviceNumber);
        if ((errcode = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), deviceNumber, deviceIds, NULL)) != 0) {
            System.err.printf("err: %d%n", errcode);
            return errcode;
        }
        var context = clCreateContext(NULL, deviceNumber, deviceIds, NULL, NULL, errcode_ret);
        if (errcode_ret.get(JAVA_INT, 0) != 0) {
            System.out.printf("%d%n", errcode_ret.get(JAVA_INT, 0));
            return 1;
        }
        var commandQueue = clCreateCommandQueueWithProperties(context, deviceIds.get(ADDRESS, 0), NULL, errcode_ret);
        // 実際にやるならリソースとしてファイルに出すんかな
        var sourceString = arena.allocateUtf8String("""
                __kernel void func(global char* a, global char* b) {
                    size_t x = get_global_id(0);
                    size_t sizex = get_global_size(0);
                    size_t y = get_global_id(1);
                    size_t sizey = get_global_size(1);
                    size_t z = get_global_id(2);
                    size_t sizez = get_global_size(2);
                    a[((z * sizey) + y) * sizex + x] = b[((z * sizey) + y) * sizex + x] << 2;
                }
                """);
        var program = clCreateProgramWithSource(context, 1, arena.allocate(ADDRESS, sourceString), NULL, errcode_ret);
        if (errcode_ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateProgramWithSource: %d%n", errcode);
            return 1;
        }
        if ((errcode = clBuildProgram(program, 1, deviceIds, NULL, NULL, NULL)) != 0) {
            System.err.printf("clBuildProgram: %d%n", errcode);
            return 1;
        }
        var kernel = clCreateKernel(program, arena.allocateUtf8String("func"), errcode_ret);
        if (errcode_ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateKernel: %d%n", errcode);
            return 1;
        }
        var wgsize = arena.allocate(JAVA_LONG);
        if ((errcode = clGetKernelWorkGroupInfo(kernel, deviceIds.get(ADDRESS, 0), CL_KERNEL_WORK_GROUP_SIZE(),
                JAVA_LONG.byteSize(), wgsize, NULL)) != 0) {
            System.err.printf("clGetKernelWorkGroupInfo: %d%n", errcode);
            return 1;
        }
        // device オブジェクトをリリースする
        if ((errcode = clReleaseDevice(deviceIds.get(ADDRESS, 0))) != 0) {
            System.err.printf("clReleaseDevice: %d%n", errcode);
            return 1;
        }
        var num = 1000;
        var outBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL, errcode_ret);
        if (errcode_ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateBuffer outBuffer: %d%n", errcode);
            return 1;
        }
        var inBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL, errcode_ret);
        if (errcode_ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateBuffer inBuffer: %d%n", errcode);
            return 1;
        }
        var in = arena.allocateArray(JAVA_BYTE, num);
        for (int i = 0; i < num; i++) {
            in.setAtIndex(JAVA_BYTE, i, (byte) ThreadLocalRandom.current().nextInt(16));
        }
        if ((errcode = clEnqueueWriteBuffer(commandQueue, inBuffer, CL_TRUE(), 0, JAVA_BYTE.byteSize() * num, in,
                0, NULL, NULL)) != 0) {
            System.err.printf("clEnqueueWriteBuffer: %d%n", errcode);
            return 1;
        }
        if ((errcode = clSetKernelArg(kernel, 0, ADDRESS.byteSize(), arena.allocate(ADDRESS, outBuffer))) != 0) {
            System.err.printf("setkernelarg 0: %d%n", errcode);
            return 1;
        }
        if ((errcode = clSetKernelArg(kernel, 1, ADDRESS.byteSize(), arena.allocate(ADDRESS, inBuffer))) != 0) {
            System.err.printf("setkernelarg 1: %d%n", errcode);
            return 1;
        }
        var globalWorkSize = arena.allocateArray(JAVA_LONG, 10, 10, 10);
        var localWorkSize = arena.allocateArray(JAVA_LONG, wgsize.get(JAVA_LONG, 0), 1, 1);
        long start = System.nanoTime();
        if ((errcode = clEnqueueNDRangeKernel(commandQueue, kernel, 3, NULL, globalWorkSize, localWorkSize, 0, NULL,
                NULL)) != 0) {
            System.err.printf("clEnqueueNDRangeKernel: %d%n", errcode);
            return 1;
        }
        clFinish(commandQueue);
        long end = System.nanoTime();
        var out = arena.allocateArray(JAVA_BYTE, num);
        if ((errcode = clEnqueueReadBuffer(commandQueue, outBuffer, CL_TRUE(), 0, JAVA_BYTE.byteSize() * num, out, 0,
                NULL, NULL)) != 0) {
            System.err.printf("clEnqueueReadBuffer: %d%n", errcode);
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

    private void callStrlen(String s, Arena arena, Linker linker) throws Throwable {
        var segment = arena.allocateUtf8String(s);
        var strlen = linker.downcallHandle(defaultLookup.find("strlen").get(), of(JAVA_LONG, ADDRESS));

        System.out.printf("strlen: %d%n", (long) strlen.invokeExact(segment));
    }
}
