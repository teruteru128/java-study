// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2774 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2774() {}
    static final VarHandle const$0 = constants$2773.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwDesiredCardModuleVersion"));
    static final VarHandle const$1 = constants$2773.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwCspFlags"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSerialNumberOffset"),
        JAVA_INT.withName("cbSerialNumberLength"),
        JAVA_INT.withName("dwDesiredCardModuleVersion")
    ).withName("");
    static final VarHandle const$3 = constants$2774.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbSerialNumberOffset"));
    static final VarHandle const$4 = constants$2774.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbSerialNumberLength"));
    static final VarHandle const$5 = constants$2774.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwDesiredCardModuleVersion"));
}

