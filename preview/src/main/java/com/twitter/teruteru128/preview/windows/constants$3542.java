// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3542 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3542() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(ICreateErrorInfoVtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$1 = constants$3541.const$3.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(ICreateErrorInfoVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$3 = constants$3541.const$3.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(ICreateErrorInfoVtbl.SetGUID.class, "apply", constants$34.const$0);
    static final VarHandle const$5 = constants$3541.const$3.varHandle(MemoryLayout.PathElement.groupElement("SetGUID"));
}


