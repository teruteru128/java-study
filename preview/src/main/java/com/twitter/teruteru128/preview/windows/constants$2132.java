// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2132 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2132() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwMsgAndCertEncodingType"),
        JAVA_INT.withName("dwFindFlags"),
        JAVA_INT.withName("dwFindType"),
        RuntimeHelper.POINTER.withName("pvFindPara")
    ).withName("_CERT_STORE_PROV_FIND_INFO");
    static final VarHandle const$1 = constants$2132.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$2 = constants$2132.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwMsgAndCertEncodingType"));
    static final VarHandle const$3 = constants$2132.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwFindFlags"));
    static final VarHandle const$4 = constants$2132.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwFindType"));
    static final VarHandle const$5 = constants$2132.const$0.varHandle(MemoryLayout.PathElement.groupElement("pvFindPara"));
}


