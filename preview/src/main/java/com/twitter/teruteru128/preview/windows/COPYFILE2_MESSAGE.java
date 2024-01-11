// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct COPYFILE2_MESSAGE {
 *     COPYFILE2_MESSAGE_TYPE Type;
 *     DWORD dwPadding;
 *     union  Info;
 * };
 * }
 */
public class COPYFILE2_MESSAGE {

    public static MemoryLayout $LAYOUT() {
        return constants$808.const$1;
    }
    public static VarHandle Type$VH() {
        return constants$808.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COPYFILE2_MESSAGE_TYPE Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)constants$808.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COPYFILE2_MESSAGE_TYPE Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        constants$808.const$2.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)constants$808.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        constants$808.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwPadding$VH() {
        return constants$808.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPadding;
     * }
     */
    public static int dwPadding$get(MemorySegment seg) {
        return (int)constants$808.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPadding;
     * }
     */
    public static void dwPadding$set(MemorySegment seg, int x) {
        constants$808.const$3.set(seg, x);
    }
    public static int dwPadding$get(MemorySegment seg, long index) {
        return (int)constants$808.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPadding$set(MemorySegment seg, long index, int x) {
        constants$808.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     struct  ChunkStarted;
     *     struct  ChunkFinished;
     *     struct  StreamStarted;
     *     struct  StreamFinished;
     *     struct  PollContinue;
     *     struct  Error;
     * };
     * }
     */
    public static final class Info {

        // Suppresses default constructor, ensuring non-instantiability.
        private Info() {}
        public static MemoryLayout $LAYOUT() {
            return constants$808.const$4;
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD dwStreamNumber;
         *     DWORD dwReserved;
         *     HANDLE hSourceFile;
         *     HANDLE hDestinationFile;
         *     ULARGE_INTEGER uliChunkNumber;
         *     ULARGE_INTEGER uliChunkSize;
         *     ULARGE_INTEGER uliStreamSize;
         *     ULARGE_INTEGER uliTotalFileSize;
         * };
         * }
         */
        public static final class ChunkStarted {

            // Suppresses default constructor, ensuring non-instantiability.
            private ChunkStarted() {}
            public static MemoryLayout $LAYOUT() {
                return constants$808.const$5;
            }
            public static VarHandle dwStreamNumber$VH() {
                return constants$809.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static int dwStreamNumber$get(MemorySegment seg) {
                return (int)constants$809.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static void dwStreamNumber$set(MemorySegment seg, int x) {
                constants$809.const$0.set(seg, x);
            }
            public static int dwStreamNumber$get(MemorySegment seg, long index) {
                return (int)constants$809.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void dwStreamNumber$set(MemorySegment seg, long index, int x) {
                constants$809.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle dwReserved$VH() {
                return constants$809.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static int dwReserved$get(MemorySegment seg) {
                return (int)constants$809.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static void dwReserved$set(MemorySegment seg, int x) {
                constants$809.const$1.set(seg, x);
            }
            public static int dwReserved$get(MemorySegment seg, long index) {
                return (int)constants$809.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void dwReserved$set(MemorySegment seg, long index, int x) {
                constants$809.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hSourceFile$VH() {
                return constants$809.const$2;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HANDLE hSourceFile;
             * }
             */
            public static MemorySegment hSourceFile$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$809.const$2.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HANDLE hSourceFile;
             * }
             */
            public static void hSourceFile$set(MemorySegment seg, MemorySegment x) {
                constants$809.const$2.set(seg, x);
            }
            public static MemorySegment hSourceFile$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$809.const$2.get(seg.asSlice(index*sizeof()));
            }
            public static void hSourceFile$set(MemorySegment seg, long index, MemorySegment x) {
                constants$809.const$2.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hDestinationFile$VH() {
                return constants$809.const$3;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HANDLE hDestinationFile;
             * }
             */
            public static MemorySegment hDestinationFile$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$809.const$3.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HANDLE hDestinationFile;
             * }
             */
            public static void hDestinationFile$set(MemorySegment seg, MemorySegment x) {
                constants$809.const$3.set(seg, x);
            }
            public static MemorySegment hDestinationFile$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$809.const$3.get(seg.asSlice(index*sizeof()));
            }
            public static void hDestinationFile$set(MemorySegment seg, long index, MemorySegment x) {
                constants$809.const$3.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment uliChunkNumber$slice(MemorySegment seg) {
                return seg.asSlice(24, 8);
            }
            public static MemorySegment uliChunkSize$slice(MemorySegment seg) {
                return seg.asSlice(32, 8);
            }
            public static MemorySegment uliStreamSize$slice(MemorySegment seg) {
                return seg.asSlice(40, 8);
            }
            public static MemorySegment uliTotalFileSize$slice(MemorySegment seg) {
                return seg.asSlice(48, 8);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment ChunkStarted$slice(MemorySegment seg) {
            return seg.asSlice(0, 56);
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD dwStreamNumber;
         *     DWORD dwFlags;
         *     HANDLE hSourceFile;
         *     HANDLE hDestinationFile;
         *     ULARGE_INTEGER uliChunkNumber;
         *     ULARGE_INTEGER uliChunkSize;
         *     ULARGE_INTEGER uliStreamSize;
         *     ULARGE_INTEGER uliStreamBytesTransferred;
         *     ULARGE_INTEGER uliTotalFileSize;
         *     ULARGE_INTEGER uliTotalBytesTransferred;
         * };
         * }
         */
        public static final class ChunkFinished {

            // Suppresses default constructor, ensuring non-instantiability.
            private ChunkFinished() {}
            public static MemoryLayout $LAYOUT() {
                return constants$809.const$4;
            }
            public static VarHandle dwStreamNumber$VH() {
                return constants$809.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static int dwStreamNumber$get(MemorySegment seg) {
                return (int)constants$809.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static void dwStreamNumber$set(MemorySegment seg, int x) {
                constants$809.const$5.set(seg, x);
            }
            public static int dwStreamNumber$get(MemorySegment seg, long index) {
                return (int)constants$809.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void dwStreamNumber$set(MemorySegment seg, long index, int x) {
                constants$809.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle dwFlags$VH() {
                return constants$810.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwFlags;
             * }
             */
            public static int dwFlags$get(MemorySegment seg) {
                return (int)constants$810.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwFlags;
             * }
             */
            public static void dwFlags$set(MemorySegment seg, int x) {
                constants$810.const$0.set(seg, x);
            }
            public static int dwFlags$get(MemorySegment seg, long index) {
                return (int)constants$810.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void dwFlags$set(MemorySegment seg, long index, int x) {
                constants$810.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hSourceFile$VH() {
                return constants$810.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HANDLE hSourceFile;
             * }
             */
            public static MemorySegment hSourceFile$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$810.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HANDLE hSourceFile;
             * }
             */
            public static void hSourceFile$set(MemorySegment seg, MemorySegment x) {
                constants$810.const$1.set(seg, x);
            }
            public static MemorySegment hSourceFile$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$810.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void hSourceFile$set(MemorySegment seg, long index, MemorySegment x) {
                constants$810.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hDestinationFile$VH() {
                return constants$810.const$2;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HANDLE hDestinationFile;
             * }
             */
            public static MemorySegment hDestinationFile$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$810.const$2.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HANDLE hDestinationFile;
             * }
             */
            public static void hDestinationFile$set(MemorySegment seg, MemorySegment x) {
                constants$810.const$2.set(seg, x);
            }
            public static MemorySegment hDestinationFile$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$810.const$2.get(seg.asSlice(index*sizeof()));
            }
            public static void hDestinationFile$set(MemorySegment seg, long index, MemorySegment x) {
                constants$810.const$2.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment uliChunkNumber$slice(MemorySegment seg) {
                return seg.asSlice(24, 8);
            }
            public static MemorySegment uliChunkSize$slice(MemorySegment seg) {
                return seg.asSlice(32, 8);
            }
            public static MemorySegment uliStreamSize$slice(MemorySegment seg) {
                return seg.asSlice(40, 8);
            }
            public static MemorySegment uliStreamBytesTransferred$slice(MemorySegment seg) {
                return seg.asSlice(48, 8);
            }
            public static MemorySegment uliTotalFileSize$slice(MemorySegment seg) {
                return seg.asSlice(56, 8);
            }
            public static MemorySegment uliTotalBytesTransferred$slice(MemorySegment seg) {
                return seg.asSlice(64, 8);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment ChunkFinished$slice(MemorySegment seg) {
            return seg.asSlice(0, 72);
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD dwStreamNumber;
         *     DWORD dwReserved;
         *     HANDLE hSourceFile;
         *     HANDLE hDestinationFile;
         *     ULARGE_INTEGER uliStreamSize;
         *     ULARGE_INTEGER uliTotalFileSize;
         * };
         * }
         */
        public static final class StreamStarted {

            // Suppresses default constructor, ensuring non-instantiability.
            private StreamStarted() {}
            public static MemoryLayout $LAYOUT() {
                return constants$810.const$3;
            }
            public static VarHandle dwStreamNumber$VH() {
                return constants$810.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static int dwStreamNumber$get(MemorySegment seg) {
                return (int)constants$810.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static void dwStreamNumber$set(MemorySegment seg, int x) {
                constants$810.const$4.set(seg, x);
            }
            public static int dwStreamNumber$get(MemorySegment seg, long index) {
                return (int)constants$810.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void dwStreamNumber$set(MemorySegment seg, long index, int x) {
                constants$810.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle dwReserved$VH() {
                return constants$810.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static int dwReserved$get(MemorySegment seg) {
                return (int)constants$810.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static void dwReserved$set(MemorySegment seg, int x) {
                constants$810.const$5.set(seg, x);
            }
            public static int dwReserved$get(MemorySegment seg, long index) {
                return (int)constants$810.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void dwReserved$set(MemorySegment seg, long index, int x) {
                constants$810.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hSourceFile$VH() {
                return constants$811.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HANDLE hSourceFile;
             * }
             */
            public static MemorySegment hSourceFile$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$811.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HANDLE hSourceFile;
             * }
             */
            public static void hSourceFile$set(MemorySegment seg, MemorySegment x) {
                constants$811.const$0.set(seg, x);
            }
            public static MemorySegment hSourceFile$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$811.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void hSourceFile$set(MemorySegment seg, long index, MemorySegment x) {
                constants$811.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hDestinationFile$VH() {
                return constants$811.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HANDLE hDestinationFile;
             * }
             */
            public static MemorySegment hDestinationFile$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$811.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HANDLE hDestinationFile;
             * }
             */
            public static void hDestinationFile$set(MemorySegment seg, MemorySegment x) {
                constants$811.const$1.set(seg, x);
            }
            public static MemorySegment hDestinationFile$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$811.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void hDestinationFile$set(MemorySegment seg, long index, MemorySegment x) {
                constants$811.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment uliStreamSize$slice(MemorySegment seg) {
                return seg.asSlice(24, 8);
            }
            public static MemorySegment uliTotalFileSize$slice(MemorySegment seg) {
                return seg.asSlice(32, 8);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment StreamStarted$slice(MemorySegment seg) {
            return seg.asSlice(0, 40);
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD dwStreamNumber;
         *     DWORD dwReserved;
         *     HANDLE hSourceFile;
         *     HANDLE hDestinationFile;
         *     ULARGE_INTEGER uliStreamSize;
         *     ULARGE_INTEGER uliStreamBytesTransferred;
         *     ULARGE_INTEGER uliTotalFileSize;
         *     ULARGE_INTEGER uliTotalBytesTransferred;
         * };
         * }
         */
        public static final class StreamFinished {

            // Suppresses default constructor, ensuring non-instantiability.
            private StreamFinished() {}
            public static MemoryLayout $LAYOUT() {
                return constants$811.const$2;
            }
            public static VarHandle dwStreamNumber$VH() {
                return constants$811.const$3;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static int dwStreamNumber$get(MemorySegment seg) {
                return (int)constants$811.const$3.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static void dwStreamNumber$set(MemorySegment seg, int x) {
                constants$811.const$3.set(seg, x);
            }
            public static int dwStreamNumber$get(MemorySegment seg, long index) {
                return (int)constants$811.const$3.get(seg.asSlice(index*sizeof()));
            }
            public static void dwStreamNumber$set(MemorySegment seg, long index, int x) {
                constants$811.const$3.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle dwReserved$VH() {
                return constants$811.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static int dwReserved$get(MemorySegment seg) {
                return (int)constants$811.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static void dwReserved$set(MemorySegment seg, int x) {
                constants$811.const$4.set(seg, x);
            }
            public static int dwReserved$get(MemorySegment seg, long index) {
                return (int)constants$811.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void dwReserved$set(MemorySegment seg, long index, int x) {
                constants$811.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hSourceFile$VH() {
                return constants$811.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HANDLE hSourceFile;
             * }
             */
            public static MemorySegment hSourceFile$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$811.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HANDLE hSourceFile;
             * }
             */
            public static void hSourceFile$set(MemorySegment seg, MemorySegment x) {
                constants$811.const$5.set(seg, x);
            }
            public static MemorySegment hSourceFile$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$811.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void hSourceFile$set(MemorySegment seg, long index, MemorySegment x) {
                constants$811.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hDestinationFile$VH() {
                return constants$812.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HANDLE hDestinationFile;
             * }
             */
            public static MemorySegment hDestinationFile$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$812.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HANDLE hDestinationFile;
             * }
             */
            public static void hDestinationFile$set(MemorySegment seg, MemorySegment x) {
                constants$812.const$0.set(seg, x);
            }
            public static MemorySegment hDestinationFile$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$812.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void hDestinationFile$set(MemorySegment seg, long index, MemorySegment x) {
                constants$812.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment uliStreamSize$slice(MemorySegment seg) {
                return seg.asSlice(24, 8);
            }
            public static MemorySegment uliStreamBytesTransferred$slice(MemorySegment seg) {
                return seg.asSlice(32, 8);
            }
            public static MemorySegment uliTotalFileSize$slice(MemorySegment seg) {
                return seg.asSlice(40, 8);
            }
            public static MemorySegment uliTotalBytesTransferred$slice(MemorySegment seg) {
                return seg.asSlice(48, 8);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment StreamFinished$slice(MemorySegment seg) {
            return seg.asSlice(0, 56);
        }
        /**
         * {@snippet :
         * struct {
         *     DWORD dwReserved;
         * };
         * }
         */
        public static final class PollContinue {

            // Suppresses default constructor, ensuring non-instantiability.
            private PollContinue() {}
            public static MemoryLayout $LAYOUT() {
                return constants$812.const$1;
            }
            public static VarHandle dwReserved$VH() {
                return constants$812.const$2;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static int dwReserved$get(MemorySegment seg) {
                return (int)constants$812.const$2.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static void dwReserved$set(MemorySegment seg, int x) {
                constants$812.const$2.set(seg, x);
            }
            public static int dwReserved$get(MemorySegment seg, long index) {
                return (int)constants$812.const$2.get(seg.asSlice(index*sizeof()));
            }
            public static void dwReserved$set(MemorySegment seg, long index, int x) {
                constants$812.const$2.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment PollContinue$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        /**
         * {@snippet :
         * struct {
         *     COPYFILE2_COPY_PHASE CopyPhase;
         *     DWORD dwStreamNumber;
         *     HRESULT hrFailure;
         *     DWORD dwReserved;
         *     ULARGE_INTEGER uliChunkNumber;
         *     ULARGE_INTEGER uliStreamSize;
         *     ULARGE_INTEGER uliStreamBytesTransferred;
         *     ULARGE_INTEGER uliTotalFileSize;
         *     ULARGE_INTEGER uliTotalBytesTransferred;
         * };
         * }
         */
        public static final class Error {

            // Suppresses default constructor, ensuring non-instantiability.
            private Error() {}
            public static MemoryLayout $LAYOUT() {
                return constants$812.const$3;
            }
            public static VarHandle CopyPhase$VH() {
                return constants$812.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * COPYFILE2_COPY_PHASE CopyPhase;
             * }
             */
            public static int CopyPhase$get(MemorySegment seg) {
                return (int)constants$812.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * COPYFILE2_COPY_PHASE CopyPhase;
             * }
             */
            public static void CopyPhase$set(MemorySegment seg, int x) {
                constants$812.const$4.set(seg, x);
            }
            public static int CopyPhase$get(MemorySegment seg, long index) {
                return (int)constants$812.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void CopyPhase$set(MemorySegment seg, long index, int x) {
                constants$812.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle dwStreamNumber$VH() {
                return constants$812.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static int dwStreamNumber$get(MemorySegment seg) {
                return (int)constants$812.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwStreamNumber;
             * }
             */
            public static void dwStreamNumber$set(MemorySegment seg, int x) {
                constants$812.const$5.set(seg, x);
            }
            public static int dwStreamNumber$get(MemorySegment seg, long index) {
                return (int)constants$812.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void dwStreamNumber$set(MemorySegment seg, long index, int x) {
                constants$812.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle hrFailure$VH() {
                return constants$813.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * HRESULT hrFailure;
             * }
             */
            public static int hrFailure$get(MemorySegment seg) {
                return (int)constants$813.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * HRESULT hrFailure;
             * }
             */
            public static void hrFailure$set(MemorySegment seg, int x) {
                constants$813.const$0.set(seg, x);
            }
            public static int hrFailure$get(MemorySegment seg, long index) {
                return (int)constants$813.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void hrFailure$set(MemorySegment seg, long index, int x) {
                constants$813.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle dwReserved$VH() {
                return constants$813.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static int dwReserved$get(MemorySegment seg) {
                return (int)constants$813.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD dwReserved;
             * }
             */
            public static void dwReserved$set(MemorySegment seg, int x) {
                constants$813.const$1.set(seg, x);
            }
            public static int dwReserved$get(MemorySegment seg, long index) {
                return (int)constants$813.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void dwReserved$set(MemorySegment seg, long index, int x) {
                constants$813.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment uliChunkNumber$slice(MemorySegment seg) {
                return seg.asSlice(16, 8);
            }
            public static MemorySegment uliStreamSize$slice(MemorySegment seg) {
                return seg.asSlice(24, 8);
            }
            public static MemorySegment uliStreamBytesTransferred$slice(MemorySegment seg) {
                return seg.asSlice(32, 8);
            }
            public static MemorySegment uliTotalFileSize$slice(MemorySegment seg) {
                return seg.asSlice(40, 8);
            }
            public static MemorySegment uliTotalBytesTransferred$slice(MemorySegment seg) {
                return seg.asSlice(48, 8);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment Error$slice(MemorySegment seg) {
            return seg.asSlice(0, 56);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment Info$slice(MemorySegment seg) {
        return seg.asSlice(8, 72);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


