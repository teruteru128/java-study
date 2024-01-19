// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPOINTER_INFO {
 *     POINTER_INPUT_TYPE pointerType;
 *     UINT32 pointerId;
 *     UINT32 frameId;
 *     POINTER_FLAGS pointerFlags;
 *     HANDLE sourceDevice;
 *     HWND hwndTarget;
 *     POINT ptPixelLocation;
 *     POINT ptHimetricLocation;
 *     POINT ptPixelLocationRaw;
 *     POINT ptHimetricLocationRaw;
 *     DWORD dwTime;
 *     UINT32 historyCount;
 *     INT32 InputData;
 *     DWORD dwKeyStates;
 *     UINT64 PerformanceCount;
 *     POINTER_BUTTON_CHANGE_TYPE ButtonChangeType;
 * };
 * }
 */
public class tagPOINTER_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1235.const$1;
    }
    public static VarHandle pointerType$VH() {
        return constants$1235.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POINTER_INPUT_TYPE pointerType;
     * }
     */
    public static int pointerType$get(MemorySegment seg) {
        return (int)constants$1235.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POINTER_INPUT_TYPE pointerType;
     * }
     */
    public static void pointerType$set(MemorySegment seg, int x) {
        constants$1235.const$2.set(seg, x);
    }
    public static int pointerType$get(MemorySegment seg, long index) {
        return (int)constants$1235.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pointerType$set(MemorySegment seg, long index, int x) {
        constants$1235.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pointerId$VH() {
        return constants$1235.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 pointerId;
     * }
     */
    public static int pointerId$get(MemorySegment seg) {
        return (int)constants$1235.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 pointerId;
     * }
     */
    public static void pointerId$set(MemorySegment seg, int x) {
        constants$1235.const$3.set(seg, x);
    }
    public static int pointerId$get(MemorySegment seg, long index) {
        return (int)constants$1235.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pointerId$set(MemorySegment seg, long index, int x) {
        constants$1235.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle frameId$VH() {
        return constants$1235.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 frameId;
     * }
     */
    public static int frameId$get(MemorySegment seg) {
        return (int)constants$1235.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 frameId;
     * }
     */
    public static void frameId$set(MemorySegment seg, int x) {
        constants$1235.const$4.set(seg, x);
    }
    public static int frameId$get(MemorySegment seg, long index) {
        return (int)constants$1235.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void frameId$set(MemorySegment seg, long index, int x) {
        constants$1235.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pointerFlags$VH() {
        return constants$1235.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POINTER_FLAGS pointerFlags;
     * }
     */
    public static int pointerFlags$get(MemorySegment seg) {
        return (int)constants$1235.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POINTER_FLAGS pointerFlags;
     * }
     */
    public static void pointerFlags$set(MemorySegment seg, int x) {
        constants$1235.const$5.set(seg, x);
    }
    public static int pointerFlags$get(MemorySegment seg, long index) {
        return (int)constants$1235.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pointerFlags$set(MemorySegment seg, long index, int x) {
        constants$1235.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sourceDevice$VH() {
        return constants$1236.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE sourceDevice;
     * }
     */
    public static MemorySegment sourceDevice$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1236.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE sourceDevice;
     * }
     */
    public static void sourceDevice$set(MemorySegment seg, MemorySegment x) {
        constants$1236.const$0.set(seg, x);
    }
    public static MemorySegment sourceDevice$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1236.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sourceDevice$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1236.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwndTarget$VH() {
        return constants$1236.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndTarget;
     * }
     */
    public static MemorySegment hwndTarget$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1236.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndTarget;
     * }
     */
    public static void hwndTarget$set(MemorySegment seg, MemorySegment x) {
        constants$1236.const$1.set(seg, x);
    }
    public static MemorySegment hwndTarget$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1236.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndTarget$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1236.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptPixelLocation$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment ptHimetricLocation$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static MemorySegment ptPixelLocationRaw$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static MemorySegment ptHimetricLocationRaw$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    public static VarHandle dwTime$VH() {
        return constants$1236.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwTime;
     * }
     */
    public static int dwTime$get(MemorySegment seg) {
        return (int)constants$1236.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwTime;
     * }
     */
    public static void dwTime$set(MemorySegment seg, int x) {
        constants$1236.const$2.set(seg, x);
    }
    public static int dwTime$get(MemorySegment seg, long index) {
        return (int)constants$1236.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTime$set(MemorySegment seg, long index, int x) {
        constants$1236.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle historyCount$VH() {
        return constants$1236.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 historyCount;
     * }
     */
    public static int historyCount$get(MemorySegment seg) {
        return (int)constants$1236.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 historyCount;
     * }
     */
    public static void historyCount$set(MemorySegment seg, int x) {
        constants$1236.const$3.set(seg, x);
    }
    public static int historyCount$get(MemorySegment seg, long index) {
        return (int)constants$1236.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void historyCount$set(MemorySegment seg, long index, int x) {
        constants$1236.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle InputData$VH() {
        return constants$1236.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT32 InputData;
     * }
     */
    public static int InputData$get(MemorySegment seg) {
        return (int)constants$1236.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT32 InputData;
     * }
     */
    public static void InputData$set(MemorySegment seg, int x) {
        constants$1236.const$4.set(seg, x);
    }
    public static int InputData$get(MemorySegment seg, long index) {
        return (int)constants$1236.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void InputData$set(MemorySegment seg, long index, int x) {
        constants$1236.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwKeyStates$VH() {
        return constants$1236.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwKeyStates;
     * }
     */
    public static int dwKeyStates$get(MemorySegment seg) {
        return (int)constants$1236.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwKeyStates;
     * }
     */
    public static void dwKeyStates$set(MemorySegment seg, int x) {
        constants$1236.const$5.set(seg, x);
    }
    public static int dwKeyStates$get(MemorySegment seg, long index) {
        return (int)constants$1236.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeyStates$set(MemorySegment seg, long index, int x) {
        constants$1236.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PerformanceCount$VH() {
        return constants$1237.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT64 PerformanceCount;
     * }
     */
    public static long PerformanceCount$get(MemorySegment seg) {
        return (long)constants$1237.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT64 PerformanceCount;
     * }
     */
    public static void PerformanceCount$set(MemorySegment seg, long x) {
        constants$1237.const$0.set(seg, x);
    }
    public static long PerformanceCount$get(MemorySegment seg, long index) {
        return (long)constants$1237.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void PerformanceCount$set(MemorySegment seg, long index, long x) {
        constants$1237.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ButtonChangeType$VH() {
        return constants$1237.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POINTER_BUTTON_CHANGE_TYPE ButtonChangeType;
     * }
     */
    public static int ButtonChangeType$get(MemorySegment seg) {
        return (int)constants$1237.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POINTER_BUTTON_CHANGE_TYPE ButtonChangeType;
     * }
     */
    public static void ButtonChangeType$set(MemorySegment seg, int x) {
        constants$1237.const$1.set(seg, x);
    }
    public static int ButtonChangeType$get(MemorySegment seg, long index) {
        return (int)constants$1237.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ButtonChangeType$set(MemorySegment seg, long index, int x) {
        constants$1237.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

