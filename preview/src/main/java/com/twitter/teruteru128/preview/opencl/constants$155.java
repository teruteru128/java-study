// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$155 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$155() {}
    static final UnionLayout const$0 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(8, JAVA_FLOAT).withName("s"),
        MemoryLayout.structLayout(
            JAVA_FLOAT.withName("x"),
            JAVA_FLOAT.withName("y"),
            JAVA_FLOAT.withName("z"),
            JAVA_FLOAT.withName("w")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            JAVA_FLOAT.withName("s0"),
            JAVA_FLOAT.withName("s1"),
            JAVA_FLOAT.withName("s2"),
            JAVA_FLOAT.withName("s3"),
            JAVA_FLOAT.withName("s4"),
            JAVA_FLOAT.withName("s5"),
            JAVA_FLOAT.withName("s6"),
            JAVA_FLOAT.withName("s7")
        ).withName("$anon$1"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("s"),
                MemoryLayout.structLayout(
                    JAVA_FLOAT.withName("x"),
                    JAVA_FLOAT.withName("y"),
                    JAVA_FLOAT.withName("z"),
                    JAVA_FLOAT.withName("w")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    JAVA_FLOAT.withName("s0"),
                    JAVA_FLOAT.withName("s1"),
                    JAVA_FLOAT.withName("s2"),
                    JAVA_FLOAT.withName("s3")
                ).withName("$anon$1"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("s"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("x"),
                            JAVA_FLOAT.withName("y")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("s0"),
                            JAVA_FLOAT.withName("s1")
                        ).withName("$anon$1"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("lo"),
                            JAVA_FLOAT.withName("hi")
                        ).withName("$anon$2"),
                        MemoryLayout.sequenceLayout(1, JAVA_LONG).withName("v2")
                    ).withName("lo"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("s"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("x"),
                            JAVA_FLOAT.withName("y")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("s0"),
                            JAVA_FLOAT.withName("s1")
                        ).withName("$anon$1"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("lo"),
                            JAVA_FLOAT.withName("hi")
                        ).withName("$anon$2"),
                        MemoryLayout.sequenceLayout(1, JAVA_LONG).withName("v2")
                    ).withName("hi")
                ).withName("$anon$2"),
                MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(1, JAVA_LONG)).withName("v2"),
                MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("v4")
            ).withName("lo"),
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("s"),
                MemoryLayout.structLayout(
                    JAVA_FLOAT.withName("x"),
                    JAVA_FLOAT.withName("y"),
                    JAVA_FLOAT.withName("z"),
                    JAVA_FLOAT.withName("w")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    JAVA_FLOAT.withName("s0"),
                    JAVA_FLOAT.withName("s1"),
                    JAVA_FLOAT.withName("s2"),
                    JAVA_FLOAT.withName("s3")
                ).withName("$anon$1"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("s"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("x"),
                            JAVA_FLOAT.withName("y")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("s0"),
                            JAVA_FLOAT.withName("s1")
                        ).withName("$anon$1"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("lo"),
                            JAVA_FLOAT.withName("hi")
                        ).withName("$anon$2"),
                        MemoryLayout.sequenceLayout(1, JAVA_LONG).withName("v2")
                    ).withName("lo"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("s"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("x"),
                            JAVA_FLOAT.withName("y")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("s0"),
                            JAVA_FLOAT.withName("s1")
                        ).withName("$anon$1"),
                        MemoryLayout.structLayout(
                            JAVA_FLOAT.withName("lo"),
                            JAVA_FLOAT.withName("hi")
                        ).withName("$anon$2"),
                        MemoryLayout.sequenceLayout(1, JAVA_LONG).withName("v2")
                    ).withName("hi")
                ).withName("$anon$2"),
                MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(1, JAVA_LONG)).withName("v2"),
                MemoryLayout.sequenceLayout(4, JAVA_FLOAT).withName("v4")
            ).withName("hi")
        ).withName("$anon$2"),
        MemoryLayout.sequenceLayout(4, MemoryLayout.sequenceLayout(1, JAVA_LONG)).withName("v2"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(4, JAVA_FLOAT)).withName("v4")
    ).withName("");
    static final VarHandle const$1 = constants$155.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$2 = constants$155.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("y"));
    static final VarHandle const$3 = constants$155.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("z"));
    static final VarHandle const$4 = constants$155.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("w"));
    static final VarHandle const$5 = constants$155.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("s0"));
}


