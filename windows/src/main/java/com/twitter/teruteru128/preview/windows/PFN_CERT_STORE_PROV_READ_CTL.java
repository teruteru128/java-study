// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_STORE_PROV_READ_CTL)(void* hStoreProv,struct _CTL_CONTEXT* pStoreCtlContext,unsigned long dwFlags,struct _CTL_CONTEXT** ppProvCtlContext);
 * }
 */
public interface PFN_CERT_STORE_PROV_READ_CTL {

    int apply(java.lang.foreign.MemorySegment hStoreProv, java.lang.foreign.MemorySegment pStoreCtlContext, int dwFlags, java.lang.foreign.MemorySegment ppProvCtlContext);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_READ_CTL fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2131.const$0, fi, constants$586.const$5, scope);
    }
    static PFN_CERT_STORE_PROV_READ_CTL ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _hStoreProv, java.lang.foreign.MemorySegment _pStoreCtlContext, int _dwFlags, java.lang.foreign.MemorySegment _ppProvCtlContext) -> {
            try {
                return (int)constants$2117.const$1.invokeExact(symbol, _hStoreProv, _pStoreCtlContext, _dwFlags, _ppProvCtlContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

