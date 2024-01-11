// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_STORE_PROV_SET_CERT_PROPERTY)(void* hStoreProv,struct _CERT_CONTEXT* pCertContext,unsigned long dwPropId,unsigned long dwFlags,void* pvData);
 * }
 */
public interface PFN_CERT_STORE_PROV_SET_CERT_PROPERTY {

    int apply(java.lang.foreign.MemorySegment hStoreProv, java.lang.foreign.MemorySegment pCtlContext, int dwPropId, int dwFlags, java.lang.foreign.MemorySegment pvData);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_SET_CERT_PROPERTY fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2130.const$0, fi, constants$1278.const$1, scope);
    }
    static PFN_CERT_STORE_PROV_SET_CERT_PROPERTY ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _hStoreProv, java.lang.foreign.MemorySegment _pCtlContext, int _dwPropId, int _dwFlags, java.lang.foreign.MemorySegment _pvData) -> {
            try {
                return (int)constants$2130.const$1.invokeExact(symbol, _hStoreProv, _pCtlContext, _dwPropId, _dwFlags, _pvData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


