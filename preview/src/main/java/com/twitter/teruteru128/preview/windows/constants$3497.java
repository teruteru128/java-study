// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3497 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3497() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(ITypeInfoVtbl.GetIDsOfNames.class, "apply", constants$586.const$5);
    static final VarHandle const$1 = constants$3493.const$3.varHandle(MemoryLayout.PathElement.groupElement("GetIDsOfNames"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_SHORT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(ITypeInfoVtbl.Invoke.class, "apply", constants$3497.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$3497.const$2
    );
    static final VarHandle const$5 = constants$3493.const$3.varHandle(MemoryLayout.PathElement.groupElement("Invoke"));
}

