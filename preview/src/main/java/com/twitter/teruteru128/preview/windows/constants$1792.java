// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1792 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1792() {}
    static final VarHandle const$0 = constants$1791.const$5.varHandle(MemoryLayout.PathElement.groupElement("EncryptAlgorithm"));
    static final VarHandle const$1 = constants$1791.const$5.varHandle(MemoryLayout.PathElement.groupElement("KeySize"));
    static final VarHandle const$2 = constants$1791.const$5.varHandle(MemoryLayout.PathElement.groupElement("SignatureAlgorithm"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "I_RpcBindingInqSecurityContextKeyInfo",
        constants$34.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "I_RpcBindingInqWireIdForSnego",
        constants$34.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "I_RpcBindingInqMarshalledTargetInfo",
        constants$37.const$3
    );
}


