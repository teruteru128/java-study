// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CMSG_IMPORT_ENCRYPT_KEY)(unsigned long long hCryptProv,unsigned long dwKeySpec,struct _CRYPT_ALGORITHM_IDENTIFIER* paiEncrypt,struct _CRYPT_ALGORITHM_IDENTIFIER* paiPubKey,unsigned char* pbEncodedKey,unsigned long cbEncodedKey,unsigned long long* phEncryptKey);
 * }
 */
public interface PFN_CMSG_IMPORT_ENCRYPT_KEY {

    int apply(long hCryptProv, int dwKeySpec, java.lang.foreign.MemorySegment paiEncrypt, java.lang.foreign.MemorySegment paiPubKey, java.lang.foreign.MemorySegment pbEncodedKey, int cbEncodedKey, java.lang.foreign.MemorySegment phEncryptKey);
    static MemorySegment allocate(PFN_CMSG_IMPORT_ENCRYPT_KEY fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2108.const$2, fi, constants$2108.const$1, scope);
    }
    static PFN_CMSG_IMPORT_ENCRYPT_KEY ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (long _hCryptProv, int _dwKeySpec, java.lang.foreign.MemorySegment _paiEncrypt, java.lang.foreign.MemorySegment _paiPubKey, java.lang.foreign.MemorySegment _pbEncodedKey, int _cbEncodedKey, java.lang.foreign.MemorySegment _phEncryptKey) -> {
            try {
                return (int)constants$2108.const$3.invokeExact(symbol, _hCryptProv, _dwKeySpec, _paiEncrypt, _paiPubKey, _pbEncodedKey, _cbEncodedKey, _phEncryptKey);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


