// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2787 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2787() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(LPFNPSPCALLBACKA.class, "apply", constants$485.const$5);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(LPFNPSPCALLBACKW.class, "apply", constants$485.const$5);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwSize"),
        JAVA_INT.withName("dwFlags"),
        RuntimeHelper.POINTER.withName("hInstance"),
        MemoryLayout.unionLayout(
            RuntimeHelper.POINTER.withName("pszTemplate"),
            RuntimeHelper.POINTER.withName("pResource")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            RuntimeHelper.POINTER.withName("hIcon"),
            RuntimeHelper.POINTER.withName("pszIcon")
        ).withName("$anon$1"),
        RuntimeHelper.POINTER.withName("pszTitle"),
        RuntimeHelper.POINTER.withName("pfnDlgProc"),
        JAVA_LONG.withName("lParam"),
        RuntimeHelper.POINTER.withName("pfnCallback"),
        RuntimeHelper.POINTER.withName("pcRefParent")
    ).withName("_PROPSHEETPAGEA_V1");
    static final VarHandle const$3 = constants$2787.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    static final VarHandle const$4 = constants$2787.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$5 = constants$2787.const$2.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
}


