// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2736 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2736() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("NumberOfWorkerThreads"),
        JAVA_INT.withName("Flags")
    ).withName("_VIRTUALIZATION_INSTANCE_INFO_INPUT");
    static final VarHandle const$1 = constants$2736.const$0.varHandle(MemoryLayout.PathElement.groupElement("NumberOfWorkerThreads"));
    static final VarHandle const$2 = constants$2736.const$0.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("HeaderSize"),
        MemoryLayout.paddingLayout(2),
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("NotificationInfoSize"),
        JAVA_SHORT.withName("NotificationInfoOffset"),
        JAVA_SHORT.withName("ProviderMajorVersion")
    ).withName("_VIRTUALIZATION_INSTANCE_INFO_INPUT_EX");
    static final VarHandle const$4 = constants$2736.const$3.varHandle(MemoryLayout.PathElement.groupElement("HeaderSize"));
    static final VarHandle const$5 = constants$2736.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
}


