// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GEO_ENUMPROC)(long);
 * }
 */
public interface GEO_ENUMPROC {

    int apply(int _x0);
    static MemorySegment allocate(GEO_ENUMPROC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1422.const$0, fi, constants$11.const$5, scope);
    }
    static GEO_ENUMPROC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int __x0) -> {
            try {
                return (int)constants$1422.const$1.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


