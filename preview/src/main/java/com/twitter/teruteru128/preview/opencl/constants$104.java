// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$104 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$104() {}
    static final VarHandle const$0 = constants$103.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("s0"));
    static final VarHandle const$1 = constants$103.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("s1"));
    static final VarHandle const$2 = constants$103.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("s2"));
    static final VarHandle const$3 = constants$103.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("s3"));
    static final UnionLayout const$4 = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(8, JAVA_SHORT).withName("s"),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("x"),
            JAVA_SHORT.withName("y"),
            JAVA_SHORT.withName("z"),
            JAVA_SHORT.withName("w")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("s0"),
            JAVA_SHORT.withName("s1"),
            JAVA_SHORT.withName("s2"),
            JAVA_SHORT.withName("s3"),
            JAVA_SHORT.withName("s4"),
            JAVA_SHORT.withName("s5"),
            JAVA_SHORT.withName("s6"),
            JAVA_SHORT.withName("s7")
        ).withName("$anon$1"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(4, JAVA_SHORT).withName("s"),
                MemoryLayout.structLayout(
                    JAVA_SHORT.withName("x"),
                    JAVA_SHORT.withName("y"),
                    JAVA_SHORT.withName("z"),
                    JAVA_SHORT.withName("w")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    JAVA_SHORT.withName("s0"),
                    JAVA_SHORT.withName("s1"),
                    JAVA_SHORT.withName("s2"),
                    JAVA_SHORT.withName("s3")
                ).withName("$anon$1"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("s"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("x"),
                            JAVA_SHORT.withName("y")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("s0"),
                            JAVA_SHORT.withName("s1")
                        ).withName("$anon$1"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("lo"),
                            JAVA_SHORT.withName("hi")
                        ).withName("$anon$2")
                    ).withName("lo"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("s"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("x"),
                            JAVA_SHORT.withName("y")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("s0"),
                            JAVA_SHORT.withName("s1")
                        ).withName("$anon$1"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("lo"),
                            JAVA_SHORT.withName("hi")
                        ).withName("$anon$2")
                    ).withName("hi")
                ).withName("$anon$2")
            ).withName("lo"),
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(4, JAVA_SHORT).withName("s"),
                MemoryLayout.structLayout(
                    JAVA_SHORT.withName("x"),
                    JAVA_SHORT.withName("y"),
                    JAVA_SHORT.withName("z"),
                    JAVA_SHORT.withName("w")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    JAVA_SHORT.withName("s0"),
                    JAVA_SHORT.withName("s1"),
                    JAVA_SHORT.withName("s2"),
                    JAVA_SHORT.withName("s3")
                ).withName("$anon$1"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("s"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("x"),
                            JAVA_SHORT.withName("y")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("s0"),
                            JAVA_SHORT.withName("s1")
                        ).withName("$anon$1"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("lo"),
                            JAVA_SHORT.withName("hi")
                        ).withName("$anon$2")
                    ).withName("lo"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("s"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("x"),
                            JAVA_SHORT.withName("y")
                        ).withName("$anon$0"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("s0"),
                            JAVA_SHORT.withName("s1")
                        ).withName("$anon$1"),
                        MemoryLayout.structLayout(
                            JAVA_SHORT.withName("lo"),
                            JAVA_SHORT.withName("hi")
                        ).withName("$anon$2")
                    ).withName("hi")
                ).withName("$anon$2")
            ).withName("hi")
        ).withName("$anon$2")
    ).withName("");
    static final VarHandle const$5 = constants$104.const$4.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("x"));
}


