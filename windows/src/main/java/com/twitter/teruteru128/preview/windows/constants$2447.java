// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2447 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2447() {}
    static final VarHandle const$0 = constants$2446.const$2.varHandle(MemoryLayout.PathElement.groupElement("TokenLength"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("Reserved"),
        JAVA_LONG.withName("TokenOffset"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("TokenType"),
            MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("Reserved"),
            MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("TokenIdLength"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(504, JAVA_BYTE).withName("Reserved2")
                ).withName("StorageOffloadZeroDataToken"),
                MemoryLayout.sequenceLayout(504, JAVA_BYTE).withName("Token")
            ).withName("$anon$0")
        ).withName("Token")
    ).withName("_DEVICE_DSM_OFFLOAD_WRITE_PARAMETERS");
    static final VarHandle const$2 = constants$2447.const$1.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$3 = constants$2447.const$1.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final VarHandle const$4 = constants$2447.const$1.varHandle(MemoryLayout.PathElement.groupElement("TokenOffset"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("OffloadWriteFlags"),
        JAVA_INT.withName("Reserved"),
        JAVA_LONG.withName("LengthCopied")
    ).withName("_STORAGE_OFFLOAD_WRITE_OUTPUT");
}

