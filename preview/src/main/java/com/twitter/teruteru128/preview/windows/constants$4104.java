// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4104 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4104() {}
    static final VarHandle const$0 = constants$4103.const$0.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IBindingVtbl.Abort.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$4103.const$0.varHandle(MemoryLayout.PathElement.groupElement("Abort"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IBindingVtbl.Suspend.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$4103.const$0.varHandle(MemoryLayout.PathElement.groupElement("Suspend"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IBindingVtbl.Resume.class, "apply", constants$18.const$5);
}

