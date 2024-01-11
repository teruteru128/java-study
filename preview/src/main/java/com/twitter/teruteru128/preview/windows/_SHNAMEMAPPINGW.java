// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SHNAMEMAPPINGW {
 *     LPWSTR pszOldPath;
 *     LPWSTR pszNewPath;
 *     int cchOldPath;
 *     int cchNewPath;
 * };
 * }
 */
public class _SHNAMEMAPPINGW {

    public static MemoryLayout $LAYOUT() {
        return constants$1861.const$4;
    }
    public static VarHandle pszOldPath$VH() {
        return constants$1861.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszOldPath;
     * }
     */
    public static MemorySegment pszOldPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1861.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszOldPath;
     * }
     */
    public static void pszOldPath$set(MemorySegment seg, MemorySegment x) {
        constants$1861.const$5.set(seg, x);
    }
    public static MemorySegment pszOldPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1861.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOldPath$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1861.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszNewPath$VH() {
        return constants$1862.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszNewPath;
     * }
     */
    public static MemorySegment pszNewPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1862.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszNewPath;
     * }
     */
    public static void pszNewPath$set(MemorySegment seg, MemorySegment x) {
        constants$1862.const$0.set(seg, x);
    }
    public static MemorySegment pszNewPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1862.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pszNewPath$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1862.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cchOldPath$VH() {
        return constants$1862.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cchOldPath;
     * }
     */
    public static int cchOldPath$get(MemorySegment seg) {
        return (int)constants$1862.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cchOldPath;
     * }
     */
    public static void cchOldPath$set(MemorySegment seg, int x) {
        constants$1862.const$1.set(seg, x);
    }
    public static int cchOldPath$get(MemorySegment seg, long index) {
        return (int)constants$1862.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cchOldPath$set(MemorySegment seg, long index, int x) {
        constants$1862.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cchNewPath$VH() {
        return constants$1862.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cchNewPath;
     * }
     */
    public static int cchNewPath$get(MemorySegment seg) {
        return (int)constants$1862.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cchNewPath;
     * }
     */
    public static void cchNewPath$set(MemorySegment seg, int x) {
        constants$1862.const$2.set(seg, x);
    }
    public static int cchNewPath$get(MemorySegment seg, long index) {
        return (int)constants$1862.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cchNewPath$set(MemorySegment seg, long index, int x) {
        constants$1862.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

