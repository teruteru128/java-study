// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2897 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2897() {}
    static final VarHandle const$0 = constants$2895.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwNupBorderCaps"));
    static final VarHandle const$1 = constants$2895.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwBookletHandlingCaps"));
    static final VarHandle const$2 = constants$2895.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwScalingCaps"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pName")
    ).withName("_PORT_INFO_1A");
    static final VarHandle const$4 = constants$2897.const$3.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pName")
    ).withName("_PORT_INFO_1W");
}


