// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3525 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3525() {}
    static final VarHandle const$0 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("IsName"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(ITypeLibVtbl.FindName.class, "apply", constants$608.const$2);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$608.const$2
    );
    static final VarHandle const$3 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("FindName"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(ITypeLibVtbl.ReleaseTLibAttr.class, "apply", constants$469.const$2);
    static final VarHandle const$5 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("ReleaseTLibAttr"));
}

