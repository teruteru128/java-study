// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1145 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1145() {}
    static final VarHandle const$0 = constants$1144.const$4.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    static final VarHandle const$1 = constants$1144.const$4.varHandle(MemoryLayout.PathElement.groupElement("time"));
    static final VarHandle const$2 = constants$1144.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("idThread"),
        JAVA_INT.withName("idThreadInstaller"),
        JAVA_LONG.withName("lParam"),
        JAVA_LONG.withName("wParam"),
        JAVA_INT.withName("code"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagDEBUGHOOKINFO");
    static final VarHandle const$4 = constants$1145.const$3.varHandle(MemoryLayout.PathElement.groupElement("idThread"));
    static final VarHandle const$5 = constants$1145.const$3.varHandle(MemoryLayout.PathElement.groupElement("idThreadInstaller"));
}


