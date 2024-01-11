// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagHELPINFO {
 *     UINT cbSize;
 *     int iContextType;
 *     int iCtrlId;
 *     HANDLE hItemHandle;
 *     DWORD_PTR dwContextId;
 *     POINT MousePos;
 * };
 * }
 */
public class tagHELPINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1288.const$3;
    }
    public static VarHandle cbSize$VH() {
        return constants$1288.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1288.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1288.const$4.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1288.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1288.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iContextType$VH() {
        return constants$1288.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iContextType;
     * }
     */
    public static int iContextType$get(MemorySegment seg) {
        return (int)constants$1288.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iContextType;
     * }
     */
    public static void iContextType$set(MemorySegment seg, int x) {
        constants$1288.const$5.set(seg, x);
    }
    public static int iContextType$get(MemorySegment seg, long index) {
        return (int)constants$1288.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void iContextType$set(MemorySegment seg, long index, int x) {
        constants$1288.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iCtrlId$VH() {
        return constants$1289.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iCtrlId;
     * }
     */
    public static int iCtrlId$get(MemorySegment seg) {
        return (int)constants$1289.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iCtrlId;
     * }
     */
    public static void iCtrlId$set(MemorySegment seg, int x) {
        constants$1289.const$0.set(seg, x);
    }
    public static int iCtrlId$get(MemorySegment seg, long index) {
        return (int)constants$1289.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void iCtrlId$set(MemorySegment seg, long index, int x) {
        constants$1289.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hItemHandle$VH() {
        return constants$1289.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hItemHandle;
     * }
     */
    public static MemorySegment hItemHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1289.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hItemHandle;
     * }
     */
    public static void hItemHandle$set(MemorySegment seg, MemorySegment x) {
        constants$1289.const$1.set(seg, x);
    }
    public static MemorySegment hItemHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1289.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void hItemHandle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1289.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwContextId$VH() {
        return constants$1289.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwContextId;
     * }
     */
    public static long dwContextId$get(MemorySegment seg) {
        return (long)constants$1289.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwContextId;
     * }
     */
    public static void dwContextId$set(MemorySegment seg, long x) {
        constants$1289.const$2.set(seg, x);
    }
    public static long dwContextId$get(MemorySegment seg, long index) {
        return (long)constants$1289.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwContextId$set(MemorySegment seg, long index, long x) {
        constants$1289.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment MousePos$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

