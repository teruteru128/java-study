// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3334 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3334() {}
    static final VarHandle const$0 = constants$3333.const$4.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IDataAdviseHolderVtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$3333.const$4.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IDataAdviseHolderVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$3333.const$4.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IDataAdviseHolderVtbl.Advise.class, "apply", constants$572.const$3);
}

