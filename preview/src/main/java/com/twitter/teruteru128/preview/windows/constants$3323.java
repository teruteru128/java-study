// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3323 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3323() {}
    static final VarHandle const$0 = constants$3321.const$0.varHandle(MemoryLayout.PathElement.groupElement("Begin_OnViewChange"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(AsyncIAdviseSink2Vtbl.Finish_OnViewChange.class, "apply", constants$0.const$0);
    static final VarHandle const$2 = constants$3321.const$0.varHandle(MemoryLayout.PathElement.groupElement("Finish_OnViewChange"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(AsyncIAdviseSink2Vtbl.Begin_OnRename.class, "apply", constants$469.const$2);
    static final VarHandle const$4 = constants$3321.const$0.varHandle(MemoryLayout.PathElement.groupElement("Begin_OnRename"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AsyncIAdviseSink2Vtbl.Finish_OnRename.class, "apply", constants$0.const$0);
}


