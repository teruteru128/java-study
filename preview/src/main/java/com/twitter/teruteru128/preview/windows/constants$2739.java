// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2739 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2739() {}
    static final VarHandle const$0 = constants$2738.const$2.varHandle(MemoryLayout.PathElement.groupElement("Reserved2"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("OpStatus"),
        JAVA_SHORT.withName("FailingDriverNameLen"),
        MemoryLayout.sequenceLayout(32, JAVA_SHORT).withName("FailingDriverName"),
        JAVA_SHORT.withName("FailureReasonLen"),
        MemoryLayout.sequenceLayout(128, JAVA_SHORT).withName("FailureReason")
    ).withName("_FS_BPIO_RESULTS");
    static final VarHandle const$2 = constants$2739.const$1.varHandle(MemoryLayout.PathElement.groupElement("OpStatus"));
    static final VarHandle const$3 = constants$2739.const$1.varHandle(MemoryLayout.PathElement.groupElement("FailingDriverNameLen"));
    static final VarHandle const$4 = constants$2739.const$1.varHandle(MemoryLayout.PathElement.groupElement("FailureReasonLen"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("ActiveBypassIoCount"),
        JAVA_SHORT.withName("StorageDriverNameLen"),
        MemoryLayout.sequenceLayout(32, JAVA_SHORT).withName("StorageDriverName"),
        MemoryLayout.paddingLayout(2)
    ).withName("_FS_BPIO_INFO");
}

