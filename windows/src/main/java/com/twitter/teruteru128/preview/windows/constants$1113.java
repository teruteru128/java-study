// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1113 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1113() {}
    static final VarHandle const$0 = constants$1112.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbEscData"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("dwFlags"),
        JAVA_INT.withName("cbName"),
        JAVA_INT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("Data"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagEMRSETICMPROFILE");
    static final VarHandle const$2 = constants$1113.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$3 = constants$1113.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbName"));
    static final VarHandle const$4 = constants$1113.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
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
            MemoryLayout.sequenceLayout(260, JAVA_SHORT).withName("lcsFilename")
        ).withName("lcs"),
        JAVA_INT.withName("dwFlags"),
        JAVA_INT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("Data"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagEMRCREATECOLORSPACEW");
}

