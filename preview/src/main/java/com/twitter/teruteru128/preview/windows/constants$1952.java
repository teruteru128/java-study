// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1952 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1952() {}
    static final VarHandle const$0 = constants$1951.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbSeedLength"));
    static final VarHandle const$1 = constants$1951.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbGroupSize"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwMagic"),
        JAVA_INT.withName("dwVersion"),
        JAVA_INT.withName("cbKeyData")
    ).withName("_BCRYPT_KEY_DATA_BLOB_HEADER");
    static final VarHandle const$3 = constants$1952.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwMagic"));
    static final VarHandle const$4 = constants$1952.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$5 = constants$1952.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbKeyData"));
}


