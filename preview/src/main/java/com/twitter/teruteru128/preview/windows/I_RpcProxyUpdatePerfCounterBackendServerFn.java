// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*I_RpcProxyUpdatePerfCounterBackendServerFn)(unsigned short* MachineName,int IsConnectEvent);
 * }
 */
public interface I_RpcProxyUpdatePerfCounterBackendServerFn {

    void apply(java.lang.foreign.MemorySegment MachineName, int IsConnectEvent);
    static MemorySegment allocate(I_RpcProxyUpdatePerfCounterBackendServerFn fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1805.const$3, fi, constants$72.const$3, scope);
    }
    static I_RpcProxyUpdatePerfCounterBackendServerFn ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _MachineName, int _IsConnectEvent) -> {
            try {
                constants$1805.const$4.invokeExact(symbol, _MachineName, _IsConnectEvent);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


