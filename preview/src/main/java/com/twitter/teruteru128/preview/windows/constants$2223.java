// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2223 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2223() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            JAVA_INT.withName("cbStruct"),
            JAVA_INT.withName("cbSize")
        ).withName("$anon$0"),
        JAVA_INT.withName("dwAuthType"),
        JAVA_INT.withName("fdwChecks"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pwszServerName")
    ).withName("_HTTPSPolicyCallbackData");
    static final VarHandle const$1 = constants$2223.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("cbStruct"));
    static final VarHandle const$2 = constants$2223.const$0.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$3 = constants$2223.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwAuthType"));
    static final VarHandle const$4 = constants$2223.const$0.varHandle(MemoryLayout.PathElement.groupElement("fdwChecks"));
    static final VarHandle const$5 = constants$2223.const$0.varHandle(MemoryLayout.PathElement.groupElement("pwszServerName"));
}


