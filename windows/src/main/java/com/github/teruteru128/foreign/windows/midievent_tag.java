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
 * struct midievent_tag {
 *     DWORD dwDeltaTime;
 *     DWORD dwStreamID;
 *     DWORD dwEvent;
 *     DWORD dwParms[1];
 * }
 * }
 */
public class midievent_tag {

    midievent_tag() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwDeltaTime"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwStreamID"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwEvent"),
        MemoryLayout.sequenceLayout(1, Windows_h.align(Windows_h.C_LONG, 1)).withName("dwParms")
    ).withName("midievent_tag");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwDeltaTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDeltaTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDeltaTime
     * }
     */
    public static final OfInt dwDeltaTime$layout() {
        return dwDeltaTime$LAYOUT;
    }

    private static final long dwDeltaTime$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDeltaTime
     * }
     */
    public static final long dwDeltaTime$offset() {
        return dwDeltaTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDeltaTime
     * }
     */
    public static int dwDeltaTime(MemorySegment struct) {
        return struct.get(dwDeltaTime$LAYOUT, dwDeltaTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDeltaTime
     * }
     */
    public static void dwDeltaTime(MemorySegment struct, int fieldValue) {
        struct.set(dwDeltaTime$LAYOUT, dwDeltaTime$OFFSET, fieldValue);
    }

    private static final OfInt dwStreamID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStreamID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStreamID
     * }
     */
    public static final OfInt dwStreamID$layout() {
        return dwStreamID$LAYOUT;
    }

    private static final long dwStreamID$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStreamID
     * }
     */
    public static final long dwStreamID$offset() {
        return dwStreamID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStreamID
     * }
     */
    public static int dwStreamID(MemorySegment struct) {
        return struct.get(dwStreamID$LAYOUT, dwStreamID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStreamID
     * }
     */
    public static void dwStreamID(MemorySegment struct, int fieldValue) {
        struct.set(dwStreamID$LAYOUT, dwStreamID$OFFSET, fieldValue);
    }

    private static final OfInt dwEvent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwEvent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwEvent
     * }
     */
    public static final OfInt dwEvent$layout() {
        return dwEvent$LAYOUT;
    }

    private static final long dwEvent$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwEvent
     * }
     */
    public static final long dwEvent$offset() {
        return dwEvent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwEvent
     * }
     */
    public static int dwEvent(MemorySegment struct) {
        return struct.get(dwEvent$LAYOUT, dwEvent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwEvent
     * }
     */
    public static void dwEvent(MemorySegment struct, int fieldValue) {
        struct.set(dwEvent$LAYOUT, dwEvent$OFFSET, fieldValue);
    }

    private static final SequenceLayout dwParms$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("dwParms"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwParms[1]
     * }
     */
    public static final SequenceLayout dwParms$layout() {
        return dwParms$LAYOUT;
    }

    private static final long dwParms$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwParms[1]
     * }
     */
    public static final long dwParms$offset() {
        return dwParms$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwParms[1]
     * }
     */
    public static MemorySegment dwParms(MemorySegment struct) {
        return struct.asSlice(dwParms$OFFSET, dwParms$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwParms[1]
     * }
     */
    public static void dwParms(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dwParms$OFFSET, dwParms$LAYOUT.byteSize());
    }

    private static long[] dwParms$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD dwParms[1]
     * }
     */
    public static long[] dwParms$dimensions() {
        return dwParms$DIMS;
    }
    private static final VarHandle dwParms$ELEM_HANDLE = dwParms$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD dwParms[1]
     * }
     */
    public static int dwParms(MemorySegment struct, long index0) {
        return (int)dwParms$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD dwParms[1]
     * }
     */
    public static void dwParms(MemorySegment struct, long index0, int fieldValue) {
        dwParms$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
