// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*LPFNADDPROPSHEETPAGES)(void*,int (*)(struct _PSP*,long long),long long);
 * }
 */
public interface LPFNADDPROPSHEETPAGES {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2);
    static MemorySegment allocate(LPFNADDPROPSHEETPAGES fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2820.const$1, fi, constants$29.const$0, scope);
    }
    static LPFNADDPROPSHEETPAGES ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2) -> {
            try {
                return (int)constants$708.const$3.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

