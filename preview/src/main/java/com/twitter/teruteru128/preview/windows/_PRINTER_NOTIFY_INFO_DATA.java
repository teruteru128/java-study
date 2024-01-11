// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_NOTIFY_INFO_DATA {
 *     WORD Type;
 *     WORD Field;
 *     DWORD Reserved;
 *     DWORD Id;
 *     union  NotifyData;
 * };
 * }
 */
public class _PRINTER_NOTIFY_INFO_DATA {

    public static MemoryLayout $LAYOUT() {
        return constants$2923.const$5;
    }
    public static VarHandle Type$VH() {
        return constants$2924.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Type;
     * }
     */
    public static short Type$get(MemorySegment seg) {
        return (short)constants$2924.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, short x) {
        constants$2924.const$0.set(seg, x);
    }
    public static short Type$get(MemorySegment seg, long index) {
        return (short)constants$2924.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, short x) {
        constants$2924.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Field$VH() {
        return constants$2924.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Field;
     * }
     */
    public static short Field$get(MemorySegment seg) {
        return (short)constants$2924.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Field;
     * }
     */
    public static void Field$set(MemorySegment seg, short x) {
        constants$2924.const$1.set(seg, x);
    }
    public static short Field$get(MemorySegment seg, long index) {
        return (short)constants$2924.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Field$set(MemorySegment seg, long index, short x) {
        constants$2924.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$2924.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)constants$2924.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        constants$2924.const$2.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)constants$2924.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        constants$2924.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Id$VH() {
        return constants$2924.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Id;
     * }
     */
    public static int Id$get(MemorySegment seg) {
        return (int)constants$2924.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Id;
     * }
     */
    public static void Id$set(MemorySegment seg, int x) {
        constants$2924.const$3.set(seg, x);
    }
    public static int Id$get(MemorySegment seg, long index) {
        return (int)constants$2924.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Id$set(MemorySegment seg, long index, int x) {
        constants$2924.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     DWORD adwData[2];
     *     struct  Data;
     * };
     * }
     */
    public static final class NotifyData {

        // Suppresses default constructor, ensuring non-instantiability.
        private NotifyData() {}
        public static MemoryLayout $LAYOUT() {
            return constants$2924.const$4;
        }
        public static MemorySegment adwData$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * };
         * }
         */
        public static final class Data {

            // Suppresses default constructor, ensuring non-instantiability.
            private Data() {}
            public static MemoryLayout $LAYOUT() {
                return constants$2924.const$5;
            }
            public static VarHandle cbBuf$VH() {
                return constants$2925.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD cbBuf;
             * }
             */
            public static int cbBuf$get(MemorySegment seg) {
                return (int)constants$2925.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD cbBuf;
             * }
             */
            public static void cbBuf$set(MemorySegment seg, int x) {
                constants$2925.const$0.set(seg, x);
            }
            public static int cbBuf$get(MemorySegment seg, long index) {
                return (int)constants$2925.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void cbBuf$set(MemorySegment seg, long index, int x) {
                constants$2925.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle pBuf$VH() {
                return constants$2925.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * LPVOID pBuf;
             * }
             */
            public static MemorySegment pBuf$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$2925.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * LPVOID pBuf;
             * }
             */
            public static void pBuf$set(MemorySegment seg, MemorySegment x) {
                constants$2925.const$1.set(seg, x);
            }
            public static MemorySegment pBuf$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$2925.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void pBuf$set(MemorySegment seg, long index, MemorySegment x) {
                constants$2925.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment Data$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment NotifyData$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


