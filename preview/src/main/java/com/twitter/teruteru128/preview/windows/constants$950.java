// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$950 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$950() {}
    static final VarHandle const$0 = constants$944.const$3.varHandle(MemoryLayout.PathElement.groupElement("dmReserved2"));
    static final VarHandle const$1 = constants$944.const$3.varHandle(MemoryLayout.PathElement.groupElement("dmPanningWidth"));
    static final VarHandle const$2 = constants$944.const$3.varHandle(MemoryLayout.PathElement.groupElement("dmPanningHeight"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(32, JAVA_SHORT).withName("dmDeviceName"),
        JAVA_SHORT.withName("dmSpecVersion"),
        JAVA_SHORT.withName("dmDriverVersion"),
        JAVA_SHORT.withName("dmSize"),
        JAVA_SHORT.withName("dmDriverExtra"),
        JAVA_INT.withName("dmFields"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("dmOrientation"),
                JAVA_SHORT.withName("dmPaperSize"),
                JAVA_SHORT.withName("dmPaperLength"),
                JAVA_SHORT.withName("dmPaperWidth"),
                JAVA_SHORT.withName("dmScale"),
                JAVA_SHORT.withName("dmCopies"),
                JAVA_SHORT.withName("dmDefaultSource"),
                JAVA_SHORT.withName("dmPrintQuality")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    JAVA_INT.withName("x"),
                    JAVA_INT.withName("y")
                ).withName("dmPosition"),
                JAVA_INT.withName("dmDisplayOrientation"),
                JAVA_INT.withName("dmDisplayFixedOutput")
            ).withName("$anon$1")
        ).withName("$anon$0"),
        JAVA_SHORT.withName("dmColor"),
        JAVA_SHORT.withName("dmDuplex"),
        JAVA_SHORT.withName("dmYResolution"),
        JAVA_SHORT.withName("dmTTOption"),
        JAVA_SHORT.withName("dmCollate"),
        MemoryLayout.sequenceLayout(32, JAVA_SHORT).withName("dmFormName"),
        JAVA_SHORT.withName("dmLogPixels"),
        JAVA_INT.withName("dmBitsPerPel"),
        JAVA_INT.withName("dmPelsWidth"),
        JAVA_INT.withName("dmPelsHeight"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("dmDisplayFlags"),
            JAVA_INT.withName("dmNup")
        ).withName("$anon$1"),
        JAVA_INT.withName("dmDisplayFrequency"),
        JAVA_INT.withName("dmICMMethod"),
        JAVA_INT.withName("dmICMIntent"),
        JAVA_INT.withName("dmMediaType"),
        JAVA_INT.withName("dmDitherType"),
        JAVA_INT.withName("dmReserved1"),
        JAVA_INT.withName("dmReserved2"),
        JAVA_INT.withName("dmPanningWidth"),
        JAVA_INT.withName("dmPanningHeight")
    ).withName("_devicemodeW");
    static final VarHandle const$4 = constants$950.const$3.varHandle(MemoryLayout.PathElement.groupElement("dmSpecVersion"));
    static final VarHandle const$5 = constants$950.const$3.varHandle(MemoryLayout.PathElement.groupElement("dmDriverVersion"));
}

