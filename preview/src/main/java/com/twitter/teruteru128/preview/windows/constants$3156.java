// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3156 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3156() {}
    static final VarHandle const$0 = constants$3155.const$2.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IPipeDoubleVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$3155.const$2.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IPipeDoubleVtbl.Pull.class, "apply", constants$586.const$5);
    static final VarHandle const$4 = constants$3155.const$2.varHandle(MemoryLayout.PathElement.groupElement("Pull"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IPipeDoubleVtbl.Push.class, "apply", constants$570.const$5);
}

