// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3010 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3010() {}
    static final VarHandle const$0 = constants$3009.const$2.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IMarshalVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$3009.const$2.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IMarshalVtbl.GetUnmarshalClass.class, "apply", constants$1499.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1499.const$2
    );
    static final VarHandle const$5 = constants$3009.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetUnmarshalClass"));
}


