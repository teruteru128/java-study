// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4436 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4436() {}
    static final VarHandle const$0 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$1 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("lCustData"));
    static final VarHandle const$2 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpfnHook"));
    static final VarHandle const$3 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpTemplateName"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ChooseColorA",
        constants$18.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ChooseColorW",
        constants$18.const$5
    );
}


