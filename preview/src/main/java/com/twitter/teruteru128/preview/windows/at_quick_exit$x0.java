// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*at_quick_exit$x0)();
 * }
 */
public interface at_quick_exit$x0 {

    void apply();
    static MemorySegment allocate(at_quick_exit$x0 fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2970.const$1, fi, constants$0.const$2, scope);
    }
    static at_quick_exit$x0 ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$681.const$5.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


