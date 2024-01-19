// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*CS_TYPE_NET_SIZE_ROUTINE)(void* hBinding,unsigned long ulNetworkCodeSet,unsigned long ulLocalBufferSize,enum _IDL_CS_CONVERT* conversionType,unsigned long* pulNetworkBufferSize,unsigned long* pStatus);
 * }
 */
public interface CS_TYPE_NET_SIZE_ROUTINE {

    void apply(java.lang.foreign.MemorySegment hBinding, int ulNetworkCodeSet, int ulNetworkBufferSize, java.lang.foreign.MemorySegment conversionType, java.lang.foreign.MemorySegment pulLocalBufferSize, java.lang.foreign.MemorySegment pStatus);
    static MemorySegment allocate(CS_TYPE_NET_SIZE_ROUTINE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2283.const$5, fi, constants$2283.const$4, scope);
    }
    static CS_TYPE_NET_SIZE_ROUTINE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _hBinding, int _ulNetworkCodeSet, int _ulNetworkBufferSize, java.lang.foreign.MemorySegment _conversionType, java.lang.foreign.MemorySegment _pulLocalBufferSize, java.lang.foreign.MemorySegment _pStatus) -> {
            try {
                constants$2284.const$0.invokeExact(symbol, _hBinding, _ulNetworkCodeSet, _ulNetworkBufferSize, _conversionType, _pulLocalBufferSize, _pStatus);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

