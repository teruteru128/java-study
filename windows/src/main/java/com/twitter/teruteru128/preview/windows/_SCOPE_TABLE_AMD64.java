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
 * struct _SCOPE_TABLE_AMD64 {
 *     DWORD Count;
 *     struct {
 *         DWORD BeginAddress;
 *         DWORD EndAddress;
 *         DWORD HandlerAddress;
 *         DWORD JumpTarget;
 *     } ScopeRecord[1];
 * }
 * }
 */
public class _SCOPE_TABLE_AMD64 {

    _SCOPE_TABLE_AMD64() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Count"),
        MemoryLayout.sequenceLayout(1, _SCOPE_TABLE_AMD64.ScopeRecord.layout()).withName("ScopeRecord")
    ).withName("_SCOPE_TABLE_AMD64");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final OfInt Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static int Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static void Count(MemorySegment struct, int fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     DWORD BeginAddress;
     *     DWORD EndAddress;
     *     DWORD HandlerAddress;
     *     DWORD JumpTarget;
     * }
     * }
     */
    public static class ScopeRecord {

        ScopeRecord() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            Windows_h.C_LONG.withName("BeginAddress"),
            Windows_h.C_LONG.withName("EndAddress"),
            Windows_h.C_LONG.withName("HandlerAddress"),
            Windows_h.C_LONG.withName("JumpTarget")
        ).withName("$anon$2740:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt BeginAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BeginAddress"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD BeginAddress
         * }
         */
        public static final OfInt BeginAddress$layout() {
            return BeginAddress$LAYOUT;
        }

        private static final long BeginAddress$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD BeginAddress
         * }
         */
        public static final long BeginAddress$offset() {
            return BeginAddress$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD BeginAddress
         * }
         */
        public static int BeginAddress(MemorySegment struct) {
            return struct.get(BeginAddress$LAYOUT, BeginAddress$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD BeginAddress
         * }
         */
        public static void BeginAddress(MemorySegment struct, int fieldValue) {
            struct.set(BeginAddress$LAYOUT, BeginAddress$OFFSET, fieldValue);
        }

        private static final OfInt EndAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EndAddress"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD EndAddress
         * }
         */
        public static final OfInt EndAddress$layout() {
            return EndAddress$LAYOUT;
        }

        private static final long EndAddress$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD EndAddress
         * }
         */
        public static final long EndAddress$offset() {
            return EndAddress$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD EndAddress
         * }
         */
        public static int EndAddress(MemorySegment struct) {
            return struct.get(EndAddress$LAYOUT, EndAddress$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD EndAddress
         * }
         */
        public static void EndAddress(MemorySegment struct, int fieldValue) {
            struct.set(EndAddress$LAYOUT, EndAddress$OFFSET, fieldValue);
        }

        private static final OfInt HandlerAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("HandlerAddress"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD HandlerAddress
         * }
         */
        public static final OfInt HandlerAddress$layout() {
            return HandlerAddress$LAYOUT;
        }

        private static final long HandlerAddress$OFFSET = 8;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD HandlerAddress
         * }
         */
        public static final long HandlerAddress$offset() {
            return HandlerAddress$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD HandlerAddress
         * }
         */
        public static int HandlerAddress(MemorySegment struct) {
            return struct.get(HandlerAddress$LAYOUT, HandlerAddress$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD HandlerAddress
         * }
         */
        public static void HandlerAddress(MemorySegment struct, int fieldValue) {
            struct.set(HandlerAddress$LAYOUT, HandlerAddress$OFFSET, fieldValue);
        }

        private static final OfInt JumpTarget$LAYOUT = (OfInt)$LAYOUT.select(groupElement("JumpTarget"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD JumpTarget
         * }
         */
        public static final OfInt JumpTarget$layout() {
            return JumpTarget$LAYOUT;
        }

        private static final long JumpTarget$OFFSET = 12;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD JumpTarget
         * }
         */
        public static final long JumpTarget$offset() {
            return JumpTarget$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD JumpTarget
         * }
         */
        public static int JumpTarget(MemorySegment struct) {
            return struct.get(JumpTarget$LAYOUT, JumpTarget$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD JumpTarget
         * }
         */
        public static void JumpTarget(MemorySegment struct, int fieldValue) {
            struct.set(JumpTarget$LAYOUT, JumpTarget$OFFSET, fieldValue);
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

    private static final SequenceLayout ScopeRecord$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ScopeRecord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD BeginAddress;
     *     DWORD EndAddress;
     *     DWORD HandlerAddress;
     *     DWORD JumpTarget;
     * } ScopeRecord[1]
     * }
     */
    public static final SequenceLayout ScopeRecord$layout() {
        return ScopeRecord$LAYOUT;
    }

    private static final long ScopeRecord$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD BeginAddress;
     *     DWORD EndAddress;
     *     DWORD HandlerAddress;
     *     DWORD JumpTarget;
     * } ScopeRecord[1]
     * }
     */
    public static final long ScopeRecord$offset() {
        return ScopeRecord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD BeginAddress;
     *     DWORD EndAddress;
     *     DWORD HandlerAddress;
     *     DWORD JumpTarget;
     * } ScopeRecord[1]
     * }
     */
    public static MemorySegment ScopeRecord(MemorySegment struct) {
        return struct.asSlice(ScopeRecord$OFFSET, ScopeRecord$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD BeginAddress;
     *     DWORD EndAddress;
     *     DWORD HandlerAddress;
     *     DWORD JumpTarget;
     * } ScopeRecord[1]
     * }
     */
    public static void ScopeRecord(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ScopeRecord$OFFSET, ScopeRecord$LAYOUT.byteSize());
    }

    private static long[] ScopeRecord$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * struct {
     *     DWORD BeginAddress;
     *     DWORD EndAddress;
     *     DWORD HandlerAddress;
     *     DWORD JumpTarget;
     * } ScopeRecord[1]
     * }
     */
    public static long[] ScopeRecord$dimensions() {
        return ScopeRecord$DIMS;
    }
    private static final MethodHandle ScopeRecord$ELEM_HANDLE = ScopeRecord$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD BeginAddress;
     *     DWORD EndAddress;
     *     DWORD HandlerAddress;
     *     DWORD JumpTarget;
     * } ScopeRecord[1]
     * }
     */
    public static MemorySegment ScopeRecord(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)ScopeRecord$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD BeginAddress;
     *     DWORD EndAddress;
     *     DWORD HandlerAddress;
     *     DWORD JumpTarget;
     * } ScopeRecord[1]
     * }
     */
    public static void ScopeRecord(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, ScopeRecord(struct, index0), 0L, _SCOPE_TABLE_AMD64.ScopeRecord.layout().byteSize());
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

