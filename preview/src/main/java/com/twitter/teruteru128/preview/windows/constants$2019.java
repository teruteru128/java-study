// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2019 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2019() {}
    static final VarHandle const$0 = constants$2018.const$1.varHandle(MemoryLayout.PathElement.groupElement("rgExtension"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pszTimeStampAlgorithm"),
        RuntimeHelper.POINTER.withName("pszContentType"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("Content"),
        JAVA_INT.withName("cAttribute"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgAttribute")
    ).withName("_CRYPT_TIME_STAMP_REQUEST_INFO");
    static final VarHandle const$2 = constants$2019.const$1.varHandle(MemoryLayout.PathElement.groupElement("pszTimeStampAlgorithm"));
    static final VarHandle const$3 = constants$2019.const$1.varHandle(MemoryLayout.PathElement.groupElement("pszContentType"));
    static final VarHandle const$4 = constants$2019.const$1.varHandle(MemoryLayout.PathElement.groupElement("cAttribute"));
    static final VarHandle const$5 = constants$2019.const$1.varHandle(MemoryLayout.PathElement.groupElement("rgAttribute"));
}


