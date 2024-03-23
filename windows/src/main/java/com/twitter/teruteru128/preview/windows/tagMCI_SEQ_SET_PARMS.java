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
 * struct tagMCI_SEQ_SET_PARMS {
 *     DWORD_PTR dwCallback;
 *     DWORD dwTimeFormat;
 *     DWORD dwAudio;
 *     DWORD dwTempo;
 *     DWORD dwPort;
 *     DWORD dwSlave;
 *     DWORD dwMaster;
 *     DWORD dwOffset;
 * }
 * }
 */
public class tagMCI_SEQ_SET_PARMS {

    tagMCI_SEQ_SET_PARMS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_LONG_LONG, 1).withName("dwCallback"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwTimeFormat"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwAudio"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwTempo"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwPort"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwSlave"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwMaster"),
        Windows_h.align(Windows_h.C_LONG, 1).withName("dwOffset")
    ).withName("tagMCI_SEQ_SET_PARMS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong dwCallback$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static final OfLong dwCallback$layout() {
        return dwCallback$LAYOUT;
    }

    private static final long dwCallback$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static final long dwCallback$offset() {
        return dwCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static long dwCallback(MemorySegment struct) {
        return struct.get(dwCallback$LAYOUT, dwCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static void dwCallback(MemorySegment struct, long fieldValue) {
        struct.set(dwCallback$LAYOUT, dwCallback$OFFSET, fieldValue);
    }

    private static final OfInt dwTimeFormat$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTimeFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTimeFormat
     * }
     */
    public static final OfInt dwTimeFormat$layout() {
        return dwTimeFormat$LAYOUT;
    }

    private static final long dwTimeFormat$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTimeFormat
     * }
     */
    public static final long dwTimeFormat$offset() {
        return dwTimeFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTimeFormat
     * }
     */
    public static int dwTimeFormat(MemorySegment struct) {
        return struct.get(dwTimeFormat$LAYOUT, dwTimeFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTimeFormat
     * }
     */
    public static void dwTimeFormat(MemorySegment struct, int fieldValue) {
        struct.set(dwTimeFormat$LAYOUT, dwTimeFormat$OFFSET, fieldValue);
    }

    private static final OfInt dwAudio$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwAudio"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwAudio
     * }
     */
    public static final OfInt dwAudio$layout() {
        return dwAudio$LAYOUT;
    }

    private static final long dwAudio$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwAudio
     * }
     */
    public static final long dwAudio$offset() {
        return dwAudio$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwAudio
     * }
     */
    public static int dwAudio(MemorySegment struct) {
        return struct.get(dwAudio$LAYOUT, dwAudio$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwAudio
     * }
     */
    public static void dwAudio(MemorySegment struct, int fieldValue) {
        struct.set(dwAudio$LAYOUT, dwAudio$OFFSET, fieldValue);
    }

    private static final OfInt dwTempo$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTempo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTempo
     * }
     */
    public static final OfInt dwTempo$layout() {
        return dwTempo$LAYOUT;
    }

    private static final long dwTempo$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTempo
     * }
     */
    public static final long dwTempo$offset() {
        return dwTempo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTempo
     * }
     */
    public static int dwTempo(MemorySegment struct) {
        return struct.get(dwTempo$LAYOUT, dwTempo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTempo
     * }
     */
    public static void dwTempo(MemorySegment struct, int fieldValue) {
        struct.set(dwTempo$LAYOUT, dwTempo$OFFSET, fieldValue);
    }

    private static final OfInt dwPort$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPort"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPort
     * }
     */
    public static final OfInt dwPort$layout() {
        return dwPort$LAYOUT;
    }

    private static final long dwPort$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPort
     * }
     */
    public static final long dwPort$offset() {
        return dwPort$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPort
     * }
     */
    public static int dwPort(MemorySegment struct) {
        return struct.get(dwPort$LAYOUT, dwPort$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPort
     * }
     */
    public static void dwPort(MemorySegment struct, int fieldValue) {
        struct.set(dwPort$LAYOUT, dwPort$OFFSET, fieldValue);
    }

    private static final OfInt dwSlave$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSlave"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSlave
     * }
     */
    public static final OfInt dwSlave$layout() {
        return dwSlave$LAYOUT;
    }

    private static final long dwSlave$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSlave
     * }
     */
    public static final long dwSlave$offset() {
        return dwSlave$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSlave
     * }
     */
    public static int dwSlave(MemorySegment struct) {
        return struct.get(dwSlave$LAYOUT, dwSlave$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSlave
     * }
     */
    public static void dwSlave(MemorySegment struct, int fieldValue) {
        struct.set(dwSlave$LAYOUT, dwSlave$OFFSET, fieldValue);
    }

    private static final OfInt dwMaster$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMaster"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMaster
     * }
     */
    public static final OfInt dwMaster$layout() {
        return dwMaster$LAYOUT;
    }

    private static final long dwMaster$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMaster
     * }
     */
    public static final long dwMaster$offset() {
        return dwMaster$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMaster
     * }
     */
    public static int dwMaster(MemorySegment struct) {
        return struct.get(dwMaster$LAYOUT, dwMaster$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMaster
     * }
     */
    public static void dwMaster(MemorySegment struct, int fieldValue) {
        struct.set(dwMaster$LAYOUT, dwMaster$OFFSET, fieldValue);
    }

    private static final OfInt dwOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwOffset
     * }
     */
    public static final OfInt dwOffset$layout() {
        return dwOffset$LAYOUT;
    }

    private static final long dwOffset$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwOffset
     * }
     */
    public static final long dwOffset$offset() {
        return dwOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwOffset
     * }
     */
    public static int dwOffset(MemorySegment struct) {
        return struct.get(dwOffset$LAYOUT, dwOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwOffset
     * }
     */
    public static void dwOffset(MemorySegment struct, int fieldValue) {
        struct.set(dwOffset$LAYOUT, dwOffset$OFFSET, fieldValue);
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

