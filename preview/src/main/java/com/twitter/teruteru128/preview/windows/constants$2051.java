// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2051 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2051() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cTaggedAttribute"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgTaggedAttribute"),
        JAVA_INT.withName("cTaggedContentInfo"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgTaggedContentInfo"),
        JAVA_INT.withName("cTaggedOtherMsg"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgTaggedOtherMsg")
    ).withName("_CMC_RESPONSE_INFO");
    static final VarHandle const$1 = constants$2051.const$0.varHandle(MemoryLayout.PathElement.groupElement("cTaggedAttribute"));
    static final VarHandle const$2 = constants$2051.const$0.varHandle(MemoryLayout.PathElement.groupElement("rgTaggedAttribute"));
    static final VarHandle const$3 = constants$2051.const$0.varHandle(MemoryLayout.PathElement.groupElement("cTaggedContentInfo"));
    static final VarHandle const$4 = constants$2051.const$0.varHandle(MemoryLayout.PathElement.groupElement("rgTaggedContentInfo"));
    static final VarHandle const$5 = constants$2051.const$0.varHandle(MemoryLayout.PathElement.groupElement("cTaggedOtherMsg"));
}


