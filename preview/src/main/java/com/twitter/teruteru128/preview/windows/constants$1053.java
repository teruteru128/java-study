// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1053 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1053() {}
    static final VarHandle const$0 = constants$1051.const$4.varHandle(MemoryLayout.PathElement.groupElement("caReferenceWhite"));
    static final VarHandle const$1 = constants$1051.const$4.varHandle(MemoryLayout.PathElement.groupElement("caContrast"));
    static final VarHandle const$2 = constants$1051.const$4.varHandle(MemoryLayout.PathElement.groupElement("caBrightness"));
    static final VarHandle const$3 = constants$1051.const$4.varHandle(MemoryLayout.PathElement.groupElement("caColorfulness"));
    static final VarHandle const$4 = constants$1051.const$4.varHandle(MemoryLayout.PathElement.groupElement("caRedGreenTint"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SetColorAdjustment",
        constants$34.const$0
    );
}


