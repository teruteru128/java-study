// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2168 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2168() {}
    static final VarHandle const$0 = constants$2167.const$5.varHandle(MemoryLayout.PathElement.groupElement("cOID"));
    static final VarHandle const$1 = constants$2167.const$5.varHandle(MemoryLayout.PathElement.groupElement("rgpszOID"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CryptUninstallDefaultContext",
        constants$485.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CryptExportPublicKeyInfo",
        constants$1907.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CryptExportPublicKeyInfoEx",
        constants$2168.const$4
    );
}

