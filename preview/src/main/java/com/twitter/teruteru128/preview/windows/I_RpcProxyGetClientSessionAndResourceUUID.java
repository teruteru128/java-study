// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * long (*I_RpcProxyGetClientSessionAndResourceUUID)(void* Context,int* SessionIdPresent,struct _GUID* SessionId,int* ResourceIdPresent,struct _GUID* ResourceId);
 * }
 */
public interface I_RpcProxyGetClientSessionAndResourceUUID {

    int apply(java.lang.foreign.MemorySegment Context, java.lang.foreign.MemorySegment SessionIdPresent, java.lang.foreign.MemorySegment SessionId, java.lang.foreign.MemorySegment ResourceIdPresent, java.lang.foreign.MemorySegment ResourceId);
    static MemorySegment allocate(I_RpcProxyGetClientSessionAndResourceUUID fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1804.const$3, fi, constants$577.const$5, scope);
    }
    static I_RpcProxyGetClientSessionAndResourceUUID ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _Context, java.lang.foreign.MemorySegment _SessionIdPresent, java.lang.foreign.MemorySegment _SessionId, java.lang.foreign.MemorySegment _ResourceIdPresent, java.lang.foreign.MemorySegment _ResourceId) -> {
            try {
                return (int)constants$1781.const$5.invokeExact(symbol, _Context, _SessionIdPresent, _SessionId, _ResourceIdPresent, _ResourceId);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


