// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("_locale_pctype"),
        JAVA_INT.withName("_locale_mb_cur_max"),
        JAVA_INT.withName("_locale_lc_codepage")
    ).withName("__crt_locale_data_public");
    static final VarHandle const$1 = constants$2.const$0.varHandle(MemoryLayout.PathElement.groupElement("_locale_pctype"));
    static final VarHandle const$2 = constants$2.const$0.varHandle(MemoryLayout.PathElement.groupElement("_locale_mb_cur_max"));
    static final VarHandle const$3 = constants$2.const$0.varHandle(MemoryLayout.PathElement.groupElement("_locale_lc_codepage"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("locinfo"),
        RuntimeHelper.POINTER.withName("mbcinfo")
    ).withName("__crt_locale_pointers");
    static final VarHandle const$5 = constants$2.const$4.varHandle(MemoryLayout.PathElement.groupElement("locinfo"));
}


