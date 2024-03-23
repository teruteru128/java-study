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
 * struct _SET_PARTITION_INFORMATION_EX {
 *     PARTITION_STYLE PartitionStyle;
 *     union {
 *         SET_PARTITION_INFORMATION_MBR Mbr;
 *         SET_PARTITION_INFORMATION_GPT Gpt;
 *     };
 * }
 * }
 */
public class _SET_PARTITION_INFORMATION_EX {

    _SET_PARTITION_INFORMATION_EX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("PartitionStyle"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            _SET_PARTITION_INFORMATION.layout().withName("Mbr"),
            _PARTITION_INFORMATION_GPT.layout().withName("Gpt")
        ).withName("$anon$9108:5")
    ).withName("_SET_PARTITION_INFORMATION_EX");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt PartitionStyle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PartitionStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PARTITION_STYLE PartitionStyle
     * }
     */
    public static final OfInt PartitionStyle$layout() {
        return PartitionStyle$LAYOUT;
    }

    private static final long PartitionStyle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PARTITION_STYLE PartitionStyle
     * }
     */
    public static final long PartitionStyle$offset() {
        return PartitionStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PARTITION_STYLE PartitionStyle
     * }
     */
    public static int PartitionStyle(MemorySegment struct) {
        return struct.get(PartitionStyle$LAYOUT, PartitionStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PARTITION_STYLE PartitionStyle
     * }
     */
    public static void PartitionStyle(MemorySegment struct, int fieldValue) {
        struct.set(PartitionStyle$LAYOUT, PartitionStyle$OFFSET, fieldValue);
    }

    private static final GroupLayout Mbr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$9108:5"), groupElement("Mbr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SET_PARTITION_INFORMATION_MBR Mbr
     * }
     */
    public static final GroupLayout Mbr$layout() {
        return Mbr$LAYOUT;
    }

    private static final long Mbr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SET_PARTITION_INFORMATION_MBR Mbr
     * }
     */
    public static final long Mbr$offset() {
        return Mbr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SET_PARTITION_INFORMATION_MBR Mbr
     * }
     */
    public static MemorySegment Mbr(MemorySegment struct) {
        return struct.asSlice(Mbr$OFFSET, Mbr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SET_PARTITION_INFORMATION_MBR Mbr
     * }
     */
    public static void Mbr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Mbr$OFFSET, Mbr$LAYOUT.byteSize());
    }

    private static final GroupLayout Gpt$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$9108:5"), groupElement("Gpt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SET_PARTITION_INFORMATION_GPT Gpt
     * }
     */
    public static final GroupLayout Gpt$layout() {
        return Gpt$LAYOUT;
    }

    private static final long Gpt$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SET_PARTITION_INFORMATION_GPT Gpt
     * }
     */
    public static final long Gpt$offset() {
        return Gpt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SET_PARTITION_INFORMATION_GPT Gpt
     * }
     */
    public static MemorySegment Gpt(MemorySegment struct) {
        return struct.asSlice(Gpt$OFFSET, Gpt$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SET_PARTITION_INFORMATION_GPT Gpt
     * }
     */
    public static void Gpt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Gpt$OFFSET, Gpt$LAYOUT.byteSize());
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

