// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$446 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$446() {}
    static final VarHandle const$0 = constants$445.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("UnwindInfoAddress"));
    static final VarHandle const$1 = constants$445.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("UnwindData"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("MinimumRequiredConfigSize"),
        JAVA_INT.withName("PolicyFlags"),
        JAVA_INT.withName("NumberOfImports"),
        JAVA_INT.withName("ImportList"),
        JAVA_INT.withName("ImportEntrySize"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("FamilyID"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("ImageID"),
        JAVA_INT.withName("ImageVersion"),
        JAVA_INT.withName("SecurityVersion"),
        JAVA_INT.withName("EnclaveSize"),
        JAVA_INT.withName("NumberOfThreads"),
        JAVA_INT.withName("EnclaveFlags")
    ).withName("_IMAGE_ENCLAVE_CONFIG32");
    static final VarHandle const$3 = constants$446.const$2.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$446.const$2.varHandle(MemoryLayout.PathElement.groupElement("MinimumRequiredConfigSize"));
    static final VarHandle const$5 = constants$446.const$2.varHandle(MemoryLayout.PathElement.groupElement("PolicyFlags"));
}


