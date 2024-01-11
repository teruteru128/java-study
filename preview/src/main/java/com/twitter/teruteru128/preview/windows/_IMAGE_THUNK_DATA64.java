// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_THUNK_DATA64 {
 *     union  u1;
 * };
 * }
 */
public class _IMAGE_THUNK_DATA64 {

    public static MemoryLayout $LAYOUT() {
        return constants$404.const$3;
    }
    /**
     * {@snippet :
     * union {
     *     ULONGLONG ForwarderString;
     *     ULONGLONG Function;
     *     ULONGLONG Ordinal;
     *     ULONGLONG AddressOfData;
     * };
     * }
     */
    public static final class u1 {

        // Suppresses default constructor, ensuring non-instantiability.
        private u1() {}
        public static MemoryLayout $LAYOUT() {
            return constants$404.const$4;
        }
        public static VarHandle ForwarderString$VH() {
            return constants$404.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * ULONGLONG ForwarderString;
         * }
         */
        public static long ForwarderString$get(MemorySegment seg) {
            return (long)constants$404.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * ULONGLONG ForwarderString;
         * }
         */
        public static void ForwarderString$set(MemorySegment seg, long x) {
            constants$404.const$5.set(seg, x);
        }
        public static long ForwarderString$get(MemorySegment seg, long index) {
            return (long)constants$404.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void ForwarderString$set(MemorySegment seg, long index, long x) {
            constants$404.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Function$VH() {
            return constants$405.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * ULONGLONG Function;
         * }
         */
        public static long Function$get(MemorySegment seg) {
            return (long)constants$405.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * ULONGLONG Function;
         * }
         */
        public static void Function$set(MemorySegment seg, long x) {
            constants$405.const$0.set(seg, x);
        }
        public static long Function$get(MemorySegment seg, long index) {
            return (long)constants$405.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void Function$set(MemorySegment seg, long index, long x) {
            constants$405.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Ordinal$VH() {
            return constants$405.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * ULONGLONG Ordinal;
         * }
         */
        public static long Ordinal$get(MemorySegment seg) {
            return (long)constants$405.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * ULONGLONG Ordinal;
         * }
         */
        public static void Ordinal$set(MemorySegment seg, long x) {
            constants$405.const$1.set(seg, x);
        }
        public static long Ordinal$get(MemorySegment seg, long index) {
            return (long)constants$405.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void Ordinal$set(MemorySegment seg, long index, long x) {
            constants$405.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle AddressOfData$VH() {
            return constants$405.const$2;
        }
        /**
         * Getter for field:
         * {@snippet :
         * ULONGLONG AddressOfData;
         * }
         */
        public static long AddressOfData$get(MemorySegment seg) {
            return (long)constants$405.const$2.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * ULONGLONG AddressOfData;
         * }
         */
        public static void AddressOfData$set(MemorySegment seg, long x) {
            constants$405.const$2.set(seg, x);
        }
        public static long AddressOfData$get(MemorySegment seg, long index) {
            return (long)constants$405.const$2.get(seg.asSlice(index*sizeof()));
        }
        public static void AddressOfData$set(MemorySegment seg, long index, long x) {
            constants$405.const$2.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment u1$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


