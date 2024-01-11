// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _KNONVOLATILE_CONTEXT_POINTERS_ARM64 {
 *     PDWORD64 X19;
 *     PDWORD64 X20;
 *     PDWORD64 X21;
 *     PDWORD64 X22;
 *     PDWORD64 X23;
 *     PDWORD64 X24;
 *     PDWORD64 X25;
 *     PDWORD64 X26;
 *     PDWORD64 X27;
 *     PDWORD64 X28;
 *     PDWORD64 Fp;
 *     PDWORD64 Lr;
 *     PDWORD64 D8;
 *     PDWORD64 D9;
 *     PDWORD64 D10;
 *     PDWORD64 D11;
 *     PDWORD64 D12;
 *     PDWORD64 D13;
 *     PDWORD64 D14;
 *     PDWORD64 D15;
 * };
 * }
 */
public class _KNONVOLATILE_CONTEXT_POINTERS_ARM64 {

    public static MemoryLayout $LAYOUT() {
        return constants$123.const$2;
    }
    public static VarHandle X19$VH() {
        return constants$123.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X19;
     * }
     */
    public static MemorySegment X19$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$123.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X19;
     * }
     */
    public static void X19$set(MemorySegment seg, MemorySegment x) {
        constants$123.const$3.set(seg, x);
    }
    public static MemorySegment X19$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$123.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void X19$set(MemorySegment seg, long index, MemorySegment x) {
        constants$123.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X20$VH() {
        return constants$123.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X20;
     * }
     */
    public static MemorySegment X20$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$123.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X20;
     * }
     */
    public static void X20$set(MemorySegment seg, MemorySegment x) {
        constants$123.const$4.set(seg, x);
    }
    public static MemorySegment X20$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$123.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void X20$set(MemorySegment seg, long index, MemorySegment x) {
        constants$123.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X21$VH() {
        return constants$123.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X21;
     * }
     */
    public static MemorySegment X21$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$123.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X21;
     * }
     */
    public static void X21$set(MemorySegment seg, MemorySegment x) {
        constants$123.const$5.set(seg, x);
    }
    public static MemorySegment X21$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$123.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void X21$set(MemorySegment seg, long index, MemorySegment x) {
        constants$123.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X22$VH() {
        return constants$124.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X22;
     * }
     */
    public static MemorySegment X22$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$124.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X22;
     * }
     */
    public static void X22$set(MemorySegment seg, MemorySegment x) {
        constants$124.const$0.set(seg, x);
    }
    public static MemorySegment X22$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$124.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void X22$set(MemorySegment seg, long index, MemorySegment x) {
        constants$124.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X23$VH() {
        return constants$124.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X23;
     * }
     */
    public static MemorySegment X23$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$124.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X23;
     * }
     */
    public static void X23$set(MemorySegment seg, MemorySegment x) {
        constants$124.const$1.set(seg, x);
    }
    public static MemorySegment X23$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$124.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void X23$set(MemorySegment seg, long index, MemorySegment x) {
        constants$124.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X24$VH() {
        return constants$124.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X24;
     * }
     */
    public static MemorySegment X24$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$124.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X24;
     * }
     */
    public static void X24$set(MemorySegment seg, MemorySegment x) {
        constants$124.const$2.set(seg, x);
    }
    public static MemorySegment X24$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$124.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void X24$set(MemorySegment seg, long index, MemorySegment x) {
        constants$124.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X25$VH() {
        return constants$124.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X25;
     * }
     */
    public static MemorySegment X25$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$124.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X25;
     * }
     */
    public static void X25$set(MemorySegment seg, MemorySegment x) {
        constants$124.const$3.set(seg, x);
    }
    public static MemorySegment X25$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$124.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void X25$set(MemorySegment seg, long index, MemorySegment x) {
        constants$124.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X26$VH() {
        return constants$124.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X26;
     * }
     */
    public static MemorySegment X26$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$124.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X26;
     * }
     */
    public static void X26$set(MemorySegment seg, MemorySegment x) {
        constants$124.const$4.set(seg, x);
    }
    public static MemorySegment X26$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$124.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void X26$set(MemorySegment seg, long index, MemorySegment x) {
        constants$124.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X27$VH() {
        return constants$124.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X27;
     * }
     */
    public static MemorySegment X27$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$124.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X27;
     * }
     */
    public static void X27$set(MemorySegment seg, MemorySegment x) {
        constants$124.const$5.set(seg, x);
    }
    public static MemorySegment X27$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$124.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void X27$set(MemorySegment seg, long index, MemorySegment x) {
        constants$124.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X28$VH() {
        return constants$125.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 X28;
     * }
     */
    public static MemorySegment X28$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$125.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 X28;
     * }
     */
    public static void X28$set(MemorySegment seg, MemorySegment x) {
        constants$125.const$0.set(seg, x);
    }
    public static MemorySegment X28$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$125.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void X28$set(MemorySegment seg, long index, MemorySegment x) {
        constants$125.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Fp$VH() {
        return constants$125.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 Fp;
     * }
     */
    public static MemorySegment Fp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$125.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 Fp;
     * }
     */
    public static void Fp$set(MemorySegment seg, MemorySegment x) {
        constants$125.const$1.set(seg, x);
    }
    public static MemorySegment Fp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$125.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Fp$set(MemorySegment seg, long index, MemorySegment x) {
        constants$125.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Lr$VH() {
        return constants$125.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 Lr;
     * }
     */
    public static MemorySegment Lr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$125.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 Lr;
     * }
     */
    public static void Lr$set(MemorySegment seg, MemorySegment x) {
        constants$125.const$2.set(seg, x);
    }
    public static MemorySegment Lr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$125.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Lr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$125.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D8$VH() {
        return constants$125.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 D8;
     * }
     */
    public static MemorySegment D8$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$125.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 D8;
     * }
     */
    public static void D8$set(MemorySegment seg, MemorySegment x) {
        constants$125.const$3.set(seg, x);
    }
    public static MemorySegment D8$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$125.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void D8$set(MemorySegment seg, long index, MemorySegment x) {
        constants$125.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D9$VH() {
        return constants$125.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 D9;
     * }
     */
    public static MemorySegment D9$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$125.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 D9;
     * }
     */
    public static void D9$set(MemorySegment seg, MemorySegment x) {
        constants$125.const$4.set(seg, x);
    }
    public static MemorySegment D9$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$125.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void D9$set(MemorySegment seg, long index, MemorySegment x) {
        constants$125.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D10$VH() {
        return constants$125.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 D10;
     * }
     */
    public static MemorySegment D10$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$125.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 D10;
     * }
     */
    public static void D10$set(MemorySegment seg, MemorySegment x) {
        constants$125.const$5.set(seg, x);
    }
    public static MemorySegment D10$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$125.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void D10$set(MemorySegment seg, long index, MemorySegment x) {
        constants$125.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D11$VH() {
        return constants$126.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 D11;
     * }
     */
    public static MemorySegment D11$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 D11;
     * }
     */
    public static void D11$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$0.set(seg, x);
    }
    public static MemorySegment D11$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void D11$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D12$VH() {
        return constants$126.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 D12;
     * }
     */
    public static MemorySegment D12$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 D12;
     * }
     */
    public static void D12$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$1.set(seg, x);
    }
    public static MemorySegment D12$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void D12$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D13$VH() {
        return constants$126.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 D13;
     * }
     */
    public static MemorySegment D13$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 D13;
     * }
     */
    public static void D13$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$2.set(seg, x);
    }
    public static MemorySegment D13$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void D13$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D14$VH() {
        return constants$126.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 D14;
     * }
     */
    public static MemorySegment D14$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 D14;
     * }
     */
    public static void D14$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$3.set(seg, x);
    }
    public static MemorySegment D14$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void D14$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle D15$VH() {
        return constants$126.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PDWORD64 D15;
     * }
     */
    public static MemorySegment D15$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$126.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PDWORD64 D15;
     * }
     */
    public static void D15$set(MemorySegment seg, MemorySegment x) {
        constants$126.const$4.set(seg, x);
    }
    public static MemorySegment D15$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$126.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void D15$set(MemorySegment seg, long index, MemorySegment x) {
        constants$126.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

