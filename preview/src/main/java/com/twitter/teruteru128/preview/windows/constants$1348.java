// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1348 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1348() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwFlags"),
        RuntimeHelper.POINTER.withName("lpszDefaultScheme")
    ).withName("tagHIGHCONTRASTA");
    static final VarHandle const$1 = constants$1348.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$2 = constants$1348.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$3 = constants$1348.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpszDefaultScheme"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwFlags"),
        RuntimeHelper.POINTER.withName("lpszDefaultScheme")
    ).withName("tagHIGHCONTRASTW");
    static final VarHandle const$5 = constants$1348.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
}


