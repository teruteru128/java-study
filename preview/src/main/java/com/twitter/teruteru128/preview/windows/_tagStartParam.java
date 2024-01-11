// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _tagStartParam {
 *     IID iid;
 *     IBindCtx* pIBindCtx;
 *     IUnknown* pItf;
 * };
 * }
 */
public class _tagStartParam {

    public static MemoryLayout $LAYOUT() {
        return constants$4202.const$2;
    }
    public static MemorySegment iid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle pIBindCtx$VH() {
        return constants$4202.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IBindCtx* pIBindCtx;
     * }
     */
    public static MemorySegment pIBindCtx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4202.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IBindCtx* pIBindCtx;
     * }
     */
    public static void pIBindCtx$set(MemorySegment seg, MemorySegment x) {
        constants$4202.const$3.set(seg, x);
    }
    public static MemorySegment pIBindCtx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4202.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pIBindCtx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4202.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pItf$VH() {
        return constants$4202.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IUnknown* pItf;
     * }
     */
    public static MemorySegment pItf$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4202.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IUnknown* pItf;
     * }
     */
    public static void pItf$set(MemorySegment seg, MemorySegment x) {
        constants$4202.const$4.set(seg, x);
    }
    public static MemorySegment pItf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4202.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pItf$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4202.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


