// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3068 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3068() {}
    static final VarHandle const$0 = constants$3066.const$0.varHandle(MemoryLayout.PathElement.groupElement("FreeBuffer"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IAsyncRpcChannelBufferVtbl.GetDestCtx.class, "apply", constants$37.const$3);
    static final VarHandle const$2 = constants$3066.const$0.varHandle(MemoryLayout.PathElement.groupElement("GetDestCtx"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IAsyncRpcChannelBufferVtbl.IsConnected.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$3066.const$0.varHandle(MemoryLayout.PathElement.groupElement("IsConnected"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IAsyncRpcChannelBufferVtbl.GetProtocolVersion.class, "apply", constants$34.const$0);
}


