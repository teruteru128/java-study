// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3442 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3442() {}
    static final VarHandle const$0 = constants$3440.const$3.varHandle(MemoryLayout.PathElement.groupElement("oVft"));
    static final VarHandle const$1 = constants$3440.const$3.varHandle(MemoryLayout.PathElement.groupElement("cScodes"));
    static final VarHandle const$2 = constants$3440.const$3.varHandle(MemoryLayout.PathElement.groupElement("wFuncFlags"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("memid"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpstrSchema"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("oInst"),
            RuntimeHelper.POINTER.withName("lpvarValue")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.unionLayout(
                    RuntimeHelper.POINTER.withName("lptdesc"),
                    RuntimeHelper.POINTER.withName("lpadesc"),
                    JAVA_INT.withName("hreftype")
                ).withName("$anon$0"),
                JAVA_SHORT.withName("vt"),
                MemoryLayout.paddingLayout(6)
            ).withName("tdesc"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    JAVA_LONG.withName("dwReserved"),
                    JAVA_SHORT.withName("wIDLFlags"),
                    MemoryLayout.paddingLayout(6)
                ).withName("idldesc"),
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("pparamdescex"),
                    JAVA_SHORT.withName("wParamFlags"),
                    MemoryLayout.paddingLayout(6)
                ).withName("paramdesc")
            ).withName("$anon$0")
        ).withName("elemdescVar"),
        JAVA_SHORT.withName("wVarFlags"),
        MemoryLayout.paddingLayout(2),
        JAVA_INT.withName("varkind")
    ).withName("tagVARDESC");
    static final VarHandle const$4 = constants$3442.const$3.varHandle(MemoryLayout.PathElement.groupElement("memid"));
    static final VarHandle const$5 = constants$3442.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpstrSchema"));
}


