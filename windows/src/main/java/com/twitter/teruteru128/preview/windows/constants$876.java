// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$876 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$876() {}
    static final VarHandle const$0 = constants$875.const$0.varHandle(MemoryLayout.PathElement.groupElement("ReparsePointTag"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("StructureVersion"),
        JAVA_SHORT.withName("StructureSize"),
        JAVA_INT.withName("Protocol"),
        JAVA_SHORT.withName("ProtocolMajorVersion"),
        JAVA_SHORT.withName("ProtocolMinorVersion"),
        JAVA_SHORT.withName("ProtocolRevision"),
        JAVA_SHORT.withName("Reserved"),
        JAVA_INT.withName("Flags"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, JAVA_INT).withName("Reserved")
        ).withName("GenericReserved"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    JAVA_INT.withName("Capabilities")
                ).withName("Server"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("Capabilities"),
                    JAVA_INT.withName("CachingFlags")
                ).withName("Share")
            ).withName("Smb2"),
            MemoryLayout.sequenceLayout(16, JAVA_INT).withName("Reserved")
        ).withName("ProtocolSpecific")
    ).withName("_FILE_REMOTE_PROTOCOL_INFO");
    static final VarHandle const$2 = constants$876.const$1.varHandle(MemoryLayout.PathElement.groupElement("StructureVersion"));
    static final VarHandle const$3 = constants$876.const$1.varHandle(MemoryLayout.PathElement.groupElement("StructureSize"));
    static final VarHandle const$4 = constants$876.const$1.varHandle(MemoryLayout.PathElement.groupElement("Protocol"));
    static final VarHandle const$5 = constants$876.const$1.varHandle(MemoryLayout.PathElement.groupElement("ProtocolMajorVersion"));
}

