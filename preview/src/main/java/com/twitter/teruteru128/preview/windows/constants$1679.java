// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1679 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1679() {}
    static final VarHandle const$0 = constants$1678.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwValue"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "mixerGetControlDetailsA",
        constants$570.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mixerGetControlDetailsW",
        constants$570.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "mixerSetControlDetails",
        constants$570.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("wPeriodMin"),
        JAVA_INT.withByteAlignment(1).withName("wPeriodMax")
    ).withName("timecaps_tag");
    static final VarHandle const$5 = constants$1679.const$4.varHandle(MemoryLayout.PathElement.groupElement("wPeriodMin"));
}

