// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$785 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$785() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "BackupSeek",
        constants$785.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "BackupWrite",
        constants$784.const$4
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwStreamId"),
        JAVA_INT.withName("dwStreamAttributes"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("u"),
            JAVA_LONG.withName("QuadPart")
        ).withName("Size"),
        JAVA_INT.withName("dwStreamNameSize"),
        MemoryLayout.sequenceLayout(1, JAVA_SHORT).withName("cStreamName"),
        MemoryLayout.paddingLayout(2)
    ).withName("_WIN32_STREAM_ID");
    static final VarHandle const$4 = constants$785.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwStreamId"));
    static final VarHandle const$5 = constants$785.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwStreamAttributes"));
}


