// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * LRESULT (*MMIOPROC)(LPSTR lpmmioinfo,UINT uMsg,LPARAM lParam1,LPARAM lParam2);
 * }
 */
public interface MMIOPROC {

    long apply(java.lang.foreign.MemorySegment lpmmioinfo, int uMsg, long lParam1, long lParam2);
    static MemorySegment allocate(MMIOPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1597.const$1, fi, constants$1131.const$4, scope);
    }
    static MMIOPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _lpmmioinfo, int _uMsg, long _lParam1, long _lParam2) -> {
            try {
                return (long)constants$1132.const$0.invokeExact(symbol, _lpmmioinfo, _uMsg, _lParam1, _lParam2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


