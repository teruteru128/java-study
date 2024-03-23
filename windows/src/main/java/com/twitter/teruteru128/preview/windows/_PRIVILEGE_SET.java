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
 * struct _PRIVILEGE_SET {
 *     DWORD PrivilegeCount;
 *     DWORD Control;
 *     LUID_AND_ATTRIBUTES Privilege[1];
 * }
 * }
 */
public class _PRIVILEGE_SET {

    _PRIVILEGE_SET() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("PrivilegeCount"),
        Windows_h.C_LONG.withName("Control"),
        MemoryLayout.sequenceLayout(1, _LUID_AND_ATTRIBUTES.layout()).withName("Privilege")
    ).withName("_PRIVILEGE_SET");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt PrivilegeCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PrivilegeCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PrivilegeCount
     * }
     */
    public static final OfInt PrivilegeCount$layout() {
        return PrivilegeCount$LAYOUT;
    }

    private static final long PrivilegeCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PrivilegeCount
     * }
     */
    public static final long PrivilegeCount$offset() {
        return PrivilegeCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PrivilegeCount
     * }
     */
    public static int PrivilegeCount(MemorySegment struct) {
        return struct.get(PrivilegeCount$LAYOUT, PrivilegeCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PrivilegeCount
     * }
     */
    public static void PrivilegeCount(MemorySegment struct, int fieldValue) {
        struct.set(PrivilegeCount$LAYOUT, PrivilegeCount$OFFSET, fieldValue);
    }

    private static final OfInt Control$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Control"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Control
     * }
     */
    public static final OfInt Control$layout() {
        return Control$LAYOUT;
    }

    private static final long Control$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Control
     * }
     */
    public static final long Control$offset() {
        return Control$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Control
     * }
     */
    public static int Control(MemorySegment struct) {
        return struct.get(Control$LAYOUT, Control$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Control
     * }
     */
    public static void Control(MemorySegment struct, int fieldValue) {
        struct.set(Control$LAYOUT, Control$OFFSET, fieldValue);
    }

    private static final SequenceLayout Privilege$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Privilege"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LUID_AND_ATTRIBUTES Privilege[1]
     * }
     */
    public static final SequenceLayout Privilege$layout() {
        return Privilege$LAYOUT;
    }

    private static final long Privilege$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LUID_AND_ATTRIBUTES Privilege[1]
     * }
     */
    public static final long Privilege$offset() {
        return Privilege$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LUID_AND_ATTRIBUTES Privilege[1]
     * }
     */
    public static MemorySegment Privilege(MemorySegment struct) {
        return struct.asSlice(Privilege$OFFSET, Privilege$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LUID_AND_ATTRIBUTES Privilege[1]
     * }
     */
    public static void Privilege(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Privilege$OFFSET, Privilege$LAYOUT.byteSize());
    }

    private static long[] Privilege$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * LUID_AND_ATTRIBUTES Privilege[1]
     * }
     */
    public static long[] Privilege$dimensions() {
        return Privilege$DIMS;
    }
    private static final MethodHandle Privilege$ELEM_HANDLE = Privilege$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * LUID_AND_ATTRIBUTES Privilege[1]
     * }
     */
    public static MemorySegment Privilege(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)Privilege$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * LUID_AND_ATTRIBUTES Privilege[1]
     * }
     */
    public static void Privilege(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, Privilege(struct, index0), 0L, _LUID_AND_ATTRIBUTES.layout().byteSize());
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

