// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2077 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2077() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CryptUnregisterOIDInfo",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_CRYPT_ENUM_OID_INFO.class, "apply", constants$34.const$0);
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CryptEnumOIDInfo",
        constants$2077.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CryptFindLocalizedName",
        constants$33.const$3
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwFlags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pwszCNGSignHashAlgids"),
        RuntimeHelper.POINTER.withName("pwszCNGPubKeyMinBitLengths")
    ).withName("_CERT_STRONG_SIGN_SERIALIZED_INFO");
}

