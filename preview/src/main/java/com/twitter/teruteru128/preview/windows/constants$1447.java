// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1447 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1447() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "EnumTimeFormatsEx",
        constants$993.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(LOCALE_ENUMPROCEX.class, "apply", constants$509.const$1);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "EnumSystemLocalesEx",
        constants$616.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ResolveLocaleName",
        constants$570.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("X"),
        JAVA_SHORT.withName("Y")
    ).withName("_COORD");
    static final VarHandle const$5 = constants$1447.const$4.varHandle(MemoryLayout.PathElement.groupElement("X"));
}


