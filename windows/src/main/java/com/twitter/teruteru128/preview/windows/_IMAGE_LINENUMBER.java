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
 * struct _IMAGE_LINENUMBER {
 *     union {
 *         DWORD SymbolTableIndex;
 *         DWORD VirtualAddress;
 *     } Type;
 *     WORD Linenumber;
 * }
 * }
 */
public class _IMAGE_LINENUMBER {

    _IMAGE_LINENUMBER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _IMAGE_LINENUMBER.Type.layout().withName("Type"),
        Windows_h.C_SHORT.withName("Linenumber")
    ).withName("_IMAGE_LINENUMBER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * union {
     *     DWORD SymbolTableIndex;
     *     DWORD VirtualAddress;
     * }
     * }
     */
    public static class Type {

        Type() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            Windows_h.align(Windows_h.C_LONG, 2).withName("SymbolTableIndex"),
            Windows_h.align(Windows_h.C_LONG, 2).withName("VirtualAddress")
        ).withName("$anon$19193:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt SymbolTableIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SymbolTableIndex"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD SymbolTableIndex
         * }
         */
        public static final OfInt SymbolTableIndex$layout() {
            return SymbolTableIndex$LAYOUT;
        }

        private static final long SymbolTableIndex$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD SymbolTableIndex
         * }
         */
        public static final long SymbolTableIndex$offset() {
            return SymbolTableIndex$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD SymbolTableIndex
         * }
         */
        public static int SymbolTableIndex(MemorySegment union) {
            return union.get(SymbolTableIndex$LAYOUT, SymbolTableIndex$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD SymbolTableIndex
         * }
         */
        public static void SymbolTableIndex(MemorySegment union, int fieldValue) {
            union.set(SymbolTableIndex$LAYOUT, SymbolTableIndex$OFFSET, fieldValue);
        }

        private static final OfInt VirtualAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("VirtualAddress"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD VirtualAddress
         * }
         */
        public static final OfInt VirtualAddress$layout() {
            return VirtualAddress$LAYOUT;
        }

        private static final long VirtualAddress$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD VirtualAddress
         * }
         */
        public static final long VirtualAddress$offset() {
            return VirtualAddress$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD VirtualAddress
         * }
         */
        public static int VirtualAddress(MemorySegment union) {
            return union.get(VirtualAddress$LAYOUT, VirtualAddress$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD VirtualAddress
         * }
         */
        public static void VirtualAddress(MemorySegment union, int fieldValue) {
            union.set(VirtualAddress$LAYOUT, VirtualAddress$OFFSET, fieldValue);
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

    private static final GroupLayout Type$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     DWORD SymbolTableIndex;
     *     DWORD VirtualAddress;
     * } Type
     * }
     */
    public static final GroupLayout Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     DWORD SymbolTableIndex;
     *     DWORD VirtualAddress;
     * } Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     DWORD SymbolTableIndex;
     *     DWORD VirtualAddress;
     * } Type
     * }
     */
    public static MemorySegment Type(MemorySegment struct) {
        return struct.asSlice(Type$OFFSET, Type$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     DWORD SymbolTableIndex;
     *     DWORD VirtualAddress;
     * } Type
     * }
     */
    public static void Type(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Type$OFFSET, Type$LAYOUT.byteSize());
    }

    private static final OfShort Linenumber$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Linenumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Linenumber
     * }
     */
    public static final OfShort Linenumber$layout() {
        return Linenumber$LAYOUT;
    }

    private static final long Linenumber$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Linenumber
     * }
     */
    public static final long Linenumber$offset() {
        return Linenumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Linenumber
     * }
     */
    public static short Linenumber(MemorySegment struct) {
        return struct.get(Linenumber$LAYOUT, Linenumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Linenumber
     * }
     */
    public static void Linenumber(MemorySegment struct, short fieldValue) {
        struct.set(Linenumber$LAYOUT, Linenumber$OFFSET, fieldValue);
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

