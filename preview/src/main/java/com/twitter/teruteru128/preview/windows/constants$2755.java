// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2755 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2755() {}
    static final VarHandle const$0 = constants$2753.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbAtr"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SCardLocateCardsA",
        constants$2755.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SCardLocateCardsW",
        constants$2755.const$1
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbAtr"),
        MemoryLayout.sequenceLayout(36, JAVA_BYTE).withName("rgbAtr"),
        MemoryLayout.sequenceLayout(36, JAVA_BYTE).withName("rgbMask")
    ).withName("_SCARD_ATRMASK");
    static final VarHandle const$5 = constants$2755.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbAtr"));
}


