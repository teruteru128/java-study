// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1973 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1973() {}
    static final VarHandle const$0 = constants$1971.const$5.varHandle(MemoryLayout.PathElement.groupElement("pKM"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cProviders"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgpProviders")
    ).withName("_CRYPT_PROVIDER_REFS");
    static final VarHandle const$2 = constants$1973.const$1.varHandle(MemoryLayout.PathElement.groupElement("cProviders"));
    static final VarHandle const$3 = constants$1973.const$1.varHandle(MemoryLayout.PathElement.groupElement("rgpProviders"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "BCryptQueryProviderRegistration",
        constants$1007.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "BCryptEnumRegisteredProviders",
        constants$34.const$0
    );
}


