// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY {
 *     DWORD EntryLength;
 *     DWORD DependencyTypeFlags;
 *     DWORD ProviderSpecificFlags;
 *     VIRTUAL_STORAGE_TYPE VirtualStorageType;
 * };
 * }
 */
public class _STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY {

    public static MemoryLayout $LAYOUT() {
        return constants$2667.const$1;
    }
    public static VarHandle EntryLength$VH() {
        return constants$2667.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD EntryLength;
     * }
     */
    public static int EntryLength$get(MemorySegment seg) {
        return (int)constants$2667.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD EntryLength;
     * }
     */
    public static void EntryLength$set(MemorySegment seg, int x) {
        constants$2667.const$2.set(seg, x);
    }
    public static int EntryLength$get(MemorySegment seg, long index) {
        return (int)constants$2667.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void EntryLength$set(MemorySegment seg, long index, int x) {
        constants$2667.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DependencyTypeFlags$VH() {
        return constants$2667.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DependencyTypeFlags;
     * }
     */
    public static int DependencyTypeFlags$get(MemorySegment seg) {
        return (int)constants$2667.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DependencyTypeFlags;
     * }
     */
    public static void DependencyTypeFlags$set(MemorySegment seg, int x) {
        constants$2667.const$3.set(seg, x);
    }
    public static int DependencyTypeFlags$get(MemorySegment seg, long index) {
        return (int)constants$2667.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void DependencyTypeFlags$set(MemorySegment seg, long index, int x) {
        constants$2667.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ProviderSpecificFlags$VH() {
        return constants$2667.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ProviderSpecificFlags;
     * }
     */
    public static int ProviderSpecificFlags$get(MemorySegment seg) {
        return (int)constants$2667.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ProviderSpecificFlags;
     * }
     */
    public static void ProviderSpecificFlags$set(MemorySegment seg, int x) {
        constants$2667.const$4.set(seg, x);
    }
    public static int ProviderSpecificFlags$get(MemorySegment seg, long index) {
        return (int)constants$2667.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ProviderSpecificFlags$set(MemorySegment seg, long index, int x) {
        constants$2667.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment VirtualStorageType$slice(MemorySegment seg) {
        return seg.asSlice(12, 20);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


