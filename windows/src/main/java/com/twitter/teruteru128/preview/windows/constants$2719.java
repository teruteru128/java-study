// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2719 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2719() {}
    static final VarHandle const$0 = constants$2718.const$5.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$1 = constants$2718.const$5.varHandle(MemoryLayout.PathElement.groupElement("FileHandle"));
    static final VarHandle const$2 = constants$2718.const$5.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("State"),
        JAVA_LONG.withName("SourceFileOffset"),
        JAVA_LONG.withName("TargetFileOffset"),
        JAVA_LONG.withName("ByteCount"),
        JAVA_LONG.withName("BytesDuplicated")
    ).withName("_ASYNC_DUPLICATE_EXTENTS_STATUS");
    static final VarHandle const$4 = constants$2719.const$3.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$5 = constants$2719.const$3.varHandle(MemoryLayout.PathElement.groupElement("State"));
}

