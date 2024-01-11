// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct mmtime_tag {
 *     UINT wType;
 *     union  u;
 * };
 * }
 */
public class mmtime_tag {

    public static MemoryLayout $LAYOUT() {
        return constants$1550.const$2;
    }
    public static VarHandle wType$VH() {
        return constants$1550.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wType;
     * }
     */
    public static int wType$get(MemorySegment seg) {
        return (int)constants$1550.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wType;
     * }
     */
    public static void wType$set(MemorySegment seg, int x) {
        constants$1550.const$3.set(seg, x);
    }
    public static int wType$get(MemorySegment seg, long index) {
        return (int)constants$1550.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wType$set(MemorySegment seg, long index, int x) {
        constants$1550.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     DWORD ms;
     *     DWORD sample;
     *     DWORD cb;
     *     DWORD ticks;
     *     struct  smpte;
     *     struct  midi;
     * };
     * }
     */
    public static final class u {

        // Suppresses default constructor, ensuring non-instantiability.
        private u() {}
        public static MemoryLayout $LAYOUT() {
            return constants$1550.const$4;
        }
        public static VarHandle ms$VH() {
            return constants$1550.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD ms;
         * }
         */
        public static int ms$get(MemorySegment seg) {
            return (int)constants$1550.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD ms;
         * }
         */
        public static void ms$set(MemorySegment seg, int x) {
            constants$1550.const$5.set(seg, x);
        }
        public static int ms$get(MemorySegment seg, long index) {
            return (int)constants$1550.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void ms$set(MemorySegment seg, long index, int x) {
            constants$1550.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle sample$VH() {
            return constants$1551.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD sample;
         * }
         */
        public static int sample$get(MemorySegment seg) {
            return (int)constants$1551.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD sample;
         * }
         */
        public static void sample$set(MemorySegment seg, int x) {
            constants$1551.const$0.set(seg, x);
        }
        public static int sample$get(MemorySegment seg, long index) {
            return (int)constants$1551.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void sample$set(MemorySegment seg, long index, int x) {
            constants$1551.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle cb$VH() {
            return constants$1551.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD cb;
         * }
         */
        public static int cb$get(MemorySegment seg) {
            return (int)constants$1551.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD cb;
         * }
         */
        public static void cb$set(MemorySegment seg, int x) {
            constants$1551.const$1.set(seg, x);
        }
        public static int cb$get(MemorySegment seg, long index) {
            return (int)constants$1551.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void cb$set(MemorySegment seg, long index, int x) {
            constants$1551.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle ticks$VH() {
            return constants$1551.const$2;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD ticks;
         * }
         */
        public static int ticks$get(MemorySegment seg) {
            return (int)constants$1551.const$2.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD ticks;
         * }
         */
        public static void ticks$set(MemorySegment seg, int x) {
            constants$1551.const$2.set(seg, x);
        }
        public static int ticks$get(MemorySegment seg, long index) {
            return (int)constants$1551.const$2.get(seg.asSlice(index*sizeof()));
        }
        public static void ticks$set(MemorySegment seg, long index, int x) {
            constants$1551.const$2.set(seg.asSlice(index*sizeof()), x);
        }
        /**
         * {@snippet :
         * struct {
         *     BYTE hour;
         *     BYTE min;
         *     BYTE sec;
         *     BYTE frame;
         *     BYTE fps;
         *     BYTE dummy;
         *     BYTE pad[2];
         * };
         * }
         */
        public static final class smpte {

            // Suppresses default constructor, ensuring non-instantiability.
            private smpte() {}
            public static MemoryLayout $LAYOUT() {
                return constants$1551.const$3;
            }
            public static VarHandle hour$VH() {
                return constants$1551.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE hour;
             * }
             */
            public static byte hour$get(MemorySegment seg) {
                return (byte)constants$1551.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE hour;
             * }
             */
            public static void hour$set(MemorySegment seg, byte x) {
                constants$1551.const$4.set(seg, x);
            }
            public static byte hour$get(MemorySegment seg, long index) {
                return (byte)constants$1551.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void hour$set(MemorySegment seg, long index, byte x) {
                constants$1551.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle min$VH() {
                return constants$1551.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE min;
             * }
             */
            public static byte min$get(MemorySegment seg) {
                return (byte)constants$1551.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE min;
             * }
             */
            public static void min$set(MemorySegment seg, byte x) {
                constants$1551.const$5.set(seg, x);
            }
            public static byte min$get(MemorySegment seg, long index) {
                return (byte)constants$1551.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void min$set(MemorySegment seg, long index, byte x) {
                constants$1551.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle sec$VH() {
                return constants$1552.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE sec;
             * }
             */
            public static byte sec$get(MemorySegment seg) {
                return (byte)constants$1552.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE sec;
             * }
             */
            public static void sec$set(MemorySegment seg, byte x) {
                constants$1552.const$0.set(seg, x);
            }
            public static byte sec$get(MemorySegment seg, long index) {
                return (byte)constants$1552.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void sec$set(MemorySegment seg, long index, byte x) {
                constants$1552.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle frame$VH() {
                return constants$1552.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE frame;
             * }
             */
            public static byte frame$get(MemorySegment seg) {
                return (byte)constants$1552.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE frame;
             * }
             */
            public static void frame$set(MemorySegment seg, byte x) {
                constants$1552.const$1.set(seg, x);
            }
            public static byte frame$get(MemorySegment seg, long index) {
                return (byte)constants$1552.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void frame$set(MemorySegment seg, long index, byte x) {
                constants$1552.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle fps$VH() {
                return constants$1552.const$2;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE fps;
             * }
             */
            public static byte fps$get(MemorySegment seg) {
                return (byte)constants$1552.const$2.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE fps;
             * }
             */
            public static void fps$set(MemorySegment seg, byte x) {
                constants$1552.const$2.set(seg, x);
            }
            public static byte fps$get(MemorySegment seg, long index) {
                return (byte)constants$1552.const$2.get(seg.asSlice(index*sizeof()));
            }
            public static void fps$set(MemorySegment seg, long index, byte x) {
                constants$1552.const$2.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle dummy$VH() {
                return constants$1552.const$3;
            }
            /**
             * Getter for field:
             * {@snippet :
             * BYTE dummy;
             * }
             */
            public static byte dummy$get(MemorySegment seg) {
                return (byte)constants$1552.const$3.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * BYTE dummy;
             * }
             */
            public static void dummy$set(MemorySegment seg, byte x) {
                constants$1552.const$3.set(seg, x);
            }
            public static byte dummy$get(MemorySegment seg, long index) {
                return (byte)constants$1552.const$3.get(seg.asSlice(index*sizeof()));
            }
            public static void dummy$set(MemorySegment seg, long index, byte x) {
                constants$1552.const$3.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment pad$slice(MemorySegment seg) {
                return seg.asSlice(6, 2);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment smpte$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD songptrpos;
         * };
         * }
         */
        public static final class midi {

            // Suppresses default constructor, ensuring non-instantiability.
            private midi() {}
            public static MemoryLayout $LAYOUT() {
                return constants$1552.const$4;
            }
            public static VarHandle songptrpos$VH() {
                return constants$1552.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD songptrpos;
             * }
             */
            public static int songptrpos$get(MemorySegment seg) {
                return (int)constants$1552.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD songptrpos;
             * }
             */
            public static void songptrpos$set(MemorySegment seg, int x) {
                constants$1552.const$5.set(seg, x);
            }
            public static int songptrpos$get(MemorySegment seg, long index) {
                return (int)constants$1552.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void songptrpos$set(MemorySegment seg, long index, int x) {
                constants$1552.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment midi$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


