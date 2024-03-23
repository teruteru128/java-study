// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _DRIVER_INFO_5W {
 *     DWORD cVersion;
 *     LPWSTR pName;
 *     LPWSTR pEnvironment;
 *     LPWSTR pDriverPath;
 *     LPWSTR pDataFile;
 *     LPWSTR pConfigFile;
 *     DWORD dwDriverAttributes;
 *     DWORD dwConfigVersion;
 *     DWORD dwDriverVersion;
 * }
 * }
 */
public class _DRIVER_INFO_5W {

    _DRIVER_INFO_5W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cVersion"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pName"),
        Windows_h.C_POINTER.withName("pEnvironment"),
        Windows_h.C_POINTER.withName("pDriverPath"),
        Windows_h.C_POINTER.withName("pDataFile"),
        Windows_h.C_POINTER.withName("pConfigFile"),
        Windows_h.C_LONG.withName("dwDriverAttributes"),
        Windows_h.C_LONG.withName("dwConfigVersion"),
        Windows_h.C_LONG.withName("dwDriverVersion"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DRIVER_INFO_5W");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cVersion
     * }
     */
    public static final OfInt cVersion$layout() {
        return cVersion$LAYOUT;
    }

    private static final long cVersion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cVersion
     * }
     */
    public static final long cVersion$offset() {
        return cVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cVersion
     * }
     */
    public static int cVersion(MemorySegment struct) {
        return struct.get(cVersion$LAYOUT, cVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cVersion
     * }
     */
    public static void cVersion(MemorySegment struct, int fieldValue) {
        struct.set(cVersion$LAYOUT, cVersion$OFFSET, fieldValue);
    }

    private static final AddressLayout pName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static final AddressLayout pName$layout() {
        return pName$LAYOUT;
    }

    private static final long pName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static final long pName$offset() {
        return pName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static MemorySegment pName(MemorySegment struct) {
        return struct.get(pName$LAYOUT, pName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static void pName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pName$LAYOUT, pName$OFFSET, fieldValue);
    }

    private static final AddressLayout pEnvironment$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pEnvironment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pEnvironment
     * }
     */
    public static final AddressLayout pEnvironment$layout() {
        return pEnvironment$LAYOUT;
    }

    private static final long pEnvironment$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pEnvironment
     * }
     */
    public static final long pEnvironment$offset() {
        return pEnvironment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pEnvironment
     * }
     */
    public static MemorySegment pEnvironment(MemorySegment struct) {
        return struct.get(pEnvironment$LAYOUT, pEnvironment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pEnvironment
     * }
     */
    public static void pEnvironment(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pEnvironment$LAYOUT, pEnvironment$OFFSET, fieldValue);
    }

    private static final AddressLayout pDriverPath$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDriverPath"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pDriverPath
     * }
     */
    public static final AddressLayout pDriverPath$layout() {
        return pDriverPath$LAYOUT;
    }

    private static final long pDriverPath$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pDriverPath
     * }
     */
    public static final long pDriverPath$offset() {
        return pDriverPath$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pDriverPath
     * }
     */
    public static MemorySegment pDriverPath(MemorySegment struct) {
        return struct.get(pDriverPath$LAYOUT, pDriverPath$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pDriverPath
     * }
     */
    public static void pDriverPath(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDriverPath$LAYOUT, pDriverPath$OFFSET, fieldValue);
    }

    private static final AddressLayout pDataFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDataFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pDataFile
     * }
     */
    public static final AddressLayout pDataFile$layout() {
        return pDataFile$LAYOUT;
    }

    private static final long pDataFile$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pDataFile
     * }
     */
    public static final long pDataFile$offset() {
        return pDataFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pDataFile
     * }
     */
    public static MemorySegment pDataFile(MemorySegment struct) {
        return struct.get(pDataFile$LAYOUT, pDataFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pDataFile
     * }
     */
    public static void pDataFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDataFile$LAYOUT, pDataFile$OFFSET, fieldValue);
    }

    private static final AddressLayout pConfigFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pConfigFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pConfigFile
     * }
     */
    public static final AddressLayout pConfigFile$layout() {
        return pConfigFile$LAYOUT;
    }

    private static final long pConfigFile$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pConfigFile
     * }
     */
    public static final long pConfigFile$offset() {
        return pConfigFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pConfigFile
     * }
     */
    public static MemorySegment pConfigFile(MemorySegment struct) {
        return struct.get(pConfigFile$LAYOUT, pConfigFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pConfigFile
     * }
     */
    public static void pConfigFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pConfigFile$LAYOUT, pConfigFile$OFFSET, fieldValue);
    }

    private static final OfInt dwDriverAttributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDriverAttributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDriverAttributes
     * }
     */
    public static final OfInt dwDriverAttributes$layout() {
        return dwDriverAttributes$LAYOUT;
    }

    private static final long dwDriverAttributes$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDriverAttributes
     * }
     */
    public static final long dwDriverAttributes$offset() {
        return dwDriverAttributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDriverAttributes
     * }
     */
    public static int dwDriverAttributes(MemorySegment struct) {
        return struct.get(dwDriverAttributes$LAYOUT, dwDriverAttributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDriverAttributes
     * }
     */
    public static void dwDriverAttributes(MemorySegment struct, int fieldValue) {
        struct.set(dwDriverAttributes$LAYOUT, dwDriverAttributes$OFFSET, fieldValue);
    }

    private static final OfInt dwConfigVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwConfigVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwConfigVersion
     * }
     */
    public static final OfInt dwConfigVersion$layout() {
        return dwConfigVersion$LAYOUT;
    }

    private static final long dwConfigVersion$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwConfigVersion
     * }
     */
    public static final long dwConfigVersion$offset() {
        return dwConfigVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwConfigVersion
     * }
     */
    public static int dwConfigVersion(MemorySegment struct) {
        return struct.get(dwConfigVersion$LAYOUT, dwConfigVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwConfigVersion
     * }
     */
    public static void dwConfigVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwConfigVersion$LAYOUT, dwConfigVersion$OFFSET, fieldValue);
    }

    private static final OfInt dwDriverVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDriverVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDriverVersion
     * }
     */
    public static final OfInt dwDriverVersion$layout() {
        return dwDriverVersion$LAYOUT;
    }

    private static final long dwDriverVersion$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDriverVersion
     * }
     */
    public static final long dwDriverVersion$offset() {
        return dwDriverVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDriverVersion
     * }
     */
    public static int dwDriverVersion(MemorySegment struct) {
        return struct.get(dwDriverVersion$LAYOUT, dwDriverVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDriverVersion
     * }
     */
    public static void dwDriverVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwDriverVersion$LAYOUT, dwDriverVersion$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

