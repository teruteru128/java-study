// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3254 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3254() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IMonikerVtbl.IsEqual.class, "apply", constants$34.const$0);
    static final VarHandle const$1 = constants$3249.const$3.varHandle(MemoryLayout.PathElement.groupElement("IsEqual"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IMonikerVtbl.Hash.class, "apply", constants$34.const$0);
    static final VarHandle const$3 = constants$3249.const$3.varHandle(MemoryLayout.PathElement.groupElement("Hash"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IMonikerVtbl.IsRunning.class, "apply", constants$1.const$3);
    static final VarHandle const$5 = constants$3249.const$3.varHandle(MemoryLayout.PathElement.groupElement("IsRunning"));
}

