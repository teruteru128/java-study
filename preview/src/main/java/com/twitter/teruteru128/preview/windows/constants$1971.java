// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1971 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1971() {}
    static final VarHandle const$0 = constants$1970.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbValue"));
    static final VarHandle const$1 = constants$1970.const$4.varHandle(MemoryLayout.PathElement.groupElement("pbValue"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pszImage"),
        JAVA_INT.withName("dwFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CRYPT_IMAGE_REF");
    static final VarHandle const$3 = constants$1971.const$2.varHandle(MemoryLayout.PathElement.groupElement("pszImage"));
    static final VarHandle const$4 = constants$1971.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwInterface"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pszFunction"),
        RuntimeHelper.POINTER.withName("pszProvider"),
        JAVA_INT.withName("cProperties"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgpProperties"),
        RuntimeHelper.POINTER.withName("pUM"),
        RuntimeHelper.POINTER.withName("pKM")
    ).withName("_CRYPT_PROVIDER_REF");
}


