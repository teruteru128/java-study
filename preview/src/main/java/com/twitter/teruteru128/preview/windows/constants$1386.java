// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1386 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1386() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("usFlags"),
        MemoryLayout.paddingLayout(2),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("ulButtons"),
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("usButtonFlags"),
                JAVA_SHORT.withName("usButtonData")
            ).withName("$anon$0")
        ).withName("$anon$0"),
        JAVA_INT.withName("ulRawButtons"),
        JAVA_INT.withName("lLastX"),
        JAVA_INT.withName("lLastY"),
        JAVA_INT.withName("ulExtraInformation")
    ).withName("tagRAWMOUSE");
    static final VarHandle const$1 = constants$1386.const$0.varHandle(MemoryLayout.PathElement.groupElement("usFlags"));
    static final VarHandle const$2 = constants$1386.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("ulButtons"));
    static final VarHandle const$3 = constants$1386.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("usButtonFlags"));
    static final VarHandle const$4 = constants$1386.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("usButtonData"));
    static final VarHandle const$5 = constants$1386.const$0.varHandle(MemoryLayout.PathElement.groupElement("ulRawButtons"));
}

