// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum _COPYFILE2_MESSAGE_ACTION (*PCOPYFILE2_PROGRESS_ROUTINE)(struct COPYFILE2_MESSAGE* pMessage,void* pvCallbackContext);
 * }
 */
public interface PCOPYFILE2_PROGRESS_ROUTINE {

    int apply(java.lang.foreign.MemorySegment pMessage, java.lang.foreign.MemorySegment pvCallbackContext);
    static MemorySegment allocate(PCOPYFILE2_PROGRESS_ROUTINE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$813.const$2, fi, constants$34.const$0, scope);
    }
    static PCOPYFILE2_PROGRESS_ROUTINE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pMessage, java.lang.foreign.MemorySegment _pvCallbackContext) -> {
            try {
                return (int)constants$92.const$2.invokeExact(symbol, _pMessage, _pvCallbackContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

