// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$376 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$376() {}
    static final VarHandle const$0 = constants$374.const$1.varHandle(MemoryLayout.PathElement.groupElement("GprMask"));
    static final VarHandle const$1 = constants$374.const$1.varHandle(MemoryLayout.PathElement.groupElement("GpValue"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("Magic"),
        JAVA_BYTE.withName("MajorLinkerVersion"),
        JAVA_BYTE.withName("MinorLinkerVersion"),
        JAVA_INT.withName("SizeOfCode"),
        JAVA_INT.withName("SizeOfInitializedData"),
        JAVA_INT.withName("SizeOfUninitializedData"),
        JAVA_INT.withName("AddressOfEntryPoint"),
        JAVA_INT.withName("BaseOfCode"),
        JAVA_LONG.withByteAlignment(4).withName("ImageBase"),
        JAVA_INT.withName("SectionAlignment"),
        JAVA_INT.withName("FileAlignment"),
        JAVA_SHORT.withName("MajorOperatingSystemVersion"),
        JAVA_SHORT.withName("MinorOperatingSystemVersion"),
        JAVA_SHORT.withName("MajorImageVersion"),
        JAVA_SHORT.withName("MinorImageVersion"),
        JAVA_SHORT.withName("MajorSubsystemVersion"),
        JAVA_SHORT.withName("MinorSubsystemVersion"),
        JAVA_INT.withName("Win32VersionValue"),
        JAVA_INT.withName("SizeOfImage"),
        JAVA_INT.withName("SizeOfHeaders"),
        JAVA_INT.withName("CheckSum"),
        JAVA_SHORT.withName("Subsystem"),
        JAVA_SHORT.withName("DllCharacteristics"),
        JAVA_LONG.withByteAlignment(4).withName("SizeOfStackReserve"),
        JAVA_LONG.withByteAlignment(4).withName("SizeOfStackCommit"),
        JAVA_LONG.withByteAlignment(4).withName("SizeOfHeapReserve"),
        JAVA_LONG.withByteAlignment(4).withName("SizeOfHeapCommit"),
        JAVA_INT.withName("LoaderFlags"),
        JAVA_INT.withName("NumberOfRvaAndSizes"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            JAVA_INT.withName("VirtualAddress"),
            JAVA_INT.withName("Size")
        ).withName("_IMAGE_DATA_DIRECTORY")).withName("DataDirectory")
    ).withName("_IMAGE_OPTIONAL_HEADER64");
    static final VarHandle const$3 = constants$376.const$2.varHandle(MemoryLayout.PathElement.groupElement("Magic"));
    static final VarHandle const$4 = constants$376.const$2.varHandle(MemoryLayout.PathElement.groupElement("MajorLinkerVersion"));
    static final VarHandle const$5 = constants$376.const$2.varHandle(MemoryLayout.PathElement.groupElement("MinorLinkerVersion"));
}


