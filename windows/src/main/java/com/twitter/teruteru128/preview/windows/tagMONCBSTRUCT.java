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
 * struct tagMONCBSTRUCT {
 *     UINT cb;
 *     DWORD dwTime;
 *     HANDLE hTask;
 *     DWORD dwRet;
 *     UINT wType;
 *     UINT wFmt;
 *     HCONV hConv;
 *     HSZ hsz1;
 *     HSZ hsz2;
 *     HDDEDATA hData;
 *     ULONG_PTR dwData1;
 *     ULONG_PTR dwData2;
 *     CONVCONTEXT cc;
 *     DWORD cbData;
 *     DWORD Data[8];
 * }
 * }
 */
public class tagMONCBSTRUCT {

    tagMONCBSTRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("cb"),
        Windows_h.C_LONG.withName("dwTime"),
        Windows_h.C_POINTER.withName("hTask"),
        Windows_h.C_LONG.withName("dwRet"),
        Windows_h.C_INT.withName("wType"),
        Windows_h.C_INT.withName("wFmt"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hConv"),
        Windows_h.C_POINTER.withName("hsz1"),
        Windows_h.C_POINTER.withName("hsz2"),
        Windows_h.C_POINTER.withName("hData"),
        Windows_h.C_LONG_LONG.withName("dwData1"),
        Windows_h.C_LONG_LONG.withName("dwData2"),
        tagCONVCONTEXT.layout().withName("cc"),
        Windows_h.C_LONG.withName("cbData"),
        MemoryLayout.sequenceLayout(8, Windows_h.C_LONG).withName("Data")
    ).withName("tagMONCBSTRUCT");

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

    private static final long dwTime$OFFSET = 4;

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

    private static final long hTask$OFFSET = 8;

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

