// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1853 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1853() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ExtractAssociatedIconExA",
        constants$699.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "ExtractAssociatedIconExW",
        constants$699.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ExtractIconA",
        constants$713.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ExtractIconW",
        constants$713.const$1
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("uSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("pt"),
        JAVA_INT.withName("fNC"),
        RuntimeHelper.POINTER.withName("lpFileList"),
        JAVA_INT.withName("grfKeyState"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DRAGINFOA");
    static final VarHandle const$5 = constants$1853.const$4.varHandle(MemoryLayout.PathElement.groupElement("uSize"));
}


