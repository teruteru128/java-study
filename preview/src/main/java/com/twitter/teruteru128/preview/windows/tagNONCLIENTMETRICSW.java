// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagNONCLIENTMETRICSW {
 *     UINT cbSize;
 *     int iBorderWidth;
 *     int iScrollWidth;
 *     int iScrollHeight;
 *     int iCaptionWidth;
 *     int iCaptionHeight;
 *     LOGFONTW lfCaptionFont;
 *     int iSmCaptionWidth;
 *     int iSmCaptionHeight;
 *     LOGFONTW lfSmCaptionFont;
 *     int iMenuWidth;
 *     int iMenuHeight;
 *     LOGFONTW lfMenuFont;
 *     LOGFONTW lfStatusFont;
 *     LOGFONTW lfMessageFont;
 *     int iPaddedBorderWidth;
 * };
 * }
 */
public class tagNONCLIENTMETRICSW {

    public static MemoryLayout $LAYOUT() {
        return constants$1340.const$1;
    }
    public static VarHandle cbSize$VH() {
        return constants$1340.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1340.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1340.const$2.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1340.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1340.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iBorderWidth$VH() {
        return constants$1340.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iBorderWidth;
     * }
     */
    public static int iBorderWidth$get(MemorySegment seg) {
        return (int)constants$1340.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iBorderWidth;
     * }
     */
    public static void iBorderWidth$set(MemorySegment seg, int x) {
        constants$1340.const$3.set(seg, x);
    }
    public static int iBorderWidth$get(MemorySegment seg, long index) {
        return (int)constants$1340.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void iBorderWidth$set(MemorySegment seg, long index, int x) {
        constants$1340.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iScrollWidth$VH() {
        return constants$1340.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iScrollWidth;
     * }
     */
    public static int iScrollWidth$get(MemorySegment seg) {
        return (int)constants$1340.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iScrollWidth;
     * }
     */
    public static void iScrollWidth$set(MemorySegment seg, int x) {
        constants$1340.const$4.set(seg, x);
    }
    public static int iScrollWidth$get(MemorySegment seg, long index) {
        return (int)constants$1340.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void iScrollWidth$set(MemorySegment seg, long index, int x) {
        constants$1340.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iScrollHeight$VH() {
        return constants$1340.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iScrollHeight;
     * }
     */
    public static int iScrollHeight$get(MemorySegment seg) {
        return (int)constants$1340.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iScrollHeight;
     * }
     */
    public static void iScrollHeight$set(MemorySegment seg, int x) {
        constants$1340.const$5.set(seg, x);
    }
    public static int iScrollHeight$get(MemorySegment seg, long index) {
        return (int)constants$1340.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void iScrollHeight$set(MemorySegment seg, long index, int x) {
        constants$1340.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iCaptionWidth$VH() {
        return constants$1341.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iCaptionWidth;
     * }
     */
    public static int iCaptionWidth$get(MemorySegment seg) {
        return (int)constants$1341.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iCaptionWidth;
     * }
     */
    public static void iCaptionWidth$set(MemorySegment seg, int x) {
        constants$1341.const$0.set(seg, x);
    }
    public static int iCaptionWidth$get(MemorySegment seg, long index) {
        return (int)constants$1341.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void iCaptionWidth$set(MemorySegment seg, long index, int x) {
        constants$1341.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iCaptionHeight$VH() {
        return constants$1341.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iCaptionHeight;
     * }
     */
    public static int iCaptionHeight$get(MemorySegment seg) {
        return (int)constants$1341.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iCaptionHeight;
     * }
     */
    public static void iCaptionHeight$set(MemorySegment seg, int x) {
        constants$1341.const$1.set(seg, x);
    }
    public static int iCaptionHeight$get(MemorySegment seg, long index) {
        return (int)constants$1341.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void iCaptionHeight$set(MemorySegment seg, long index, int x) {
        constants$1341.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lfCaptionFont$slice(MemorySegment seg) {
        return seg.asSlice(24, 92);
    }
    public static VarHandle iSmCaptionWidth$VH() {
        return constants$1341.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iSmCaptionWidth;
     * }
     */
    public static int iSmCaptionWidth$get(MemorySegment seg) {
        return (int)constants$1341.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iSmCaptionWidth;
     * }
     */
    public static void iSmCaptionWidth$set(MemorySegment seg, int x) {
        constants$1341.const$2.set(seg, x);
    }
    public static int iSmCaptionWidth$get(MemorySegment seg, long index) {
        return (int)constants$1341.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void iSmCaptionWidth$set(MemorySegment seg, long index, int x) {
        constants$1341.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iSmCaptionHeight$VH() {
        return constants$1341.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iSmCaptionHeight;
     * }
     */
    public static int iSmCaptionHeight$get(MemorySegment seg) {
        return (int)constants$1341.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iSmCaptionHeight;
     * }
     */
    public static void iSmCaptionHeight$set(MemorySegment seg, int x) {
        constants$1341.const$3.set(seg, x);
    }
    public static int iSmCaptionHeight$get(MemorySegment seg, long index) {
        return (int)constants$1341.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void iSmCaptionHeight$set(MemorySegment seg, long index, int x) {
        constants$1341.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lfSmCaptionFont$slice(MemorySegment seg) {
        return seg.asSlice(124, 92);
    }
    public static VarHandle iMenuWidth$VH() {
        return constants$1341.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iMenuWidth;
     * }
     */
    public static int iMenuWidth$get(MemorySegment seg) {
        return (int)constants$1341.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iMenuWidth;
     * }
     */
    public static void iMenuWidth$set(MemorySegment seg, int x) {
        constants$1341.const$4.set(seg, x);
    }
    public static int iMenuWidth$get(MemorySegment seg, long index) {
        return (int)constants$1341.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void iMenuWidth$set(MemorySegment seg, long index, int x) {
        constants$1341.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iMenuHeight$VH() {
        return constants$1341.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iMenuHeight;
     * }
     */
    public static int iMenuHeight$get(MemorySegment seg) {
        return (int)constants$1341.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iMenuHeight;
     * }
     */
    public static void iMenuHeight$set(MemorySegment seg, int x) {
        constants$1341.const$5.set(seg, x);
    }
    public static int iMenuHeight$get(MemorySegment seg, long index) {
        return (int)constants$1341.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void iMenuHeight$set(MemorySegment seg, long index, int x) {
        constants$1341.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lfMenuFont$slice(MemorySegment seg) {
        return seg.asSlice(224, 92);
    }
    public static MemorySegment lfStatusFont$slice(MemorySegment seg) {
        return seg.asSlice(316, 92);
    }
    public static MemorySegment lfMessageFont$slice(MemorySegment seg) {
        return seg.asSlice(408, 92);
    }
    public static VarHandle iPaddedBorderWidth$VH() {
        return constants$1342.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iPaddedBorderWidth;
     * }
     */
    public static int iPaddedBorderWidth$get(MemorySegment seg) {
        return (int)constants$1342.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iPaddedBorderWidth;
     * }
     */
    public static void iPaddedBorderWidth$set(MemorySegment seg, int x) {
        constants$1342.const$0.set(seg, x);
    }
    public static int iPaddedBorderWidth$get(MemorySegment seg, long index) {
        return (int)constants$1342.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void iPaddedBorderWidth$set(MemorySegment seg, long index, int x) {
        constants$1342.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


