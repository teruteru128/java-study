// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3520 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3520() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0010_v0_0_s_ifspec", RuntimeHelper.POINTER);
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("guid"),
        JAVA_INT.withName("lcid"),
        JAVA_INT.withName("syskind"),
        JAVA_SHORT.withName("wMajorVerNum"),
        JAVA_SHORT.withName("wMinorVerNum"),
        JAVA_SHORT.withName("wLibFlags"),
        MemoryLayout.paddingLayout(2)
    ).withName("tagTLIBATTR");
    static final VarHandle const$2 = constants$3520.const$1.varHandle(MemoryLayout.PathElement.groupElement("lcid"));
    static final VarHandle const$3 = constants$3520.const$1.varHandle(MemoryLayout.PathElement.groupElement("syskind"));
    static final VarHandle const$4 = constants$3520.const$1.varHandle(MemoryLayout.PathElement.groupElement("wMajorVerNum"));
    static final VarHandle const$5 = constants$3520.const$1.varHandle(MemoryLayout.PathElement.groupElement("wMinorVerNum"));
}

