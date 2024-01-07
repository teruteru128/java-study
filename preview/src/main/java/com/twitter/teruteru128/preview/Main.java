package com.twitter.teruteru128.preview;

import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;

import static com.twitter.teruteru128.preview.opencl.opencl_h.*;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clGetDeviceIDs;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clGetPlatformIDs;
import static com.twitter.teruteru128.preview.opencl.opencl_h_1.clReleaseDevice;

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
     * @see https://docs.oracle.com/javase/jp/21/core/call-native-functions-jextract.html#GUID-480A7E64-531A-4C88-800F-810FF87F24A1 jextract
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
        err = clGetDeviceIDs(platform, 0xFFFFFFFFL, 0, NULL, deviceNumberPtr);
        if (err != 0) {
            System.err.printf("err: %d%n", err);
            return err;
        }
        int deviceNumber = deviceNumberPtr.get(JAVA_INT, 0);
        var deviceIds = arena.allocateArray(ADDRESS, deviceNumber);
        err = clGetDeviceIDs(platform, 0xffffffffL, deviceNumber, deviceIds, NULL);
        // device オブジェクトをリリースする
        err = clReleaseDevice(deviceIds.get(ADDRESS, 0));
        return 0;
    }

    private void callStrlen(String s, Arena arena, Linker linker) throws Throwable {
        var segment = arena.allocateUtf8String(s);
        var stdlib = linker.defaultLookup();
        var strlenAddr = stdlib.find("strlen").get();
        var strlenSig = of(JAVA_LONG, ADDRESS);

        var strlen = linker.downcallHandle(strlenAddr, strlenSig);

        System.out.printf("strlen: %d%n", (long) strlen.invokeExact(segment));
    }
}
