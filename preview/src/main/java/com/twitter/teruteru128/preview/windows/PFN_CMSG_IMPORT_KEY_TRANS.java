// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CMSG_IMPORT_KEY_TRANS)(struct _CRYPT_ALGORITHM_IDENTIFIER* pContentEncryptionAlgorithm,struct _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA* pKeyTransDecryptPara,unsigned long dwFlags,void* pvReserved,unsigned long long* phContentEncryptKey);
 * }
 */
public interface PFN_CMSG_IMPORT_KEY_TRANS {

    int apply(java.lang.foreign.MemorySegment pContentEncryptionAlgorithm, java.lang.foreign.MemorySegment pMailListDecryptPara, int dwFlags, java.lang.foreign.MemorySegment pvReserved, java.lang.foreign.MemorySegment phContentEncryptKey);
    static MemorySegment allocate(PFN_CMSG_IMPORT_KEY_TRANS fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2115.const$0, fi, constants$588.const$3, scope);
    }
    static PFN_CMSG_IMPORT_KEY_TRANS ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pContentEncryptionAlgorithm, java.lang.foreign.MemorySegment _pMailListDecryptPara, int _dwFlags, java.lang.foreign.MemorySegment _pvReserved, java.lang.foreign.MemorySegment _phContentEncryptKey) -> {
            try {
                return (int)constants$1005.const$2.invokeExact(symbol, _pContentEncryptionAlgorithm, _pMailListDecryptPara, _dwFlags, _pvReserved, _phContentEncryptKey);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


