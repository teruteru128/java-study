// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2201 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2201() {}
    static final VarHandle const$0 = constants$2200.const$4.varHandle(MemoryLayout.PathElement.groupElement("pCrlContext"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("iDeltaCrlIndicator"),
        RuntimeHelper.POINTER.withName("pftCacheResync"),
        RuntimeHelper.POINTER.withName("pLastSyncTime"),
        RuntimeHelper.POINTER.withName("pMaxAgeTime"),
        RuntimeHelper.POINTER.withName("pChainPara"),
        RuntimeHelper.POINTER.withName("pDeltaCrlIndicator")
    ).withName("_CRYPT_GET_TIME_VALID_OBJECT_EXTRA_INFO");
    static final VarHandle const$2 = constants$2201.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$3 = constants$2201.const$1.varHandle(MemoryLayout.PathElement.groupElement("iDeltaCrlIndicator"));
    static final VarHandle const$4 = constants$2201.const$1.varHandle(MemoryLayout.PathElement.groupElement("pftCacheResync"));
    static final VarHandle const$5 = constants$2201.const$1.varHandle(MemoryLayout.PathElement.groupElement("pLastSyncTime"));
}

