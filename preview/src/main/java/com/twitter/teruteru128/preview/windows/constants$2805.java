// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2805 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2805() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("pcRefParent"),
        RuntimeHelper.POINTER.withName("pszHeaderTitle"),
        RuntimeHelper.POINTER.withName("pszHeaderSubTitle"),
        RuntimeHelper.POINTER.withName("hActCtx"),
        MemoryLayout.unionLayout(
            RuntimeHelper.POINTER.withName("hbmHeader"),
            RuntimeHelper.POINTER.withName("pszbmHeader")
        ).withName("$anon$2")
    ).withName("_PROPSHEETPAGEW");
    static final VarHandle const$1 = constants$2805.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    static final VarHandle const$2 = constants$2805.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$3 = constants$2805.const$0.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    static final VarHandle const$4 = constants$2805.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pszTemplate"));
    static final VarHandle const$5 = constants$2805.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pResource"));
}


