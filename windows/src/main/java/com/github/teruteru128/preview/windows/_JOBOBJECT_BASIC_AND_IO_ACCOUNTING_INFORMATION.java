// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * struct _JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION {
 *     JOBOBJECT_BASIC_ACCOUNTING_INFORMATION BasicInfo;
 *     IO_COUNTERS IoInfo;
 * }
 * }
 */
public class _JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION {

    _JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.layout().withName("BasicInfo"),
        _IO_COUNTERS.layout().withName("IoInfo")
    ).withName("_JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout BasicInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("BasicInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_BASIC_ACCOUNTING_INFORMATION BasicInfo
     * }
     */
    public static final GroupLayout BasicInfo$layout() {
        return BasicInfo$LAYOUT;
    }

    private static final long BasicInfo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_BASIC_ACCOUNTING_INFORMATION BasicInfo
     * }
     */
    public static final long BasicInfo$offset() {
        return BasicInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_BASIC_ACCOUNTING_INFORMATION BasicInfo
     * }
     */
    public static MemorySegment BasicInfo(MemorySegment struct) {
        return struct.asSlice(BasicInfo$OFFSET, BasicInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_BASIC_ACCOUNTING_INFORMATION BasicInfo
     * }
     */
    public static void BasicInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, BasicInfo$OFFSET, BasicInfo$LAYOUT.byteSize());
    }

    private static final GroupLayout IoInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("IoInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * IO_COUNTERS IoInfo
     * }
     */
    public static final GroupLayout IoInfo$layout() {
        return IoInfo$LAYOUT;
    }

    private static final long IoInfo$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * IO_COUNTERS IoInfo
     * }
     */
    public static final long IoInfo$offset() {
        return IoInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * IO_COUNTERS IoInfo
     * }
     */
    public static MemorySegment IoInfo(MemorySegment struct) {
        return struct.asSlice(IoInfo$OFFSET, IoInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * IO_COUNTERS IoInfo
     * }
     */
    public static void IoInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, IoInfo$OFFSET, IoInfo$LAYOUT.byteSize());
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
