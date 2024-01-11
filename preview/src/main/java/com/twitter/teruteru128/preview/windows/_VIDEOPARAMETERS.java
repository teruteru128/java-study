// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _VIDEOPARAMETERS {
 *     GUID Guid;
 *     ULONG dwOffset;
 *     ULONG dwCommand;
 *     ULONG dwFlags;
 *     ULONG dwMode;
 *     ULONG dwTVStandard;
 *     ULONG dwAvailableModes;
 *     ULONG dwAvailableTVStandard;
 *     ULONG dwFlickerFilter;
 *     ULONG dwOverScanX;
 *     ULONG dwOverScanY;
 *     ULONG dwMaxUnscaledX;
 *     ULONG dwMaxUnscaledY;
 *     ULONG dwPositionX;
 *     ULONG dwPositionY;
 *     ULONG dwBrightness;
 *     ULONG dwContrast;
 *     ULONG dwCPType;
 *     ULONG dwCPCommand;
 *     ULONG dwCPStandard;
 *     ULONG dwCPKey;
 *     ULONG bCP_APSTriggerBits;
 *     UCHAR bOEMCopyProtection[256];
 * };
 * }
 */
public class _VIDEOPARAMETERS {

    public static MemoryLayout $LAYOUT() {
        return constants$1349.const$2;
    }
    public static MemorySegment Guid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle dwOffset$VH() {
        return constants$1349.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwOffset;
     * }
     */
    public static int dwOffset$get(MemorySegment seg) {
        return (int)constants$1349.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwOffset;
     * }
     */
    public static void dwOffset$set(MemorySegment seg, int x) {
        constants$1349.const$3.set(seg, x);
    }
    public static int dwOffset$get(MemorySegment seg, long index) {
        return (int)constants$1349.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOffset$set(MemorySegment seg, long index, int x) {
        constants$1349.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCommand$VH() {
        return constants$1349.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCommand;
     * }
     */
    public static int dwCommand$get(MemorySegment seg) {
        return (int)constants$1349.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCommand;
     * }
     */
    public static void dwCommand$set(MemorySegment seg, int x) {
        constants$1349.const$4.set(seg, x);
    }
    public static int dwCommand$get(MemorySegment seg, long index) {
        return (int)constants$1349.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCommand$set(MemorySegment seg, long index, int x) {
        constants$1349.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlags$VH() {
        return constants$1349.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$1349.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$1349.const$5.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$1349.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$1349.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMode$VH() {
        return constants$1350.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwMode;
     * }
     */
    public static int dwMode$get(MemorySegment seg) {
        return (int)constants$1350.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwMode;
     * }
     */
    public static void dwMode$set(MemorySegment seg, int x) {
        constants$1350.const$0.set(seg, x);
    }
    public static int dwMode$get(MemorySegment seg, long index) {
        return (int)constants$1350.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMode$set(MemorySegment seg, long index, int x) {
        constants$1350.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwTVStandard$VH() {
        return constants$1350.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwTVStandard;
     * }
     */
    public static int dwTVStandard$get(MemorySegment seg) {
        return (int)constants$1350.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwTVStandard;
     * }
     */
    public static void dwTVStandard$set(MemorySegment seg, int x) {
        constants$1350.const$1.set(seg, x);
    }
    public static int dwTVStandard$get(MemorySegment seg, long index) {
        return (int)constants$1350.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTVStandard$set(MemorySegment seg, long index, int x) {
        constants$1350.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwAvailableModes$VH() {
        return constants$1350.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwAvailableModes;
     * }
     */
    public static int dwAvailableModes$get(MemorySegment seg) {
        return (int)constants$1350.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwAvailableModes;
     * }
     */
    public static void dwAvailableModes$set(MemorySegment seg, int x) {
        constants$1350.const$2.set(seg, x);
    }
    public static int dwAvailableModes$get(MemorySegment seg, long index) {
        return (int)constants$1350.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAvailableModes$set(MemorySegment seg, long index, int x) {
        constants$1350.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwAvailableTVStandard$VH() {
        return constants$1350.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwAvailableTVStandard;
     * }
     */
    public static int dwAvailableTVStandard$get(MemorySegment seg) {
        return (int)constants$1350.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwAvailableTVStandard;
     * }
     */
    public static void dwAvailableTVStandard$set(MemorySegment seg, int x) {
        constants$1350.const$3.set(seg, x);
    }
    public static int dwAvailableTVStandard$get(MemorySegment seg, long index) {
        return (int)constants$1350.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAvailableTVStandard$set(MemorySegment seg, long index, int x) {
        constants$1350.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlickerFilter$VH() {
        return constants$1350.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwFlickerFilter;
     * }
     */
    public static int dwFlickerFilter$get(MemorySegment seg) {
        return (int)constants$1350.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwFlickerFilter;
     * }
     */
    public static void dwFlickerFilter$set(MemorySegment seg, int x) {
        constants$1350.const$4.set(seg, x);
    }
    public static int dwFlickerFilter$get(MemorySegment seg, long index) {
        return (int)constants$1350.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlickerFilter$set(MemorySegment seg, long index, int x) {
        constants$1350.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwOverScanX$VH() {
        return constants$1350.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwOverScanX;
     * }
     */
    public static int dwOverScanX$get(MemorySegment seg) {
        return (int)constants$1350.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwOverScanX;
     * }
     */
    public static void dwOverScanX$set(MemorySegment seg, int x) {
        constants$1350.const$5.set(seg, x);
    }
    public static int dwOverScanX$get(MemorySegment seg, long index) {
        return (int)constants$1350.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOverScanX$set(MemorySegment seg, long index, int x) {
        constants$1350.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwOverScanY$VH() {
        return constants$1351.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwOverScanY;
     * }
     */
    public static int dwOverScanY$get(MemorySegment seg) {
        return (int)constants$1351.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwOverScanY;
     * }
     */
    public static void dwOverScanY$set(MemorySegment seg, int x) {
        constants$1351.const$0.set(seg, x);
    }
    public static int dwOverScanY$get(MemorySegment seg, long index) {
        return (int)constants$1351.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOverScanY$set(MemorySegment seg, long index, int x) {
        constants$1351.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMaxUnscaledX$VH() {
        return constants$1351.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwMaxUnscaledX;
     * }
     */
    public static int dwMaxUnscaledX$get(MemorySegment seg) {
        return (int)constants$1351.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwMaxUnscaledX;
     * }
     */
    public static void dwMaxUnscaledX$set(MemorySegment seg, int x) {
        constants$1351.const$1.set(seg, x);
    }
    public static int dwMaxUnscaledX$get(MemorySegment seg, long index) {
        return (int)constants$1351.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxUnscaledX$set(MemorySegment seg, long index, int x) {
        constants$1351.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMaxUnscaledY$VH() {
        return constants$1351.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwMaxUnscaledY;
     * }
     */
    public static int dwMaxUnscaledY$get(MemorySegment seg) {
        return (int)constants$1351.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwMaxUnscaledY;
     * }
     */
    public static void dwMaxUnscaledY$set(MemorySegment seg, int x) {
        constants$1351.const$2.set(seg, x);
    }
    public static int dwMaxUnscaledY$get(MemorySegment seg, long index) {
        return (int)constants$1351.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxUnscaledY$set(MemorySegment seg, long index, int x) {
        constants$1351.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwPositionX$VH() {
        return constants$1351.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwPositionX;
     * }
     */
    public static int dwPositionX$get(MemorySegment seg) {
        return (int)constants$1351.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwPositionX;
     * }
     */
    public static void dwPositionX$set(MemorySegment seg, int x) {
        constants$1351.const$3.set(seg, x);
    }
    public static int dwPositionX$get(MemorySegment seg, long index) {
        return (int)constants$1351.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPositionX$set(MemorySegment seg, long index, int x) {
        constants$1351.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwPositionY$VH() {
        return constants$1351.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwPositionY;
     * }
     */
    public static int dwPositionY$get(MemorySegment seg) {
        return (int)constants$1351.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwPositionY;
     * }
     */
    public static void dwPositionY$set(MemorySegment seg, int x) {
        constants$1351.const$4.set(seg, x);
    }
    public static int dwPositionY$get(MemorySegment seg, long index) {
        return (int)constants$1351.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPositionY$set(MemorySegment seg, long index, int x) {
        constants$1351.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwBrightness$VH() {
        return constants$1351.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwBrightness;
     * }
     */
    public static int dwBrightness$get(MemorySegment seg) {
        return (int)constants$1351.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwBrightness;
     * }
     */
    public static void dwBrightness$set(MemorySegment seg, int x) {
        constants$1351.const$5.set(seg, x);
    }
    public static int dwBrightness$get(MemorySegment seg, long index) {
        return (int)constants$1351.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBrightness$set(MemorySegment seg, long index, int x) {
        constants$1351.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwContrast$VH() {
        return constants$1352.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwContrast;
     * }
     */
    public static int dwContrast$get(MemorySegment seg) {
        return (int)constants$1352.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwContrast;
     * }
     */
    public static void dwContrast$set(MemorySegment seg, int x) {
        constants$1352.const$0.set(seg, x);
    }
    public static int dwContrast$get(MemorySegment seg, long index) {
        return (int)constants$1352.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwContrast$set(MemorySegment seg, long index, int x) {
        constants$1352.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCPType$VH() {
        return constants$1352.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCPType;
     * }
     */
    public static int dwCPType$get(MemorySegment seg) {
        return (int)constants$1352.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCPType;
     * }
     */
    public static void dwCPType$set(MemorySegment seg, int x) {
        constants$1352.const$1.set(seg, x);
    }
    public static int dwCPType$get(MemorySegment seg, long index) {
        return (int)constants$1352.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCPType$set(MemorySegment seg, long index, int x) {
        constants$1352.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCPCommand$VH() {
        return constants$1352.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCPCommand;
     * }
     */
    public static int dwCPCommand$get(MemorySegment seg) {
        return (int)constants$1352.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCPCommand;
     * }
     */
    public static void dwCPCommand$set(MemorySegment seg, int x) {
        constants$1352.const$2.set(seg, x);
    }
    public static int dwCPCommand$get(MemorySegment seg, long index) {
        return (int)constants$1352.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCPCommand$set(MemorySegment seg, long index, int x) {
        constants$1352.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCPStandard$VH() {
        return constants$1352.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCPStandard;
     * }
     */
    public static int dwCPStandard$get(MemorySegment seg) {
        return (int)constants$1352.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCPStandard;
     * }
     */
    public static void dwCPStandard$set(MemorySegment seg, int x) {
        constants$1352.const$3.set(seg, x);
    }
    public static int dwCPStandard$get(MemorySegment seg, long index) {
        return (int)constants$1352.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCPStandard$set(MemorySegment seg, long index, int x) {
        constants$1352.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCPKey$VH() {
        return constants$1352.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCPKey;
     * }
     */
    public static int dwCPKey$get(MemorySegment seg) {
        return (int)constants$1352.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCPKey;
     * }
     */
    public static void dwCPKey$set(MemorySegment seg, int x) {
        constants$1352.const$4.set(seg, x);
    }
    public static int dwCPKey$get(MemorySegment seg, long index) {
        return (int)constants$1352.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCPKey$set(MemorySegment seg, long index, int x) {
        constants$1352.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bCP_APSTriggerBits$VH() {
        return constants$1352.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG bCP_APSTriggerBits;
     * }
     */
    public static int bCP_APSTriggerBits$get(MemorySegment seg) {
        return (int)constants$1352.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG bCP_APSTriggerBits;
     * }
     */
    public static void bCP_APSTriggerBits$set(MemorySegment seg, int x) {
        constants$1352.const$5.set(seg, x);
    }
    public static int bCP_APSTriggerBits$get(MemorySegment seg, long index) {
        return (int)constants$1352.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bCP_APSTriggerBits$set(MemorySegment seg, long index, int x) {
        constants$1352.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bOEMCopyProtection$slice(MemorySegment seg) {
        return seg.asSlice(100, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

