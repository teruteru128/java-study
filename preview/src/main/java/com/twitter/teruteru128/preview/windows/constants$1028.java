// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1028 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1028() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("tmHeight"),
                JAVA_INT.withName("tmAscent"),
                JAVA_INT.withName("tmDescent"),
                JAVA_INT.withName("tmInternalLeading"),
                JAVA_INT.withName("tmExternalLeading"),
                JAVA_INT.withName("tmAveCharWidth"),
                JAVA_INT.withName("tmMaxCharWidth"),
                JAVA_INT.withName("tmWeight"),
                JAVA_INT.withName("tmOverhang"),
                JAVA_INT.withName("tmDigitizedAspectX"),
                JAVA_INT.withName("tmDigitizedAspectY"),
                JAVA_SHORT.withName("tmFirstChar"),
                JAVA_SHORT.withName("tmLastChar"),
                JAVA_SHORT.withName("tmDefaultChar"),
                JAVA_SHORT.withName("tmBreakChar"),
                JAVA_BYTE.withName("tmItalic"),
                JAVA_BYTE.withName("tmUnderlined"),
                JAVA_BYTE.withName("tmStruckOut"),
                JAVA_BYTE.withName("tmPitchAndFamily"),
                JAVA_BYTE.withName("tmCharSet"),
                MemoryLayout.paddingLayout(3),
                JAVA_INT.withName("ntmFlags"),
                JAVA_INT.withName("ntmSizeEM"),
                JAVA_INT.withName("ntmCellHeight"),
                JAVA_INT.withName("ntmAvgWidth")
            ).withName("ntmTm"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, JAVA_INT).withName("fsUsb"),
                MemoryLayout.sequenceLayout(2, JAVA_INT).withName("fsCsb")
            ).withName("ntmFontSig")
        ).withName("etmNewTextMetricEx"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("axlReserved"),
            JAVA_INT.withName("axlNumAxes"),
            MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
                JAVA_INT.withName("axMinValue"),
                JAVA_INT.withName("axMaxValue"),
                MemoryLayout.sequenceLayout(16, JAVA_SHORT).withName("axAxisName")
            ).withName("tagAXISINFOW")).withName("axlAxisInfo")
        ).withName("etmAxesList")
    ).withName("tagENUMTEXTMETRICW");
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetViewportExtEx",
        constants$34.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetViewportOrgEx",
        constants$34.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetWindowExtEx",
        constants$34.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetWindowOrgEx",
        constants$34.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "IntersectClipRect",
        constants$587.const$5
    );
}


