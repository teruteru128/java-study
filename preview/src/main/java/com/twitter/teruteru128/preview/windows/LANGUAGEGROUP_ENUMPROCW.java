// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*LANGUAGEGROUP_ENUMPROCW)(unsigned long,unsigned short*,unsigned short*,unsigned long,long long);
 * }
 */
public interface LANGUAGEGROUP_ENUMPROCW {

    int apply(int _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, long _x4);
    static MemorySegment allocate(LANGUAGEGROUP_ENUMPROCW fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1420.const$3, fi, constants$1418.const$2, scope);
    }
    static LANGUAGEGROUP_ENUMPROCW ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, long __x4) -> {
            try {
                return (int)constants$1418.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


