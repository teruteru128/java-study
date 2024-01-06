package com.twitter.teruteru128.preview;

import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;

public class Main {
    void main(String[] args) throws Throwable {
        // でも本当にほしいのはSocketとかファイルとかMessageDigestとかの連携なんだよね……
        // もしかしてネイティブライブラリにアクセスできるならOpenSSLにアクセスもできる……？
        // OpenCLもアクセスできるっぽい
        var s = args.length >= 1 ? args[0] : "yattaze.";
        try (var arena = Arena.ofConfined()) {
            var segment = arena.allocateUtf8String(s);
            var linker = Linker.nativeLinker();
            var stdlib = linker.defaultLookup();
            var strlenAddr = stdlib.find("strlen").get();
            var strlenSig = of(JAVA_LONG, ADDRESS);

            var strlen = linker.downcallHandle(strlenAddr, strlenSig);

            System.out.printf("strlen: %d%n", (long) strlen.invokeExact(segment));
            var openCL = SymbolLookup.libraryLookup("OpenCL", arena);
            var clGetPlatformIDs = linker.downcallHandle(openCL.find("clGetPlatformIDs").get(),
                    of(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
            var numEntries = arena.allocate(JAVA_INT);
            int err = (int) clGetPlatformIDs.invoke(0, NULL, numEntries);
            if (err != 0) {
                System.err.printf("err: %d%n", err);
                return;
            }
            var platformIds = arena.allocateArray(ADDRESS, numEntries.get(JAVA_INT, 0));

            err = (int) clGetPlatformIDs.invokeExact(8, platformIds, NULL);
            if (err != 0) {
                System.err.printf("err: %d%n", err);
                return;
            }
            var clGetDeviceIDs = linker.downcallHandle(openCL.find("clGetDeviceIDs").get(),
                    of(JAVA_INT, ADDRESS, JAVA_LONG, JAVA_INT, ADDRESS, ADDRESS));
            var deviceNumberPtr = arena.allocate(JAVA_INT);
            var platform = platformIds.get(ADDRESS, 0);
            err = (int) clGetDeviceIDs.invokeExact(platform, 0xFFFFFFFFL, 0, NULL, deviceNumberPtr);
            if (err != 0) {
                System.err.printf("err: %d%n", err);
                return;
            }
            int deviceNumber = deviceNumberPtr.get(JAVA_INT, 0);
            var deviceIds = arena.allocateArray(ADDRESS, deviceNumber);
            err = (int) clGetDeviceIDs.invokeExact(platform, 0xffffffffL, deviceNumber, deviceIds, NULL);
            var clGetDeviceInfo = linker.downcallHandle(openCL.find("clGetDeviceInfo").get(),
                    of(JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        }
    }
}
