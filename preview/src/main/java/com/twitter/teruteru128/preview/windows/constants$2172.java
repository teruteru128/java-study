// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2172 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2172() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(PFN_EXPORT_PRIV_KEY_FUNC.class, "apply", constants$2169.const$0);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CryptExportPKCS8",
        constants$2169.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CryptExportPKCS8Ex",
        constants$775.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CryptHashPublicKeyInfo",
        constants$2172.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CertRDNValueToStrA",
        constants$1071.const$3
    );
}


