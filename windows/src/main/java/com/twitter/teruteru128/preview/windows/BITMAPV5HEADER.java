// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD bV5Size;
 *     LONG bV5Width;
 *     LONG bV5Height;
 *     WORD bV5Planes;
 *     WORD bV5BitCount;
 *     DWORD bV5Compression;
 *     DWORD bV5SizeImage;
 *     LONG bV5XPelsPerMeter;
 *     LONG bV5YPelsPerMeter;
 *     DWORD bV5ClrUsed;
 *     DWORD bV5ClrImportant;
 *     DWORD bV5RedMask;
 *     DWORD bV5GreenMask;
 *     DWORD bV5BlueMask;
 *     DWORD bV5AlphaMask;
 *     DWORD bV5CSType;
 *     CIEXYZTRIPLE bV5Endpoints;
 *     DWORD bV5GammaRed;
 *     DWORD bV5GammaGreen;
 *     DWORD bV5GammaBlue;
 *     DWORD bV5Intent;
 *     DWORD bV5ProfileData;
 *     DWORD bV5ProfileSize;
 *     DWORD bV5Reserved;
 * };
 * }
 */
public class BITMAPV5HEADER {

    public static MemoryLayout $LAYOUT() {
        return constants$901.const$1;
    }
    public static VarHandle bV5Size$VH() {
        return constants$901.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5Size;
     * }
     */
    public static int bV5Size$get(MemorySegment seg) {
        return (int)constants$901.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5Size;
     * }
     */
    public static void bV5Size$set(MemorySegment seg, int x) {
        constants$901.const$2.set(seg, x);
    }
    public static int bV5Size$get(MemorySegment seg, long index) {
        return (int)constants$901.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Size$set(MemorySegment seg, long index, int x) {
        constants$901.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5Width$VH() {
        return constants$901.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bV5Width;
     * }
     */
    public static int bV5Width$get(MemorySegment seg) {
        return (int)constants$901.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bV5Width;
     * }
     */
    public static void bV5Width$set(MemorySegment seg, int x) {
        constants$901.const$3.set(seg, x);
    }
    public static int bV5Width$get(MemorySegment seg, long index) {
        return (int)constants$901.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Width$set(MemorySegment seg, long index, int x) {
        constants$901.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5Height$VH() {
        return constants$901.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bV5Height;
     * }
     */
    public static int bV5Height$get(MemorySegment seg) {
        return (int)constants$901.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bV5Height;
     * }
     */
    public static void bV5Height$set(MemorySegment seg, int x) {
        constants$901.const$4.set(seg, x);
    }
    public static int bV5Height$get(MemorySegment seg, long index) {
        return (int)constants$901.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Height$set(MemorySegment seg, long index, int x) {
        constants$901.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5Planes$VH() {
        return constants$901.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD bV5Planes;
     * }
     */
    public static short bV5Planes$get(MemorySegment seg) {
        return (short)constants$901.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD bV5Planes;
     * }
     */
    public static void bV5Planes$set(MemorySegment seg, short x) {
        constants$901.const$5.set(seg, x);
    }
    public static short bV5Planes$get(MemorySegment seg, long index) {
        return (short)constants$901.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Planes$set(MemorySegment seg, long index, short x) {
        constants$901.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5BitCount$VH() {
        return constants$902.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD bV5BitCount;
     * }
     */
    public static short bV5BitCount$get(MemorySegment seg) {
        return (short)constants$902.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD bV5BitCount;
     * }
     */
    public static void bV5BitCount$set(MemorySegment seg, short x) {
        constants$902.const$0.set(seg, x);
    }
    public static short bV5BitCount$get(MemorySegment seg, long index) {
        return (short)constants$902.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5BitCount$set(MemorySegment seg, long index, short x) {
        constants$902.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5Compression$VH() {
        return constants$902.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5Compression;
     * }
     */
    public static int bV5Compression$get(MemorySegment seg) {
        return (int)constants$902.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5Compression;
     * }
     */
    public static void bV5Compression$set(MemorySegment seg, int x) {
        constants$902.const$1.set(seg, x);
    }
    public static int bV5Compression$get(MemorySegment seg, long index) {
        return (int)constants$902.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Compression$set(MemorySegment seg, long index, int x) {
        constants$902.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5SizeImage$VH() {
        return constants$902.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5SizeImage;
     * }
     */
    public static int bV5SizeImage$get(MemorySegment seg) {
        return (int)constants$902.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5SizeImage;
     * }
     */
    public static void bV5SizeImage$set(MemorySegment seg, int x) {
        constants$902.const$2.set(seg, x);
    }
    public static int bV5SizeImage$get(MemorySegment seg, long index) {
        return (int)constants$902.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5SizeImage$set(MemorySegment seg, long index, int x) {
        constants$902.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5XPelsPerMeter$VH() {
        return constants$902.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bV5XPelsPerMeter;
     * }
     */
    public static int bV5XPelsPerMeter$get(MemorySegment seg) {
        return (int)constants$902.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bV5XPelsPerMeter;
     * }
     */
    public static void bV5XPelsPerMeter$set(MemorySegment seg, int x) {
        constants$902.const$3.set(seg, x);
    }
    public static int bV5XPelsPerMeter$get(MemorySegment seg, long index) {
        return (int)constants$902.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5XPelsPerMeter$set(MemorySegment seg, long index, int x) {
        constants$902.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5YPelsPerMeter$VH() {
        return constants$902.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bV5YPelsPerMeter;
     * }
     */
    public static int bV5YPelsPerMeter$get(MemorySegment seg) {
        return (int)constants$902.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bV5YPelsPerMeter;
     * }
     */
    public static void bV5YPelsPerMeter$set(MemorySegment seg, int x) {
        constants$902.const$4.set(seg, x);
    }
    public static int bV5YPelsPerMeter$get(MemorySegment seg, long index) {
        return (int)constants$902.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5YPelsPerMeter$set(MemorySegment seg, long index, int x) {
        constants$902.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5ClrUsed$VH() {
        return constants$902.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5ClrUsed;
     * }
     */
    public static int bV5ClrUsed$get(MemorySegment seg) {
        return (int)constants$902.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5ClrUsed;
     * }
     */
    public static void bV5ClrUsed$set(MemorySegment seg, int x) {
        constants$902.const$5.set(seg, x);
    }
    public static int bV5ClrUsed$get(MemorySegment seg, long index) {
        return (int)constants$902.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5ClrUsed$set(MemorySegment seg, long index, int x) {
        constants$902.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5ClrImportant$VH() {
        return constants$903.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5ClrImportant;
     * }
     */
    public static int bV5ClrImportant$get(MemorySegment seg) {
        return (int)constants$903.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5ClrImportant;
     * }
     */
    public static void bV5ClrImportant$set(MemorySegment seg, int x) {
        constants$903.const$0.set(seg, x);
    }
    public static int bV5ClrImportant$get(MemorySegment seg, long index) {
        return (int)constants$903.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5ClrImportant$set(MemorySegment seg, long index, int x) {
        constants$903.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5RedMask$VH() {
        return constants$903.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5RedMask;
     * }
     */
    public static int bV5RedMask$get(MemorySegment seg) {
        return (int)constants$903.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5RedMask;
     * }
     */
    public static void bV5RedMask$set(MemorySegment seg, int x) {
        constants$903.const$1.set(seg, x);
    }
    public static int bV5RedMask$get(MemorySegment seg, long index) {
        return (int)constants$903.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5RedMask$set(MemorySegment seg, long index, int x) {
        constants$903.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5GreenMask$VH() {
        return constants$903.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5GreenMask;
     * }
     */
    public static int bV5GreenMask$get(MemorySegment seg) {
        return (int)constants$903.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5GreenMask;
     * }
     */
    public static void bV5GreenMask$set(MemorySegment seg, int x) {
        constants$903.const$2.set(seg, x);
    }
    public static int bV5GreenMask$get(MemorySegment seg, long index) {
        return (int)constants$903.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5GreenMask$set(MemorySegment seg, long index, int x) {
        constants$903.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5BlueMask$VH() {
        return constants$903.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5BlueMask;
     * }
     */
    public static int bV5BlueMask$get(MemorySegment seg) {
        return (int)constants$903.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5BlueMask;
     * }
     */
    public static void bV5BlueMask$set(MemorySegment seg, int x) {
        constants$903.const$3.set(seg, x);
    }
    public static int bV5BlueMask$get(MemorySegment seg, long index) {
        return (int)constants$903.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5BlueMask$set(MemorySegment seg, long index, int x) {
        constants$903.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5AlphaMask$VH() {
        return constants$903.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5AlphaMask;
     * }
     */
    public static int bV5AlphaMask$get(MemorySegment seg) {
        return (int)constants$903.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5AlphaMask;
     * }
     */
    public static void bV5AlphaMask$set(MemorySegment seg, int x) {
        constants$903.const$4.set(seg, x);
    }
    public static int bV5AlphaMask$get(MemorySegment seg, long index) {
        return (int)constants$903.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5AlphaMask$set(MemorySegment seg, long index, int x) {
        constants$903.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5CSType$VH() {
        return constants$903.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5CSType;
     * }
     */
    public static int bV5CSType$get(MemorySegment seg) {
        return (int)constants$903.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5CSType;
     * }
     */
    public static void bV5CSType$set(MemorySegment seg, int x) {
        constants$903.const$5.set(seg, x);
    }
    public static int bV5CSType$get(MemorySegment seg, long index) {
        return (int)constants$903.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5CSType$set(MemorySegment seg, long index, int x) {
        constants$903.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bV5Endpoints$slice(MemorySegment seg) {
        return seg.asSlice(60, 36);
    }
    public static VarHandle bV5GammaRed$VH() {
        return constants$904.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5GammaRed;
     * }
     */
    public static int bV5GammaRed$get(MemorySegment seg) {
        return (int)constants$904.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5GammaRed;
     * }
     */
    public static void bV5GammaRed$set(MemorySegment seg, int x) {
        constants$904.const$0.set(seg, x);
    }
    public static int bV5GammaRed$get(MemorySegment seg, long index) {
        return (int)constants$904.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5GammaRed$set(MemorySegment seg, long index, int x) {
        constants$904.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5GammaGreen$VH() {
        return constants$904.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5GammaGreen;
     * }
     */
    public static int bV5GammaGreen$get(MemorySegment seg) {
        return (int)constants$904.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5GammaGreen;
     * }
     */
    public static void bV5GammaGreen$set(MemorySegment seg, int x) {
        constants$904.const$1.set(seg, x);
    }
    public static int bV5GammaGreen$get(MemorySegment seg, long index) {
        return (int)constants$904.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5GammaGreen$set(MemorySegment seg, long index, int x) {
        constants$904.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5GammaBlue$VH() {
        return constants$904.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5GammaBlue;
     * }
     */
    public static int bV5GammaBlue$get(MemorySegment seg) {
        return (int)constants$904.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5GammaBlue;
     * }
     */
    public static void bV5GammaBlue$set(MemorySegment seg, int x) {
        constants$904.const$2.set(seg, x);
    }
    public static int bV5GammaBlue$get(MemorySegment seg, long index) {
        return (int)constants$904.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5GammaBlue$set(MemorySegment seg, long index, int x) {
        constants$904.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5Intent$VH() {
        return constants$904.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5Intent;
     * }
     */
    public static int bV5Intent$get(MemorySegment seg) {
        return (int)constants$904.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5Intent;
     * }
     */
    public static void bV5Intent$set(MemorySegment seg, int x) {
        constants$904.const$3.set(seg, x);
    }
    public static int bV5Intent$get(MemorySegment seg, long index) {
        return (int)constants$904.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Intent$set(MemorySegment seg, long index, int x) {
        constants$904.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5ProfileData$VH() {
        return constants$904.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5ProfileData;
     * }
     */
    public static int bV5ProfileData$get(MemorySegment seg) {
        return (int)constants$904.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5ProfileData;
     * }
     */
    public static void bV5ProfileData$set(MemorySegment seg, int x) {
        constants$904.const$4.set(seg, x);
    }
    public static int bV5ProfileData$get(MemorySegment seg, long index) {
        return (int)constants$904.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5ProfileData$set(MemorySegment seg, long index, int x) {
        constants$904.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5ProfileSize$VH() {
        return constants$904.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5ProfileSize;
     * }
     */
    public static int bV5ProfileSize$get(MemorySegment seg) {
        return (int)constants$904.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5ProfileSize;
     * }
     */
    public static void bV5ProfileSize$set(MemorySegment seg, int x) {
        constants$904.const$5.set(seg, x);
    }
    public static int bV5ProfileSize$get(MemorySegment seg, long index) {
        return (int)constants$904.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5ProfileSize$set(MemorySegment seg, long index, int x) {
        constants$904.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bV5Reserved$VH() {
        return constants$905.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bV5Reserved;
     * }
     */
    public static int bV5Reserved$get(MemorySegment seg) {
        return (int)constants$905.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bV5Reserved;
     * }
     */
    public static void bV5Reserved$set(MemorySegment seg, int x) {
        constants$905.const$0.set(seg, x);
    }
    public static int bV5Reserved$get(MemorySegment seg, long index) {
        return (int)constants$905.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void bV5Reserved$set(MemorySegment seg, long index, int x) {
        constants$905.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

