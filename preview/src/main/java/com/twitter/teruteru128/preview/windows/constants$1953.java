// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1953 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1953() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbLength"),
        JAVA_INT.withName("dwMagic"),
        JAVA_INT.withName("cbKeyLength"),
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("Count"),
        MemoryLayout.sequenceLayout(20, JAVA_BYTE).withName("Seed"),
        MemoryLayout.sequenceLayout(20, JAVA_BYTE).withName("q")
    ).withName("_BCRYPT_DSA_PARAMETER_HEADER");
    static final VarHandle const$1 = constants$1953.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbLength"));
    static final VarHandle const$2 = constants$1953.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwMagic"));
    static final VarHandle const$3 = constants$1953.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbKeyLength"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbLength"),
        JAVA_INT.withName("dwMagic"),
        JAVA_INT.withName("cbKeyLength"),
        JAVA_INT.withName("hashAlgorithm"),
        JAVA_INT.withName("standardVersion"),
        JAVA_INT.withName("cbSeedLength"),
        JAVA_INT.withName("cbGroupSize"),
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("Count")
    ).withName("_BCRYPT_DSA_PARAMETER_HEADER_V2");
    static final VarHandle const$5 = constants$1953.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbLength"));
}


