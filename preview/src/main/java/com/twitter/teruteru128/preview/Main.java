package com.twitter.teruteru128.preview;

import static com.twitter.teruteru128.preview.opencl.opencl_h.*;
import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.MemoryLayout.*;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.*;
import static com.twitter.teruteru128.preview.windows.Windows_h.*;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
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
            extracted2(arena);
        }
        if (ret != 0) {
            System.out.printf("何かしらのエラーが発生しました: %d%n", ret);
            System.exit(ret);
        }
    }

    private void extracted2(Arena arena) {
        var hAlg = arena.allocate(ADDRESS);
        var algo = "SHA256".toCharArray();
        var m = arena.allocateArray(JAVA_CHAR, algo.length + 1);
        m.fill((byte)0);
        MemorySegment.copy(algo, 0, m, JAVA_CHAR, 0, algo.length);
        int status = 0;
        if (!((status = BCryptOpenAlgorithmProvider(hAlg, m, NULL, 0)) >= 0)) {
            System.err.printf("**** Error 0x%1$08x(%1$d) returned by BCryptOpenAlgorithmProvider%n", status);
            return;
        }
        System.err.println("scuess!");
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
        int err;
        var numEntriesPtr = arena.allocate(JAVA_INT);
        err = clGetPlatformIDs(0, NULL, numEntriesPtr);
        if (err != 0) {
            System.err.printf("err: %d%n", err);
            return err;
        }
        int platformCount = numEntriesPtr.get(JAVA_INT, 0);
        var platformIds = arena.allocateArray(ADDRESS, platformCount);

        err = clGetPlatformIDs(platformCount, platformIds, NULL);
        if (err != 0) {
            System.err.printf("err: %d%n", err);
            return err;
        }
        var deviceNumberPtr = arena.allocate(JAVA_INT);
        var platform = platformIds.get(ADDRESS, 0);
        err = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), 0, NULL, deviceNumberPtr);
        if (err != 0) {
            System.err.printf("err: %d%n", err);
            return err;
        }
        int deviceNumber = deviceNumberPtr.get(JAVA_INT, 0);
        var deviceIds = arena.allocateArray(ADDRESS, deviceNumber);
        var ret = arena.allocate(4);
        err = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), deviceNumber, deviceIds, ret);
        var context = clCreateContext(NULL, 1, deviceIds, NULL, NULL, ret);
        if (ret.get(JAVA_INT, 0) != 0) {
            System.out.printf("%d%n", ret.get(JAVA_INT, 0));
            return 1;
        }
        var commandQueue = clCreateCommandQueueWithProperties(context, deviceIds.get(ADDRESS, 0), NULL, ret);
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
        var program = clCreateProgramWithSource(context, 1, arena.allocate(ADDRESS, sourceString), NULL, ret);
        if (err != 0) {
            System.err.printf("clCreateProgramWithSource: %d%n", err);
            return 1;
        }
        err = clBuildProgram(program, 1, deviceIds, NULL, NULL, NULL);
        if (err != 0) {
            System.err.printf("clBuildProgram: %d%n", err);
            return 1;
        }
        var kernel = clCreateKernel(program, arena.allocateUtf8String("func"), ret);
        if (ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateKernel: %d%n", err);
            return 1;
        }
        var wgsize = arena.allocate(JAVA_LONG);
        err = clGetKernelWorkGroupInfo(kernel, deviceIds.get(ADDRESS, 0), CL_KERNEL_WORK_GROUP_SIZE(),
                JAVA_LONG.byteSize(), wgsize, NULL);
        if (err != 0) {
            System.err.printf("clGetKernelWorkGroupInfo: %d%n", err);
            return 1;
        }
        // device オブジェクトをリリースする
        err = clReleaseDevice(deviceIds.get(ADDRESS, 0));
        if (err != 0) {
            System.err.printf("clReleaseDevice: %d%n", err);
            return 1;
        }
        var num = 1000;
        var outBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL, ret);
        if (ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateBuffer outBuffer: %d%n", err);
            return 1;
        }
        var inBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), JAVA_BYTE.byteSize() * num, NULL, ret);
        if (ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateBuffer inBuffer: %d%n", err);
            return 1;
        }
        var in = arena.allocateArray(JAVA_BYTE, num);
        for (int i = 0; i < num; i++) {
            in.setAtIndex(JAVA_BYTE, i, (byte) ThreadLocalRandom.current().nextInt(16));
        }
        err = clEnqueueWriteBuffer(commandQueue, inBuffer, CL_TRUE(), 0, JAVA_BYTE.byteSize() * num, in,
                0, NULL, NULL);
        if (err != 0) {
            System.err.printf("clEnqueueWriteBuffer: %d%n", err);
            return 1;
        }
        err = clSetKernelArg(kernel, 0, ADDRESS.byteSize(), arena.allocate(ADDRESS, outBuffer));
        if (err != 0) {
            System.err.printf("setkernelarg 0: %d%n", err);
            return 1;
        }
        err = clSetKernelArg(kernel, 1, ADDRESS.byteSize(), arena.allocate(ADDRESS, inBuffer));
        if (err != 0) {
            System.err.printf("setkernelarg 1: %d%n", err);
            return 1;
        }
        var globalWorkSize = arena.allocateArray(JAVA_LONG, 10, 10, 10);
        var localWorkSize = arena.allocateArray(JAVA_LONG, wgsize.get(JAVA_LONG, 0), 1, 1);
        long start = System.nanoTime();
        err = clEnqueueNDRangeKernel(commandQueue, kernel, 3, NULL, globalWorkSize, localWorkSize, 0, NULL,
                NULL);
        if (err != 0) {
            System.err.printf("clEnqueueNDRangeKernel: %d%n", err);
            return 1;
        }
        clFinish(commandQueue);
        long end = System.nanoTime();
        var out = arena.allocateArray(JAVA_BYTE, num);
        err = clEnqueueReadBuffer(commandQueue, outBuffer, CL_TRUE(), 0, JAVA_BYTE.byteSize() * num, out, 0, NULL,
                NULL);
        if (err != 0) {
            System.err.printf("clEnqueueReadBuffer: %d%n", err);
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
