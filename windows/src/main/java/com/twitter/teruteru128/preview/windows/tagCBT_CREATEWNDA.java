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
 * struct tagCBT_CREATEWNDA {
 *     struct tagCREATESTRUCTA *lpcs;
 *     HWND hwndInsertAfter;
 * }
 * }
 */
public class tagCBT_CREATEWNDA {

    tagCBT_CREATEWNDA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("lpcs"),
        Windows_h.C_POINTER.withName("hwndInsertAfter")
    ).withName("tagCBT_CREATEWNDA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout lpcs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpcs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct tagCREATESTRUCTA *lpcs
     * }
     */
    public static final AddressLayout lpcs$layout() {
        return lpcs$LAYOUT;
    }

    private static final long lpcs$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct tagCREATESTRUCTA *lpcs
     * }
     */
    public static final long lpcs$offset() {
        return lpcs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct tagCREATESTRUCTA *lpcs
     * }
     */
    public static MemorySegment lpcs(MemorySegment struct) {
        return struct.get(lpcs$LAYOUT, lpcs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct tagCREATESTRUCTA *lpcs
     * }
     */
    public static void lpcs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpcs$LAYOUT, lpcs$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndInsertAfter$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndInsertAfter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndInsertAfter
     * }
     */
    public static final AddressLayout hwndInsertAfter$layout() {
        return hwndInsertAfter$LAYOUT;
    }

    private static final long hwndInsertAfter$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndInsertAfter
     * }
     */
    public static final long hwndInsertAfter$offset() {
        return hwndInsertAfter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndInsertAfter
     * }
     */
    public static MemorySegment hwndInsertAfter(MemorySegment struct) {
        return struct.get(hwndInsertAfter$LAYOUT, hwndInsertAfter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndInsertAfter
     * }
     */
    public static void hwndInsertAfter(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndInsertAfter$LAYOUT, hwndInsertAfter$OFFSET, fieldValue);
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

