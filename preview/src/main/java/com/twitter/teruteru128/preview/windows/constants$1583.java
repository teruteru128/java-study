// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1583 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1583() {}
    static final VarHandle const$0 = constants$1582.const$3.varHandle(MemoryLayout.PathElement.groupElement("nCmdShow"));
    static final VarHandle const$1 = constants$1582.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpstrText"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withByteAlignment(1).withName("dwCallback"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("hWnd"),
        JAVA_INT.withByteAlignment(1).withName("nCmdShow"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("lpstrText")
    ).withName("tagMCI_ANIM_WINDOW_PARMSW");
    static final VarHandle const$3 = constants$1583.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    static final VarHandle const$4 = constants$1583.const$2.varHandle(MemoryLayout.PathElement.groupElement("hWnd"));
    static final VarHandle const$5 = constants$1583.const$2.varHandle(MemoryLayout.PathElement.groupElement("nCmdShow"));
}

