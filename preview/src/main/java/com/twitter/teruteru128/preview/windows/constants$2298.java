// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2298 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2298() {}
    static final VarHandle const$0 = constants$2297.const$0.varHandle(MemoryLayout.PathElement.groupElement("pMethodProperties"));
    static final VarHandle const$1 = constants$2297.const$0.varHandle(MemoryLayout.PathElement.groupElement("pReserved2"));
    static final UnionLayout const$2 = MemoryLayout.unionLayout(
        RuntimeHelper.POINTER.withName("Pointer"),
        JAVA_LONG.withName("Simple")
    ).withName("_CLIENT_CALL_RETURN");
    static final VarHandle const$3 = constants$2298.const$2.varHandle(MemoryLayout.PathElement.groupElement("Pointer"));
    static final VarHandle const$4 = constants$2298.const$2.varHandle(MemoryLayout.PathElement.groupElement("Simple"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("RefIdToPointer"),
        RuntimeHelper.POINTER.withName("PointerToRefId"),
        JAVA_INT.withName("NextRefId"),
        JAVA_INT.withName("XlatSide")
    ).withName("_FULL_PTR_XLAT_TABLES");
}


