// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3438 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3438() {}
    static final VarHandle const$0 = constants$3437.const$5.varHandle(MemoryLayout.PathElement.groupElement("rgvarg"));
    static final VarHandle const$1 = constants$3437.const$5.varHandle(MemoryLayout.PathElement.groupElement("rgdispidNamedArgs"));
    static final VarHandle const$2 = constants$3437.const$5.varHandle(MemoryLayout.PathElement.groupElement("cArgs"));
    static final VarHandle const$3 = constants$3437.const$5.varHandle(MemoryLayout.PathElement.groupElement("cNamedArgs"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("wCode"),
        JAVA_SHORT.withName("wReserved"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("bstrSource"),
        RuntimeHelper.POINTER.withName("bstrDescription"),
        RuntimeHelper.POINTER.withName("bstrHelpFile"),
        JAVA_INT.withName("dwHelpContext"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pvReserved"),
        RuntimeHelper.POINTER.withName("pfnDeferredFillIn"),
        JAVA_INT.withName("scode"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagEXCEPINFO");
    static final VarHandle const$5 = constants$3438.const$4.varHandle(MemoryLayout.PathElement.groupElement("wCode"));
}

