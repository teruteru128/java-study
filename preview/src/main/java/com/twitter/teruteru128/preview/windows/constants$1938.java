// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1938 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1938() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CryptContextAddRef",
        constants$1622.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CryptDuplicateKey",
        constants$1916.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CryptDuplicateHash",
        constants$1916.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetEncSChannel",
        constants$34.const$0
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwMinLength"),
        JAVA_INT.withName("dwMaxLength"),
        JAVA_INT.withName("dwIncrement")
    ).withName("__BCRYPT_KEY_LENGTHS_STRUCT");
    static final VarHandle const$5 = constants$1938.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwMinLength"));
}


