// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1980 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1980() {}
    static final VarHandle const$0 = constants$1979.const$5.varHandle(MemoryLayout.PathElement.groupElement("magic"));
    static final VarHandle const$1 = constants$1979.const$5.varHandle(MemoryLayout.PathElement.groupElement("pcrMask"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("magic"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pbKeyBlob"),
        JAVA_INT.withName("cbKeyBlob"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pbKeyAuth"),
        JAVA_INT.withName("cbKeyAuth"),
        MemoryLayout.paddingLayout(4)
    ).withName("_NCRYPT_KEY_ATTEST_PADDING_INFO");
    static final VarHandle const$3 = constants$1980.const$2.varHandle(MemoryLayout.PathElement.groupElement("magic"));
    static final VarHandle const$4 = constants$1980.const$2.varHandle(MemoryLayout.PathElement.groupElement("pbKeyBlob"));
    static final VarHandle const$5 = constants$1980.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbKeyBlob"));
}


