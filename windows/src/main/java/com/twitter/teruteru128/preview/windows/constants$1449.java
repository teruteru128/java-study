// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1449 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1449() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("bKeyDown"),
        JAVA_SHORT.withName("wRepeatCount"),
        JAVA_SHORT.withName("wVirtualKeyCode"),
        JAVA_SHORT.withName("wVirtualScanCode"),
        MemoryLayout.unionLayout(
            JAVA_SHORT.withName("UnicodeChar"),
            JAVA_BYTE.withName("AsciiChar")
        ).withName("uChar"),
        JAVA_INT.withName("dwControlKeyState")
    ).withName("_KEY_EVENT_RECORD");
    static final VarHandle const$1 = constants$1449.const$0.varHandle(MemoryLayout.PathElement.groupElement("bKeyDown"));
    static final VarHandle const$2 = constants$1449.const$0.varHandle(MemoryLayout.PathElement.groupElement("wRepeatCount"));
    static final VarHandle const$3 = constants$1449.const$0.varHandle(MemoryLayout.PathElement.groupElement("wVirtualKeyCode"));
    static final VarHandle const$4 = constants$1449.const$0.varHandle(MemoryLayout.PathElement.groupElement("wVirtualScanCode"));
    static final UnionLayout const$5 = MemoryLayout.unionLayout(
        JAVA_SHORT.withName("UnicodeChar"),
        JAVA_BYTE.withName("AsciiChar")
    ).withName("");
}

