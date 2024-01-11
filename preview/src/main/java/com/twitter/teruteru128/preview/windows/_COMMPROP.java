// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _COMMPROP {
 *     WORD wPacketLength;
 *     WORD wPacketVersion;
 *     DWORD dwServiceMask;
 *     DWORD dwReserved1;
 *     DWORD dwMaxTxQueue;
 *     DWORD dwMaxRxQueue;
 *     DWORD dwMaxBaud;
 *     DWORD dwProvSubType;
 *     DWORD dwProvCapabilities;
 *     DWORD dwSettableParams;
 *     DWORD dwSettableBaud;
 *     WORD wSettableData;
 *     WORD wSettableStopParity;
 *     DWORD dwCurrentTxQueue;
 *     DWORD dwCurrentRxQueue;
 *     DWORD dwProvSpec1;
 *     DWORD dwProvSpec2;
 *     WCHAR wcProvChar[1];
 * };
 * }
 */
public class _COMMPROP {

    public static MemoryLayout $LAYOUT() {
        return constants$743.const$2;
    }
    public static VarHandle wPacketLength$VH() {
        return constants$743.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPacketLength;
     * }
     */
    public static short wPacketLength$get(MemorySegment seg) {
        return (short)constants$743.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPacketLength;
     * }
     */
    public static void wPacketLength$set(MemorySegment seg, short x) {
        constants$743.const$3.set(seg, x);
    }
    public static short wPacketLength$get(MemorySegment seg, long index) {
        return (short)constants$743.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wPacketLength$set(MemorySegment seg, long index, short x) {
        constants$743.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wPacketVersion$VH() {
        return constants$743.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPacketVersion;
     * }
     */
    public static short wPacketVersion$get(MemorySegment seg) {
        return (short)constants$743.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPacketVersion;
     * }
     */
    public static void wPacketVersion$set(MemorySegment seg, short x) {
        constants$743.const$4.set(seg, x);
    }
    public static short wPacketVersion$get(MemorySegment seg, long index) {
        return (short)constants$743.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wPacketVersion$set(MemorySegment seg, long index, short x) {
        constants$743.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwServiceMask$VH() {
        return constants$743.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwServiceMask;
     * }
     */
    public static int dwServiceMask$get(MemorySegment seg) {
        return (int)constants$743.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwServiceMask;
     * }
     */
    public static void dwServiceMask$set(MemorySegment seg, int x) {
        constants$743.const$5.set(seg, x);
    }
    public static int dwServiceMask$get(MemorySegment seg, long index) {
        return (int)constants$743.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwServiceMask$set(MemorySegment seg, long index, int x) {
        constants$743.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwReserved1$VH() {
        return constants$744.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReserved1;
     * }
     */
    public static int dwReserved1$get(MemorySegment seg) {
        return (int)constants$744.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReserved1;
     * }
     */
    public static void dwReserved1$set(MemorySegment seg, int x) {
        constants$744.const$0.set(seg, x);
    }
    public static int dwReserved1$get(MemorySegment seg, long index) {
        return (int)constants$744.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved1$set(MemorySegment seg, long index, int x) {
        constants$744.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMaxTxQueue$VH() {
        return constants$744.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMaxTxQueue;
     * }
     */
    public static int dwMaxTxQueue$get(MemorySegment seg) {
        return (int)constants$744.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMaxTxQueue;
     * }
     */
    public static void dwMaxTxQueue$set(MemorySegment seg, int x) {
        constants$744.const$1.set(seg, x);
    }
    public static int dwMaxTxQueue$get(MemorySegment seg, long index) {
        return (int)constants$744.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxTxQueue$set(MemorySegment seg, long index, int x) {
        constants$744.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMaxRxQueue$VH() {
        return constants$744.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMaxRxQueue;
     * }
     */
    public static int dwMaxRxQueue$get(MemorySegment seg) {
        return (int)constants$744.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMaxRxQueue;
     * }
     */
    public static void dwMaxRxQueue$set(MemorySegment seg, int x) {
        constants$744.const$2.set(seg, x);
    }
    public static int dwMaxRxQueue$get(MemorySegment seg, long index) {
        return (int)constants$744.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxRxQueue$set(MemorySegment seg, long index, int x) {
        constants$744.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMaxBaud$VH() {
        return constants$744.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMaxBaud;
     * }
     */
    public static int dwMaxBaud$get(MemorySegment seg) {
        return (int)constants$744.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMaxBaud;
     * }
     */
    public static void dwMaxBaud$set(MemorySegment seg, int x) {
        constants$744.const$3.set(seg, x);
    }
    public static int dwMaxBaud$get(MemorySegment seg, long index) {
        return (int)constants$744.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxBaud$set(MemorySegment seg, long index, int x) {
        constants$744.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwProvSubType$VH() {
        return constants$744.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProvSubType;
     * }
     */
    public static int dwProvSubType$get(MemorySegment seg) {
        return (int)constants$744.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProvSubType;
     * }
     */
    public static void dwProvSubType$set(MemorySegment seg, int x) {
        constants$744.const$4.set(seg, x);
    }
    public static int dwProvSubType$get(MemorySegment seg, long index) {
        return (int)constants$744.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProvSubType$set(MemorySegment seg, long index, int x) {
        constants$744.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwProvCapabilities$VH() {
        return constants$744.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProvCapabilities;
     * }
     */
    public static int dwProvCapabilities$get(MemorySegment seg) {
        return (int)constants$744.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProvCapabilities;
     * }
     */
    public static void dwProvCapabilities$set(MemorySegment seg, int x) {
        constants$744.const$5.set(seg, x);
    }
    public static int dwProvCapabilities$get(MemorySegment seg, long index) {
        return (int)constants$744.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProvCapabilities$set(MemorySegment seg, long index, int x) {
        constants$744.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSettableParams$VH() {
        return constants$745.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSettableParams;
     * }
     */
    public static int dwSettableParams$get(MemorySegment seg) {
        return (int)constants$745.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSettableParams;
     * }
     */
    public static void dwSettableParams$set(MemorySegment seg, int x) {
        constants$745.const$0.set(seg, x);
    }
    public static int dwSettableParams$get(MemorySegment seg, long index) {
        return (int)constants$745.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSettableParams$set(MemorySegment seg, long index, int x) {
        constants$745.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSettableBaud$VH() {
        return constants$745.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSettableBaud;
     * }
     */
    public static int dwSettableBaud$get(MemorySegment seg) {
        return (int)constants$745.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSettableBaud;
     * }
     */
    public static void dwSettableBaud$set(MemorySegment seg, int x) {
        constants$745.const$1.set(seg, x);
    }
    public static int dwSettableBaud$get(MemorySegment seg, long index) {
        return (int)constants$745.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSettableBaud$set(MemorySegment seg, long index, int x) {
        constants$745.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wSettableData$VH() {
        return constants$745.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wSettableData;
     * }
     */
    public static short wSettableData$get(MemorySegment seg) {
        return (short)constants$745.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wSettableData;
     * }
     */
    public static void wSettableData$set(MemorySegment seg, short x) {
        constants$745.const$2.set(seg, x);
    }
    public static short wSettableData$get(MemorySegment seg, long index) {
        return (short)constants$745.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void wSettableData$set(MemorySegment seg, long index, short x) {
        constants$745.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wSettableStopParity$VH() {
        return constants$745.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wSettableStopParity;
     * }
     */
    public static short wSettableStopParity$get(MemorySegment seg) {
        return (short)constants$745.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wSettableStopParity;
     * }
     */
    public static void wSettableStopParity$set(MemorySegment seg, short x) {
        constants$745.const$3.set(seg, x);
    }
    public static short wSettableStopParity$get(MemorySegment seg, long index) {
        return (short)constants$745.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wSettableStopParity$set(MemorySegment seg, long index, short x) {
        constants$745.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCurrentTxQueue$VH() {
        return constants$745.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCurrentTxQueue;
     * }
     */
    public static int dwCurrentTxQueue$get(MemorySegment seg) {
        return (int)constants$745.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCurrentTxQueue;
     * }
     */
    public static void dwCurrentTxQueue$set(MemorySegment seg, int x) {
        constants$745.const$4.set(seg, x);
    }
    public static int dwCurrentTxQueue$get(MemorySegment seg, long index) {
        return (int)constants$745.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCurrentTxQueue$set(MemorySegment seg, long index, int x) {
        constants$745.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCurrentRxQueue$VH() {
        return constants$745.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCurrentRxQueue;
     * }
     */
    public static int dwCurrentRxQueue$get(MemorySegment seg) {
        return (int)constants$745.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCurrentRxQueue;
     * }
     */
    public static void dwCurrentRxQueue$set(MemorySegment seg, int x) {
        constants$745.const$5.set(seg, x);
    }
    public static int dwCurrentRxQueue$get(MemorySegment seg, long index) {
        return (int)constants$745.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCurrentRxQueue$set(MemorySegment seg, long index, int x) {
        constants$745.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwProvSpec1$VH() {
        return constants$746.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProvSpec1;
     * }
     */
    public static int dwProvSpec1$get(MemorySegment seg) {
        return (int)constants$746.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProvSpec1;
     * }
     */
    public static void dwProvSpec1$set(MemorySegment seg, int x) {
        constants$746.const$0.set(seg, x);
    }
    public static int dwProvSpec1$get(MemorySegment seg, long index) {
        return (int)constants$746.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProvSpec1$set(MemorySegment seg, long index, int x) {
        constants$746.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwProvSpec2$VH() {
        return constants$746.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProvSpec2;
     * }
     */
    public static int dwProvSpec2$get(MemorySegment seg) {
        return (int)constants$746.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProvSpec2;
     * }
     */
    public static void dwProvSpec2$set(MemorySegment seg, int x) {
        constants$746.const$1.set(seg, x);
    }
    public static int dwProvSpec2$get(MemorySegment seg, long index) {
        return (int)constants$746.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProvSpec2$set(MemorySegment seg, long index, int x) {
        constants$746.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment wcProvChar$slice(MemorySegment seg) {
        return seg.asSlice(60, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


