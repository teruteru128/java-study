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
 * struct tagCLIENTCREATESTRUCT {
 *     HANDLE hWindowMenu;
 *     UINT idFirstChild;
 * }
 * }
 */
public class tagCLIENTCREATESTRUCT {

    tagCLIENTCREATESTRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("hWindowMenu"),
        Windows_h.C_INT.withName("idFirstChild"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagCLIENTCREATESTRUCT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout hWindowMenu$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hWindowMenu"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hWindowMenu
     * }
     */
    public static final AddressLayout hWindowMenu$layout() {
        return hWindowMenu$LAYOUT;
    }

    private static final long hWindowMenu$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hWindowMenu
     * }
     */
    public static final long hWindowMenu$offset() {
        return hWindowMenu$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hWindowMenu
     * }
     */
    public static MemorySegment hWindowMenu(MemorySegment struct) {
        return struct.get(hWindowMenu$LAYOUT, hWindowMenu$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hWindowMenu
     * }
     */
    public static void hWindowMenu(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hWindowMenu$LAYOUT, hWindowMenu$OFFSET, fieldValue);
    }

    private static final OfInt idFirstChild$LAYOUT = (OfInt)$LAYOUT.select(groupElement("idFirstChild"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT idFirstChild
     * }
     */
    public static final OfInt idFirstChild$layout() {
        return idFirstChild$LAYOUT;
    }

    private static final long idFirstChild$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT idFirstChild
     * }
     */
    public static final long idFirstChild$offset() {
        return idFirstChild$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT idFirstChild
     * }
     */
    public static int idFirstChild(MemorySegment struct) {
        return struct.get(idFirstChild$LAYOUT, idFirstChild$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT idFirstChild
     * }
     */
    public static void idFirstChild(MemorySegment struct, int fieldValue) {
        struct.set(idFirstChild$LAYOUT, idFirstChild$OFFSET, fieldValue);
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
