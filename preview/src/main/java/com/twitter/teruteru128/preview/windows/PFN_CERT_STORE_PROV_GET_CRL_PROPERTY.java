// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_STORE_PROV_GET_CRL_PROPERTY)(void* hStoreProv,struct _CRL_CONTEXT* pCrlContext,unsigned long dwPropId,unsigned long dwFlags,void* pvData,unsigned long* pcbData);
 * }
 */
public interface PFN_CERT_STORE_PROV_GET_CRL_PROPERTY {

    int apply(java.lang.foreign.MemorySegment hStoreProv, java.lang.foreign.MemorySegment pCtlContext, int dwPropId, int dwFlags, java.lang.foreign.MemorySegment pvData, java.lang.foreign.MemorySegment pcbData);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_GET_CRL_PROPERTY fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2134.const$2, fi, constants$1489.const$2, scope);
    }
    static PFN_CERT_STORE_PROV_GET_CRL_PROPERTY ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _hStoreProv, java.lang.foreign.MemorySegment _pCtlContext, int _dwPropId, int _dwFlags, java.lang.foreign.MemorySegment _pvData, java.lang.foreign.MemorySegment _pcbData) -> {
            try {
                return (int)constants$2133.const$5.invokeExact(symbol, _hStoreProv, _pCtlContext, _dwPropId, _dwFlags, _pvData, _pcbData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


