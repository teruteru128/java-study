// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1714 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1714() {}
    static final VarHandle const$0 = constants$1713.const$5.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    static final VarHandle const$1 = constants$1713.const$5.varHandle(MemoryLayout.PathElement.groupElement("EndpointFlags"));
    static final VarHandle const$2 = constants$1713.const$5.varHandle(MemoryLayout.PathElement.groupElement("NICFlags"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(RPC_OBJECT_INQ_FN.class, "apply", constants$508.const$5);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(RPC_IF_CALLBACK_FN.class, "apply", constants$34.const$0);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(RPC_SECURITY_CALLBACK_FN.class, "apply", constants$0.const$0);
}

