// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_POLICY_ENTRY {
 *     IMAGE_POLICY_ENTRY_TYPE Type;
 *     IMAGE_POLICY_ID PolicyId;
 *     union  u;
 * };
 * }
 */
public class _IMAGE_POLICY_ENTRY {

    public static MemoryLayout $LAYOUT() {
        return constants$487.const$1;
    }
    public static VarHandle Type$VH() {
        return constants$487.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IMAGE_POLICY_ENTRY_TYPE Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)constants$487.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IMAGE_POLICY_ENTRY_TYPE Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        constants$487.const$2.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)constants$487.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        constants$487.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PolicyId$VH() {
        return constants$487.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IMAGE_POLICY_ID PolicyId;
     * }
     */
    public static int PolicyId$get(MemorySegment seg) {
        return (int)constants$487.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IMAGE_POLICY_ID PolicyId;
     * }
     */
    public static void PolicyId$set(MemorySegment seg, int x) {
        constants$487.const$3.set(seg, x);
    }
    public static int PolicyId$get(MemorySegment seg, long index) {
        return (int)constants$487.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void PolicyId$set(MemorySegment seg, long index, int x) {
        constants$487.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     void* None;
     *     BOOLEAN BoolValue;
     *     INT8 Int8Value;
     *     UINT8 UInt8Value;
     *     INT16 Int16Value;
     *     UINT16 UInt16Value;
     *     INT32 Int32Value;
     *     UINT32 UInt32Value;
     *     INT64 Int64Value;
     *     UINT64 UInt64Value;
     *     PCSTR AnsiStringValue;
     *     PCWSTR UnicodeStringValue;
     * };
     * }
     */
    public static final class u {

        // Suppresses default constructor, ensuring non-instantiability.
        private u() {}
        public static MemoryLayout $LAYOUT() {
            return constants$487.const$4;
        }
        public static VarHandle None$VH() {
            return constants$487.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * void* None;
         * }
         */
        public static MemorySegment None$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$487.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * void* None;
         * }
         */
        public static void None$set(MemorySegment seg, MemorySegment x) {
            constants$487.const$5.set(seg, x);
        }
        public static MemorySegment None$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$487.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void None$set(MemorySegment seg, long index, MemorySegment x) {
            constants$487.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle BoolValue$VH() {
            return constants$488.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * BOOLEAN BoolValue;
         * }
         */
        public static byte BoolValue$get(MemorySegment seg) {
            return (byte)constants$488.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * BOOLEAN BoolValue;
         * }
         */
        public static void BoolValue$set(MemorySegment seg, byte x) {
            constants$488.const$0.set(seg, x);
        }
        public static byte BoolValue$get(MemorySegment seg, long index) {
            return (byte)constants$488.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void BoolValue$set(MemorySegment seg, long index, byte x) {
            constants$488.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Int8Value$VH() {
            return constants$488.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * INT8 Int8Value;
         * }
         */
        public static byte Int8Value$get(MemorySegment seg) {
            return (byte)constants$488.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * INT8 Int8Value;
         * }
         */
        public static void Int8Value$set(MemorySegment seg, byte x) {
            constants$488.const$1.set(seg, x);
        }
        public static byte Int8Value$get(MemorySegment seg, long index) {
            return (byte)constants$488.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void Int8Value$set(MemorySegment seg, long index, byte x) {
            constants$488.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle UInt8Value$VH() {
            return constants$488.const$2;
        }
        /**
         * Getter for field:
         * {@snippet :
         * UINT8 UInt8Value;
         * }
         */
        public static byte UInt8Value$get(MemorySegment seg) {
            return (byte)constants$488.const$2.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * UINT8 UInt8Value;
         * }
         */
        public static void UInt8Value$set(MemorySegment seg, byte x) {
            constants$488.const$2.set(seg, x);
        }
        public static byte UInt8Value$get(MemorySegment seg, long index) {
            return (byte)constants$488.const$2.get(seg.asSlice(index*sizeof()));
        }
        public static void UInt8Value$set(MemorySegment seg, long index, byte x) {
            constants$488.const$2.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Int16Value$VH() {
            return constants$488.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * INT16 Int16Value;
         * }
         */
        public static short Int16Value$get(MemorySegment seg) {
            return (short)constants$488.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * INT16 Int16Value;
         * }
         */
        public static void Int16Value$set(MemorySegment seg, short x) {
            constants$488.const$3.set(seg, x);
        }
        public static short Int16Value$get(MemorySegment seg, long index) {
            return (short)constants$488.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void Int16Value$set(MemorySegment seg, long index, short x) {
            constants$488.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle UInt16Value$VH() {
            return constants$488.const$4;
        }
        /**
         * Getter for field:
         * {@snippet :
         * UINT16 UInt16Value;
         * }
         */
        public static short UInt16Value$get(MemorySegment seg) {
            return (short)constants$488.const$4.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * UINT16 UInt16Value;
         * }
         */
        public static void UInt16Value$set(MemorySegment seg, short x) {
            constants$488.const$4.set(seg, x);
        }
        public static short UInt16Value$get(MemorySegment seg, long index) {
            return (short)constants$488.const$4.get(seg.asSlice(index*sizeof()));
        }
        public static void UInt16Value$set(MemorySegment seg, long index, short x) {
            constants$488.const$4.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Int32Value$VH() {
            return constants$488.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * INT32 Int32Value;
         * }
         */
        public static int Int32Value$get(MemorySegment seg) {
            return (int)constants$488.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * INT32 Int32Value;
         * }
         */
        public static void Int32Value$set(MemorySegment seg, int x) {
            constants$488.const$5.set(seg, x);
        }
        public static int Int32Value$get(MemorySegment seg, long index) {
            return (int)constants$488.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void Int32Value$set(MemorySegment seg, long index, int x) {
            constants$488.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle UInt32Value$VH() {
            return constants$489.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * UINT32 UInt32Value;
         * }
         */
        public static int UInt32Value$get(MemorySegment seg) {
            return (int)constants$489.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * UINT32 UInt32Value;
         * }
         */
        public static void UInt32Value$set(MemorySegment seg, int x) {
            constants$489.const$0.set(seg, x);
        }
        public static int UInt32Value$get(MemorySegment seg, long index) {
            return (int)constants$489.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void UInt32Value$set(MemorySegment seg, long index, int x) {
            constants$489.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle Int64Value$VH() {
            return constants$489.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * INT64 Int64Value;
         * }
         */
        public static long Int64Value$get(MemorySegment seg) {
            return (long)constants$489.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * INT64 Int64Value;
         * }
         */
        public static void Int64Value$set(MemorySegment seg, long x) {
            constants$489.const$1.set(seg, x);
        }
        public static long Int64Value$get(MemorySegment seg, long index) {
            return (long)constants$489.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void Int64Value$set(MemorySegment seg, long index, long x) {
            constants$489.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle UInt64Value$VH() {
            return constants$489.const$2;
        }
        /**
         * Getter for field:
         * {@snippet :
         * UINT64 UInt64Value;
         * }
         */
        public static long UInt64Value$get(MemorySegment seg) {
            return (long)constants$489.const$2.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * UINT64 UInt64Value;
         * }
         */
        public static void UInt64Value$set(MemorySegment seg, long x) {
            constants$489.const$2.set(seg, x);
        }
        public static long UInt64Value$get(MemorySegment seg, long index) {
            return (long)constants$489.const$2.get(seg.asSlice(index*sizeof()));
        }
        public static void UInt64Value$set(MemorySegment seg, long index, long x) {
            constants$489.const$2.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle AnsiStringValue$VH() {
            return constants$489.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PCSTR AnsiStringValue;
         * }
         */
        public static MemorySegment AnsiStringValue$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$489.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PCSTR AnsiStringValue;
         * }
         */
        public static void AnsiStringValue$set(MemorySegment seg, MemorySegment x) {
            constants$489.const$3.set(seg, x);
        }
        public static MemorySegment AnsiStringValue$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$489.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void AnsiStringValue$set(MemorySegment seg, long index, MemorySegment x) {
            constants$489.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle UnicodeStringValue$VH() {
            return constants$489.const$4;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PCWSTR UnicodeStringValue;
         * }
         */
        public static MemorySegment UnicodeStringValue$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$489.const$4.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PCWSTR UnicodeStringValue;
         * }
         */
        public static void UnicodeStringValue$set(MemorySegment seg, MemorySegment x) {
            constants$489.const$4.set(seg, x);
        }
        public static MemorySegment UnicodeStringValue$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$489.const$4.get(seg.asSlice(index*sizeof()));
        }
        public static void UnicodeStringValue$set(MemorySegment seg, long index, MemorySegment x) {
            constants$489.const$4.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

