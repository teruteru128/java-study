// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4130 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4130() {}
    static final VarHandle const$0 = constants$4129.const$2.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IHttpNegotiateVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$4129.const$2.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IHttpNegotiateVtbl.BeginningTransaction.class, "apply", constants$691.const$2);
    static final VarHandle const$4 = constants$4129.const$2.varHandle(MemoryLayout.PathElement.groupElement("BeginningTransaction"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IHttpNegotiateVtbl.OnResponse.class, "apply", constants$775.const$0);
}

