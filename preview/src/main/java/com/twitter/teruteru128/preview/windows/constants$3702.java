// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3702 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3702() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            JAVA_INT.withName("cx"),
            JAVA_INT.withName("cy")
        ).withName("tagSIZE")
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IOleInPlaceSiteVtbl.Scroll.class, "apply", constants$3702.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$3702.const$0
    );
    static final VarHandle const$3 = constants$3698.const$5.varHandle(MemoryLayout.PathElement.groupElement("Scroll"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IOleInPlaceSiteVtbl.OnUIDeactivate.class, "apply", constants$65.const$2);
    static final VarHandle const$5 = constants$3698.const$5.varHandle(MemoryLayout.PathElement.groupElement("OnUIDeactivate"));
}

