// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4483 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4483() {}
    static final VarHandle const$0 = constants$4482.const$5.varHandle(MemoryLayout.PathElement.groupElement("pmszRequiredPrivileges"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pmszRequiredPrivileges")
    ).withName("_SERVICE_REQUIRED_PRIVILEGES_INFOW");
    static final VarHandle const$2 = constants$4483.const$1.varHandle(MemoryLayout.PathElement.groupElement("pmszRequiredPrivileges"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwPreshutdownTimeout")
    ).withName("_SERVICE_PRESHUTDOWN_INFO");
    static final VarHandle const$4 = constants$4483.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwPreshutdownTimeout"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwDataType"),
        JAVA_INT.withName("cbData"),
        RuntimeHelper.POINTER.withName("pData")
    ).withName("_SERVICE_TRIGGER_SPECIFIC_DATA_ITEM");
}


