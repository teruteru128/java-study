// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1515 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1515() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "WNetGetResourceInformationW",
        constants$1.const$3
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpUniversalName")
    ).withName("_UNIVERSAL_NAME_INFOA");
    static final VarHandle const$2 = constants$1515.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpUniversalName"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpUniversalName")
    ).withName("_UNIVERSAL_NAME_INFOW");
    static final VarHandle const$4 = constants$1515.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpUniversalName"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpUniversalName"),
        RuntimeHelper.POINTER.withName("lpConnectionName"),
        RuntimeHelper.POINTER.withName("lpRemainingPath")
    ).withName("_REMOTE_NAME_INFOA");
}


