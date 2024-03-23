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
 * struct _APPLICATIONLAUNCH_SETTING_VALUE {
 *     LARGE_INTEGER ActivationTime;
 *     DWORD Flags;
 *     DWORD ButtonInstanceID;
 * }
 * }
 */
public class _APPLICATIONLAUNCH_SETTING_VALUE {

    _APPLICATIONLAUNCH_SETTING_VALUE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("ActivationTime"),
        Windows_h.C_LONG.withName("Flags"),
        Windows_h.C_LONG.withName("ButtonInstanceID")
    ).withName("_APPLICATIONLAUNCH_SETTING_VALUE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout ActivationTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ActivationTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ActivationTime
     * }
     */
    public static final GroupLayout ActivationTime$layout() {
        return ActivationTime$LAYOUT;
    }

    private static final long ActivationTime$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ActivationTime
     * }
     */
    public static final long ActivationTime$offset() {
        return ActivationTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ActivationTime
     * }
     */
    public static MemorySegment ActivationTime(MemorySegment struct) {
        return struct.asSlice(ActivationTime$OFFSET, ActivationTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ActivationTime
     * }
     */
    public static void ActivationTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ActivationTime$OFFSET, ActivationTime$LAYOUT.byteSize());
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

    private static final long Flags$OFFSET = 8;

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

    private static final OfInt ButtonInstanceID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ButtonInstanceID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ButtonInstanceID
     * }
     */
    public static final OfInt ButtonInstanceID$layout() {
        return ButtonInstanceID$LAYOUT;
    }

    private static final long ButtonInstanceID$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ButtonInstanceID
     * }
     */
    public static final long ButtonInstanceID$offset() {
        return ButtonInstanceID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ButtonInstanceID
     * }
     */
    public static int ButtonInstanceID(MemorySegment struct) {
        return struct.get(ButtonInstanceID$LAYOUT, ButtonInstanceID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ButtonInstanceID
     * }
     */
    public static void ButtonInstanceID(MemorySegment struct, int fieldValue) {
        struct.set(ButtonInstanceID$LAYOUT, ButtonInstanceID$OFFSET, fieldValue);
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

