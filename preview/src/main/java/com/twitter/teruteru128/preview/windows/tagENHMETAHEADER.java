// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagENHMETAHEADER {
 *     DWORD iType;
 *     DWORD nSize;
 *     RECTL rclBounds;
 *     RECTL rclFrame;
 *     DWORD dSignature;
 *     DWORD nVersion;
 *     DWORD nBytes;
 *     DWORD nRecords;
 *     WORD nHandles;
 *     WORD sReserved;
 *     DWORD nDescription;
 *     DWORD offDescription;
 *     DWORD nPalEntries;
 *     SIZEL szlDevice;
 *     SIZEL szlMillimeters;
 *     DWORD cbPixelFormat;
 *     DWORD offPixelFormat;
 *     DWORD bOpenGL;
 *     SIZEL szlMicrometers;
 * };
 * }
 */
public class tagENHMETAHEADER {

    public static MemoryLayout $LAYOUT() {
        return constants$910.const$4;
    }
    public static VarHandle iType$VH() {
        return constants$910.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iType;
     * }
     */
    public static int iType$get(MemorySegment seg) {
        return (int)constants$910.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iType;
     * }
     */
    public static void iType$set(MemorySegment seg, int x) {
        constants$910.const$5.set(seg, x);
    }
    public static int iType$get(MemorySegment seg, long index) {
        return (int)constants$910.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void iType$set(MemorySegment seg, long index, int x) {
        constants$910.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nSize$VH() {
        return constants$911.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nSize;
     * }
     */
    public static int nSize$get(MemorySegment seg) {
        return (int)constants$911.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nSize;
     * }
     */
    public static void nSize$set(MemorySegment seg, int x) {
        constants$911.const$0.set(seg, x);
    }
    public static int nSize$get(MemorySegment seg, long index) {
        return (int)constants$911.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void nSize$set(MemorySegment seg, long index, int x) {
        constants$911.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment rclFrame$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static VarHandle dSignature$VH() {
        return constants$911.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dSignature;
     * }
     */
    public static int dSignature$get(MemorySegment seg) {
        return (int)constants$911.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dSignature;
     * }
     */
    public static void dSignature$set(MemorySegment seg, int x) {
        constants$911.const$1.set(seg, x);
    }
    public static int dSignature$get(MemorySegment seg, long index) {
        return (int)constants$911.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dSignature$set(MemorySegment seg, long index, int x) {
        constants$911.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nVersion$VH() {
        return constants$911.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nVersion;
     * }
     */
    public static int nVersion$get(MemorySegment seg) {
        return (int)constants$911.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nVersion;
     * }
     */
    public static void nVersion$set(MemorySegment seg, int x) {
        constants$911.const$2.set(seg, x);
    }
    public static int nVersion$get(MemorySegment seg, long index) {
        return (int)constants$911.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void nVersion$set(MemorySegment seg, long index, int x) {
        constants$911.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nBytes$VH() {
        return constants$911.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nBytes;
     * }
     */
    public static int nBytes$get(MemorySegment seg) {
        return (int)constants$911.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nBytes;
     * }
     */
    public static void nBytes$set(MemorySegment seg, int x) {
        constants$911.const$3.set(seg, x);
    }
    public static int nBytes$get(MemorySegment seg, long index) {
        return (int)constants$911.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void nBytes$set(MemorySegment seg, long index, int x) {
        constants$911.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nRecords$VH() {
        return constants$911.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nRecords;
     * }
     */
    public static int nRecords$get(MemorySegment seg) {
        return (int)constants$911.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nRecords;
     * }
     */
    public static void nRecords$set(MemorySegment seg, int x) {
        constants$911.const$4.set(seg, x);
    }
    public static int nRecords$get(MemorySegment seg, long index) {
        return (int)constants$911.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void nRecords$set(MemorySegment seg, long index, int x) {
        constants$911.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nHandles$VH() {
        return constants$911.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nHandles;
     * }
     */
    public static short nHandles$get(MemorySegment seg) {
        return (short)constants$911.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nHandles;
     * }
     */
    public static void nHandles$set(MemorySegment seg, short x) {
        constants$911.const$5.set(seg, x);
    }
    public static short nHandles$get(MemorySegment seg, long index) {
        return (short)constants$911.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void nHandles$set(MemorySegment seg, long index, short x) {
        constants$911.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sReserved$VH() {
        return constants$912.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD sReserved;
     * }
     */
    public static short sReserved$get(MemorySegment seg) {
        return (short)constants$912.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD sReserved;
     * }
     */
    public static void sReserved$set(MemorySegment seg, short x) {
        constants$912.const$0.set(seg, x);
    }
    public static short sReserved$get(MemorySegment seg, long index) {
        return (short)constants$912.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sReserved$set(MemorySegment seg, long index, short x) {
        constants$912.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nDescription$VH() {
        return constants$912.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nDescription;
     * }
     */
    public static int nDescription$get(MemorySegment seg) {
        return (int)constants$912.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nDescription;
     * }
     */
    public static void nDescription$set(MemorySegment seg, int x) {
        constants$912.const$1.set(seg, x);
    }
    public static int nDescription$get(MemorySegment seg, long index) {
        return (int)constants$912.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void nDescription$set(MemorySegment seg, long index, int x) {
        constants$912.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offDescription$VH() {
        return constants$912.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD offDescription;
     * }
     */
    public static int offDescription$get(MemorySegment seg) {
        return (int)constants$912.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD offDescription;
     * }
     */
    public static void offDescription$set(MemorySegment seg, int x) {
        constants$912.const$2.set(seg, x);
    }
    public static int offDescription$get(MemorySegment seg, long index) {
        return (int)constants$912.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void offDescription$set(MemorySegment seg, long index, int x) {
        constants$912.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nPalEntries$VH() {
        return constants$912.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nPalEntries;
     * }
     */
    public static int nPalEntries$get(MemorySegment seg) {
        return (int)constants$912.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nPalEntries;
     * }
     */
    public static void nPalEntries$set(MemorySegment seg, int x) {
        constants$912.const$3.set(seg, x);
    }
    public static int nPalEntries$get(MemorySegment seg, long index) {
        return (int)constants$912.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void nPalEntries$set(MemorySegment seg, long index, int x) {
        constants$912.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szlDevice$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    public static MemorySegment szlMillimeters$slice(MemorySegment seg) {
        return seg.asSlice(80, 8);
    }
    public static VarHandle cbPixelFormat$VH() {
        return constants$912.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbPixelFormat;
     * }
     */
    public static int cbPixelFormat$get(MemorySegment seg) {
        return (int)constants$912.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbPixelFormat;
     * }
     */
    public static void cbPixelFormat$set(MemorySegment seg, int x) {
        constants$912.const$4.set(seg, x);
    }
    public static int cbPixelFormat$get(MemorySegment seg, long index) {
        return (int)constants$912.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPixelFormat$set(MemorySegment seg, long index, int x) {
        constants$912.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offPixelFormat$VH() {
        return constants$912.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD offPixelFormat;
     * }
     */
    public static int offPixelFormat$get(MemorySegment seg) {
        return (int)constants$912.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD offPixelFormat;
     * }
     */
    public static void offPixelFormat$set(MemorySegment seg, int x) {
        constants$912.const$5.set(seg, x);
    }
    public static int offPixelFormat$get(MemorySegment seg, long index) {
        return (int)constants$912.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void offPixelFormat$set(MemorySegment seg, long index, int x) {
        constants$912.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bOpenGL$VH() {
        return constants$913.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bOpenGL;
     * }
     */
    public static int bOpenGL$get(MemorySegment seg) {
        return (int)constants$913.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bOpenGL;
     * }
     */
    public static void bOpenGL$set(MemorySegment seg, int x) {
        constants$913.const$0.set(seg, x);
    }
    public static int bOpenGL$get(MemorySegment seg, long index) {
        return (int)constants$913.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bOpenGL$set(MemorySegment seg, long index, int x) {
        constants$913.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szlMicrometers$slice(MemorySegment seg) {
        return seg.asSlice(100, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

