// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$112 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$112() {}
    static final VarHandle const$0 = constants$106.const$5.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("sE"));
    static final VarHandle const$1 = constants$106.const$5.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("sF"));
    static final UnionLayout const$2 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("s"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("s0"),
            JAVA_INT.withName("s1")
        ).withName("$anon$1"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("lo"),
            JAVA_INT.withName("hi")
        ).withName("$anon$2"),
        MemoryLayout.sequenceLayout(1, JAVA_LONG).withName("v2")
    ).withName("");
    static final VarHandle const$3 = constants$112.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$4 = constants$112.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$5 = constants$112.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("s0"));
}

