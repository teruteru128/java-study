// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4215 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4215() {}
    static final VarHandle const$0 = constants$4212.const$4.varHandle(MemoryLayout.PathElement.groupElement("Terminate"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IInternetProtocolExVtbl.Suspend.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$4212.const$4.varHandle(MemoryLayout.PathElement.groupElement("Suspend"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IInternetProtocolExVtbl.Resume.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$4212.const$4.varHandle(MemoryLayout.PathElement.groupElement("Resume"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IInternetProtocolExVtbl.Read.class, "apply", constants$586.const$5);
}

