// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1939 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1939() {}
    static final VarHandle const$0 = constants$1938.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwMaxLength"));
    static final VarHandle const$1 = constants$1938.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwIncrement"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbOID"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pbOID")
    ).withName("_BCRYPT_OID");
    static final VarHandle const$3 = constants$1939.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbOID"));
    static final VarHandle const$4 = constants$1939.const$2.varHandle(MemoryLayout.PathElement.groupElement("pbOID"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwOIDCount"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pOIDs")
    ).withName("_BCRYPT_OID_LIST");
}


