// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$897 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$897() {}
    static final VarHandle const$0 = constants$895.const$5.varHandle(MemoryLayout.PathElement.groupElement("biSizeImage"));
    static final VarHandle const$1 = constants$895.const$5.varHandle(MemoryLayout.PathElement.groupElement("biXPelsPerMeter"));
    static final VarHandle const$2 = constants$895.const$5.varHandle(MemoryLayout.PathElement.groupElement("biYPelsPerMeter"));
    static final VarHandle const$3 = constants$895.const$5.varHandle(MemoryLayout.PathElement.groupElement("biClrUsed"));
    static final VarHandle const$4 = constants$895.const$5.varHandle(MemoryLayout.PathElement.groupElement("biClrImportant"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("bV4Size"),
        JAVA_INT.withName("bV4Width"),
        JAVA_INT.withName("bV4Height"),
        JAVA_SHORT.withName("bV4Planes"),
        JAVA_SHORT.withName("bV4BitCount"),
        JAVA_INT.withName("bV4V4Compression"),
        JAVA_INT.withName("bV4SizeImage"),
        JAVA_INT.withName("bV4XPelsPerMeter"),
        JAVA_INT.withName("bV4YPelsPerMeter"),
        JAVA_INT.withName("bV4ClrUsed"),
        JAVA_INT.withName("bV4ClrImportant"),
        JAVA_INT.withName("bV4RedMask"),
        JAVA_INT.withName("bV4GreenMask"),
        JAVA_INT.withName("bV4BlueMask"),
        JAVA_INT.withName("bV4AlphaMask"),
        JAVA_INT.withName("bV4CSType"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("ciexyzX"),
                JAVA_INT.withName("ciexyzY"),
                JAVA_INT.withName("ciexyzZ")
            ).withName("ciexyzRed"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("ciexyzX"),
                JAVA_INT.withName("ciexyzY"),
                JAVA_INT.withName("ciexyzZ")
            ).withName("ciexyzGreen"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("ciexyzX"),
                JAVA_INT.withName("ciexyzY"),
                JAVA_INT.withName("ciexyzZ")
            ).withName("ciexyzBlue")
        ).withName("bV4Endpoints"),
        JAVA_INT.withName("bV4GammaRed"),
        JAVA_INT.withName("bV4GammaGreen"),
        JAVA_INT.withName("bV4GammaBlue")
    ).withName("");
}


