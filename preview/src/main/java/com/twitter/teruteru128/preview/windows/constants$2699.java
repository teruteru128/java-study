// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2699 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2699() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("ChecksumAlgorithm"),
        JAVA_SHORT.withName("Reserved"),
        JAVA_INT.withName("Flags")
    ).withName("_FSCTL_SET_INTEGRITY_INFORMATION_BUFFER");
    static final VarHandle const$1 = constants$2699.const$0.varHandle(MemoryLayout.PathElement.groupElement("ChecksumAlgorithm"));
    static final VarHandle const$2 = constants$2699.const$0.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final VarHandle const$3 = constants$2699.const$0.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("EnableIntegrity"),
        JAVA_BYTE.withName("KeepIntegrityStateUnchanged"),
        JAVA_SHORT.withName("Reserved"),
        JAVA_INT.withName("Flags"),
        JAVA_BYTE.withName("Version"),
        MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("Reserved2")
    ).withName("_FSCTL_SET_INTEGRITY_INFORMATION_BUFFER_EX");
    static final VarHandle const$5 = constants$2699.const$4.varHandle(MemoryLayout.PathElement.groupElement("EnableIntegrity"));
}


