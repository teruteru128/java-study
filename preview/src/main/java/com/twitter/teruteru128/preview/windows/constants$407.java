// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$407 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$407() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_LONG.withByteAlignment(4).withName("StartAddressOfRawData"),
        JAVA_LONG.withByteAlignment(4).withName("EndAddressOfRawData"),
        JAVA_LONG.withByteAlignment(4).withName("AddressOfIndex"),
        JAVA_LONG.withByteAlignment(4).withName("AddressOfCallBacks"),
        JAVA_INT.withName("SizeOfZeroFill"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("Characteristics"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_IMAGE_TLS_DIRECTORY64");
    static final VarHandle const$1 = constants$407.const$0.varHandle(MemoryLayout.PathElement.groupElement("StartAddressOfRawData"));
    static final VarHandle const$2 = constants$407.const$0.varHandle(MemoryLayout.PathElement.groupElement("EndAddressOfRawData"));
    static final VarHandle const$3 = constants$407.const$0.varHandle(MemoryLayout.PathElement.groupElement("AddressOfIndex"));
    static final VarHandle const$4 = constants$407.const$0.varHandle(MemoryLayout.PathElement.groupElement("AddressOfCallBacks"));
    static final VarHandle const$5 = constants$407.const$0.varHandle(MemoryLayout.PathElement.groupElement("SizeOfZeroFill"));
}

