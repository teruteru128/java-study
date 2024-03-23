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
 * struct {
 *     POWER_ACTION Action;
 *     DWORD Flags;
 *     DWORD EventCode;
 * }
 * }
 */
public class POWER_ACTION_POLICY {

    POWER_ACTION_POLICY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("Action"),
        Windows_h.C_LONG.withName("Flags"),
        Windows_h.C_LONG.withName("EventCode")
    ).withName("$anon$17618:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Action$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Action"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POWER_ACTION Action
     * }
     */
    public static final OfInt Action$layout() {
        return Action$LAYOUT;
    }

    private static final long Action$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POWER_ACTION Action
     * }
     */
    public static final long Action$offset() {
        return Action$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POWER_ACTION Action
     * }
     */
    public static int Action(MemorySegment struct) {
        return struct.get(Action$LAYOUT, Action$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POWER_ACTION Action
     * }
     */
    public static void Action(MemorySegment struct, int fieldValue) {
        struct.set(Action$LAYOUT, Action$OFFSET, fieldValue);
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

    private static final long Flags$OFFSET = 4;

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

    private static final OfInt EventCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EventCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EventCode
     * }
     */
    public static final OfInt EventCode$layout() {
        return EventCode$LAYOUT;
    }

    private static final long EventCode$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EventCode
     * }
     */
    public static final long EventCode$offset() {
        return EventCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EventCode
     * }
     */
    public static int EventCode(MemorySegment struct) {
        return struct.get(EventCode$LAYOUT, EventCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EventCode
     * }
     */
    public static void EventCode(MemorySegment struct, int fieldValue) {
        struct.set(EventCode$LAYOUT, EventCode$OFFSET, fieldValue);
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

