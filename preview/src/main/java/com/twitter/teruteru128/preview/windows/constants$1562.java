// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1562 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1562() {}
    static final VarHandle const$0 = constants$1561.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpstrReturn"));
    static final VarHandle const$1 = constants$1561.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwRetSize"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withByteAlignment(1).withName("dwCallback"),
        JAVA_INT.withByteAlignment(1).withName("dwReturn"),
        JAVA_INT.withByteAlignment(1).withName("dwItem")
    ).withName("tagMCI_GETDEVCAPS_PARMS");
    static final VarHandle const$3 = constants$1562.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    static final VarHandle const$4 = constants$1562.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwReturn"));
    static final VarHandle const$5 = constants$1562.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwItem"));
}


