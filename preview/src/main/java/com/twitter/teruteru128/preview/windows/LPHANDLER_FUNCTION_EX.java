// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned long (*LPHANDLER_FUNCTION_EX)(unsigned long dwControl,unsigned long dwEventType,void* lpEventData,void* lpContext);
 * }
 */
public interface LPHANDLER_FUNCTION_EX {

    int apply(int dwControl, int dwEventType, java.lang.foreign.MemorySegment lpEventData, java.lang.foreign.MemorySegment lpContext);
    static MemorySegment allocate(LPHANDLER_FUNCTION_EX fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$4500.const$0, fi, constants$2077.const$2, scope);
    }
    static LPHANDLER_FUNCTION_EX ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _dwControl, int _dwEventType, java.lang.foreign.MemorySegment _lpEventData, java.lang.foreign.MemorySegment _lpContext) -> {
            try {
                return (int)constants$4499.const$4.invokeExact(symbol, _dwControl, _dwEventType, _lpEventData, _lpContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

