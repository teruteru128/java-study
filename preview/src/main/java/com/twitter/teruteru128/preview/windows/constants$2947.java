// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2947 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2947() {}
    static final VarHandle const$0 = constants$2946.const$3.varHandle(MemoryLayout.PathElement.groupElement("propertyInt32"));
    static final VarHandle const$1 = constants$2946.const$3.varHandle(MemoryLayout.PathElement.groupElement("propertyInt64"));
    static final VarHandle const$2 = constants$2924.const$5.varHandle(MemoryLayout.PathElement.groupElement("cbBuf"));
    static final VarHandle const$3 = constants$2924.const$5.varHandle(MemoryLayout.PathElement.groupElement("pBuf"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("propertyName"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("ePropertyType"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
                JAVA_BYTE.withName("propertyByte"),
                RuntimeHelper.POINTER.withName("propertyString"),
                JAVA_INT.withName("propertyInt32"),
                JAVA_LONG.withName("propertyInt64"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("cbBuf"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("pBuf")
                ).withName("propertyBlob")
            ).withName("value")
        ).withName("propertyValue")
    ).withName("");
    static final VarHandle const$5 = constants$2947.const$4.varHandle(MemoryLayout.PathElement.groupElement("propertyName"));
}

