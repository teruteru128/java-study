// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4214 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4214() {}
    static final VarHandle const$0 = constants$4212.const$4.varHandle(MemoryLayout.PathElement.groupElement("Start"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IInternetProtocolExVtbl.Continue.class, "apply", constants$34.const$0);
    static final VarHandle const$2 = constants$4212.const$4.varHandle(MemoryLayout.PathElement.groupElement("Continue"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IInternetProtocolExVtbl.Abort.class, "apply", constants$67.const$1);
    static final VarHandle const$4 = constants$4212.const$4.varHandle(MemoryLayout.PathElement.groupElement("Abort"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IInternetProtocolExVtbl.Terminate.class, "apply", constants$65.const$2);
}


