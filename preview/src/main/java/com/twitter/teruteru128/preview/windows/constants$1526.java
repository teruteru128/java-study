// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1526 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1526() {}
    static final VarHandle const$0 = constants$1525.const$5.varHandle(MemoryLayout.PathElement.groupElement("hszSvc"));
    static final VarHandle const$1 = constants$1525.const$5.varHandle(MemoryLayout.PathElement.groupElement("hszTopic"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cb"),
        JAVA_INT.withName("wFlags"),
        JAVA_INT.withName("wCountryID"),
        JAVA_INT.withName("iCodePage"),
        JAVA_INT.withName("dwLangID"),
        JAVA_INT.withName("dwSecurity"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Length"),
            JAVA_INT.withName("ImpersonationLevel"),
            JAVA_BYTE.withName("ContextTrackingMode"),
            JAVA_BYTE.withName("EffectiveOnly"),
            MemoryLayout.paddingLayout(2)
        ).withName("qos")
    ).withName("tagCONVCONTEXT");
    static final VarHandle const$3 = constants$1526.const$2.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    static final VarHandle const$4 = constants$1526.const$2.varHandle(MemoryLayout.PathElement.groupElement("wFlags"));
    static final VarHandle const$5 = constants$1526.const$2.varHandle(MemoryLayout.PathElement.groupElement("wCountryID"));
}


