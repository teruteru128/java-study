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
 * struct _CLAIM_SECURITY_ATTRIBUTES_INFORMATION {
 *     WORD Version;
 *     WORD Reserved;
 *     DWORD AttributeCount;
 *     union {
 *         PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
 *     } Attribute;
 * }
 * }
 */
public class _CLAIM_SECURITY_ATTRIBUTES_INFORMATION {

    _CLAIM_SECURITY_ATTRIBUTES_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("Version"),
        Windows_h.C_SHORT.withName("Reserved"),
        Windows_h.C_LONG.withName("AttributeCount"),
        _CLAIM_SECURITY_ATTRIBUTES_INFORMATION.Attribute.layout().withName("Attribute")
    ).withName("_CLAIM_SECURITY_ATTRIBUTES_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Version$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static final OfShort Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static short Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static void Version(MemorySegment struct, short fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
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

    private static final long Reserved$OFFSET = 2;

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

    private static final OfInt AttributeCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AttributeCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AttributeCount
     * }
     */
    public static final OfInt AttributeCount$layout() {
        return AttributeCount$LAYOUT;
    }

    private static final long AttributeCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AttributeCount
     * }
     */
    public static final long AttributeCount$offset() {
        return AttributeCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AttributeCount
     * }
     */
    public static int AttributeCount(MemorySegment struct) {
        return struct.get(AttributeCount$LAYOUT, AttributeCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AttributeCount
     * }
     */
    public static void AttributeCount(MemorySegment struct, int fieldValue) {
        struct.set(AttributeCount$LAYOUT, AttributeCount$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
     * }
     * }
     */
    public static class Attribute {

        Attribute() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            Windows_h.C_POINTER.withName("pAttributeV1")
        ).withName("$anon$12005:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final AddressLayout pAttributeV1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pAttributeV1"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1
         * }
         */
        public static final AddressLayout pAttributeV1$layout() {
            return pAttributeV1$LAYOUT;
        }

        private static final long pAttributeV1$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1
         * }
         */
        public static final long pAttributeV1$offset() {
            return pAttributeV1$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1
         * }
         */
        public static MemorySegment pAttributeV1(MemorySegment union) {
            return union.get(pAttributeV1$LAYOUT, pAttributeV1$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1
         * }
         */
        public static void pAttributeV1(MemorySegment union, MemorySegment fieldValue) {
            union.set(pAttributeV1$LAYOUT, pAttributeV1$OFFSET, fieldValue);
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

    private static final GroupLayout Attribute$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Attribute"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
     * } Attribute
     * }
     */
    public static final GroupLayout Attribute$layout() {
        return Attribute$LAYOUT;
    }

    private static final long Attribute$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
     * } Attribute
     * }
     */
    public static final long Attribute$offset() {
        return Attribute$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
     * } Attribute
     * }
     */
    public static MemorySegment Attribute(MemorySegment struct) {
        return struct.asSlice(Attribute$OFFSET, Attribute$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
     * } Attribute
     * }
     */
    public static void Attribute(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Attribute$OFFSET, Attribute$LAYOUT.byteSize());
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
