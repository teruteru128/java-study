// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2007 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2007() {}
    static final VarHandle const$0 = constants$2006.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwValueType"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cRDNAttr"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgRDNAttr")
    ).withName("_CERT_RDN");
    static final VarHandle const$2 = constants$2007.const$1.varHandle(MemoryLayout.PathElement.groupElement("cRDNAttr"));
    static final VarHandle const$3 = constants$2007.const$1.varHandle(MemoryLayout.PathElement.groupElement("rgRDNAttr"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cRDN"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgRDN")
    ).withName("_CERT_NAME_INFO");
    static final VarHandle const$5 = constants$2007.const$4.varHandle(MemoryLayout.PathElement.groupElement("cRDN"));
}


