// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCHARSETINFO {
 *     UINT ciCharset;
 *     UINT ciACP;
 *     FONTSIGNATURE fs;
 * };
 * }
 */
public class tagCHARSETINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$906.const$4;
    }
    public static VarHandle ciCharset$VH() {
        return constants$906.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT ciCharset;
     * }
     */
    public static int ciCharset$get(MemorySegment seg) {
        return (int)constants$906.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT ciCharset;
     * }
     */
    public static void ciCharset$set(MemorySegment seg, int x) {
        constants$906.const$5.set(seg, x);
    }
    public static int ciCharset$get(MemorySegment seg, long index) {
        return (int)constants$906.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ciCharset$set(MemorySegment seg, long index, int x) {
        constants$906.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ciACP$VH() {
        return constants$907.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT ciACP;
     * }
     */
    public static int ciACP$get(MemorySegment seg) {
        return (int)constants$907.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT ciACP;
     * }
     */
    public static void ciACP$set(MemorySegment seg, int x) {
        constants$907.const$0.set(seg, x);
    }
    public static int ciACP$get(MemorySegment seg, long index) {
        return (int)constants$907.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ciACP$set(MemorySegment seg, long index, int x) {
        constants$907.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment fs$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


