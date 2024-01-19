// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_IS_WEAK_HASH)(unsigned long dwHashUseType,unsigned short* pwszCNGHashAlgid,unsigned long dwChainFlags,struct _CERT_CHAIN_CONTEXT* pSignerChainContext,struct _FILETIME* pTimeStamp,unsigned short* pwszFileName);
 * }
 */
public interface PFN_CERT_IS_WEAK_HASH {

    int apply(int dwHashUseType, java.lang.foreign.MemorySegment pwszCNGHashAlgid, int dwChainFlags, java.lang.foreign.MemorySegment pSignerChainContext, java.lang.foreign.MemorySegment pTimeStamp, java.lang.foreign.MemorySegment pwszFileName);
    static MemorySegment allocate(PFN_CERT_IS_WEAK_HASH fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2244.const$3, fi, constants$1937.const$1, scope);
    }
    static PFN_CERT_IS_WEAK_HASH ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int _dwHashUseType, java.lang.foreign.MemorySegment _pwszCNGHashAlgid, int _dwChainFlags, java.lang.foreign.MemorySegment _pSignerChainContext, java.lang.foreign.MemorySegment _pTimeStamp, java.lang.foreign.MemorySegment _pwszFileName) -> {
            try {
                return (int)constants$2244.const$4.invokeExact(symbol, _dwHashUseType, _pwszCNGHashAlgid, _dwChainFlags, _pSignerChainContext, _pTimeStamp, _pwszFileName);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

