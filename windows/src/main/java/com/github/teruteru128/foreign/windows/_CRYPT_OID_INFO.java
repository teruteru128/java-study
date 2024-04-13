// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * struct _CRYPT_OID_INFO {
 *     DWORD cbSize;
 *     LPCSTR pszOID;
 *     LPCWSTR pwszName;
 *     DWORD dwGroupId;
 *     union {
 *         DWORD dwValue;
 *         ALG_ID Algid;
 *         DWORD dwLength;
 *     };
 *     CRYPT_DATA_BLOB ExtraInfo;
 * }
 * }
 */
public class _CRYPT_OID_INFO {

    _CRYPT_OID_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pszOID"),
        Windows_h.C_POINTER.withName("pwszName"),
        Windows_h.C_LONG.withName("dwGroupId"),
        MemoryLayout.unionLayout(
            Windows_h.C_LONG.withName("dwValue"),
            Windows_h.C_INT.withName("Algid"),
            Windows_h.C_LONG.withName("dwLength")
        ).withName("$anon$6208:5"),
        _CRYPTOAPI_BLOB.layout().withName("ExtraInfo")
    ).withName("_CRYPT_OID_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final AddressLayout pszOID$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszOID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pszOID
     * }
     */
    public static final AddressLayout pszOID$layout() {
        return pszOID$LAYOUT;
    }

    private static final long pszOID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pszOID
     * }
     */
    public static final long pszOID$offset() {
        return pszOID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pszOID
     * }
     */
    public static MemorySegment pszOID(MemorySegment struct) {
        return struct.get(pszOID$LAYOUT, pszOID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pszOID
     * }
     */
    public static void pszOID(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszOID$LAYOUT, pszOID$OFFSET, fieldValue);
    }

    private static final AddressLayout pwszName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwszName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pwszName
     * }
     */
    public static final AddressLayout pwszName$layout() {
        return pwszName$LAYOUT;
    }

    private static final long pwszName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pwszName
     * }
     */
    public static final long pwszName$offset() {
        return pwszName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pwszName
     * }
     */
    public static MemorySegment pwszName(MemorySegment struct) {
        return struct.get(pwszName$LAYOUT, pwszName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pwszName
     * }
     */
    public static void pwszName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwszName$LAYOUT, pwszName$OFFSET, fieldValue);
    }

    private static final OfInt dwGroupId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwGroupId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwGroupId
     * }
     */
    public static final OfInt dwGroupId$layout() {
        return dwGroupId$LAYOUT;
    }

    private static final long dwGroupId$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwGroupId
     * }
     */
    public static final long dwGroupId$offset() {
        return dwGroupId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwGroupId
     * }
     */
    public static int dwGroupId(MemorySegment struct) {
        return struct.get(dwGroupId$LAYOUT, dwGroupId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwGroupId
     * }
     */
    public static void dwGroupId(MemorySegment struct, int fieldValue) {
        struct.set(dwGroupId$LAYOUT, dwGroupId$OFFSET, fieldValue);
    }

    private static final OfInt dwValue$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$6208:5"), groupElement("dwValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwValue
     * }
     */
    public static final OfInt dwValue$layout() {
        return dwValue$LAYOUT;
    }

    private static final long dwValue$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwValue
     * }
     */
    public static final long dwValue$offset() {
        return dwValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwValue
     * }
     */
    public static int dwValue(MemorySegment struct) {
        return struct.get(dwValue$LAYOUT, dwValue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwValue
     * }
     */
    public static void dwValue(MemorySegment struct, int fieldValue) {
        struct.set(dwValue$LAYOUT, dwValue$OFFSET, fieldValue);
    }

    private static final OfInt Algid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$6208:5"), groupElement("Algid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ALG_ID Algid
     * }
     */
    public static final OfInt Algid$layout() {
        return Algid$LAYOUT;
    }

    private static final long Algid$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ALG_ID Algid
     * }
     */
    public static final long Algid$offset() {
        return Algid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ALG_ID Algid
     * }
     */
    public static int Algid(MemorySegment struct) {
        return struct.get(Algid$LAYOUT, Algid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ALG_ID Algid
     * }
     */
    public static void Algid(MemorySegment struct, int fieldValue) {
        struct.set(Algid$LAYOUT, Algid$OFFSET, fieldValue);
    }

    private static final OfInt dwLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$6208:5"), groupElement("dwLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwLength
     * }
     */
    public static final OfInt dwLength$layout() {
        return dwLength$LAYOUT;
    }

    private static final long dwLength$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwLength
     * }
     */
    public static final long dwLength$offset() {
        return dwLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwLength
     * }
     */
    public static int dwLength(MemorySegment struct) {
        return struct.get(dwLength$LAYOUT, dwLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwLength
     * }
     */
    public static void dwLength(MemorySegment struct, int fieldValue) {
        struct.set(dwLength$LAYOUT, dwLength$OFFSET, fieldValue);
    }

    private static final GroupLayout ExtraInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ExtraInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ExtraInfo
     * }
     */
    public static final GroupLayout ExtraInfo$layout() {
        return ExtraInfo$LAYOUT;
    }

    private static final long ExtraInfo$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ExtraInfo
     * }
     */
    public static final long ExtraInfo$offset() {
        return ExtraInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ExtraInfo
     * }
     */
    public static MemorySegment ExtraInfo(MemorySegment struct) {
        return struct.asSlice(ExtraInfo$OFFSET, ExtraInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ExtraInfo
     * }
     */
    public static void ExtraInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ExtraInfo$OFFSET, ExtraInfo$LAYOUT.byteSize());
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
