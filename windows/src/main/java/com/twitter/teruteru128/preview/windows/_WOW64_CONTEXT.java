// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _WOW64_CONTEXT {
 *     DWORD ContextFlags;
 *     DWORD Dr0;
 *     DWORD Dr1;
 *     DWORD Dr2;
 *     DWORD Dr3;
 *     DWORD Dr6;
 *     DWORD Dr7;
 *     WOW64_FLOATING_SAVE_AREA FloatSave;
 *     DWORD SegGs;
 *     DWORD SegFs;
 *     DWORD SegEs;
 *     DWORD SegDs;
 *     DWORD Edi;
 *     DWORD Esi;
 *     DWORD Ebx;
 *     DWORD Edx;
 *     DWORD Ecx;
 *     DWORD Eax;
 *     DWORD Ebp;
 *     DWORD Eip;
 *     DWORD SegCs;
 *     DWORD EFlags;
 *     DWORD Esp;
 *     DWORD SegSs;
 *     BYTE ExtendedRegisters[512];
 * };
 * }
 */
public class _WOW64_CONTEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$130.const$1;
    }
    public static VarHandle ContextFlags$VH() {
        return constants$130.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ContextFlags;
     * }
     */
    public static int ContextFlags$get(MemorySegment seg) {
        return (int)constants$130.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ContextFlags;
     * }
     */
    public static void ContextFlags$set(MemorySegment seg, int x) {
        constants$130.const$2.set(seg, x);
    }
    public static int ContextFlags$get(MemorySegment seg, long index) {
        return (int)constants$130.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextFlags$set(MemorySegment seg, long index, int x) {
        constants$130.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Dr0$VH() {
        return constants$130.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Dr0;
     * }
     */
    public static int Dr0$get(MemorySegment seg) {
        return (int)constants$130.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Dr0;
     * }
     */
    public static void Dr0$set(MemorySegment seg, int x) {
        constants$130.const$3.set(seg, x);
    }
    public static int Dr0$get(MemorySegment seg, long index) {
        return (int)constants$130.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr0$set(MemorySegment seg, long index, int x) {
        constants$130.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Dr1$VH() {
        return constants$130.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Dr1;
     * }
     */
    public static int Dr1$get(MemorySegment seg) {
        return (int)constants$130.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Dr1;
     * }
     */
    public static void Dr1$set(MemorySegment seg, int x) {
        constants$130.const$4.set(seg, x);
    }
    public static int Dr1$get(MemorySegment seg, long index) {
        return (int)constants$130.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr1$set(MemorySegment seg, long index, int x) {
        constants$130.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Dr2$VH() {
        return constants$130.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Dr2;
     * }
     */
    public static int Dr2$get(MemorySegment seg) {
        return (int)constants$130.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Dr2;
     * }
     */
    public static void Dr2$set(MemorySegment seg, int x) {
        constants$130.const$5.set(seg, x);
    }
    public static int Dr2$get(MemorySegment seg, long index) {
        return (int)constants$130.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr2$set(MemorySegment seg, long index, int x) {
        constants$130.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Dr3$VH() {
        return constants$131.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Dr3;
     * }
     */
    public static int Dr3$get(MemorySegment seg) {
        return (int)constants$131.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Dr3;
     * }
     */
    public static void Dr3$set(MemorySegment seg, int x) {
        constants$131.const$0.set(seg, x);
    }
    public static int Dr3$get(MemorySegment seg, long index) {
        return (int)constants$131.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr3$set(MemorySegment seg, long index, int x) {
        constants$131.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Dr6$VH() {
        return constants$131.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Dr6;
     * }
     */
    public static int Dr6$get(MemorySegment seg) {
        return (int)constants$131.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Dr6;
     * }
     */
    public static void Dr6$set(MemorySegment seg, int x) {
        constants$131.const$1.set(seg, x);
    }
    public static int Dr6$get(MemorySegment seg, long index) {
        return (int)constants$131.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr6$set(MemorySegment seg, long index, int x) {
        constants$131.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Dr7$VH() {
        return constants$131.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Dr7;
     * }
     */
    public static int Dr7$get(MemorySegment seg) {
        return (int)constants$131.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Dr7;
     * }
     */
    public static void Dr7$set(MemorySegment seg, int x) {
        constants$131.const$2.set(seg, x);
    }
    public static int Dr7$get(MemorySegment seg, long index) {
        return (int)constants$131.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Dr7$set(MemorySegment seg, long index, int x) {
        constants$131.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FloatSave$slice(MemorySegment seg) {
        return seg.asSlice(28, 112);
    }
    public static VarHandle SegGs$VH() {
        return constants$131.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SegGs;
     * }
     */
    public static int SegGs$get(MemorySegment seg) {
        return (int)constants$131.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SegGs;
     * }
     */
    public static void SegGs$set(MemorySegment seg, int x) {
        constants$131.const$3.set(seg, x);
    }
    public static int SegGs$get(MemorySegment seg, long index) {
        return (int)constants$131.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SegGs$set(MemorySegment seg, long index, int x) {
        constants$131.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SegFs$VH() {
        return constants$131.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SegFs;
     * }
     */
    public static int SegFs$get(MemorySegment seg) {
        return (int)constants$131.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SegFs;
     * }
     */
    public static void SegFs$set(MemorySegment seg, int x) {
        constants$131.const$4.set(seg, x);
    }
    public static int SegFs$get(MemorySegment seg, long index) {
        return (int)constants$131.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void SegFs$set(MemorySegment seg, long index, int x) {
        constants$131.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SegEs$VH() {
        return constants$131.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SegEs;
     * }
     */
    public static int SegEs$get(MemorySegment seg) {
        return (int)constants$131.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SegEs;
     * }
     */
    public static void SegEs$set(MemorySegment seg, int x) {
        constants$131.const$5.set(seg, x);
    }
    public static int SegEs$get(MemorySegment seg, long index) {
        return (int)constants$131.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SegEs$set(MemorySegment seg, long index, int x) {
        constants$131.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SegDs$VH() {
        return constants$132.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SegDs;
     * }
     */
    public static int SegDs$get(MemorySegment seg) {
        return (int)constants$132.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SegDs;
     * }
     */
    public static void SegDs$set(MemorySegment seg, int x) {
        constants$132.const$0.set(seg, x);
    }
    public static int SegDs$get(MemorySegment seg, long index) {
        return (int)constants$132.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SegDs$set(MemorySegment seg, long index, int x) {
        constants$132.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Edi$VH() {
        return constants$132.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Edi;
     * }
     */
    public static int Edi$get(MemorySegment seg) {
        return (int)constants$132.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Edi;
     * }
     */
    public static void Edi$set(MemorySegment seg, int x) {
        constants$132.const$1.set(seg, x);
    }
    public static int Edi$get(MemorySegment seg, long index) {
        return (int)constants$132.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Edi$set(MemorySegment seg, long index, int x) {
        constants$132.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Esi$VH() {
        return constants$132.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Esi;
     * }
     */
    public static int Esi$get(MemorySegment seg) {
        return (int)constants$132.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Esi;
     * }
     */
    public static void Esi$set(MemorySegment seg, int x) {
        constants$132.const$2.set(seg, x);
    }
    public static int Esi$get(MemorySegment seg, long index) {
        return (int)constants$132.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Esi$set(MemorySegment seg, long index, int x) {
        constants$132.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Ebx$VH() {
        return constants$132.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Ebx;
     * }
     */
    public static int Ebx$get(MemorySegment seg) {
        return (int)constants$132.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Ebx;
     * }
     */
    public static void Ebx$set(MemorySegment seg, int x) {
        constants$132.const$3.set(seg, x);
    }
    public static int Ebx$get(MemorySegment seg, long index) {
        return (int)constants$132.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Ebx$set(MemorySegment seg, long index, int x) {
        constants$132.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Edx$VH() {
        return constants$132.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Edx;
     * }
     */
    public static int Edx$get(MemorySegment seg) {
        return (int)constants$132.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Edx;
     * }
     */
    public static void Edx$set(MemorySegment seg, int x) {
        constants$132.const$4.set(seg, x);
    }
    public static int Edx$get(MemorySegment seg, long index) {
        return (int)constants$132.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Edx$set(MemorySegment seg, long index, int x) {
        constants$132.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Ecx$VH() {
        return constants$132.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Ecx;
     * }
     */
    public static int Ecx$get(MemorySegment seg) {
        return (int)constants$132.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Ecx;
     * }
     */
    public static void Ecx$set(MemorySegment seg, int x) {
        constants$132.const$5.set(seg, x);
    }
    public static int Ecx$get(MemorySegment seg, long index) {
        return (int)constants$132.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Ecx$set(MemorySegment seg, long index, int x) {
        constants$132.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Eax$VH() {
        return constants$133.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Eax;
     * }
     */
    public static int Eax$get(MemorySegment seg) {
        return (int)constants$133.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Eax;
     * }
     */
    public static void Eax$set(MemorySegment seg, int x) {
        constants$133.const$0.set(seg, x);
    }
    public static int Eax$get(MemorySegment seg, long index) {
        return (int)constants$133.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Eax$set(MemorySegment seg, long index, int x) {
        constants$133.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Ebp$VH() {
        return constants$133.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Ebp;
     * }
     */
    public static int Ebp$get(MemorySegment seg) {
        return (int)constants$133.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Ebp;
     * }
     */
    public static void Ebp$set(MemorySegment seg, int x) {
        constants$133.const$1.set(seg, x);
    }
    public static int Ebp$get(MemorySegment seg, long index) {
        return (int)constants$133.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Ebp$set(MemorySegment seg, long index, int x) {
        constants$133.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Eip$VH() {
        return constants$133.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Eip;
     * }
     */
    public static int Eip$get(MemorySegment seg) {
        return (int)constants$133.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Eip;
     * }
     */
    public static void Eip$set(MemorySegment seg, int x) {
        constants$133.const$2.set(seg, x);
    }
    public static int Eip$get(MemorySegment seg, long index) {
        return (int)constants$133.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Eip$set(MemorySegment seg, long index, int x) {
        constants$133.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SegCs$VH() {
        return constants$133.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SegCs;
     * }
     */
    public static int SegCs$get(MemorySegment seg) {
        return (int)constants$133.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SegCs;
     * }
     */
    public static void SegCs$set(MemorySegment seg, int x) {
        constants$133.const$3.set(seg, x);
    }
    public static int SegCs$get(MemorySegment seg, long index) {
        return (int)constants$133.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SegCs$set(MemorySegment seg, long index, int x) {
        constants$133.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle EFlags$VH() {
        return constants$133.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD EFlags;
     * }
     */
    public static int EFlags$get(MemorySegment seg) {
        return (int)constants$133.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD EFlags;
     * }
     */
    public static void EFlags$set(MemorySegment seg, int x) {
        constants$133.const$4.set(seg, x);
    }
    public static int EFlags$get(MemorySegment seg, long index) {
        return (int)constants$133.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void EFlags$set(MemorySegment seg, long index, int x) {
        constants$133.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Esp$VH() {
        return constants$133.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Esp;
     * }
     */
    public static int Esp$get(MemorySegment seg) {
        return (int)constants$133.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Esp;
     * }
     */
    public static void Esp$set(MemorySegment seg, int x) {
        constants$133.const$5.set(seg, x);
    }
    public static int Esp$get(MemorySegment seg, long index) {
        return (int)constants$133.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Esp$set(MemorySegment seg, long index, int x) {
        constants$133.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SegSs$VH() {
        return constants$134.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SegSs;
     * }
     */
    public static int SegSs$get(MemorySegment seg) {
        return (int)constants$134.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SegSs;
     * }
     */
    public static void SegSs$set(MemorySegment seg, int x) {
        constants$134.const$0.set(seg, x);
    }
    public static int SegSs$get(MemorySegment seg, long index) {
        return (int)constants$134.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SegSs$set(MemorySegment seg, long index, int x) {
        constants$134.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ExtendedRegisters$slice(MemorySegment seg) {
        return seg.asSlice(204, 512);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

