// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1875 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1875() {}
    static final VarHandle const$0 = constants$1873.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwStateMask"));
    static final VarHandle const$1 = constants$1873.const$4.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("uTimeout"));
    static final VarHandle const$2 = constants$1873.const$4.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("uVersion"));
    static final VarHandle const$3 = constants$1873.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwInfoFlags"));
    static final VarHandle const$4 = constants$1873.const$4.varHandle(MemoryLayout.PathElement.groupElement("hBalloonIcon"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hWnd"),
        JAVA_INT.withName("uID"),
        JAVA_INT.withName("uFlags"),
        JAVA_INT.withName("uCallbackMessage"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hIcon"),
        MemoryLayout.sequenceLayout(128, JAVA_SHORT).withName("szTip"),
        JAVA_INT.withName("dwState"),
        JAVA_INT.withName("dwStateMask"),
        MemoryLayout.sequenceLayout(256, JAVA_SHORT).withName("szInfo"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("uTimeout"),
            JAVA_INT.withName("uVersion")
        ).withName("$anon$0"),
        MemoryLayout.sequenceLayout(64, JAVA_SHORT).withName("szInfoTitle"),
        JAVA_INT.withName("dwInfoFlags"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("guidItem"),
        RuntimeHelper.POINTER.withName("hBalloonIcon")
    ).withName("_NOTIFYICONDATAW");
}


