// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1593 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1593() {}
    static final VarHandle const$0 = constants$1592.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpszDCISectionName"));
    static final VarHandle const$1 = constants$1592.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpszDCIAliasName"));
    static final VarHandle const$2 = constants$1592.const$4.varHandle(MemoryLayout.PathElement.groupElement("dnDevNode"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("dwDCISize"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("lpszDCISectionName"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("lpszDCIAliasName")
    ).withName("tagDRVCONFIGINFO");
    static final VarHandle const$4 = constants$1593.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwDCISize"));
    static final VarHandle const$5 = constants$1593.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpszDCISectionName"));
}

