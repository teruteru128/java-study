// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1147 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1147() {}
    static final VarHandle const$0 = constants$1146.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(32),
        JAVA_INT.withName("mouseData"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagMOUSEHOOKSTRUCTEX");
    static final VarHandle const$2 = constants$1147.const$1.varHandle(MemoryLayout.PathElement.groupElement("mouseData"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("hwnd"),
        JAVA_INT.withName("message"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("wParam"),
        JAVA_LONG.withName("lParam")
    ).withName("tagHARDWAREHOOKSTRUCT");
    static final VarHandle const$4 = constants$1147.const$3.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    static final VarHandle const$5 = constants$1147.const$3.varHandle(MemoryLayout.PathElement.groupElement("message"));
}


