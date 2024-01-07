package com.twitter.teruteru128.preview;

import static com.twitter.teruteru128.preview.opencl.opencl_h.CL_TRUE;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.CL_DEVICE_TYPE_ALL;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.CL_MEM_READ_WRITE;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clBuildProgram;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clCreateBuffer;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clCreateCommandQueueWithProperties;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clCreateContext;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clCreateKernel;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clCreateProgramWithSource;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clEnqueueNDRangeKernel;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clEnqueueReadBuffer;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clEnqueueWriteBuffer;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clFinish;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clGetDeviceIDs;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clGetPlatformIDs;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clReleaseCommandQueue;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clReleaseContext;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clReleaseDevice;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clReleaseKernel;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clReleaseMemObject;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clReleaseProgram;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clSetKernelArg;
import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws Throwable {
        var main = new Main();
        main.call(args);
    }

    private void call(String[] args) throws Throwable {
        // でも本当にほしいのはSocketとかファイルとかMessageDigestとかの連携なんだよね……
        // もしかしてネイティブライブラリにアクセスできるならOpenSSLにアクセスもできる……？
        // OpenCLもアクセスできるっぽい
        var s = args.length >= 1 ? args[0] : "yattaze.";
        int ret = 0;
        try (var arena = Arena.ofConfined()) {
            var linker = Linker.nativeLinker();
            callStrlen(s, arena, linker);
            ret = extracted(arena, linker);
        }
        if (ret != 0) {
            System.out.printf("何かしらのエラーが発生しました: %d%n", ret);
            System.exit(ret);
        }
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
        var sourceString = arena.allocateUtf8String("""
                __kernel void func(global int* a, global int* b) {
                    size_t x = get_global_id(0);
                    size_t sizex = get_global_size(0);
                    size_t y = get_global_id(1);
                    size_t sizey = get_global_size(1);
                    size_t z = get_global_id(2);
                    size_t sizez = get_global_size(2);
                    a[((z * sizez) + y) * sizey + x] = b[((z * sizez) + y) * sizey + x] << 2;
                }
                """);
        var ss = arena.allocate(ADDRESS, sourceString);
        var program = clCreateProgramWithSource(context, 1, ss, NULL, ret);
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
        // device オブジェクトをリリースする
        err = clReleaseDevice(deviceIds.get(ADDRESS, 0));
        if (err != 0) {
            System.err.printf("clReleaseDevice: %d%n", err);
            return 1;
        }
        var outBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), 4000, NULL, ret);
        if (ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateBuffer outBuffer: %d%n", err);
            return 1;
        }
        var inBuffer = clCreateBuffer(context, CL_MEM_READ_WRITE(), 4000, NULL, ret);
        if (ret.get(JAVA_INT, 0) != 0) {
            System.err.printf("clCreateBuffer inBuffer: %d%n", err);
            return 1;
        }
        var in = arena.allocateArray(JAVA_INT, 1000);
        for (int i = 0; i < 1000; i++) {
            in.setAtIndex(JAVA_INT, i, ThreadLocalRandom.current().nextInt(16));
        }
        err = clEnqueueWriteBuffer(commandQueue, inBuffer, CL_TRUE(), 0, JAVA_INT.byteSize() * 1000, in,
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
        var localWorkSize = arena.allocateArray(JAVA_LONG, 5, 5, 5);
        err = clEnqueueNDRangeKernel(commandQueue, kernel, 3, NULL, globalWorkSize, localWorkSize, 0, NULL,
                NULL);
        if (err != 0) {
            System.err.printf("clEnqueueNDRangeKernel: %d%n", err);
            return 1;
        }
        var out = arena.allocateArray(JAVA_INT, 1000);
        err = clEnqueueReadBuffer(commandQueue, outBuffer, CL_TRUE(), 0, 4000, out, 0, NULL,
                NULL);
        if (err != 0) {
            System.err.printf("clEnqueueReadBuffer: %d%n", err);
            return 1;
        }
        boolean eq = true;
        for (int i = 0; i < 1000; i++) {
            eq &= (in.getAtIndex(JAVA_INT, i) << 2) == out.getAtIndex(JAVA_INT, i);
        }
        System.out.printf("status: %s%n", eq ? "ok" : "ng");
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
        var strlen = linker.downcallHandle(linker.defaultLookup().find("strlen").get(), of(JAVA_LONG, ADDRESS));

        System.out.printf("strlen: %d%n", (long) strlen.invokeExact(segment));
    }
}
