// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4298 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4298() {}
    static final VarHandle const$0 = constants$4297.const$4.varHandle(MemoryLayout.PathElement.groupElement("szDistUnit"));
    static final VarHandle const$1 = constants$4297.const$4.varHandle(MemoryLayout.PathElement.groupElement("szCodeBase"));
    static final VarHandle const$2 = constants$4297.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwVersionMS"));
    static final VarHandle const$3 = constants$4297.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwVersionLS"));
    static final VarHandle const$4 = constants$4297.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwStyle"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwFlags"),
        JAVA_INT.withName("dwAdState"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("szTitle"),
        RuntimeHelper.POINTER.withName("szAbstract"),
        RuntimeHelper.POINTER.withName("szHREF"),
        JAVA_INT.withName("dwInstalledVersionMS"),
        JAVA_INT.withName("dwInstalledVersionLS"),
        JAVA_INT.withName("dwUpdateVersionMS"),
        JAVA_INT.withName("dwUpdateVersionLS"),
        JAVA_INT.withName("dwAdvertisedVersionMS"),
        JAVA_INT.withName("dwAdvertisedVersionLS"),
        JAVA_INT.withName("dwReserved"),
        MemoryLayout.paddingLayout(4)
    ).withName("_tagSOFTDISTINFO");
}

