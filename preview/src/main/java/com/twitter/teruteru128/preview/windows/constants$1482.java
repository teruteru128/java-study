// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1482 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1482() {}
    static final VarHandle const$0 = constants$1481.const$4.varHandle(MemoryLayout.PathElement.groupElement("pv_valuelen"));
    static final VarHandle const$1 = constants$1481.const$4.varHandle(MemoryLayout.PathElement.groupElement("pv_value_context"));
    static final VarHandle const$2 = constants$1481.const$4.varHandle(MemoryLayout.PathElement.groupElement("pv_type"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(QUERYHANDLER.class, "apply", constants$626.const$3);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$626.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PQUERYHANDLER.class, "apply", constants$626.const$3);
}

