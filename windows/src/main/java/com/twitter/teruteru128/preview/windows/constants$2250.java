// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2250 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2250() {}
    static final VarHandle const$0 = constants$2249.const$2.varHandle(MemoryLayout.PathElement.groupElement("KeyLength"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("EfsVersion")
    ).withName("_EFS_COMPATIBILITY_INFO");
    static final VarHandle const$2 = constants$2250.const$1.varHandle(MemoryLayout.PathElement.groupElement("EfsVersion"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("EfsVersion"),
        JAVA_INT.withName("SubVersion")
    ).withName("_EFS_VERSION_INFO");
    static final VarHandle const$4 = constants$2250.const$3.varHandle(MemoryLayout.PathElement.groupElement("EfsVersion"));
    static final VarHandle const$5 = constants$2250.const$3.varHandle(MemoryLayout.PathElement.groupElement("SubVersion"));
}

