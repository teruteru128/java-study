// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1951 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1951() {}
    static final VarHandle const$0 = constants$1950.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbKey"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwMagic"),
        JAVA_INT.withName("cbKey"),
        JAVA_INT.withName("hashAlgorithm"),
        JAVA_INT.withName("standardVersion"),
        JAVA_INT.withName("cbSeedLength"),
        JAVA_INT.withName("cbGroupSize"),
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("Count")
    ).withName("_BCRYPT_DSA_KEY_BLOB_V2");
    static final VarHandle const$2 = constants$1951.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwMagic"));
    static final VarHandle const$3 = constants$1951.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbKey"));
    static final VarHandle const$4 = constants$1951.const$1.varHandle(MemoryLayout.PathElement.groupElement("hashAlgorithm"));
    static final VarHandle const$5 = constants$1951.const$1.varHandle(MemoryLayout.PathElement.groupElement("standardVersion"));
}


