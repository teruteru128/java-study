// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1564 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1564() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_LONG.withByteAlignment(1).withName("dwCallback"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("lpstrReturn"),
        JAVA_INT.withByteAlignment(1).withName("dwRetSize"),
        JAVA_INT.withByteAlignment(1).withName("dwNumber"),
        JAVA_INT.withByteAlignment(1).withName("wDeviceType")
    ).withName("tagMCI_SYSINFO_PARMSW");
    static final VarHandle const$1 = constants$1564.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    static final VarHandle const$2 = constants$1564.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpstrReturn"));
    static final VarHandle const$3 = constants$1564.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwRetSize"));
    static final VarHandle const$4 = constants$1564.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwNumber"));
    static final VarHandle const$5 = constants$1564.const$0.varHandle(MemoryLayout.PathElement.groupElement("wDeviceType"));
}


