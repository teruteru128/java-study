// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$408 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$408() {}
    static final VarHandle const$0 = constants$407.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Characteristics"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("StartAddressOfRawData"),
        JAVA_INT.withName("EndAddressOfRawData"),
        JAVA_INT.withName("AddressOfIndex"),
        JAVA_INT.withName("AddressOfCallBacks"),
        JAVA_INT.withName("SizeOfZeroFill"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("Characteristics"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_IMAGE_TLS_DIRECTORY32");
    static final VarHandle const$2 = constants$408.const$1.varHandle(MemoryLayout.PathElement.groupElement("StartAddressOfRawData"));
    static final VarHandle const$3 = constants$408.const$1.varHandle(MemoryLayout.PathElement.groupElement("EndAddressOfRawData"));
    static final VarHandle const$4 = constants$408.const$1.varHandle(MemoryLayout.PathElement.groupElement("AddressOfIndex"));
    static final VarHandle const$5 = constants$408.const$1.varHandle(MemoryLayout.PathElement.groupElement("AddressOfCallBacks"));
}

