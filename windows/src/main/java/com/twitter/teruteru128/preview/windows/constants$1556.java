// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1556 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1556() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "mciGetErrorStringW",
        constants$490.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "mciSetYieldProc",
        constants$490.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mciGetCreatorTask",
        constants$36.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "mciGetYieldProc",
        constants$604.const$3
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_LONG.withByteAlignment(1).withName("dwCallback")
    ).withName("tagMCI_GENERIC_PARMS");
    static final VarHandle const$5 = constants$1556.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
}

