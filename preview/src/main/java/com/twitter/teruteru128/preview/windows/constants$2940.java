// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2940 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2940() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "DeletePrintProvidorA",
        constants$37.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "DeletePrintProvidorW",
        constants$37.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "IsValidDevmodeA",
        constants$39.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "IsValidDevmodeW",
        constants$39.const$3
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwFlags")
    ).withName("_PRINTER_OPTIONSA");
    static final VarHandle const$5 = constants$2940.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
}


