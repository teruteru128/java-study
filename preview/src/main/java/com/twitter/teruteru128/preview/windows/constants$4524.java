// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4524 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4524() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwSize"),
        JAVA_INT.withName("dwVersion"),
        JAVA_INT.withName("dwStrLen"),
        JAVA_INT.withName("dwStrOffset"),
        JAVA_INT.withName("dwCompStrLen"),
        JAVA_INT.withName("dwCompStrOffset"),
        JAVA_INT.withName("dwTargetStrLen"),
        JAVA_INT.withName("dwTargetStrOffset")
    ).withName("tagRECONVERTSTRING");
    static final VarHandle const$1 = constants$4524.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    static final VarHandle const$2 = constants$4524.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$3 = constants$4524.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwStrLen"));
    static final VarHandle const$4 = constants$4524.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwStrOffset"));
    static final VarHandle const$5 = constants$4524.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwCompStrLen"));
}


