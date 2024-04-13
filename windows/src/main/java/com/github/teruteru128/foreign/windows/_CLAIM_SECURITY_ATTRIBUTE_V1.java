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
 * struct _CLAIM_SECURITY_ATTRIBUTE_V1 {
 *     PWSTR Name;
 *     WORD ValueType;
 *     WORD Reserved;
 *     DWORD Flags;
 *     DWORD ValueCount;
 *     union {
 *         PLONG64 pInt64;
 *         PDWORD64 pUint64;
 *         PWSTR *ppString;
 *         PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
 *         PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
 *     } Values;
 * }
 * }
 */
public class _CLAIM_SECURITY_ATTRIBUTE_V1 {

    _CLAIM_SECURITY_ATTRIBUTE_V1() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("Name"),
        Windows_h.C_SHORT.withName("ValueType"),
        Windows_h.C_SHORT.withName("Reserved"),
        Windows_h.C_LONG.withName("Flags"),
        Windows_h.C_LONG.withName("ValueCount"),
        MemoryLayout.paddingLayout(4),
        _CLAIM_SECURITY_ATTRIBUTE_V1.Values.layout().withName("Values")
    ).withName("_CLAIM_SECURITY_ATTRIBUTE_V1");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout Name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PWSTR Name
     * }
     */
    public static final AddressLayout Name$layout() {
        return Name$LAYOUT;
    }

    private static final long Name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PWSTR Name
     * }
     */
    public static final long Name$offset() {
        return Name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PWSTR Name
     * }
     */
    public static MemorySegment Name(MemorySegment struct) {
        return struct.get(Name$LAYOUT, Name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PWSTR Name
     * }
     */
    public static void Name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Name$LAYOUT, Name$OFFSET, fieldValue);
    }

    private static final OfShort ValueType$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ValueType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ValueType
     * }
     */
    public static final OfShort ValueType$layout() {
        return ValueType$LAYOUT;
    }

    private static final long ValueType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ValueType
     * }
     */
    public static final long ValueType$offset() {
        return ValueType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ValueType
     * }
     */
    public static short ValueType(MemorySegment struct) {
        return struct.get(ValueType$LAYOUT, ValueType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ValueType
     * }
     */
    public static void ValueType(MemorySegment struct, short fieldValue) {
        struct.set(ValueType$LAYOUT, ValueType$OFFSET, fieldValue);
    }

    private static final OfShort Reserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final OfShort Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static short Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, short fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfInt ValueCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ValueCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ValueCount
     * }
     */
    public static final OfInt ValueCount$layout() {
        return ValueCount$LAYOUT;
    }

    private static final long ValueCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ValueCount
     * }
     */
    public static final long ValueCount$offset() {
        return ValueCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ValueCount
     * }
     */
    public static int ValueCount(MemorySegment struct) {
        return struct.get(ValueCount$LAYOUT, ValueCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ValueCount
     * }
     */
    public static void ValueCount(MemorySegment struct, int fieldValue) {
        struct.set(ValueCount$LAYOUT, ValueCount$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     PLONG64 pInt64;
     *     PDWORD64 pUint64;
     *     PWSTR *ppString;
     *     PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
     *     PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
     * }
     * }
     */
    public static class Values {

        Values() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            Windows_h.C_POINTER.withName("pInt64"),
            Windows_h.C_POINTER.withName("pUint64"),
            Windows_h.C_POINTER.withName("ppString"),
            Windows_h.C_POINTER.withName("pFqbn"),
            Windows_h.C_POINTER.withName("pOctetString")
        ).withName("$anon$11909:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final AddressLayout pInt64$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pInt64"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * PLONG64 pInt64
         * }
         */
        public static final AddressLayout pInt64$layout() {
            return pInt64$LAYOUT;
        }

        private static final long pInt64$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * PLONG64 pInt64
         * }
         */
        public static final long pInt64$offset() {
            return pInt64$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * PLONG64 pInt64
         * }
         */
        public static MemorySegment pInt64(MemorySegment union) {
            return union.get(pInt64$LAYOUT, pInt64$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * PLONG64 pInt64
         * }
         */
        public static void pInt64(MemorySegment union, MemorySegment fieldValue) {
            union.set(pInt64$LAYOUT, pInt64$OFFSET, fieldValue);
        }

        private static final AddressLayout pUint64$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pUint64"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * PDWORD64 pUint64
         * }
         */
        public static final AddressLayout pUint64$layout() {
            return pUint64$LAYOUT;
        }

        private static final long pUint64$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * PDWORD64 pUint64
         * }
         */
        public static final long pUint64$offset() {
            return pUint64$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * PDWORD64 pUint64
         * }
         */
        public static MemorySegment pUint64(MemorySegment union) {
            return union.get(pUint64$LAYOUT, pUint64$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * PDWORD64 pUint64
         * }
         */
        public static void pUint64(MemorySegment union, MemorySegment fieldValue) {
            union.set(pUint64$LAYOUT, pUint64$OFFSET, fieldValue);
        }

        private static final AddressLayout ppString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ppString"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * PWSTR *ppString
         * }
         */
        public static final AddressLayout ppString$layout() {
            return ppString$LAYOUT;
        }

        private static final long ppString$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * PWSTR *ppString
         * }
         */
        public static final long ppString$offset() {
            return ppString$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * PWSTR *ppString
         * }
         */
        public static MemorySegment ppString(MemorySegment union) {
            return union.get(ppString$LAYOUT, ppString$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * PWSTR *ppString
         * }
         */
        public static void ppString(MemorySegment union, MemorySegment fieldValue) {
            union.set(ppString$LAYOUT, ppString$OFFSET, fieldValue);
        }

        private static final AddressLayout pFqbn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pFqbn"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn
         * }
         */
        public static final AddressLayout pFqbn$layout() {
            return pFqbn$LAYOUT;
        }

        private static final long pFqbn$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn
         * }
         */
        public static final long pFqbn$offset() {
            return pFqbn$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn
         * }
         */
        public static MemorySegment pFqbn(MemorySegment union) {
            return union.get(pFqbn$LAYOUT, pFqbn$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn
         * }
         */
        public static void pFqbn(MemorySegment union, MemorySegment fieldValue) {
            union.set(pFqbn$LAYOUT, pFqbn$OFFSET, fieldValue);
        }

        private static final AddressLayout pOctetString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pOctetString"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString
         * }
         */
        public static final AddressLayout pOctetString$layout() {
            return pOctetString$LAYOUT;
        }

        private static final long pOctetString$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString
         * }
         */
        public static final long pOctetString$offset() {
            return pOctetString$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString
         * }
         */
        public static MemorySegment pOctetString(MemorySegment union) {
            return union.get(pOctetString$LAYOUT, pOctetString$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString
         * }
         */
        public static void pOctetString(MemorySegment union, MemorySegment fieldValue) {
            union.set(pOctetString$LAYOUT, pOctetString$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout Values$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Values"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     PLONG64 pInt64;
     *     PDWORD64 pUint64;
     *     PWSTR *ppString;
     *     PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
     *     PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
     * } Values
     * }
     */
    public static final GroupLayout Values$layout() {
        return Values$LAYOUT;
    }

    private static final long Values$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     PLONG64 pInt64;
     *     PDWORD64 pUint64;
     *     PWSTR *ppString;
     *     PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
     *     PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
     * } Values
     * }
     */
    public static final long Values$offset() {
        return Values$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     PLONG64 pInt64;
     *     PDWORD64 pUint64;
     *     PWSTR *ppString;
     *     PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
     *     PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
     * } Values
     * }
     */
    public static MemorySegment Values(MemorySegment struct) {
        return struct.asSlice(Values$OFFSET, Values$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     PLONG64 pInt64;
     *     PDWORD64 pUint64;
     *     PWSTR *ppString;
     *     PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE pFqbn;
     *     PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pOctetString;
     * } Values
     * }
     */
    public static void Values(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Values$OFFSET, Values$LAYOUT.byteSize());
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
