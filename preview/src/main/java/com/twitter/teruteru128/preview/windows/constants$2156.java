// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2156 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2156() {}
    static final VarHandle const$0 = constants$2155.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$1 = constants$2155.const$3.varHandle(MemoryLayout.PathElement.groupElement("ppCtl"));
    static final VarHandle const$2 = constants$2155.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwCtlEntryIndex"));
    static final VarHandle const$3 = constants$2155.const$3.varHandle(MemoryLayout.PathElement.groupElement("ppSigner"));
    static final VarHandle const$4 = constants$2155.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwSignerIndex"));
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "CertVerifyCTLUsage",
        constants$2156.const$5
    );
}

