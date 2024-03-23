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
 * struct _SYSTEM_LOGICAL_PROCESSOR_INFORMATION {
 *     ULONG_PTR ProcessorMask;
 *     LOGICAL_PROCESSOR_RELATIONSHIP Relationship;
 *     union {
 *         struct {
 *             BYTE Flags;
 *         } ProcessorCore;
 *         struct {
 *             DWORD NodeNumber;
 *         } NumaNode;
 *         CACHE_DESCRIPTOR Cache;
 *         ULONGLONG Reserved[2];
 *     };
 * }
 * }
 */
public class _SYSTEM_LOGICAL_PROCESSOR_INFORMATION {

    _SYSTEM_LOGICAL_PROCESSOR_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("ProcessorMask"),
        Windows_h.C_INT.withName("Relationship"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            _SYSTEM_LOGICAL_PROCESSOR_INFORMATION.ProcessorCore.layout().withName("ProcessorCore"),
            _SYSTEM_LOGICAL_PROCESSOR_INFORMATION.NumaNode.layout().withName("NumaNode"),
            _CACHE_DESCRIPTOR.layout().withName("Cache"),
            MemoryLayout.sequenceLayout(2, Windows_h.C_LONG_LONG).withName("Reserved")
        ).withName("$anon$13380:5")
    ).withName("_SYSTEM_LOGICAL_PROCESSOR_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong ProcessorMask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ProcessorMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessorMask
     * }
     */
    public static final OfLong ProcessorMask$layout() {
        return ProcessorMask$LAYOUT;
    }

    private static final long ProcessorMask$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessorMask
     * }
     */
    public static final long ProcessorMask$offset() {
        return ProcessorMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessorMask
     * }
     */
    public static long ProcessorMask(MemorySegment struct) {
        return struct.get(ProcessorMask$LAYOUT, ProcessorMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessorMask
     * }
     */
    public static void ProcessorMask(MemorySegment struct, long fieldValue) {
        struct.set(ProcessorMask$LAYOUT, ProcessorMask$OFFSET, fieldValue);
    }

    private static final OfInt Relationship$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Relationship"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGICAL_PROCESSOR_RELATIONSHIP Relationship
     * }
     */
    public static final OfInt Relationship$layout() {
        return Relationship$LAYOUT;
    }

    private static final long Relationship$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGICAL_PROCESSOR_RELATIONSHIP Relationship
     * }
     */
    public static final long Relationship$offset() {
        return Relationship$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGICAL_PROCESSOR_RELATIONSHIP Relationship
     * }
     */
    public static int Relationship(MemorySegment struct) {
        return struct.get(Relationship$LAYOUT, Relationship$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGICAL_PROCESSOR_RELATIONSHIP Relationship
     * }
     */
    public static void Relationship(MemorySegment struct, int fieldValue) {
        struct.set(Relationship$LAYOUT, Relationship$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     BYTE Flags;
     * }
     * }
     */
    public static class ProcessorCore {

        ProcessorCore() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            Windows_h.C_CHAR.withName("Flags")
        ).withName("$anon$13381:9");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfByte Flags$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Flags"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE Flags
         * }
         */
        public static final OfByte Flags$layout() {
            return Flags$LAYOUT;
        }

        private static final long Flags$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE Flags
         * }
         */
        public static final long Flags$offset() {
            return Flags$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE Flags
         * }
         */
        public static byte Flags(MemorySegment struct) {
            return struct.get(Flags$LAYOUT, Flags$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE Flags
         * }
         */
        public static void Flags(MemorySegment struct, byte fieldValue) {
            struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
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

    private static final GroupLayout ProcessorCore$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$13380:5"), groupElement("ProcessorCore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     BYTE Flags;
     * } ProcessorCore
     * }
     */
    public static final GroupLayout ProcessorCore$layout() {
        return ProcessorCore$LAYOUT;
    }

    private static final long ProcessorCore$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     BYTE Flags;
     * } ProcessorCore
     * }
     */
    public static final long ProcessorCore$offset() {
        return ProcessorCore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     BYTE Flags;
     * } ProcessorCore
     * }
     */
    public static MemorySegment ProcessorCore(MemorySegment struct) {
        return struct.asSlice(ProcessorCore$OFFSET, ProcessorCore$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     BYTE Flags;
     * } ProcessorCore
     * }
     */
    public static void ProcessorCore(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ProcessorCore$OFFSET, ProcessorCore$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     DWORD NodeNumber;
     * }
     * }
     */
    public static class NumaNode {

        NumaNode() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            Windows_h.C_LONG.withName("NodeNumber")
        ).withName("$anon$13384:9");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt NodeNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NodeNumber"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD NodeNumber
         * }
         */
        public static final OfInt NodeNumber$layout() {
            return NodeNumber$LAYOUT;
        }

        private static final long NodeNumber$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD NodeNumber
         * }
         */
        public static final long NodeNumber$offset() {
            return NodeNumber$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD NodeNumber
         * }
         */
        public static int NodeNumber(MemorySegment struct) {
            return struct.get(NodeNumber$LAYOUT, NodeNumber$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD NodeNumber
         * }
         */
        public static void NodeNumber(MemorySegment struct, int fieldValue) {
            struct.set(NodeNumber$LAYOUT, NodeNumber$OFFSET, fieldValue);
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

    private static final GroupLayout NumaNode$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$13380:5"), groupElement("NumaNode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD NodeNumber;
     * } NumaNode
     * }
     */
    public static final GroupLayout NumaNode$layout() {
        return NumaNode$LAYOUT;
    }

    private static final long NumaNode$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD NodeNumber;
     * } NumaNode
     * }
     */
    public static final long NumaNode$offset() {
        return NumaNode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD NodeNumber;
     * } NumaNode
     * }
     */
    public static MemorySegment NumaNode(MemorySegment struct) {
        return struct.asSlice(NumaNode$OFFSET, NumaNode$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD NodeNumber;
     * } NumaNode
     * }
     */
    public static void NumaNode(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, NumaNode$OFFSET, NumaNode$LAYOUT.byteSize());
    }

    private static final GroupLayout Cache$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$13380:5"), groupElement("Cache"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CACHE_DESCRIPTOR Cache
     * }
     */
    public static final GroupLayout Cache$layout() {
        return Cache$LAYOUT;
    }

    private static final long Cache$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CACHE_DESCRIPTOR Cache
     * }
     */
    public static final long Cache$offset() {
        return Cache$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CACHE_DESCRIPTOR Cache
     * }
     */
    public static MemorySegment Cache(MemorySegment struct) {
        return struct.asSlice(Cache$OFFSET, Cache$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CACHE_DESCRIPTOR Cache
     * }
     */
    public static void Cache(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Cache$OFFSET, Cache$LAYOUT.byteSize());
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("$anon$13380:5"), groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG Reserved[2]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG Reserved[2]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG Reserved[2]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG Reserved[2]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * ULONGLONG Reserved[2]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * ULONGLONG Reserved[2]
     * }
     */
    public static long Reserved(MemorySegment struct, long index0) {
        return (long)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * ULONGLONG Reserved[2]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, long fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

