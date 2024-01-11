// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagSTATSTG {
 *     LPOLESTR pwcsName;
 *     DWORD type;
 *     ULARGE_INTEGER cbSize;
 *     FILETIME mtime;
 *     FILETIME ctime;
 *     FILETIME atime;
 *     DWORD grfMode;
 *     DWORD grfLocksSupported;
 *     CLSID clsid;
 *     DWORD grfStateBits;
 *     DWORD reserved;
 * };
 * }
 */
public class tagSTATSTG {

    public static MemoryLayout $LAYOUT() {
        return constants$3048.const$5;
    }
    public static VarHandle pwcsName$VH() {
        return constants$3049.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOLESTR pwcsName;
     * }
     */
    public static MemorySegment pwcsName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3049.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOLESTR pwcsName;
     * }
     */
    public static void pwcsName$set(MemorySegment seg, MemorySegment x) {
        constants$3049.const$0.set(seg, x);
    }
    public static MemorySegment pwcsName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3049.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pwcsName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3049.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type$VH() {
        return constants$3049.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$3049.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$3049.const$1.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$3049.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$3049.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cbSize$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment mtime$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment ctime$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment atime$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static VarHandle grfMode$VH() {
        return constants$3049.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD grfMode;
     * }
     */
    public static int grfMode$get(MemorySegment seg) {
        return (int)constants$3049.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD grfMode;
     * }
     */
    public static void grfMode$set(MemorySegment seg, int x) {
        constants$3049.const$2.set(seg, x);
    }
    public static int grfMode$get(MemorySegment seg, long index) {
        return (int)constants$3049.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void grfMode$set(MemorySegment seg, long index, int x) {
        constants$3049.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle grfLocksSupported$VH() {
        return constants$3049.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD grfLocksSupported;
     * }
     */
    public static int grfLocksSupported$get(MemorySegment seg) {
        return (int)constants$3049.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD grfLocksSupported;
     * }
     */
    public static void grfLocksSupported$set(MemorySegment seg, int x) {
        constants$3049.const$3.set(seg, x);
    }
    public static int grfLocksSupported$get(MemorySegment seg, long index) {
        return (int)constants$3049.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void grfLocksSupported$set(MemorySegment seg, long index, int x) {
        constants$3049.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment clsid$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static VarHandle grfStateBits$VH() {
        return constants$3049.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD grfStateBits;
     * }
     */
    public static int grfStateBits$get(MemorySegment seg) {
        return (int)constants$3049.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD grfStateBits;
     * }
     */
    public static void grfStateBits$set(MemorySegment seg, int x) {
        constants$3049.const$4.set(seg, x);
    }
    public static int grfStateBits$get(MemorySegment seg, long index) {
        return (int)constants$3049.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void grfStateBits$set(MemorySegment seg, long index, int x) {
        constants$3049.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved$VH() {
        return constants$3049.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD reserved;
     * }
     */
    public static int reserved$get(MemorySegment seg) {
        return (int)constants$3049.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD reserved;
     * }
     */
    public static void reserved$set(MemorySegment seg, int x) {
        constants$3049.const$5.set(seg, x);
    }
    public static int reserved$get(MemorySegment seg, long index) {
        return (int)constants$3049.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, int x) {
        constants$3049.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


