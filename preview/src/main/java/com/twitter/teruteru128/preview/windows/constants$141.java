// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$141 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$141() {}
    static final VarHandle const$0 = constants$140.const$4.varHandle(MemoryLayout.PathElement.groupElement("SubAuthorityCount"));
    static final UnionLayout const$1 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("Revision"),
            JAVA_BYTE.withName("SubAuthorityCount"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("Value")
            ).withName("IdentifierAuthority"),
            MemoryLayout.sequenceLayout(1, JAVA_INT).withName("SubAuthority")
        ).withName("Sid"),
        MemoryLayout.sequenceLayout(68, JAVA_BYTE).withName("Buffer")
    ).withName("_SE_SID");
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("Sid"),
        JAVA_INT.withName("Attributes"),
        MemoryLayout.paddingLayout(4)
    ).withName("_SID_AND_ATTRIBUTES");
    static final VarHandle const$3 = constants$141.const$2.varHandle(MemoryLayout.PathElement.groupElement("Sid"));
    static final VarHandle const$4 = constants$141.const$2.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("SidCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("SidAttr"),
        MemoryLayout.sequenceLayout(32, JAVA_LONG).withName("Hash")
    ).withName("_SID_AND_ATTRIBUTES_HASH");
}


