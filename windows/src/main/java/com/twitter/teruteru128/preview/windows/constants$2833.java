// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2833 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2833() {}
    static final VarHandle const$0 = constants$2832.const$2.varHandle(MemoryLayout.PathElement.groupElement("DeviceNotSelectedTimeout"));
    static final VarHandle const$1 = constants$2832.const$2.varHandle(MemoryLayout.PathElement.groupElement("TransmissionRetryTimeout"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwStatus")
    ).withName("_PRINTER_INFO_6");
    static final VarHandle const$3 = constants$2833.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwStatus"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pszObjectGUID"),
        JAVA_INT.withName("dwAction"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PRINTER_INFO_7A");
    static final VarHandle const$5 = constants$2833.const$4.varHandle(MemoryLayout.PathElement.groupElement("pszObjectGUID"));
}

