// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2150 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2150() {}
    static final VarHandle const$0 = constants$2149.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$1 = constants$2149.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwPriority"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CertRegisterSystemStore",
        constants$585.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CertRegisterPhysicalStore",
        constants$775.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CertUnregisterSystemStore",
        constants$65.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CertUnregisterPhysicalStore",
        constants$485.const$5
    );
}

