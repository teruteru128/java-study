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
 * struct _SECURITY_DESCRIPTOR_RELATIVE {
 *     BYTE Revision;
 *     BYTE Sbz1;
 *     SECURITY_DESCRIPTOR_CONTROL Control;
 *     DWORD Owner;
 *     DWORD Group;
 *     DWORD Sacl;
 *     DWORD Dacl;
 * }
 * }
 */
public class _SECURITY_DESCRIPTOR_RELATIVE {

    _SECURITY_DESCRIPTOR_RELATIVE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_CHAR.withName("Revision"),
        Windows_h.C_CHAR.withName("Sbz1"),
        Windows_h.C_SHORT.withName("Control"),
        Windows_h.C_LONG.withName("Owner"),
        Windows_h.C_LONG.withName("Group"),
        Windows_h.C_LONG.withName("Sacl"),
        Windows_h.C_LONG.withName("Dacl")
    ).withName("_SECURITY_DESCRIPTOR_RELATIVE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte Revision$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Revision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Revision
     * }
     */
    public static final OfByte Revision$layout() {
        return Revision$LAYOUT;
    }

    private static final long Revision$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Revision
     * }
     */
    public static final long Revision$offset() {
        return Revision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Revision
     * }
     */
    public static byte Revision(MemorySegment struct) {
        return struct.get(Revision$LAYOUT, Revision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Revision
     * }
     */
    public static void Revision(MemorySegment struct, byte fieldValue) {
        struct.set(Revision$LAYOUT, Revision$OFFSET, fieldValue);
    }

    private static final OfByte Sbz1$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Sbz1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Sbz1
     * }
     */
    public static final OfByte Sbz1$layout() {
        return Sbz1$LAYOUT;
    }

    private static final long Sbz1$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Sbz1
     * }
     */
    public static final long Sbz1$offset() {
        return Sbz1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Sbz1
     * }
     */
    public static byte Sbz1(MemorySegment struct) {
        return struct.get(Sbz1$LAYOUT, Sbz1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Sbz1
     * }
     */
    public static void Sbz1(MemorySegment struct, byte fieldValue) {
        struct.set(Sbz1$LAYOUT, Sbz1$OFFSET, fieldValue);
    }

    private static final OfShort Control$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Control"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SECURITY_DESCRIPTOR_CONTROL Control
     * }
     */
    public static final OfShort Control$layout() {
        return Control$LAYOUT;
    }

    private static final long Control$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SECURITY_DESCRIPTOR_CONTROL Control
     * }
     */
    public static final long Control$offset() {
        return Control$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SECURITY_DESCRIPTOR_CONTROL Control
     * }
     */
    public static short Control(MemorySegment struct) {
        return struct.get(Control$LAYOUT, Control$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SECURITY_DESCRIPTOR_CONTROL Control
     * }
     */
    public static void Control(MemorySegment struct, short fieldValue) {
        struct.set(Control$LAYOUT, Control$OFFSET, fieldValue);
    }

    private static final OfInt Owner$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Owner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Owner
     * }
     */
    public static final OfInt Owner$layout() {
        return Owner$LAYOUT;
    }

    private static final long Owner$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Owner
     * }
     */
    public static final long Owner$offset() {
        return Owner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Owner
     * }
     */
    public static int Owner(MemorySegment struct) {
        return struct.get(Owner$LAYOUT, Owner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Owner
     * }
     */
    public static void Owner(MemorySegment struct, int fieldValue) {
        struct.set(Owner$LAYOUT, Owner$OFFSET, fieldValue);
    }

    private static final OfInt Group$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Group"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Group
     * }
     */
    public static final OfInt Group$layout() {
        return Group$LAYOUT;
    }

    private static final long Group$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Group
     * }
     */
    public static final long Group$offset() {
        return Group$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Group
     * }
     */
    public static int Group(MemorySegment struct) {
        return struct.get(Group$LAYOUT, Group$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Group
     * }
     */
    public static void Group(MemorySegment struct, int fieldValue) {
        struct.set(Group$LAYOUT, Group$OFFSET, fieldValue);
    }

    private static final OfInt Sacl$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Sacl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Sacl
     * }
     */
    public static final OfInt Sacl$layout() {
        return Sacl$LAYOUT;
    }

    private static final long Sacl$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Sacl
     * }
     */
    public static final long Sacl$offset() {
        return Sacl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Sacl
     * }
     */
    public static int Sacl(MemorySegment struct) {
        return struct.get(Sacl$LAYOUT, Sacl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Sacl
     * }
     */
    public static void Sacl(MemorySegment struct, int fieldValue) {
        struct.set(Sacl$LAYOUT, Sacl$OFFSET, fieldValue);
    }

    private static final OfInt Dacl$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Dacl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Dacl
     * }
     */
    public static final OfInt Dacl$layout() {
        return Dacl$LAYOUT;
    }

    private static final long Dacl$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Dacl
     * }
     */
    public static final long Dacl$offset() {
        return Dacl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Dacl
     * }
     */
    public static int Dacl(MemorySegment struct) {
        return struct.get(Dacl$LAYOUT, Dacl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Dacl
     * }
     */
    public static void Dacl(MemorySegment struct, int fieldValue) {
        struct.set(Dacl$LAYOUT, Dacl$OFFSET, fieldValue);
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

