// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3526 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3526() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("ITypeLib");
    static final VarHandle const$1 = constants$3526.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ITypeLib_RemoteGetTypeInfoCount_Proxy",
        constants$34.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ITypeLib_RemoteGetTypeInfoCount_Stub",
        constants$467.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ITypeLib_RemoteGetLibAttr_Proxy",
        constants$37.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "ITypeLib_RemoteGetLibAttr_Stub",
        constants$467.const$0
    );
}


