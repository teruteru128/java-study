// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3624 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3624() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "StgIsStorageFile",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "StgIsStorageILockBytes",
        constants$18.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "StgSetTimes",
        constants$1.const$3
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("usVersion"),
        JAVA_SHORT.withName("reserved"),
        JAVA_INT.withName("ulSectorSize"),
        RuntimeHelper.POINTER.withName("pwcsTemplateFile")
    ).withName("tagSTGOPTIONS");
    static final VarHandle const$4 = constants$3624.const$3.varHandle(MemoryLayout.PathElement.groupElement("usVersion"));
    static final VarHandle const$5 = constants$3624.const$3.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
}


