// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3124 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3124() {}
    static final VarHandle const$0 = constants$3123.const$2.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(ISynchronizeMutexVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$3123.const$2.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(ISynchronizeMutexVtbl.Wait.class, "apply", constants$67.const$1);
    static final VarHandle const$4 = constants$3123.const$2.varHandle(MemoryLayout.PathElement.groupElement("Wait"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(ISynchronizeMutexVtbl.Signal.class, "apply", constants$18.const$5);
}

