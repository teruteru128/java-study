// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4481 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4481() {}
    static final VarHandle const$0 = constants$4480.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwResetPeriod"));
    static final VarHandle const$1 = constants$4480.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpRebootMsg"));
    static final VarHandle const$2 = constants$4480.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpCommand"));
    static final VarHandle const$3 = constants$4480.const$5.varHandle(MemoryLayout.PathElement.groupElement("cActions"));
    static final VarHandle const$4 = constants$4480.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpsaActions"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("fDelayedAutostart")
    ).withName("_SERVICE_DELAYED_AUTO_START_INFO");
}


