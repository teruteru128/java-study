// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$92 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$92() {}
    static final VarHandle const$0 = constants$90.const$1.varHandle(MemoryLayout.PathElement.groupElement("Fill0"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PEXCEPTION_FILTER.class, "apply", constants$34.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$34.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        JAVA_BYTE,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PTERMINATION_HANDLER.class, "apply", constants$92.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$92.const$3
    );
}


