// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_SECTION_HEADER {
 *     BYTE Name[8];
 *     union  Misc;
 *     DWORD VirtualAddress;
 *     DWORD SizeOfRawData;
 *     DWORD PointerToRawData;
 *     DWORD PointerToRelocations;
 *     DWORD PointerToLinenumbers;
 *     WORD NumberOfRelocations;
 *     WORD NumberOfLinenumbers;
 *     DWORD Characteristics;
 * };
 * }
 */
public class _IMAGE_SECTION_HEADER {

    public static MemoryLayout $LAYOUT() {
        return constants$387.const$1;
    }
    public static MemorySegment Name$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    /**
     * {@snippet :
     * union {
     *     DWORD PhysicalAddress;
     *     DWORD VirtualSize;
     * };
     * }
     */
    public static final class Misc {

        // Suppresses default constructor, ensuring non-instantiability.
        private Misc() {}
        public static MemoryLayout $LAYOUT() {
            return constants$387.const$2;
        }
        public static VarHandle PhysicalAddress$VH() {
            return constants$387.const$3;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD PhysicalAddress;
         * }
         */
        public static int PhysicalAddress$get(MemorySegment seg) {
            return (int)constants$387.const$3.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD PhysicalAddress;
         * }
         */
        public static void PhysicalAddress$set(MemorySegment seg, int x) {
            constants$387.const$3.set(seg, x);
        }
        public static int PhysicalAddress$get(MemorySegment seg, long index) {
            return (int)constants$387.const$3.get(seg.asSlice(index*sizeof()));
        }
        public static void PhysicalAddress$set(MemorySegment seg, long index, int x) {
            constants$387.const$3.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle VirtualSize$VH() {
            return constants$387.const$4;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD VirtualSize;
         * }
         */
        public static int VirtualSize$get(MemorySegment seg) {
            return (int)constants$387.const$4.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD VirtualSize;
         * }
         */
        public static void VirtualSize$set(MemorySegment seg, int x) {
            constants$387.const$4.set(seg, x);
        }
        public static int VirtualSize$get(MemorySegment seg, long index) {
            return (int)constants$387.const$4.get(seg.asSlice(index*sizeof()));
        }
        public static void VirtualSize$set(MemorySegment seg, long index, int x) {
            constants$387.const$4.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment Misc$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    public static VarHandle VirtualAddress$VH() {
        return constants$387.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD VirtualAddress;
     * }
     */
    public static int VirtualAddress$get(MemorySegment seg) {
        return (int)constants$387.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD VirtualAddress;
     * }
     */
    public static void VirtualAddress$set(MemorySegment seg, int x) {
        constants$387.const$5.set(seg, x);
    }
    public static int VirtualAddress$get(MemorySegment seg, long index) {
        return (int)constants$387.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void VirtualAddress$set(MemorySegment seg, long index, int x) {
        constants$387.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SizeOfRawData$VH() {
        return constants$388.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfRawData;
     * }
     */
    public static int SizeOfRawData$get(MemorySegment seg) {
        return (int)constants$388.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfRawData;
     * }
     */
    public static void SizeOfRawData$set(MemorySegment seg, int x) {
        constants$388.const$0.set(seg, x);
    }
    public static int SizeOfRawData$get(MemorySegment seg, long index) {
        return (int)constants$388.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfRawData$set(MemorySegment seg, long index, int x) {
        constants$388.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PointerToRawData$VH() {
        return constants$388.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PointerToRawData;
     * }
     */
    public static int PointerToRawData$get(MemorySegment seg) {
        return (int)constants$388.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PointerToRawData;
     * }
     */
    public static void PointerToRawData$set(MemorySegment seg, int x) {
        constants$388.const$1.set(seg, x);
    }
    public static int PointerToRawData$get(MemorySegment seg, long index) {
        return (int)constants$388.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToRawData$set(MemorySegment seg, long index, int x) {
        constants$388.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PointerToRelocations$VH() {
        return constants$388.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PointerToRelocations;
     * }
     */
    public static int PointerToRelocations$get(MemorySegment seg) {
        return (int)constants$388.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PointerToRelocations;
     * }
     */
    public static void PointerToRelocations$set(MemorySegment seg, int x) {
        constants$388.const$2.set(seg, x);
    }
    public static int PointerToRelocations$get(MemorySegment seg, long index) {
        return (int)constants$388.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToRelocations$set(MemorySegment seg, long index, int x) {
        constants$388.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PointerToLinenumbers$VH() {
        return constants$388.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PointerToLinenumbers;
     * }
     */
    public static int PointerToLinenumbers$get(MemorySegment seg) {
        return (int)constants$388.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PointerToLinenumbers;
     * }
     */
    public static void PointerToLinenumbers$set(MemorySegment seg, int x) {
        constants$388.const$3.set(seg, x);
    }
    public static int PointerToLinenumbers$get(MemorySegment seg, long index) {
        return (int)constants$388.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToLinenumbers$set(MemorySegment seg, long index, int x) {
        constants$388.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumberOfRelocations$VH() {
        return constants$388.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberOfRelocations;
     * }
     */
    public static short NumberOfRelocations$get(MemorySegment seg) {
        return (short)constants$388.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberOfRelocations;
     * }
     */
    public static void NumberOfRelocations$set(MemorySegment seg, short x) {
        constants$388.const$4.set(seg, x);
    }
    public static short NumberOfRelocations$get(MemorySegment seg, long index) {
        return (short)constants$388.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRelocations$set(MemorySegment seg, long index, short x) {
        constants$388.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumberOfLinenumbers$VH() {
        return constants$388.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberOfLinenumbers;
     * }
     */
    public static short NumberOfLinenumbers$get(MemorySegment seg) {
        return (short)constants$388.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberOfLinenumbers;
     * }
     */
    public static void NumberOfLinenumbers$set(MemorySegment seg, short x) {
        constants$388.const$5.set(seg, x);
    }
    public static short NumberOfLinenumbers$get(MemorySegment seg, long index) {
        return (short)constants$388.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfLinenumbers$set(MemorySegment seg, long index, short x) {
        constants$388.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Characteristics$VH() {
        return constants$389.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Characteristics;
     * }
     */
    public static int Characteristics$get(MemorySegment seg) {
        return (int)constants$389.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Characteristics;
     * }
     */
    public static void Characteristics$set(MemorySegment seg, int x) {
        constants$389.const$0.set(seg, x);
    }
    public static int Characteristics$get(MemorySegment seg, long index) {
        return (int)constants$389.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, int x) {
        constants$389.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

