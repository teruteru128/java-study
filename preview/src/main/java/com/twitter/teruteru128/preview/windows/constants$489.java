// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$489 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$489() {}
    static final VarHandle const$0 = constants$487.const$4.varHandle(MemoryLayout.PathElement.groupElement("UInt32Value"));
    static final VarHandle const$1 = constants$487.const$4.varHandle(MemoryLayout.PathElement.groupElement("Int64Value"));
    static final VarHandle const$2 = constants$487.const$4.varHandle(MemoryLayout.PathElement.groupElement("UInt64Value"));
    static final VarHandle const$3 = constants$487.const$4.varHandle(MemoryLayout.PathElement.groupElement("AnsiStringValue"));
    static final VarHandle const$4 = constants$487.const$4.varHandle(MemoryLayout.PathElement.groupElement("UnicodeStringValue"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("Version"),
        MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("Reserved0"),
        JAVA_LONG.withName("ApplicationId"),
        MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
            JAVA_INT.withName("Type"),
            JAVA_INT.withName("PolicyId"),
            MemoryLayout.unionLayout(
                RuntimeHelper.POINTER.withName("None"),
                JAVA_BYTE.withName("BoolValue"),
                JAVA_BYTE.withName("Int8Value"),
                JAVA_BYTE.withName("UInt8Value"),
                JAVA_SHORT.withName("Int16Value"),
                JAVA_SHORT.withName("UInt16Value"),
                JAVA_INT.withName("Int32Value"),
                JAVA_INT.withName("UInt32Value"),
                JAVA_LONG.withName("Int64Value"),
                JAVA_LONG.withName("UInt64Value"),
                RuntimeHelper.POINTER.withName("AnsiStringValue"),
                RuntimeHelper.POINTER.withName("UnicodeStringValue")
            ).withName("u")
        ).withName("_IMAGE_POLICY_ENTRY")).withName("Policies")
    ).withName("_IMAGE_POLICY_METADATA");
}

