// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4435 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4435() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("lStructSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hwndOwner"),
        RuntimeHelper.POINTER.withName("hInstance"),
        JAVA_INT.withName("rgbResult"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpCustColors"),
        JAVA_INT.withName("Flags"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("lCustData"),
        RuntimeHelper.POINTER.withName("lpfnHook"),
        RuntimeHelper.POINTER.withName("lpTemplateName")
    ).withName("tagCHOOSECOLORW");
    static final VarHandle const$1 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    static final VarHandle const$2 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    static final VarHandle const$3 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    static final VarHandle const$4 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("rgbResult"));
    static final VarHandle const$5 = constants$4435.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpCustColors"));
}


