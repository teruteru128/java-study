// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK)(struct _CERT_CHAIN_CONTEXT* pChainContext,struct _CERT_SERVER_OCSP_RESPONSE_CONTEXT* pServerOcspResponseContext,struct _CRL_CONTEXT* pNewCrlContext,struct _CRL_CONTEXT* pPrevCrlContext,void* pvArg,unsigned long dwWriteOcspFileError);
 * }
 */
public interface PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK {

    void apply(java.lang.foreign.MemorySegment pChainContext, java.lang.foreign.MemorySegment pServerOcspResponseContext, java.lang.foreign.MemorySegment pNewCrlContext, java.lang.foreign.MemorySegment pPrevCrlContext, java.lang.foreign.MemorySegment pvArg, int dwWriteOcspFileError);
    static MemorySegment allocate(PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2231.const$2, fi, constants$2231.const$1, scope);
    }
    static PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pChainContext, java.lang.foreign.MemorySegment _pServerOcspResponseContext, java.lang.foreign.MemorySegment _pNewCrlContext, java.lang.foreign.MemorySegment _pPrevCrlContext, java.lang.foreign.MemorySegment _pvArg, int _dwWriteOcspFileError) -> {
            try {
                constants$2231.const$3.invokeExact(symbol, _pChainContext, _pServerOcspResponseContext, _pNewCrlContext, _pPrevCrlContext, _pvArg, _dwWriteOcspFileError);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


