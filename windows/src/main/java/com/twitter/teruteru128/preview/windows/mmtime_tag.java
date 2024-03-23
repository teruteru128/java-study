// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct mmtime_tag {
 *     UINT wType;
 *     union {
 *         DWORD ms;
 *         DWORD sample;
 *         DWORD cb;
 *         DWORD ticks;
 *         struct {
 *             BYTE hour;
 *             BYTE min;
 *             BYTE sec;
 *             BYTE frame;
 *             BYTE fps;
 *             BYTE dummy;
 *             BYTE pad[2];
 *         } smpte;
 *         struct {
 *             DWORD songptrpos;
 *         } midi;
 *     } u;
 * }
 * }
 */
public class mmtime_tag {

    mmtime_tag() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_INT, 1).withName("wType"),
        mmtime_tag.u.layout().withName("u")
    ).withName("mmtime_tag");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt wType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static final OfInt wType$layout() {
        return wType$LAYOUT;
    }

    private static final long wType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static final long wType$offset() {
        return wType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static int wType(MemorySegment struct) {
        return struct.get(wType$LAYOUT, wType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static void wType(MemorySegment struct, int fieldValue) {
        struct.set(wType$LAYOUT, wType$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     DWORD ms;
     *     DWORD sample;
     *     DWORD cb;
     *     DWORD ticks;
     *     struct {
     *         BYTE hour;
     *         BYTE min;
     *         BYTE sec;
     *         BYTE frame;
     *         BYTE fps;
     *         BYTE dummy;
     *         BYTE pad[2];
     *     } smpte;
     *     struct {
     *         DWORD songptrpos;
     *     } midi;
     * }
     * }
     */
    public static class u {

        u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            Windows_h.align(Windows_h.C_LONG, 1).withName("ms"),
            Windows_h.align(Windows_h.C_LONG, 1).withName("sample"),
            Windows_h.align(Windows_h.C_LONG, 1).withName("cb"),
            Windows_h.align(Windows_h.C_LONG, 1).withName("ticks"),
            mmtime_tag.u.smpte.layout().withName("smpte"),
            mmtime_tag.u.midi.layout().withName("midi")
        ).withName("$anon$110:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt ms$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ms"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD ms
         * }
         */
        public static final OfInt ms$layout() {
            return ms$LAYOUT;
        }

        private static final long ms$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD ms
         * }
         */
        public static final long ms$offset() {
            return ms$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD ms
         * }
         */
        public static int ms(MemorySegment union) {
            return union.get(ms$LAYOUT, ms$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD ms
         * }
         */
        public static void ms(MemorySegment union, int fieldValue) {
            union.set(ms$LAYOUT, ms$OFFSET, fieldValue);
        }

        private static final OfInt sample$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sample"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD sample
         * }
         */
        public static final OfInt sample$layout() {
            return sample$LAYOUT;
        }

        private static final long sample$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD sample
         * }
         */
        public static final long sample$offset() {
            return sample$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD sample
         * }
         */
        public static int sample(MemorySegment union) {
            return union.get(sample$LAYOUT, sample$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD sample
         * }
         */
        public static void sample(MemorySegment union, int fieldValue) {
            union.set(sample$LAYOUT, sample$OFFSET, fieldValue);
        }

        private static final OfInt cb$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cb"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD cb
         * }
         */
        public static final OfInt cb$layout() {
            return cb$LAYOUT;
        }

        private static final long cb$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD cb
         * }
         */
        public static final long cb$offset() {
            return cb$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD cb
         * }
         */
        public static int cb(MemorySegment union) {
            return union.get(cb$LAYOUT, cb$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD cb
         * }
         */
        public static void cb(MemorySegment union, int fieldValue) {
            union.set(cb$LAYOUT, cb$OFFSET, fieldValue);
        }

        private static final OfInt ticks$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ticks"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD ticks
         * }
         */
        public static final OfInt ticks$layout() {
            return ticks$LAYOUT;
        }

        private static final long ticks$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD ticks
         * }
         */
        public static final long ticks$offset() {
            return ticks$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD ticks
         * }
         */
        public static int ticks(MemorySegment union) {
            return union.get(ticks$LAYOUT, ticks$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD ticks
         * }
         */
        public static void ticks(MemorySegment union, int fieldValue) {
            union.set(ticks$LAYOUT, ticks$OFFSET, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     BYTE hour;
         *     BYTE min;
         *     BYTE sec;
         *     BYTE frame;
         *     BYTE fps;
         *     BYTE dummy;
         *     BYTE pad[2];
         * }
         * }
         */
        public static class smpte {

            smpte() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                Windows_h.C_CHAR.withName("hour"),
                Windows_h.C_CHAR.withName("min"),
                Windows_h.C_CHAR.withName("sec"),
                Windows_h.C_CHAR.withName("frame"),
                Windows_h.C_CHAR.withName("fps"),
                Windows_h.C_CHAR.withName("dummy"),
                MemoryLayout.sequenceLayout(2, Windows_h.C_CHAR).withName("pad")
            ).withName("$anon$118:9");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfByte hour$LAYOUT = (OfByte)$LAYOUT.select(groupElement("hour"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * BYTE hour
             * }
             */
            public static final OfByte hour$layout() {
                return hour$LAYOUT;
            }

            private static final long hour$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * BYTE hour
             * }
             */
            public static final long hour$offset() {
                return hour$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * BYTE hour
             * }
             */
            public static byte hour(MemorySegment struct) {
                return struct.get(hour$LAYOUT, hour$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * BYTE hour
             * }
             */
            public static void hour(MemorySegment struct, byte fieldValue) {
                struct.set(hour$LAYOUT, hour$OFFSET, fieldValue);
            }

            private static final OfByte min$LAYOUT = (OfByte)$LAYOUT.select(groupElement("min"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * BYTE min
             * }
             */
            public static final OfByte min$layout() {
                return min$LAYOUT;
            }

            private static final long min$OFFSET = 1;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * BYTE min
             * }
             */
            public static final long min$offset() {
                return min$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * BYTE min
             * }
             */
            public static byte min(MemorySegment struct) {
                return struct.get(min$LAYOUT, min$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * BYTE min
             * }
             */
            public static void min(MemorySegment struct, byte fieldValue) {
                struct.set(min$LAYOUT, min$OFFSET, fieldValue);
            }

            private static final OfByte sec$LAYOUT = (OfByte)$LAYOUT.select(groupElement("sec"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * BYTE sec
             * }
             */
            public static final OfByte sec$layout() {
                return sec$LAYOUT;
            }

            private static final long sec$OFFSET = 2;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * BYTE sec
             * }
             */
            public static final long sec$offset() {
                return sec$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * BYTE sec
             * }
             */
            public static byte sec(MemorySegment struct) {
                return struct.get(sec$LAYOUT, sec$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * BYTE sec
             * }
             */
            public static void sec(MemorySegment struct, byte fieldValue) {
                struct.set(sec$LAYOUT, sec$OFFSET, fieldValue);
            }

            private static final OfByte frame$LAYOUT = (OfByte)$LAYOUT.select(groupElement("frame"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * BYTE frame
             * }
             */
            public static final OfByte frame$layout() {
                return frame$LAYOUT;
            }

            private static final long frame$OFFSET = 3;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * BYTE frame
             * }
             */
            public static final long frame$offset() {
                return frame$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * BYTE frame
             * }
             */
            public static byte frame(MemorySegment struct) {
                return struct.get(frame$LAYOUT, frame$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * BYTE frame
             * }
             */
            public static void frame(MemorySegment struct, byte fieldValue) {
                struct.set(frame$LAYOUT, frame$OFFSET, fieldValue);
            }

            private static final OfByte fps$LAYOUT = (OfByte)$LAYOUT.select(groupElement("fps"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * BYTE fps
             * }
             */
            public static final OfByte fps$layout() {
                return fps$LAYOUT;
            }

            private static final long fps$OFFSET = 4;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * BYTE fps
             * }
             */
            public static final long fps$offset() {
                return fps$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * BYTE fps
             * }
             */
            public static byte fps(MemorySegment struct) {
                return struct.get(fps$LAYOUT, fps$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * BYTE fps
             * }
             */
            public static void fps(MemorySegment struct, byte fieldValue) {
                struct.set(fps$LAYOUT, fps$OFFSET, fieldValue);
            }

            private static final OfByte dummy$LAYOUT = (OfByte)$LAYOUT.select(groupElement("dummy"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * BYTE dummy
             * }
             */
            public static final OfByte dummy$layout() {
                return dummy$LAYOUT;
            }

            private static final long dummy$OFFSET = 5;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * BYTE dummy
             * }
             */
            public static final long dummy$offset() {
                return dummy$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * BYTE dummy
             * }
             */
            public static byte dummy(MemorySegment struct) {
                return struct.get(dummy$LAYOUT, dummy$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * BYTE dummy
             * }
             */
            public static void dummy(MemorySegment struct, byte fieldValue) {
                struct.set(dummy$LAYOUT, dummy$OFFSET, fieldValue);
            }

            private static final SequenceLayout pad$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pad"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * BYTE pad[2]
             * }
             */
            public static final SequenceLayout pad$layout() {
                return pad$LAYOUT;
            }

            private static final long pad$OFFSET = 6;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * BYTE pad[2]
             * }
             */
            public static final long pad$offset() {
                return pad$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * BYTE pad[2]
             * }
             */
            public static MemorySegment pad(MemorySegment struct) {
                return struct.asSlice(pad$OFFSET, pad$LAYOUT.byteSize());
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * BYTE pad[2]
             * }
             */
            public static void pad(MemorySegment struct, MemorySegment fieldValue) {
                MemorySegment.copy(fieldValue, 0L, struct, pad$OFFSET, pad$LAYOUT.byteSize());
            }

            private static long[] pad$DIMS = { 2 };

            /**
             * Dimensions for array field:
             * {@snippet lang=c :
             * BYTE pad[2]
             * }
             */
            public static long[] pad$dimensions() {
                return pad$DIMS;
            }
            private static final VarHandle pad$ELEM_HANDLE = pad$LAYOUT.varHandle(sequenceElement());

            /**
             * Indexed getter for field:
             * {@snippet lang=c :
             * BYTE pad[2]
             * }
             */
            public static byte pad(MemorySegment struct, long index0) {
                return (byte)pad$ELEM_HANDLE.get(struct, 0L, index0);
            }

            /**
             * Indexed setter for field:
             * {@snippet lang=c :
             * BYTE pad[2]
             * }
             */
            public static void pad(MemorySegment struct, long index0, byte fieldValue) {
                pad$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
            }

            /**
             * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
             * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
             */
            public static MemorySegment asSlice(MemorySegment array, long index) {
                return array.asSlice(layout().byteSize() * index);
            }

            /**
             * The size (in bytes) of this struct
             */
            public static long sizeof() { return layout().byteSize(); }

            /**
             * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
             */
            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate(layout());
            }

            /**
             * Allocate an array of size {@code elementCount} using {@code allocator}.
             * The returned segment has size {@code elementCount * layout().byteSize()}.
             */
            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
            }

            /**
             * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
             * The returned segment has size {@code layout().byteSize()}
             */
            public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
                return reinterpret(addr, 1, arena, cleanup);
            }

            /**
             * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
             * The returned segment has size {@code elementCount * layout().byteSize()}
             */
            public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        private static final GroupLayout smpte$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("smpte"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     BYTE hour;
         *     BYTE min;
         *     BYTE sec;
         *     BYTE frame;
         *     BYTE fps;
         *     BYTE dummy;
         *     BYTE pad[2];
         * } smpte
         * }
         */
        public static final GroupLayout smpte$layout() {
            return smpte$LAYOUT;
        }

        private static final long smpte$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     BYTE hour;
         *     BYTE min;
         *     BYTE sec;
         *     BYTE frame;
         *     BYTE fps;
         *     BYTE dummy;
         *     BYTE pad[2];
         * } smpte
         * }
         */
        public static final long smpte$offset() {
            return smpte$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     BYTE hour;
         *     BYTE min;
         *     BYTE sec;
         *     BYTE frame;
         *     BYTE fps;
         *     BYTE dummy;
         *     BYTE pad[2];
         * } smpte
         * }
         */
        public static MemorySegment smpte(MemorySegment union) {
            return union.asSlice(smpte$OFFSET, smpte$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     BYTE hour;
         *     BYTE min;
         *     BYTE sec;
         *     BYTE frame;
         *     BYTE fps;
         *     BYTE dummy;
         *     BYTE pad[2];
         * } smpte
         * }
         */
        public static void smpte(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, smpte$OFFSET, smpte$LAYOUT.byteSize());
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     DWORD songptrpos;
         * }
         * }
         */
        public static class midi {

            midi() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                Windows_h.align(Windows_h.C_LONG, 1).withName("songptrpos")
            ).withName("$anon$132:9");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfInt songptrpos$LAYOUT = (OfInt)$LAYOUT.select(groupElement("songptrpos"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * DWORD songptrpos
             * }
             */
            public static final OfInt songptrpos$layout() {
                return songptrpos$LAYOUT;
            }

            private static final long songptrpos$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * DWORD songptrpos
             * }
             */
            public static final long songptrpos$offset() {
                return songptrpos$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * DWORD songptrpos
             * }
             */
            public static int songptrpos(MemorySegment struct) {
                return struct.get(songptrpos$LAYOUT, songptrpos$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * DWORD songptrpos
             * }
             */
            public static void songptrpos(MemorySegment struct, int fieldValue) {
                struct.set(songptrpos$LAYOUT, songptrpos$OFFSET, fieldValue);
            }

            /**
             * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
             * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
             */
            public static MemorySegment asSlice(MemorySegment array, long index) {
                return array.asSlice(layout().byteSize() * index);
            }

            /**
             * The size (in bytes) of this struct
             */
            public static long sizeof() { return layout().byteSize(); }

            /**
             * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
             */
            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate(layout());
            }

            /**
             * Allocate an array of size {@code elementCount} using {@code allocator}.
             * The returned segment has size {@code elementCount * layout().byteSize()}.
             */
            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
            }

            /**
             * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
             * The returned segment has size {@code layout().byteSize()}
             */
            public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
                return reinterpret(addr, 1, arena, cleanup);
            }

            /**
             * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
             * The returned segment has size {@code elementCount * layout().byteSize()}
             */
            public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        private static final GroupLayout midi$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("midi"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD songptrpos;
         * } midi
         * }
         */
        public static final GroupLayout midi$layout() {
            return midi$LAYOUT;
        }

        private static final long midi$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD songptrpos;
         * } midi
         * }
         */
        public static final long midi$offset() {
            return midi$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD songptrpos;
         * } midi
         * }
         */
        public static MemorySegment midi(MemorySegment union) {
            return union.asSlice(midi$OFFSET, midi$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD songptrpos;
         * } midi
         * }
         */
        public static void midi(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, midi$OFFSET, midi$LAYOUT.byteSize());
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout u$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("u"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     DWORD ms;
     *     DWORD sample;
     *     DWORD cb;
     *     DWORD ticks;
     *     struct {
     *         BYTE hour;
     *         BYTE min;
     *         BYTE sec;
     *         BYTE frame;
     *         BYTE fps;
     *         BYTE dummy;
     *         BYTE pad[2];
     *     } smpte;
     *     struct {
     *         DWORD songptrpos;
     *     } midi;
     * } u
     * }
     */
    public static final GroupLayout u$layout() {
        return u$LAYOUT;
    }

    private static final long u$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     DWORD ms;
     *     DWORD sample;
     *     DWORD cb;
     *     DWORD ticks;
     *     struct {
     *         BYTE hour;
     *         BYTE min;
     *         BYTE sec;
     *         BYTE frame;
     *         BYTE fps;
     *         BYTE dummy;
     *         BYTE pad[2];
     *     } smpte;
     *     struct {
     *         DWORD songptrpos;
     *     } midi;
     * } u
     * }
     */
    public static final long u$offset() {
        return u$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     DWORD ms;
     *     DWORD sample;
     *     DWORD cb;
     *     DWORD ticks;
     *     struct {
     *         BYTE hour;
     *         BYTE min;
     *         BYTE sec;
     *         BYTE frame;
     *         BYTE fps;
     *         BYTE dummy;
     *         BYTE pad[2];
     *     } smpte;
     *     struct {
     *         DWORD songptrpos;
     *     } midi;
     * } u
     * }
     */
    public static MemorySegment u(MemorySegment struct) {
        return struct.asSlice(u$OFFSET, u$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     DWORD ms;
     *     DWORD sample;
     *     DWORD cb;
     *     DWORD ticks;
     *     struct {
     *         BYTE hour;
     *         BYTE min;
     *         BYTE sec;
     *         BYTE frame;
     *         BYTE fps;
     *         BYTE dummy;
     *         BYTE pad[2];
     *     } smpte;
     *     struct {
     *         DWORD songptrpos;
     *     } midi;
     * } u
     * }
     */
    public static void u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, u$OFFSET, u$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

