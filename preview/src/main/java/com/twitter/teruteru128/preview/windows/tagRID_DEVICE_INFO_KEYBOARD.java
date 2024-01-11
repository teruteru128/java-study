// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagRID_DEVICE_INFO_KEYBOARD {
 *     DWORD dwType;
 *     DWORD dwSubType;
 *     DWORD dwKeyboardMode;
 *     DWORD dwNumberOfFunctionKeys;
 *     DWORD dwNumberOfIndicators;
 *     DWORD dwNumberOfKeysTotal;
 * };
 * }
 */
public class tagRID_DEVICE_INFO_KEYBOARD {

    public static MemoryLayout $LAYOUT() {
        return constants$1390.const$3;
    }
    public static VarHandle dwType$VH() {
        return constants$1390.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static int dwType$get(MemorySegment seg) {
        return (int)constants$1390.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static void dwType$set(MemorySegment seg, int x) {
        constants$1390.const$4.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)constants$1390.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        constants$1390.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSubType$VH() {
        return constants$1390.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSubType;
     * }
     */
    public static int dwSubType$get(MemorySegment seg) {
        return (int)constants$1390.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSubType;
     * }
     */
    public static void dwSubType$set(MemorySegment seg, int x) {
        constants$1390.const$5.set(seg, x);
    }
    public static int dwSubType$get(MemorySegment seg, long index) {
        return (int)constants$1390.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSubType$set(MemorySegment seg, long index, int x) {
        constants$1390.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwKeyboardMode$VH() {
        return constants$1391.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwKeyboardMode;
     * }
     */
    public static int dwKeyboardMode$get(MemorySegment seg) {
        return (int)constants$1391.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwKeyboardMode;
     * }
     */
    public static void dwKeyboardMode$set(MemorySegment seg, int x) {
        constants$1391.const$0.set(seg, x);
    }
    public static int dwKeyboardMode$get(MemorySegment seg, long index) {
        return (int)constants$1391.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeyboardMode$set(MemorySegment seg, long index, int x) {
        constants$1391.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwNumberOfFunctionKeys$VH() {
        return constants$1391.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfFunctionKeys;
     * }
     */
    public static int dwNumberOfFunctionKeys$get(MemorySegment seg) {
        return (int)constants$1391.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfFunctionKeys;
     * }
     */
    public static void dwNumberOfFunctionKeys$set(MemorySegment seg, int x) {
        constants$1391.const$1.set(seg, x);
    }
    public static int dwNumberOfFunctionKeys$get(MemorySegment seg, long index) {
        return (int)constants$1391.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfFunctionKeys$set(MemorySegment seg, long index, int x) {
        constants$1391.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwNumberOfIndicators$VH() {
        return constants$1391.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfIndicators;
     * }
     */
    public static int dwNumberOfIndicators$get(MemorySegment seg) {
        return (int)constants$1391.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfIndicators;
     * }
     */
    public static void dwNumberOfIndicators$set(MemorySegment seg, int x) {
        constants$1391.const$2.set(seg, x);
    }
    public static int dwNumberOfIndicators$get(MemorySegment seg, long index) {
        return (int)constants$1391.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfIndicators$set(MemorySegment seg, long index, int x) {
        constants$1391.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwNumberOfKeysTotal$VH() {
        return constants$1391.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfKeysTotal;
     * }
     */
    public static int dwNumberOfKeysTotal$get(MemorySegment seg) {
        return (int)constants$1391.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfKeysTotal;
     * }
     */
    public static void dwNumberOfKeysTotal$set(MemorySegment seg, int x) {
        constants$1391.const$3.set(seg, x);
    }
    public static int dwNumberOfKeysTotal$get(MemorySegment seg, long index) {
        return (int)constants$1391.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfKeysTotal$set(MemorySegment seg, long index, int x) {
        constants$1391.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


