// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4162 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4162() {}
    static final VarHandle const$0 = constants$4159.const$1.varHandle(MemoryLayout.PathElement.groupElement("GetIUri"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IUriBuilderVtbl.SetIUri.class, "apply", constants$34.const$0);
    static final VarHandle const$2 = constants$4159.const$1.varHandle(MemoryLayout.PathElement.groupElement("SetIUri"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IUriBuilderVtbl.GetFragment.class, "apply", constants$37.const$3);
    static final VarHandle const$4 = constants$4159.const$1.varHandle(MemoryLayout.PathElement.groupElement("GetFragment"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IUriBuilderVtbl.GetHost.class, "apply", constants$37.const$3);
}


