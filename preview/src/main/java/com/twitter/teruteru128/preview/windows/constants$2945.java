// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2945 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2945() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("_GUID"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("_FILETIME"),
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CorePrinterDriverInstalledA",
        constants$2945.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CorePrinterDriverInstalledW",
        constants$2945.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetPrinterDriverPackagePathA",
        constants$807.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetPrinterDriverPackagePathW",
        constants$807.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "DeletePrinterDriverPackageA",
        constants$37.const$3
    );
}