    private static final OfInt dwRet$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwRet"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwRet
     * }
     */
    public static final OfInt dwRet$layout() {
        return dwRet$LAYOUT;
    }

    private static final long dwRet$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwRet
     * }
     */
    public static final long dwRet$offset() {
        return dwRet$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwRet
     * }
     */
    public static int dwRet(MemorySegment struct) {
        return struct.get(dwRet$LAYOUT, dwRet$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwRet
     * }
     */
    public static void dwRet(MemorySegment struct, int fieldValue) {
        struct.set(dwRet$LAYOUT, dwRet$OFFSET, fieldValue);
    }

    private static final OfInt wType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static final OfInt wType$layout() {
        return wType$LAYOUT;
    }

    private static final long wType$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static final long wType$offset() {
        return wType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static int wType(MemorySegment struct) {
        return struct.get(wType$LAYOUT, wType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static void wType(MemorySegment struct, int fieldValue) {
        struct.set(wType$LAYOUT, wType$OFFSET, fieldValue);
    }

    private static final OfInt wFmt$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wFmt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wFmt
     * }
     */
    public static final OfInt wFmt$layout() {
        return wFmt$LAYOUT;
    }

    private static final long wFmt$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wFmt
     * }
     */
    public static final long wFmt$offset() {
        return wFmt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wFmt
     * }
     */
    public static int wFmt(MemorySegment struct) {
        return struct.get(wFmt$LAYOUT, wFmt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wFmt
     * }
     */
    public static void wFmt(MemorySegment struct, int fieldValue) {
        struct.set(wFmt$LAYOUT, wFmt$OFFSET, fieldValue);
    }

    private static final AddressLayout hConv$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hConv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCONV hConv
     * }
     */
    public static final AddressLayout hConv$layout() {
        return hConv$LAYOUT;
    }

    private static final long hConv$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCONV hConv
     * }
     */
    public static final long hConv$offset() {
        return hConv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCONV hConv
     * }
     */
    public static MemorySegment hConv(MemorySegment struct) {
        return struct.get(hConv$LAYOUT, hConv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCONV hConv
     * }
     */
    public static void hConv(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hConv$LAYOUT, hConv$OFFSET, fieldValue);
    }

    private static final AddressLayout hsz1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hsz1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hsz1
     * }
     */
    public static final AddressLayout hsz1$layout() {
        return hsz1$LAYOUT;
    }

    private static final long hsz1$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hsz1
     * }
     */
    public static final long hsz1$offset() {
        return hsz1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hsz1
     * }
     */
    public static MemorySegment hsz1(MemorySegment struct) {
        return struct.get(hsz1$LAYOUT, hsz1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hsz1
     * }
     */
    public static void hsz1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hsz1$LAYOUT, hsz1$OFFSET, fieldValue);
    }

    private static final AddressLayout hsz2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hsz2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hsz2
     * }
     */
    public static final AddressLayout hsz2$layout() {
        return hsz2$LAYOUT;
    }

    private static final long hsz2$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hsz2
     * }
     */
    public static final long hsz2$offset() {
        return hsz2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hsz2
     * }
     */
    public static MemorySegment hsz2(MemorySegment struct) {
        return struct.get(hsz2$LAYOUT, hsz2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hsz2
     * }
     */
    public static void hsz2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hsz2$LAYOUT, hsz2$OFFSET, fieldValue);
    }

    private static final AddressLayout hData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HDDEDATA hData
     * }
     */
    public static final AddressLayout hData$layout() {
        return hData$LAYOUT;
    }

    private static final long hData$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HDDEDATA hData
     * }
     */
    public static final long hData$offset() {
        return hData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HDDEDATA hData
     * }
     */
    public static MemorySegment hData(MemorySegment struct) {
        return struct.get(hData$LAYOUT, hData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HDDEDATA hData
     * }
     */
    public static void hData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hData$LAYOUT, hData$OFFSET, fieldValue);
    }

    private static final OfLong dwData1$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwData1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR dwData1
     * }
     */
    public static final OfLong dwData1$layout() {
        return dwData1$LAYOUT;
    }

    private static final long dwData1$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR dwData1
     * }
     */
    public static final long dwData1$offset() {
        return dwData1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwData1
     * }
     */
    public static long dwData1(MemorySegment struct) {
        return struct.get(dwData1$LAYOUT, dwData1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwData1
     * }
     */
    public static void dwData1(MemorySegment struct, long fieldValue) {
        struct.set(dwData1$LAYOUT, dwData1$OFFSET, fieldValue);
    }

    private static final OfLong dwData2$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwData2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR dwData2
     * }
     */
    public static final OfLong dwData2$layout() {
        return dwData2$LAYOUT;
    }

    private static final long dwData2$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR dwData2
     * }
     */
    public static final long dwData2$offset() {
        return dwData2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwData2
     * }
     */
    public static long dwData2(MemorySegment struct) {
        return struct.get(dwData2$LAYOUT, dwData2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwData2
     * }
     */
    public static void dwData2(MemorySegment struct, long fieldValue) {
        struct.set(dwData2$LAYOUT, dwData2$OFFSET, fieldValue);
    }

    private static final GroupLayout cc$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("cc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CONVCONTEXT cc
     * }
     */
    public static final GroupLayout cc$layout() {
        return cc$LAYOUT;
    }

    private static final long cc$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CONVCONTEXT cc
     * }
     */
    public static final long cc$offset() {
        return cc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CONVCONTEXT cc
     * }
     */
    public static MemorySegment cc(MemorySegment struct) {
        return struct.asSlice(cc$OFFSET, cc$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CONVCONTEXT cc
     * }
     */
    public static void cc(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cc$OFFSET, cc$LAYOUT.byteSize());
    }

    private static final OfInt cbData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static final OfInt cbData$layout() {
        return cbData$LAYOUT;
    }

    private static final long cbData$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static final long cbData$offset() {
        return cbData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static int cbData(MemorySegment struct) {
        return struct.get(cbData$LAYOUT, cbData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static void cbData(MemorySegment struct, int fieldValue) {
        struct.set(cbData$LAYOUT, cbData$OFFSET, fieldValue);
    }

    private static final SequenceLayout Data$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Data[8]
     * }
     */
    public static final SequenceLayout Data$layout() {
        return Data$LAYOUT;
    }

    private static final long Data$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Data[8]
     * }
     */
    public static final long Data$offset() {
        return Data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Data[8]
     * }
     */
    public static MemorySegment Data(MemorySegment struct) {
        return struct.asSlice(Data$OFFSET, Data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Data[8]
     * }
     */
    public static void Data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Data$OFFSET, Data$LAYOUT.byteSize());
    }

    private static long[] Data$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD Data[8]
     * }
     */
    public static long[] Data$dimensions() {
        return Data$DIMS;
    }
    private static final VarHandle Data$ELEM_HANDLE = Data$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD Data[8]
     * }
     */
    public static int Data(MemorySegment struct, long index0) {
        return (int)Data$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD Data[8]
     * }
     */
    public static void Data(MemorySegment struct, long index0, int fieldValue) {
        Data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

