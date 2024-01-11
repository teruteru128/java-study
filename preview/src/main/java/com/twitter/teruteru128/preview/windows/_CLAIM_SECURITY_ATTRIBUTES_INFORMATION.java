// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CLAIM_SECURITY_ATTRIBUTES_INFORMATION {
 *     WORD Version;
 *     WORD Reserved;
 *     DWORD AttributeCount;
 *     union  Attribute;
 * };
 * }
 */
public class _CLAIM_SECURITY_ATTRIBUTES_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$179.const$2;
    }
    public static VarHandle Version$VH() {
        return constants$179.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static short Version$get(MemorySegment seg) {
        return (short)constants$179.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, short x) {
        constants$179.const$3.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)constants$179.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        constants$179.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$179.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static short Reserved$get(MemorySegment seg) {
        return (short)constants$179.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, short x) {
        constants$179.const$4.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)constants$179.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        constants$179.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AttributeCount$VH() {
        return constants$179.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AttributeCount;
     * }
     */
    public static int AttributeCount$get(MemorySegment seg) {
        return (int)constants$179.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AttributeCount;
     * }
     */
    public static void AttributeCount$set(MemorySegment seg, int x) {
        constants$179.const$5.set(seg, x);
    }
    public static int AttributeCount$get(MemorySegment seg, long index) {
        return (int)constants$179.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void AttributeCount$set(MemorySegment seg, long index, int x) {
        constants$179.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
     * };
     * }
     */
    public static final class Attribute {

        // Suppresses default constructor, ensuring non-instantiability.
        private Attribute() {}
        public static MemoryLayout $LAYOUT() {
            return constants$180.const$0;
        }
        public static VarHandle pAttributeV1$VH() {
            return constants$180.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
         * }
         */
        public static MemorySegment pAttributeV1$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)constants$180.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * PCLAIM_SECURITY_ATTRIBUTE_V1 pAttributeV1;
         * }
         */
        public static void pAttributeV1$set(MemorySegment seg, MemorySegment x) {
            constants$180.const$1.set(seg, x);
        }
        public static MemorySegment pAttributeV1$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)constants$180.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void pAttributeV1$set(MemorySegment seg, long index, MemorySegment x) {
            constants$180.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment Attribute$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


