// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1655 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1655() {}
    static final VarHandle const$0 = constants$1654.const$3.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    static final VarHandle const$1 = constants$1654.const$3.varHandle(MemoryLayout.PathElement.groupElement("wTechnology"));
    static final VarHandle const$2 = constants$1654.const$3.varHandle(MemoryLayout.PathElement.groupElement("wReserved1"));
    static final VarHandle const$3 = constants$1654.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "auxGetNumDevs",
        constants$1.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "auxGetDevCapsA",
        constants$1622.const$1
    );
}


