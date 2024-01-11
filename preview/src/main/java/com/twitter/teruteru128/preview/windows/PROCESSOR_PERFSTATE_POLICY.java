// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD Revision;
 *     BYTE MaxThrottle;
 *     BYTE MinThrottle;
 *     BYTE BusyAdjThreshold;
 *     union {
 *         BYTE Spare;
 *         union  Flags;
 *     };
 *     DWORD TimeCheck;
 *     DWORD IncreaseTime;
 *     DWORD DecreaseTime;
 *     DWORD IncreasePercent;
 *     DWORD DecreasePercent;
 * };
 * }
 */
public class PROCESSOR_PERFSTATE_POLICY {

    public static MemoryLayout $LAYOUT() {
        return constants$339.const$3;
    }
    public static VarHandle Revision$VH() {
        return constants$339.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Revision;
     * }
     */
    public static int Revision$get(MemorySegment seg) {
        return (int)constants$339.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Revision;
     * }
     */
    public static void Revision$set(MemorySegment seg, int x) {
        constants$339.const$4.set(seg, x);
    }
    public static int Revision$get(MemorySegment seg, long index) {
        return (int)constants$339.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, int x) {
        constants$339.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxThrottle$VH() {
        return constants$339.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE MaxThrottle;
     * }
     */
    public static byte MaxThrottle$get(MemorySegment seg) {
        return (byte)constants$339.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE MaxThrottle;
     * }
     */
    public static void MaxThrottle$set(MemorySegment seg, byte x) {
        constants$339.const$5.set(seg, x);
    }
    public static byte MaxThrottle$get(MemorySegment seg, long index) {
        return (byte)constants$339.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxThrottle$set(MemorySegment seg, long index, byte x) {
        constants$339.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MinThrottle$VH() {
        return constants$340.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE MinThrottle;
     * }
     */
    public static byte MinThrottle$get(MemorySegment seg) {
        return (byte)constants$340.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE MinThrottle;
     * }
     */
    public static void MinThrottle$set(MemorySegment seg, byte x) {
        constants$340.const$0.set(seg, x);
    }
    public static byte MinThrottle$get(MemorySegment seg, long index) {
        return (byte)constants$340.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void MinThrottle$set(MemorySegment seg, long index, byte x) {
        constants$340.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle BusyAdjThreshold$VH() {
        return constants$340.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE BusyAdjThreshold;
     * }
     */
    public static byte BusyAdjThreshold$get(MemorySegment seg) {
        return (byte)constants$340.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE BusyAdjThreshold;
     * }
     */
    public static void BusyAdjThreshold$set(MemorySegment seg, byte x) {
        constants$340.const$1.set(seg, x);
    }
    public static byte BusyAdjThreshold$get(MemorySegment seg, long index) {
        return (byte)constants$340.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void BusyAdjThreshold$set(MemorySegment seg, long index, byte x) {
        constants$340.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Spare$VH() {
        return constants$340.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Spare;
     * }
     */
    public static byte Spare$get(MemorySegment seg) {
        return (byte)constants$340.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Spare;
     * }
     */
    public static void Spare$set(MemorySegment seg, byte x) {
        constants$340.const$2.set(seg, x);
    }
    public static byte Spare$get(MemorySegment seg, long index) {
        return (byte)constants$340.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Spare$set(MemorySegment seg, long index, byte x) {
        constants$340.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     BYTE AsBYTE;
     *     struct {
     *              *         BYTE NoDomainAccounting;
     *         BYTE IncreasePolicy;
     *         BYTE DecreasePolicy;
     *         BYTE Reserved;
     *     };
     * };
     * }
     */
    public static final class Flags {

        // Suppresses default constructor, ensuring non-instantiability.
        private Flags() {}
        public static MemoryLayout $LAYOUT() {
            return constants$340.const$3;
        }
        public static VarHandle AsBYTE$VH() {
            return constants$340.const$4;
        }
        /**
         * Getter for field:
         * {@snippet :
         * BYTE AsBYTE;
         * }
         */
        public static byte AsBYTE$get(MemorySegment seg) {
            return (byte)constants$340.const$4.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * BYTE AsBYTE;
         * }
         */
        public static void AsBYTE$set(MemorySegment seg, byte x) {
            constants$340.const$4.set(seg, x);
        }
        public static byte AsBYTE$get(MemorySegment seg, long index) {
            return (byte)constants$340.const$4.get(seg.asSlice(index*sizeof()));
        }
        public static void AsBYTE$set(MemorySegment seg, long index, byte x) {
            constants$340.const$4.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment Flags$slice(MemorySegment seg) {
        return seg.asSlice(7, 1);
    }
    public static VarHandle TimeCheck$VH() {
        return constants$340.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeCheck;
     * }
     */
    public static int TimeCheck$get(MemorySegment seg) {
        return (int)constants$340.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeCheck;
     * }
     */
    public static void TimeCheck$set(MemorySegment seg, int x) {
        constants$340.const$5.set(seg, x);
    }
    public static int TimeCheck$get(MemorySegment seg, long index) {
        return (int)constants$340.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeCheck$set(MemorySegment seg, long index, int x) {
        constants$340.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle IncreaseTime$VH() {
        return constants$341.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD IncreaseTime;
     * }
     */
    public static int IncreaseTime$get(MemorySegment seg) {
        return (int)constants$341.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD IncreaseTime;
     * }
     */
    public static void IncreaseTime$set(MemorySegment seg, int x) {
        constants$341.const$0.set(seg, x);
    }
    public static int IncreaseTime$get(MemorySegment seg, long index) {
        return (int)constants$341.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void IncreaseTime$set(MemorySegment seg, long index, int x) {
        constants$341.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DecreaseTime$VH() {
        return constants$341.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DecreaseTime;
     * }
     */
    public static int DecreaseTime$get(MemorySegment seg) {
        return (int)constants$341.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DecreaseTime;
     * }
     */
    public static void DecreaseTime$set(MemorySegment seg, int x) {
        constants$341.const$1.set(seg, x);
    }
    public static int DecreaseTime$get(MemorySegment seg, long index) {
        return (int)constants$341.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void DecreaseTime$set(MemorySegment seg, long index, int x) {
        constants$341.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle IncreasePercent$VH() {
        return constants$341.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD IncreasePercent;
     * }
     */
    public static int IncreasePercent$get(MemorySegment seg) {
        return (int)constants$341.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD IncreasePercent;
     * }
     */
    public static void IncreasePercent$set(MemorySegment seg, int x) {
        constants$341.const$2.set(seg, x);
    }
    public static int IncreasePercent$get(MemorySegment seg, long index) {
        return (int)constants$341.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void IncreasePercent$set(MemorySegment seg, long index, int x) {
        constants$341.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DecreasePercent$VH() {
        return constants$341.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DecreasePercent;
     * }
     */
    public static int DecreasePercent$get(MemorySegment seg) {
        return (int)constants$341.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DecreasePercent;
     * }
     */
    public static void DecreasePercent$set(MemorySegment seg, int x) {
        constants$341.const$3.set(seg, x);
    }
    public static int DecreasePercent$get(MemorySegment seg, long index) {
        return (int)constants$341.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void DecreasePercent$set(MemorySegment seg, long index, int x) {
        constants$341.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

