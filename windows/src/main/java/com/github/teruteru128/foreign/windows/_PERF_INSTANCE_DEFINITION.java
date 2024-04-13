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
 * struct _PERF_INSTANCE_DEFINITION {
 *     DWORD ByteLength;
 *     DWORD ParentObjectTitleIndex;
 *     DWORD ParentObjectInstance;
 *     LONG UniqueID;
 *     DWORD NameOffset;
 *     DWORD NameLength;
 * }
 * }
 */
public class _PERF_INSTANCE_DEFINITION {

    _PERF_INSTANCE_DEFINITION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("ByteLength"),
        Windows_h.C_LONG.withName("ParentObjectTitleIndex"),
        Windows_h.C_LONG.withName("ParentObjectInstance"),
        Windows_h.C_LONG.withName("UniqueID"),
        Windows_h.C_LONG.withName("NameOffset"),
        Windows_h.C_LONG.withName("NameLength")
    ).withName("_PERF_INSTANCE_DEFINITION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ByteLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ByteLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ByteLength
     * }
     */
    public static final OfInt ByteLength$layout() {
        return ByteLength$LAYOUT;
    }

    private static final long ByteLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ByteLength
     * }
     */
    public static final long ByteLength$offset() {
        return ByteLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ByteLength
     * }
     */
    public static int ByteLength(MemorySegment struct) {
        return struct.get(ByteLength$LAYOUT, ByteLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ByteLength
     * }
     */
    public static void ByteLength(MemorySegment struct, int fieldValue) {
        struct.set(ByteLength$LAYOUT, ByteLength$OFFSET, fieldValue);
    }

    private static final OfInt ParentObjectTitleIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ParentObjectTitleIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ParentObjectTitleIndex
     * }
     */
    public static final OfInt ParentObjectTitleIndex$layout() {
        return ParentObjectTitleIndex$LAYOUT;
    }

    private static final long ParentObjectTitleIndex$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ParentObjectTitleIndex
     * }
     */
    public static final long ParentObjectTitleIndex$offset() {
        return ParentObjectTitleIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ParentObjectTitleIndex
     * }
     */
    public static int ParentObjectTitleIndex(MemorySegment struct) {
        return struct.get(ParentObjectTitleIndex$LAYOUT, ParentObjectTitleIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ParentObjectTitleIndex
     * }
     */
    public static void ParentObjectTitleIndex(MemorySegment struct, int fieldValue) {
        struct.set(ParentObjectTitleIndex$LAYOUT, ParentObjectTitleIndex$OFFSET, fieldValue);
    }

    private static final OfInt ParentObjectInstance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ParentObjectInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ParentObjectInstance
     * }
     */
    public static final OfInt ParentObjectInstance$layout() {
        return ParentObjectInstance$LAYOUT;
    }

    private static final long ParentObjectInstance$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ParentObjectInstance
     * }
     */
    public static final long ParentObjectInstance$offset() {
        return ParentObjectInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ParentObjectInstance
     * }
     */
    public static int ParentObjectInstance(MemorySegment struct) {
        return struct.get(ParentObjectInstance$LAYOUT, ParentObjectInstance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ParentObjectInstance
     * }
     */
    public static void ParentObjectInstance(MemorySegment struct, int fieldValue) {
        struct.set(ParentObjectInstance$LAYOUT, ParentObjectInstance$OFFSET, fieldValue);
    }

    private static final OfInt UniqueID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("UniqueID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG UniqueID
     * }
     */
    public static final OfInt UniqueID$layout() {
        return UniqueID$LAYOUT;
    }

    private static final long UniqueID$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG UniqueID
     * }
     */
    public static final long UniqueID$offset() {
        return UniqueID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG UniqueID
     * }
     */
    public static int UniqueID(MemorySegment struct) {
        return struct.get(UniqueID$LAYOUT, UniqueID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG UniqueID
     * }
     */
    public static void UniqueID(MemorySegment struct, int fieldValue) {
        struct.set(UniqueID$LAYOUT, UniqueID$OFFSET, fieldValue);
    }

    private static final OfInt NameOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NameOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NameOffset
     * }
     */
    public static final OfInt NameOffset$layout() {
        return NameOffset$LAYOUT;
    }

    private static final long NameOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NameOffset
     * }
     */
    public static final long NameOffset$offset() {
        return NameOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NameOffset
     * }
     */
    public static int NameOffset(MemorySegment struct) {
        return struct.get(NameOffset$LAYOUT, NameOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NameOffset
     * }
     */
    public static void NameOffset(MemorySegment struct, int fieldValue) {
        struct.set(NameOffset$LAYOUT, NameOffset$OFFSET, fieldValue);
    }

    private static final OfInt NameLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NameLength
     * }
     */
    public static final OfInt NameLength$layout() {
        return NameLength$LAYOUT;
    }

    private static final long NameLength$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NameLength
     * }
     */
    public static final long NameLength$offset() {
        return NameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NameLength
     * }
     */
    public static int NameLength(MemorySegment struct) {
        return struct.get(NameLength$LAYOUT, NameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NameLength
     * }
     */
    public static void NameLength(MemorySegment struct, int fieldValue) {
        struct.set(NameLength$LAYOUT, NameLength$OFFSET, fieldValue);
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
