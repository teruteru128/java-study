// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1209 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1209() {}
    static final VarHandle const$0 = constants$1208.const$0.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    static final VarHandle const$1 = constants$1208.const$0.varHandle(MemoryLayout.PathElement.groupElement("id"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CreateDialogParamA",
        constants$1209.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CreateDialogParamW",
        constants$1209.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CreateDialogIndirectParamA",
        constants$1209.const$2
    );
}


