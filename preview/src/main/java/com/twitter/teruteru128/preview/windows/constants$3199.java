// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3199 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3199() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CoGetDefaultContext",
        constants$569.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CoGetApartmentType",
        constants$34.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwServerPid"),
        JAVA_INT.withName("dwServerTid"),
        JAVA_LONG.withName("ui64ServerAddress")
    ).withName("tagServerInformation");
    static final VarHandle const$3 = constants$3199.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwServerPid"));
    static final VarHandle const$4 = constants$3199.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwServerTid"));
    static final VarHandle const$5 = constants$3199.const$2.varHandle(MemoryLayout.PathElement.groupElement("ui64ServerAddress"));
}

