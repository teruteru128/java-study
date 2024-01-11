// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1111 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1111() {}
    static final VarHandle const$0 = constants$1110.const$5.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("nSize"),
            JAVA_SHORT.withName("nVersion"),
            JAVA_INT.withName("dwFlags"),
            JAVA_BYTE.withName("iPixelType"),
            JAVA_BYTE.withName("cColorBits"),
            JAVA_BYTE.withName("cRedBits"),
            JAVA_BYTE.withName("cRedShift"),
            JAVA_BYTE.withName("cGreenBits"),
            JAVA_BYTE.withName("cGreenShift"),
            JAVA_BYTE.withName("cBlueBits"),
            JAVA_BYTE.withName("cBlueShift"),
            JAVA_BYTE.withName("cAlphaBits"),
            JAVA_BYTE.withName("cAlphaShift"),
            JAVA_BYTE.withName("cAccumBits"),
            JAVA_BYTE.withName("cAccumRedBits"),
            JAVA_BYTE.withName("cAccumGreenBits"),
            JAVA_BYTE.withName("cAccumBlueBits"),
            JAVA_BYTE.withName("cAccumAlphaBits"),
            JAVA_BYTE.withName("cDepthBits"),
            JAVA_BYTE.withName("cStencilBits"),
            JAVA_BYTE.withName("cAuxBuffers"),
            JAVA_BYTE.withName("iLayerType"),
            JAVA_BYTE.withName("bReserved"),
            JAVA_INT.withName("dwLayerMask"),
            JAVA_INT.withName("dwVisibleMask"),
            JAVA_INT.withName("dwDamageMask")
        ).withName("pfd")
    ).withName("tagEMRPIXELFORMAT");
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("ihCS"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("lcsSignature"),
            JAVA_INT.withName("lcsVersion"),
            JAVA_INT.withName("lcsSize"),
            JAVA_INT.withName("lcsCSType"),
            JAVA_INT.withName("lcsIntent"),
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
            ).withName("lcsEndpoints"),
            JAVA_INT.withName("lcsGammaRed"),
            JAVA_INT.withName("lcsGammaGreen"),
            JAVA_INT.withName("lcsGammaBlue"),
            MemoryLayout.sequenceLayout(260, JAVA_BYTE).withName("lcsFilename")
        ).withName("lcs")
    ).withName("tagEMRCREATECOLORSPACE");
    static final VarHandle const$3 = constants$1111.const$2.varHandle(MemoryLayout.PathElement.groupElement("ihCS"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("ihCS")
    ).withName("tagEMRSETCOLORSPACE");
    static final VarHandle const$5 = constants$1111.const$4.varHandle(MemoryLayout.PathElement.groupElement("ihCS"));
}


