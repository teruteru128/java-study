// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3213 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3213() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CoFileTimeNow",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CLSIDFromProgIDEx",
        constants$34.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("unused")
    ).withName("CO_DEVICE_CATALOG_COOKIE__");
    static final VarHandle const$3 = constants$3213.const$2.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CoRegisterDeviceCatalog",
        constants$34.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CoRevokeDeviceCatalog",
        constants$18.const$5
    );
}

