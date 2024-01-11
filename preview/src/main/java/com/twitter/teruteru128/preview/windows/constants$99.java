// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$99 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$99() {}
    static final VarHandle const$0 = constants$98.const$5.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    static final UnionLayout const$1 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("Low"),
            JAVA_LONG.withName("High")
        ).withName("$anon$0"),
        MemoryLayout.sequenceLayout(2, JAVA_DOUBLE).withName("D"),
        MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("S"),
        MemoryLayout.sequenceLayout(8, JAVA_SHORT).withName("H"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("B")
    ).withName("_ARM64_NT_NEON128");
    static final VarHandle const$2 = constants$99.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Low"));
    static final VarHandle const$3 = constants$99.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("High"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("ContextFlags"),
        JAVA_INT.withName("Cpsr"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_LONG.withName("X0"),
                JAVA_LONG.withName("X1"),
                JAVA_LONG.withName("X2"),
                JAVA_LONG.withName("X3"),
                JAVA_LONG.withName("X4"),
                JAVA_LONG.withName("X5"),
                JAVA_LONG.withName("X6"),
                JAVA_LONG.withName("X7"),
                JAVA_LONG.withName("X8"),
                JAVA_LONG.withName("X9"),
                JAVA_LONG.withName("X10"),
                JAVA_LONG.withName("X11"),
                JAVA_LONG.withName("X12"),
                JAVA_LONG.withName("X13"),
                JAVA_LONG.withName("X14"),
                JAVA_LONG.withName("X15"),
                JAVA_LONG.withName("X16"),
                JAVA_LONG.withName("X17"),
                JAVA_LONG.withName("X18"),
                JAVA_LONG.withName("X19"),
                JAVA_LONG.withName("X20"),
                JAVA_LONG.withName("X21"),
                JAVA_LONG.withName("X22"),
                JAVA_LONG.withName("X23"),
                JAVA_LONG.withName("X24"),
                JAVA_LONG.withName("X25"),
                JAVA_LONG.withName("X26"),
                JAVA_LONG.withName("X27"),
                JAVA_LONG.withName("X28"),
                JAVA_LONG.withName("Fp"),
                JAVA_LONG.withName("Lr")
            ).withName("$anon$0"),
            MemoryLayout.sequenceLayout(31, JAVA_LONG).withName("X")
        ).withName("$anon$0"),
        JAVA_LONG.withName("Sp"),
        JAVA_LONG.withName("Pc"),
        MemoryLayout.sequenceLayout(32, MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_LONG.withName("Low"),
                JAVA_LONG.withName("High")
            ).withName("$anon$0"),
            MemoryLayout.sequenceLayout(2, JAVA_DOUBLE).withName("D"),
            MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("S"),
            MemoryLayout.sequenceLayout(8, JAVA_SHORT).withName("H"),
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("B")
        ).withName("_ARM64_NT_NEON128")).withName("V"),
        JAVA_INT.withName("Fpcr"),
        JAVA_INT.withName("Fpsr"),
        MemoryLayout.sequenceLayout(8, JAVA_INT).withName("Bcr"),
        MemoryLayout.sequenceLayout(8, JAVA_LONG).withName("Bvr"),
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("Wcr"),
        MemoryLayout.sequenceLayout(2, JAVA_LONG).withName("Wvr")
    ).withName("_ARM64_NT_CONTEXT");
    static final VarHandle const$5 = constants$99.const$4.varHandle(MemoryLayout.PathElement.groupElement("ContextFlags"));
}


