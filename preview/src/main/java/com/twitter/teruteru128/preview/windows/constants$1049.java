// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1049 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1049() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GdiComment",
        constants$485.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetTextMetricsA",
        constants$34.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetTextMetricsW",
        constants$34.const$0
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("bmType"),
            JAVA_INT.withName("bmWidth"),
            JAVA_INT.withName("bmHeight"),
            JAVA_INT.withName("bmWidthBytes"),
            JAVA_SHORT.withName("bmPlanes"),
            JAVA_SHORT.withName("bmBitsPixel"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("bmBits")
        ).withName("dsBm"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("biSize"),
            JAVA_INT.withName("biWidth"),
            JAVA_INT.withName("biHeight"),
            JAVA_SHORT.withName("biPlanes"),
            JAVA_SHORT.withName("biBitCount"),
            JAVA_INT.withName("biCompression"),
            JAVA_INT.withName("biSizeImage"),
            JAVA_INT.withName("biXPelsPerMeter"),
            JAVA_INT.withName("biYPelsPerMeter"),
            JAVA_INT.withName("biClrUsed"),
            JAVA_INT.withName("biClrImportant")
        ).withName("dsBmih"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("dsBitfields"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("dshSection"),
        JAVA_INT.withName("dsOffset"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagDIBSECTION");
    static final VarHandle const$4 = constants$1049.const$3.varHandle(MemoryLayout.PathElement.groupElement("dshSection"));
    static final VarHandle const$5 = constants$1049.const$3.varHandle(MemoryLayout.PathElement.groupElement("dsOffset"));
}

