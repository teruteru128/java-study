// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3319 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3319() {}
    static final VarHandle const$0 = constants$3317.const$0.varHandle(MemoryLayout.PathElement.groupElement("OnRename"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IAdviseSink2Vtbl.OnSave.class, "apply", constants$0.const$0);
    static final VarHandle const$2 = constants$3317.const$0.varHandle(MemoryLayout.PathElement.groupElement("OnSave"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IAdviseSink2Vtbl.OnClose.class, "apply", constants$0.const$0);
    static final VarHandle const$4 = constants$3317.const$0.varHandle(MemoryLayout.PathElement.groupElement("OnClose"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IAdviseSink2Vtbl.OnLinkSrcChange.class, "apply", constants$469.const$2);
}


