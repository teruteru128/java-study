// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagENUMLOGFONTEXDVA {
 *     ENUMLOGFONTEXA elfEnumLogfontEx;
 *     DESIGNVECTOR elfDesignVector;
 * };
 * }
 */
public class tagENUMLOGFONTEXDVA {

    public static MemoryLayout $LAYOUT() {
        return constants$1027.const$1;
    }
    public static MemorySegment elfEnumLogfontEx$slice(MemorySegment seg) {
        return seg.asSlice(0, 188);
    }
    public static MemorySegment elfDesignVector$slice(MemorySegment seg) {
        return seg.asSlice(188, 72);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


