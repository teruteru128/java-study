// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMETHODDATA {
 *     OLECHAR* szName;
 *     PARAMDATA* ppdata;
 *     DISPID dispid;
 *     UINT iMeth;
 *     CALLCONV cc;
 *     UINT cArgs;
 *     WORD wFlags;
 *     VARTYPE vtReturn;
 * };
 * }
 */
public class tagMETHODDATA {

    public static MemoryLayout $LAYOUT() {
        return constants$4396.const$4;
    }
    public static VarHandle szName$VH() {
        return constants$4396.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * OLECHAR* szName;
     * }
     */
    public static MemorySegment szName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4396.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * OLECHAR* szName;
     * }
     */
    public static void szName$set(MemorySegment seg, MemorySegment x) {
        constants$4396.const$5.set(seg, x);
    }
    public static MemorySegment szName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4396.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void szName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4396.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ppdata$VH() {
        return constants$4397.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PARAMDATA* ppdata;
     * }
     */
    public static MemorySegment ppdata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4397.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PARAMDATA* ppdata;
     * }
     */
    public static void ppdata$set(MemorySegment seg, MemorySegment x) {
        constants$4397.const$0.set(seg, x);
    }
    public static MemorySegment ppdata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4397.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ppdata$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4397.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dispid$VH() {
        return constants$4397.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DISPID dispid;
     * }
     */
    public static int dispid$get(MemorySegment seg) {
        return (int)constants$4397.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DISPID dispid;
     * }
     */
    public static void dispid$set(MemorySegment seg, int x) {
        constants$4397.const$1.set(seg, x);
    }
    public static int dispid$get(MemorySegment seg, long index) {
        return (int)constants$4397.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dispid$set(MemorySegment seg, long index, int x) {
        constants$4397.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iMeth$VH() {
        return constants$4397.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT iMeth;
     * }
     */
    public static int iMeth$get(MemorySegment seg) {
        return (int)constants$4397.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT iMeth;
     * }
     */
    public static void iMeth$set(MemorySegment seg, int x) {
        constants$4397.const$2.set(seg, x);
    }
    public static int iMeth$get(MemorySegment seg, long index) {
        return (int)constants$4397.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void iMeth$set(MemorySegment seg, long index, int x) {
        constants$4397.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cc$VH() {
        return constants$4397.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CALLCONV cc;
     * }
     */
    public static int cc$get(MemorySegment seg) {
        return (int)constants$4397.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CALLCONV cc;
     * }
     */
    public static void cc$set(MemorySegment seg, int x) {
        constants$4397.const$3.set(seg, x);
    }
    public static int cc$get(MemorySegment seg, long index) {
        return (int)constants$4397.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cc$set(MemorySegment seg, long index, int x) {
        constants$4397.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cArgs$VH() {
        return constants$4397.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cArgs;
     * }
     */
    public static int cArgs$get(MemorySegment seg) {
        return (int)constants$4397.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cArgs;
     * }
     */
    public static void cArgs$set(MemorySegment seg, int x) {
        constants$4397.const$4.set(seg, x);
    }
    public static int cArgs$get(MemorySegment seg, long index) {
        return (int)constants$4397.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cArgs$set(MemorySegment seg, long index, int x) {
        constants$4397.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wFlags$VH() {
        return constants$4397.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wFlags;
     * }
     */
    public static short wFlags$get(MemorySegment seg) {
        return (short)constants$4397.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wFlags;
     * }
     */
    public static void wFlags$set(MemorySegment seg, short x) {
        constants$4397.const$5.set(seg, x);
    }
    public static short wFlags$get(MemorySegment seg, long index) {
        return (short)constants$4397.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wFlags$set(MemorySegment seg, long index, short x) {
        constants$4397.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vtReturn$VH() {
        return constants$4398.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VARTYPE vtReturn;
     * }
     */
    public static short vtReturn$get(MemorySegment seg) {
        return (short)constants$4398.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VARTYPE vtReturn;
     * }
     */
    public static void vtReturn$set(MemorySegment seg, short x) {
        constants$4398.const$0.set(seg, x);
    }
    public static short vtReturn$get(MemorySegment seg, long index) {
        return (short)constants$4398.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void vtReturn$set(MemorySegment seg, long index, short x) {
        constants$4398.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


