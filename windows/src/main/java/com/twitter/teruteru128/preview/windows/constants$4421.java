// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4421 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4421() {}
    static final VarHandle const$0 = constants$4418.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpstrDefExt"));
    static final VarHandle const$1 = constants$4418.const$1.varHandle(MemoryLayout.PathElement.groupElement("lCustData"));
    static final VarHandle const$2 = constants$4418.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpfnHook"));
    static final VarHandle const$3 = constants$4418.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpTemplateName"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("lStructSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hwndOwner"),
        RuntimeHelper.POINTER.withName("hInstance"),
        RuntimeHelper.POINTER.withName("lpstrFilter"),
        RuntimeHelper.POINTER.withName("lpstrCustomFilter"),
        JAVA_INT.withName("nMaxCustFilter"),
        JAVA_INT.withName("nFilterIndex"),
        RuntimeHelper.POINTER.withName("lpstrFile"),
        JAVA_INT.withName("nMaxFile"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpstrFileTitle"),
        JAVA_INT.withName("nMaxFileTitle"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpstrInitialDir"),
        RuntimeHelper.POINTER.withName("lpstrTitle"),
        JAVA_INT.withName("Flags"),
        JAVA_SHORT.withName("nFileOffset"),
        JAVA_SHORT.withName("nFileExtension"),
        RuntimeHelper.POINTER.withName("lpstrDefExt"),
        JAVA_LONG.withName("lCustData"),
        RuntimeHelper.POINTER.withName("lpfnHook"),
        RuntimeHelper.POINTER.withName("lpTemplateName"),
        RuntimeHelper.POINTER.withName("pvReserved"),
        JAVA_INT.withName("dwReserved"),
        JAVA_INT.withName("FlagsEx")
    ).withName("tagOFNA");
    static final VarHandle const$5 = constants$4421.const$4.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
}

