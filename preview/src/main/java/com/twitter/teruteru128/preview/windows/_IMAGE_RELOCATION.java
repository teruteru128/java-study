// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_RELOCATION {
 *     union {
 *         DWORD VirtualAddress;
 *         DWORD RelocCount;
 *     };
 *     DWORD SymbolTableIndex;
 *     WORD Type;
 * };
 * }
 */
public class _IMAGE_RELOCATION {

    public static MemoryLayout $LAYOUT() {
        return constants$399.const$5;
    }
    public static VarHandle VirtualAddress$VH() {
        return constants$400.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD VirtualAddress;
     * }
     */
    public static int VirtualAddress$get(MemorySegment seg) {
        return (int)constants$400.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD VirtualAddress;
     * }
     */
    public static void VirtualAddress$set(MemorySegment seg, int x) {
        constants$400.const$0.set(seg, x);
    }
    public static int VirtualAddress$get(MemorySegment seg, long index) {
        return (int)constants$400.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void VirtualAddress$set(MemorySegment seg, long index, int x) {
        constants$400.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle RelocCount$VH() {
        return constants$400.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RelocCount;
     * }
     */
    public static int RelocCount$get(MemorySegment seg) {
        return (int)constants$400.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RelocCount;
     * }
     */
    public static void RelocCount$set(MemorySegment seg, int x) {
        constants$400.const$1.set(seg, x);
    }
    public static int RelocCount$get(MemorySegment seg, long index) {
        return (int)constants$400.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void RelocCount$set(MemorySegment seg, long index, int x) {
        constants$400.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SymbolTableIndex$VH() {
        return constants$400.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SymbolTableIndex;
     * }
     */
    public static int SymbolTableIndex$get(MemorySegment seg) {
        return (int)constants$400.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SymbolTableIndex;
     * }
     */
    public static void SymbolTableIndex$set(MemorySegment seg, int x) {
        constants$400.const$2.set(seg, x);
    }
    public static int SymbolTableIndex$get(MemorySegment seg, long index) {
        return (int)constants$400.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SymbolTableIndex$set(MemorySegment seg, long index, int x) {
        constants$400.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Type$VH() {
        return constants$400.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Type;
     * }
     */
    public static short Type$get(MemorySegment seg) {
        return (short)constants$400.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, short x) {
        constants$400.const$3.set(seg, x);
    }
    public static short Type$get(MemorySegment seg, long index) {
        return (short)constants$400.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, short x) {
        constants$400.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


