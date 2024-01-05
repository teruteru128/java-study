package com.twitter.teruteru128.preview;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;

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
            var strlenSig = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);

            var strlen = linker.downcallHandle(strlenAddr, strlenSig);

            System.out.printf("%d%n", (long) strlen.invokeExact(segment));
            System.loadLibrary("OpenCL");
            System.loadLibrary("P2P");
            var openCL = SymbolLookup.loaderLookup();
            var clGetPlatformIDsAddr = openCL.find("clGetPlatformIDs").get();
        }
    }
}
