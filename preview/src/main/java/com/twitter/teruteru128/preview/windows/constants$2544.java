// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2544 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2544() {}
    static final VarHandle const$0 = constants$2543.const$1.varHandle(MemoryLayout.PathElement.groupElement("NumberDrives"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("ExBufferSize"),
        JAVA_SHORT.withName("ExFlags"),
        JAVA_INT.withName("ExCylinders"),
        JAVA_INT.withName("ExHeads"),
        JAVA_INT.withName("ExSectorsPerTrack"),
        JAVA_LONG.withName("ExSectorsPerDrive"),
        JAVA_SHORT.withName("ExSectorSize"),
        JAVA_SHORT.withName("ExReserved"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DISK_EX_INT13_INFO");
    static final VarHandle const$2 = constants$2544.const$1.varHandle(MemoryLayout.PathElement.groupElement("ExBufferSize"));
    static final VarHandle const$3 = constants$2544.const$1.varHandle(MemoryLayout.PathElement.groupElement("ExFlags"));
    static final VarHandle const$4 = constants$2544.const$1.varHandle(MemoryLayout.PathElement.groupElement("ExCylinders"));
    static final VarHandle const$5 = constants$2544.const$1.varHandle(MemoryLayout.PathElement.groupElement("ExHeads"));
}

