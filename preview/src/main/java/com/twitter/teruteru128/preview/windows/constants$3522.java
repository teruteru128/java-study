// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3522 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3522() {}
    static final VarHandle const$0 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(ITypeLibVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(ITypeLibVtbl.GetTypeInfoCount.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetTypeInfoCount"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(ITypeLibVtbl.GetTypeInfo.class, "apply", constants$485.const$5);
}


