// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3264 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3264() {}
    static final VarHandle const$0 = constants$3263.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "IEnumSTATSTG_RemoteNext_Proxy",
        constants$585.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "IEnumSTATSTG_RemoteNext_Stub",
        constants$467.const$0
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("ulCntStr"),
        JAVA_INT.withName("ulCntChar"),
        MemoryLayout.sequenceLayout(1, JAVA_SHORT).withName("rgString"),
        MemoryLayout.paddingLayout(2)
    ).withName("tagRemSNB");
    static final VarHandle const$4 = constants$3264.const$3.varHandle(MemoryLayout.PathElement.groupElement("ulCntStr"));
    static final VarHandle const$5 = constants$3264.const$3.varHandle(MemoryLayout.PathElement.groupElement("ulCntChar"));
}

