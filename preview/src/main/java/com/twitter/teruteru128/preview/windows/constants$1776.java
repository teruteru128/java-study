// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1776 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1776() {}
    static final VarHandle const$0 = constants$1773.const$1.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$1 = constants$1773.const$1.varHandle(MemoryLayout.PathElement.groupElement("MaxCalls"));
    static final VarHandle const$2 = constants$1773.const$1.varHandle(MemoryLayout.PathElement.groupElement("MaxRpcSize"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(RPC_INTERFACE_TEMPLATEW.IfCallback.class, "apply", constants$34.const$0);
    static final VarHandle const$4 = constants$1773.const$1.varHandle(MemoryLayout.PathElement.groupElement("IfCallback"));
    static final VarHandle const$5 = constants$1773.const$1.varHandle(MemoryLayout.PathElement.groupElement("UuidVector"));
}


