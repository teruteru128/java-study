// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1329 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1329() {}
    static final VarHandle const$0 = constants$1327.const$4.varHandle(MemoryLayout.PathElement.groupElement("style"));
    static final VarHandle const$1 = constants$1327.const$4.varHandle(MemoryLayout.PathElement.groupElement("lParam"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("szClass"),
        RuntimeHelper.POINTER.withName("szTitle"),
        RuntimeHelper.POINTER.withName("hOwner"),
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("cx"),
        JAVA_INT.withName("cy"),
        JAVA_INT.withName("style"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("lParam")
    ).withName("tagMDICREATESTRUCTW");
    static final VarHandle const$3 = constants$1329.const$2.varHandle(MemoryLayout.PathElement.groupElement("szClass"));
    static final VarHandle const$4 = constants$1329.const$2.varHandle(MemoryLayout.PathElement.groupElement("szTitle"));
    static final VarHandle const$5 = constants$1329.const$2.varHandle(MemoryLayout.PathElement.groupElement("hOwner"));
}


