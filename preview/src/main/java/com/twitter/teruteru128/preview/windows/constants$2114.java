// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2114 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2114() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_CMSG_EXPORT_KEY_AGREE.class, "apply", constants$691.const$2);
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwRecipientIndex"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("KeyEncryptionAlgorithm"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("EncryptedKey"),
        JAVA_INT.withName("dwFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CMSG_MAIL_LIST_ENCRYPT_INFO");
    static final VarHandle const$2 = constants$2114.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$3 = constants$2114.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwRecipientIndex"));
    static final VarHandle const$4 = constants$2114.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PFN_CMSG_EXPORT_MAIL_LIST.class, "apply", constants$691.const$2);
}


