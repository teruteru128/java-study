// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1357 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1357() {}
    static final VarHandle const$0 = constants$1356.const$2.varHandle(MemoryLayout.PathElement.groupElement("iDelayMSec"));
    static final VarHandle const$1 = constants$1356.const$2.varHandle(MemoryLayout.PathElement.groupElement("iRepeatMSec"));
    static final VarHandle const$2 = constants$1356.const$2.varHandle(MemoryLayout.PathElement.groupElement("iBounceMSec"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwFlags")
    ).withName("tagSTICKYKEYS");
    static final VarHandle const$4 = constants$1357.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$5 = constants$1357.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
}


