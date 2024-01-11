// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_LINENUMBER {
 *     union  Type;
 *     WORD Linenumber;
 * };
 * }
 */
public class _IMAGE_LINENUMBER {

    public static MemoryLayout $LAYOUT() {
        return constants$400.const$4;
    }
    /**
     * {@snippet :
     * union {
     *     DWORD SymbolTableIndex;
     *     DWORD VirtualAddress;
     * };
     * }
     */
    public static final class Type {

        // Suppresses default constructor, ensuring non-instantiability.
        private Type() {}
        public static MemoryLayout $LAYOUT() {
            return constants$400.const$5;
        }
        public static VarHandle SymbolTableIndex$VH() {
            return constants$401.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD SymbolTableIndex;
         * }
         */
        public static int SymbolTableIndex$get(MemorySegment seg) {
            return (int)constants$401.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD SymbolTableIndex;
         * }
         */
        public static void SymbolTableIndex$set(MemorySegment seg, int x) {
            constants$401.const$0.set(seg, x);
        }
        public static int SymbolTableIndex$get(MemorySegment seg, long index) {
            return (int)constants$401.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void SymbolTableIndex$set(MemorySegment seg, long index, int x) {
            constants$401.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle VirtualAddress$VH() {
            return constants$401.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD VirtualAddress;
         * }
         */
        public static int VirtualAddress$get(MemorySegment seg) {
            return (int)constants$401.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD VirtualAddress;
         * }
         */
        public static void VirtualAddress$set(MemorySegment seg, int x) {
            constants$401.const$1.set(seg, x);
        }
        public static int VirtualAddress$get(MemorySegment seg, long index) {
            return (int)constants$401.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void VirtualAddress$set(MemorySegment seg, long index, int x) {
            constants$401.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment Type$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static VarHandle Linenumber$VH() {
        return constants$401.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Linenumber;
     * }
     */
    public static short Linenumber$get(MemorySegment seg) {
        return (short)constants$401.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Linenumber;
     * }
     */
    public static void Linenumber$set(MemorySegment seg, short x) {
        constants$401.const$2.set(seg, x);
    }
    public static short Linenumber$get(MemorySegment seg, long index) {
        return (short)constants$401.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Linenumber$set(MemorySegment seg, long index, short x) {
        constants$401.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


