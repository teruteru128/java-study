// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3054 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3054() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IStreamVtbl.Commit.class, "apply", constants$65.const$2);
    static final VarHandle const$1 = constants$3050.const$1.varHandle(MemoryLayout.PathElement.groupElement("Commit"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IStreamVtbl.Revert.class, "apply", constants$18.const$5);
    static final VarHandle const$3 = constants$3050.const$1.varHandle(MemoryLayout.PathElement.groupElement("Revert"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
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
        ).withName("_ULARGE_INTEGER"),
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
        ).withName("_ULARGE_INTEGER"),
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IStreamVtbl.LockRegion.class, "apply", constants$3054.const$4);
}

