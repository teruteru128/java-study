// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$383 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$383() {}
    static final VarHandle const$0 = constants$382.const$1.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    static final VarHandle const$1 = constants$382.const$1.varHandle(MemoryLayout.PathElement.groupElement("SizeOfData"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("Sig1"),
        JAVA_SHORT.withName("Sig2"),
        JAVA_SHORT.withName("Version"),
        JAVA_SHORT.withName("Machine"),
        JAVA_INT.withName("TimeDateStamp"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("ClassID"),
        JAVA_INT.withName("SizeOfData"),
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("MetaDataSize"),
        JAVA_INT.withName("MetaDataOffset")
    ).withName("ANON_OBJECT_HEADER_V2");
    static final VarHandle const$3 = constants$383.const$2.varHandle(MemoryLayout.PathElement.groupElement("Sig1"));
    static final VarHandle const$4 = constants$383.const$2.varHandle(MemoryLayout.PathElement.groupElement("Sig2"));
    static final VarHandle const$5 = constants$383.const$2.varHandle(MemoryLayout.PathElement.groupElement("Version"));
}


