// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2155 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2155() {}
    static final VarHandle const$0 = constants$2154.const$3.varHandle(MemoryLayout.PathElement.groupElement("rghCtlStore"));
    static final VarHandle const$1 = constants$2154.const$3.varHandle(MemoryLayout.PathElement.groupElement("cSignerStore"));
    static final VarHandle const$2 = constants$2154.const$3.varHandle(MemoryLayout.PathElement.groupElement("rghSignerStore"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwError"),
        JAVA_INT.withName("dwFlags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ppCtl"),
        JAVA_INT.withName("dwCtlEntryIndex"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ppSigner"),
        JAVA_INT.withName("dwSignerIndex"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CTL_VERIFY_USAGE_STATUS");
    static final VarHandle const$4 = constants$2155.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$5 = constants$2155.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwError"));
}


