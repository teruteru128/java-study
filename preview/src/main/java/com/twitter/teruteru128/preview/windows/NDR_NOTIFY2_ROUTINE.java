// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*NDR_NOTIFY2_ROUTINE)(unsigned char flag);
 * }
 */
public interface NDR_NOTIFY2_ROUTINE {

    void apply(byte flag);
    static MemorySegment allocate(NDR_NOTIFY2_ROUTINE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2262.const$3, fi, constants$2262.const$2, scope);
    }
    static NDR_NOTIFY2_ROUTINE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (byte _flag) -> {
            try {
                constants$2262.const$4.invokeExact(symbol, _flag);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


