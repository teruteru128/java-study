// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2728 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2728() {}
    static final VarHandle const$0 = constants$2727.const$5.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$1 = constants$2727.const$5.varHandle(MemoryLayout.PathElement.groupElement("BehaviorCode"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("HeaderSize"),
        JAVA_INT.withName("StructureSize"),
        JAVA_SHORT.withName("KeyOffset"),
        JAVA_SHORT.withName("KeySize"),
        JAVA_INT.withName("DplLock"),
        JAVA_LONG.withName("DplUserId"),
        JAVA_LONG.withName("DplCredentialId")
    ).withName("_ENCRYPTION_KEY_CTRL_INPUT");
    static final VarHandle const$3 = constants$2728.const$2.varHandle(MemoryLayout.PathElement.groupElement("HeaderSize"));
    static final VarHandle const$4 = constants$2728.const$2.varHandle(MemoryLayout.PathElement.groupElement("StructureSize"));
    static final VarHandle const$5 = constants$2728.const$2.varHandle(MemoryLayout.PathElement.groupElement("KeyOffset"));
}


