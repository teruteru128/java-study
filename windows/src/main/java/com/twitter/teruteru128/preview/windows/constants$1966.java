// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1966 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1966() {}
    static final VarHandle const$0 = constants$1965.const$2.varHandle(MemoryLayout.PathElement.groupElement("rgpszFunctions"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pszImage"),
        JAVA_INT.withName("cInterfaces"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgpInterfaces")
    ).withName("_CRYPT_IMAGE_REG");
    static final VarHandle const$2 = constants$1966.const$1.varHandle(MemoryLayout.PathElement.groupElement("pszImage"));
    static final VarHandle const$3 = constants$1966.const$1.varHandle(MemoryLayout.PathElement.groupElement("cInterfaces"));
    static final VarHandle const$4 = constants$1966.const$1.varHandle(MemoryLayout.PathElement.groupElement("rgpInterfaces"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("cAliases"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgpszAliases"),
        RuntimeHelper.POINTER.withName("pUM"),
        RuntimeHelper.POINTER.withName("pKM")
    ).withName("_CRYPT_PROVIDER_REG");
}

