// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4202 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4202() {}
    static final VarHandle const$0 = constants$4201.const$3.varHandle(MemoryLayout.PathElement.groupElement("pData"));
    static final VarHandle const$1 = constants$4201.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("iid"),
        RuntimeHelper.POINTER.withName("pIBindCtx"),
        RuntimeHelper.POINTER.withName("pItf")
    ).withName("_tagStartParam");
    static final VarHandle const$3 = constants$4202.const$2.varHandle(MemoryLayout.PathElement.groupElement("pIBindCtx"));
    static final VarHandle const$4 = constants$4202.const$2.varHandle(MemoryLayout.PathElement.groupElement("pItf"));
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("IID_IInternetProtocolRoot", constants$27.const$0);
}

