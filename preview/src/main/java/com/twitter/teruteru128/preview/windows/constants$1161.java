// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1161 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1161() {}
    static final VarHandle const$0 = constants$1159.const$0.varHandle(MemoryLayout.PathElement.groupElement("hIconSm"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("style"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpfnWndProc"),
        JAVA_INT.withName("cbClsExtra"),
        JAVA_INT.withName("cbWndExtra"),
        RuntimeHelper.POINTER.withName("hInstance"),
        RuntimeHelper.POINTER.withName("hIcon"),
        RuntimeHelper.POINTER.withName("hCursor"),
        RuntimeHelper.POINTER.withName("hbrBackground"),
        RuntimeHelper.POINTER.withName("lpszMenuName"),
        RuntimeHelper.POINTER.withName("lpszClassName")
    ).withName("tagWNDCLASSA");
    static final VarHandle const$2 = constants$1161.const$1.varHandle(MemoryLayout.PathElement.groupElement("style"));
    static final VarHandle const$3 = constants$1161.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpfnWndProc"));
    static final VarHandle const$4 = constants$1161.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbClsExtra"));
    static final VarHandle const$5 = constants$1161.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbWndExtra"));
}


