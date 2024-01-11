// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMULTIKEYHELPW {
 *     DWORD mkSize;
 *     WCHAR mkKeylist;
 *     WCHAR szKeyphrase[1];
 * };
 * }
 */
public class tagMULTIKEYHELPW {

    public static MemoryLayout $LAYOUT() {
        return constants$1334.const$0;
    }
    public static VarHandle mkSize$VH() {
        return constants$1334.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD mkSize;
     * }
     */
    public static int mkSize$get(MemorySegment seg) {
        return (int)constants$1334.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD mkSize;
     * }
     */
    public static void mkSize$set(MemorySegment seg, int x) {
        constants$1334.const$1.set(seg, x);
    }
    public static int mkSize$get(MemorySegment seg, long index) {
        return (int)constants$1334.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void mkSize$set(MemorySegment seg, long index, int x) {
        constants$1334.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mkKeylist$VH() {
        return constants$1334.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WCHAR mkKeylist;
     * }
     */
    public static short mkKeylist$get(MemorySegment seg) {
        return (short)constants$1334.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WCHAR mkKeylist;
     * }
     */
    public static void mkKeylist$set(MemorySegment seg, short x) {
        constants$1334.const$2.set(seg, x);
    }
    public static short mkKeylist$get(MemorySegment seg, long index) {
        return (short)constants$1334.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void mkKeylist$set(MemorySegment seg, long index, short x) {
        constants$1334.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szKeyphrase$slice(MemorySegment seg) {
        return seg.asSlice(6, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


