// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _VOLUME_GET_GPT_ATTRIBUTES_INFORMATION {
 *     DWORDLONG GptAttributes;
 * };
 * }
 */
public class _VOLUME_GET_GPT_ATTRIBUTES_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$2742.const$3;
    }
    public static VarHandle GptAttributes$VH() {
        return constants$2742.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG GptAttributes;
     * }
     */
    public static long GptAttributes$get(MemorySegment seg) {
        return (long)constants$2742.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG GptAttributes;
     * }
     */
    public static void GptAttributes$set(MemorySegment seg, long x) {
        constants$2742.const$4.set(seg, x);
    }
    public static long GptAttributes$get(MemorySegment seg, long index) {
        return (long)constants$2742.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void GptAttributes$set(MemorySegment seg, long index, long x) {
        constants$2742.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


