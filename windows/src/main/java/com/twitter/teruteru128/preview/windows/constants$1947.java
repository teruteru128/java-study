// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1947 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1947() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwMagic"),
        JAVA_INT.withName("cbKey")
    ).withName("_BCRYPT_ECCKEY_BLOB");
    static final VarHandle const$1 = constants$1947.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwMagic"));
    static final VarHandle const$2 = constants$1947.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbKey"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwCurveType"),
        JAVA_INT.withName("cbKey")
    ).withName("_SSL_ECCKEY_BLOB");
    static final VarHandle const$4 = constants$1947.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwCurveType"));
    static final VarHandle const$5 = constants$1947.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbKey"));
}

