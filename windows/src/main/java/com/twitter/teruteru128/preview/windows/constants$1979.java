// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1979 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1979() {}
    static final VarHandle const$0 = constants$1978.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$1 = constants$1978.const$4.varHandle(MemoryLayout.PathElement.groupElement("pbIV"));
    static final VarHandle const$2 = constants$1978.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbIV"));
    static final VarHandle const$3 = constants$1978.const$4.varHandle(MemoryLayout.PathElement.groupElement("pbOtherInfo"));
    static final VarHandle const$4 = constants$1978.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbOtherInfo"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("magic"),
        JAVA_INT.withName("pcrMask")
    ).withName("_NCRYPT_PLATFORM_ATTEST_PADDING_INFO");
}

