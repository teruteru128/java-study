// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO {
 *     GUID DeviceGuid;
 *     DWORD DeviceNumber;
 *     struct  Flags;
 *     DWORDLONG DeviceSize;
 * };
 * }
 */
public class _SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2510.const$4;
    }
    public static MemorySegment DeviceGuid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle DeviceNumber$VH() {
        return constants$2510.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DeviceNumber;
     * }
     */
    public static int DeviceNumber$get(MemorySegment seg) {
        return (int)constants$2510.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DeviceNumber;
     * }
     */
    public static void DeviceNumber$set(MemorySegment seg, int x) {
        constants$2510.const$5.set(seg, x);
    }
    public static int DeviceNumber$get(MemorySegment seg, long index) {
        return (int)constants$2510.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceNumber$set(MemorySegment seg, long index, int x) {
        constants$2510.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *          *     DWORD ForcedByRegistry;
     *     DWORD Initialized;
     *     DWORD Reserved;
     * };
     * }
     */
    public static final class Flags {

        // Suppresses default constructor, ensuring non-instantiability.
        private Flags() {}
        public static MemoryLayout $LAYOUT() {
            return constants$128.const$3;
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment Flags$slice(MemorySegment seg) {
        return seg.asSlice(20, 4);
    }
    public static VarHandle DeviceSize$VH() {
        return constants$2511.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG DeviceSize;
     * }
     */
    public static long DeviceSize$get(MemorySegment seg) {
        return (long)constants$2511.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG DeviceSize;
     * }
     */
    public static void DeviceSize$set(MemorySegment seg, long x) {
        constants$2511.const$0.set(seg, x);
    }
    public static long DeviceSize$get(MemorySegment seg, long index) {
        return (long)constants$2511.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceSize$set(MemorySegment seg, long index, long x) {
        constants$2511.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


