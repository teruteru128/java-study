// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$236 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$236() {}
    static final VarHandle const$0 = constants$235.const$4.varHandle(MemoryLayout.PathElement.groupElement("unsigned_accelerated"));
    static final VarHandle const$1 = constants$235.const$4.varHandle(MemoryLayout.PathElement.groupElement("mixed_signedness_accelerated"));
    static final VarHandle const$2 = constants$235.const$4.varHandle(MemoryLayout.PathElement.groupElement("accumulating_saturating_signed_accelerated"));
    static final VarHandle const$3 = constants$235.const$4.varHandle(MemoryLayout.PathElement.groupElement("accumulating_saturating_unsigned_accelerated"));
    static final VarHandle const$4 = constants$235.const$4.varHandle(MemoryLayout.PathElement.groupElement("accumulating_saturating_mixed_signedness_accelerated"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(clEnqueueAcquireExternalMemObjectsKHR_fn.class, "apply", constants$207.const$5);
}


