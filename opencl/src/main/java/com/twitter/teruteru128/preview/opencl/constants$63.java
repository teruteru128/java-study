// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$63 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$63() {}
    static final VarHandle const$0 = constants$62.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("lo"));
    static final VarHandle const$1 = constants$62.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("hi"));
    static final UnionLayout const$2 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("s"),
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("x"),
            JAVA_BYTE.withName("y"),
            JAVA_BYTE.withName("z"),
            JAVA_BYTE.withName("w")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("s0"),
            JAVA_BYTE.withName("s1"),
            JAVA_BYTE.withName("s2"),
            JAVA_BYTE.withName("s3")
        ).withName("$anon$1"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("s"),
                MemoryLayout.structLayout(
                    JAVA_BYTE.withName("x"),
                    JAVA_BYTE.withName("y")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    JAVA_BYTE.withName("s0"),
                    JAVA_BYTE.withName("s1")
                ).withName("$anon$1"),
                MemoryLayout.structLayout(
                    JAVA_BYTE.withName("lo"),
                    JAVA_BYTE.withName("hi")
                ).withName("$anon$2")
            ).withName("lo"),
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("s"),
                MemoryLayout.structLayout(
                    JAVA_BYTE.withName("x"),
                    JAVA_BYTE.withName("y")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    JAVA_BYTE.withName("s0"),
                    JAVA_BYTE.withName("s1")
                ).withName("$anon$1"),
                MemoryLayout.structLayout(
                    JAVA_BYTE.withName("lo"),
                    JAVA_BYTE.withName("hi")
                ).withName("$anon$2")
            ).withName("hi")
        ).withName("$anon$2")
    ).withName("");
    static final VarHandle const$3 = constants$63.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$4 = constants$63.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$5 = constants$63.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("z"));
}

