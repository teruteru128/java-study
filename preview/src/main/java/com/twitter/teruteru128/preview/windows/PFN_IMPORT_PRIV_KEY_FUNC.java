// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_IMPORT_PRIV_KEY_FUNC)(unsigned long long hCryptProv,struct _CRYPT_PRIVATE_KEY_INFO* pPrivateKeyInfo,unsigned long dwFlags,void* pvAuxInfo);
 * }
 */
public interface PFN_IMPORT_PRIV_KEY_FUNC {

    int apply(long hCryptProv, java.lang.foreign.MemorySegment pPrivateKeyInfo, int dwFlags, java.lang.foreign.MemorySegment pvAuxInfo);
    static MemorySegment allocate(PFN_IMPORT_PRIV_KEY_FUNC fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2171.const$3, fi, constants$1916.const$1, scope);
    }
    static PFN_IMPORT_PRIV_KEY_FUNC ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (long _hCryptProv, java.lang.foreign.MemorySegment _pPrivateKeyInfo, int _dwFlags, java.lang.foreign.MemorySegment _pvAuxInfo) -> {
            try {
                return (int)constants$2171.const$4.invokeExact(symbol, _hCryptProv, _pPrivateKeyInfo, _dwFlags, _pvAuxInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


