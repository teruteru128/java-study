// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2091 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2091() {}
    static final VarHandle const$0 = constants$2090.const$5.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("hCryptProv"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm"),
        RuntimeHelper.POINTER.withName("pvHashAuxInfo")
    ).withName("_CMSG_HASHED_ENCODE_INFO");
    static final VarHandle const$2 = constants$2091.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$3 = constants$2091.const$1.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    static final VarHandle const$4 = constants$2091.const$1.varHandle(MemoryLayout.PathElement.groupElement("pvHashAuxInfo"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("ContentEncryptionAlgorithm"),
        RuntimeHelper.POINTER.withName("pvEncryptionAuxInfo")
    ).withName("_CMSG_ENCRYPTED_ENCODE_INFO");
}


