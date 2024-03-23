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
 * struct tagMONHSZSTRUCTW {
 *     UINT cb;
 *     BOOL fsAction;
 *     DWORD dwTime;
 *     HSZ hsz;
 *     HANDLE hTask;
 *     WCHAR str[1];
 * }
 * }
 */
public class tagMONHSZSTRUCTW {

    tagMONHSZSTRUCTW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("cb"),
        Windows_h.C_INT.withName("fsAction"),
        Windows_h.C_LONG.withName("dwTime"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hsz"),
        Windows_h.C_POINTER.withName("hTask"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_SHORT).withName("str"),
        MemoryLayout.paddingLayout(6)
    ).withName("tagMONHSZSTRUCTW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cb$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT cb
     * }
     */
    public static final OfInt cb$layout() {
        return cb$LAYOUT;
    }

    private static final long cb$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cb
     * }
     */
    public static final long cb$offset() {
        return cb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cb
     * }
     */
    public static int cb(MemorySegment struct) {
        return struct.get(cb$LAYOUT, cb$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cb
     * }
     */
    public static void cb(MemorySegment struct, int fieldValue) {
        struct.set(cb$LAYOUT, cb$OFFSET, fieldValue);
    }

    private static final OfInt fsAction$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fsAction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fsAction
     * }
     */
    public static final OfInt fsAction$layout() {
        return fsAction$LAYOUT;
    }

    private static final long fsAction$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fsAction
     * }
     */
    public static final long fsAction$offset() {
        return fsAction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fsAction
     * }
     */
    public static int fsAction(MemorySegment struct) {
        return struct.get(fsAction$LAYOUT, fsAction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fsAction
     * }
     */
    public static void fsAction(MemorySegment struct, int fieldValue) {
        struct.set(fsAction$LAYOUT, fsAction$OFFSET, fieldValue);
    }

    private static final OfInt dwTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static final OfInt dwTime$layout() {
        return dwTime$LAYOUT;
    }

    private static final long dwTime$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static final long dwTime$offset() {
        return dwTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static int dwTime(MemorySegment struct) {
        return struct.get(dwTime$LAYOUT, dwTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static void dwTime(MemorySegment struct, int fieldValue) {
        struct.set(dwTime$LAYOUT, dwTime$OFFSET, fieldValue);
    }

    private static final AddressLayout hsz$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hsz"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hsz
     * }
     */
    public static final AddressLayout hsz$layout() {
        return hsz$LAYOUT;
    }

    private static final long hsz$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hsz
     * }
     */
    public static final long hsz$offset() {
        return hsz$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hsz
     * }
     */
    public static MemorySegment hsz(MemorySegment struct) {
        return struct.get(hsz$LAYOUT, hsz$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hsz
     * }
     */
    public static void hsz(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hsz$LAYOUT, hsz$OFFSET, fieldValue);
    }

    private static final AddressLayout hTask$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hTask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hTask
     * }
     */
    public static final AddressLayout hTask$layout() {
        return hTask$LAYOUT;
    }

    private static final long hTask$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hTask
     * }
     */
    public static final long hTask$offset() {
        return hTask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hTask
     * }
     */
    public static MemorySegment hTask(MemorySegment struct) {
        return struct.get(hTask$LAYOUT, hTask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hTask
     * }
     */
    public static void hTask(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hTask$LAYOUT, hTask$OFFSET, fieldValue);
    }

    private static final SequenceLayout str$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("str"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR str[1]
     * }
     */
    public static final SequenceLayout str$layout() {
        return str$LAYOUT;
    }

    private static final long str$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR str[1]
     * }
     */
    public static final long str$offset() {
        return str$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR str[1]
     * }
     */
    public static MemorySegment str(MemorySegment struct) {
        return struct.asSlice(str$OFFSET, str$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR str[1]
     * }
     */
    public static void str(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, str$OFFSET, str$LAYOUT.byteSize());
    }

    private static long[] str$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR str[1]
     * }
     */
    public static long[] str$dimensions() {
        return str$DIMS;
    }
    private static final VarHandle str$ELEM_HANDLE = str$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR str[1]
     * }
     */
    public static short str(MemorySegment struct, long index0) {
        return (short)str$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR str[1]
     * }
     */
    public static void str(MemorySegment struct, long index0, short fieldValue) {
        str$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

