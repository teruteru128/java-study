// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3087 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3087() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IPSFactoryBufferVtbl.CreateStub.class, "apply", constants$1.const$3);
    static final VarHandle const$1 = constants$3085.const$3.varHandle(MemoryLayout.PathElement.groupElement("CreateStub"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IPSFactoryBuffer");
    static final VarHandle const$3 = constants$3087.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("iid"),
        JAVA_INT.withName("cbSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("uCausality"),
        JAVA_INT.withName("dwServerPid"),
        JAVA_INT.withName("iMethod"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pObject")
    ).withName("SChannelHookCallInfo");
    static final VarHandle const$5 = constants$3087.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
}


