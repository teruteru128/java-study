// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2482 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2482() {}
    static final VarHandle const$0 = constants$2481.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwOffset"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("dwSignature"),
        JAVA_INT.withByteAlignment(1).withName("dwVersion"),
        JAVA_INT.withByteAlignment(1).withName("dwSize")
    ).withName("_DEVICEDUMP_STRUCTURE_VERSION");
    static final VarHandle const$2 = constants$2482.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwSignature"));
    static final VarHandle const$3 = constants$2482.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$4 = constants$2482.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withByteAlignment(1).withName("Data1"),
            JAVA_SHORT.withByteAlignment(1).withName("Data2"),
            JAVA_SHORT.withByteAlignment(1).withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("guidDeviceDataId"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("sOrganizationID"),
        JAVA_INT.withByteAlignment(1).withName("dwFirmwareRevision"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("sModelNumber"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("szDeviceManufacturingID"),
        JAVA_INT.withByteAlignment(1).withName("dwFlags"),
        JAVA_INT.withByteAlignment(1).withName("bRestrictedPrivateDataVersion"),
        JAVA_INT.withByteAlignment(1).withName("dwFirmwareIssueId"),
        MemoryLayout.sequenceLayout(132, JAVA_BYTE).withName("szIssueDescriptionString")
    ).withName("_DEVICEDUMP_SECTION_HEADER");
}

