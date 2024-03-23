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
 * struct {
 *     EPrintPropertyType ePropertyType;
 *     union {
 *         BYTE propertyByte;
 *         PWSTR propertyString;
 *         LONG propertyInt32;
 *         LONGLONG propertyInt64;
 *         struct {
 *             DWORD cbBuf;
 *             LPVOID pBuf;
 *         } propertyBlob;
 *     } value;
 * }
 * }
 */
public class PrintPropertyValue {

    PrintPropertyValue() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("ePropertyType"),
        MemoryLayout.paddingLayout(4),
        PrintPropertyValue.value.layout().withName("value")
    ).withName("$anon$3712:13");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ePropertyType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ePropertyType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EPrintPropertyType ePropertyType
     * }
     */
    public static final OfInt ePropertyType$layout() {
        return ePropertyType$LAYOUT;
    }

    private static final long ePropertyType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EPrintPropertyType ePropertyType
     * }
     */
    public static final long ePropertyType$offset() {
        return ePropertyType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EPrintPropertyType ePropertyType
     * }
     */
    public static int ePropertyType(MemorySegment struct) {
        return struct.get(ePropertyType$LAYOUT, ePropertyType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EPrintPropertyType ePropertyType
     * }
     */
    public static void ePropertyType(MemorySegment struct, int fieldValue) {
        struct.set(ePropertyType$LAYOUT, ePropertyType$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     BYTE propertyByte;
     *     PWSTR propertyString;
     *     LONG propertyInt32;
     *     LONGLONG propertyInt64;
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } propertyBlob;
     * }
     * }
     */
    public static class value {

        value() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            Windows_h.C_CHAR.withName("propertyByte"),
            Windows_h.C_POINTER.withName("propertyString"),
            Windows_h.C_LONG.withName("propertyInt32"),
            Windows_h.C_LONG_LONG.withName("propertyInt64"),
            PrintPropertyValue.value.propertyBlob.layout().withName("propertyBlob")
        ).withName("$anon$3715:9");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfByte propertyByte$LAYOUT = (OfByte)$LAYOUT.select(groupElement("propertyByte"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE propertyByte
         * }
         */
        public static final OfByte propertyByte$layout() {
            return propertyByte$LAYOUT;
        }

        private static final long propertyByte$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE propertyByte
         * }
         */
        public static final long propertyByte$offset() {
            return propertyByte$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE propertyByte
         * }
         */
        public static byte propertyByte(MemorySegment union) {
            return union.get(propertyByte$LAYOUT, propertyByte$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE propertyByte
         * }
         */
        public static void propertyByte(MemorySegment union, byte fieldValue) {
            union.set(propertyByte$LAYOUT, propertyByte$OFFSET, fieldValue);
        }

        private static final AddressLayout propertyString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("propertyString"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * PWSTR propertyString
         * }
         */
        public static final AddressLayout propertyString$layout() {
            return propertyString$LAYOUT;
        }

        private static final long propertyString$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * PWSTR propertyString
         * }
         */
        public static final long propertyString$offset() {
            return propertyString$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * PWSTR propertyString
         * }
         */
        public static MemorySegment propertyString(MemorySegment union) {
            return union.get(propertyString$LAYOUT, propertyString$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * PWSTR propertyString
         * }
         */
        public static void propertyString(MemorySegment union, MemorySegment fieldValue) {
            union.set(propertyString$LAYOUT, propertyString$OFFSET, fieldValue);
        }

        private static final OfInt propertyInt32$LAYOUT = (OfInt)$LAYOUT.select(groupElement("propertyInt32"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LONG propertyInt32
         * }
         */
        public static final OfInt propertyInt32$layout() {
            return propertyInt32$LAYOUT;
        }

        private static final long propertyInt32$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LONG propertyInt32
         * }
         */
        public static final long propertyInt32$offset() {
            return propertyInt32$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LONG propertyInt32
         * }
         */
        public static int propertyInt32(MemorySegment union) {
            return union.get(propertyInt32$LAYOUT, propertyInt32$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LONG propertyInt32
         * }
         */
        public static void propertyInt32(MemorySegment union, int fieldValue) {
            union.set(propertyInt32$LAYOUT, propertyInt32$OFFSET, fieldValue);
        }

        private static final OfLong propertyInt64$LAYOUT = (OfLong)$LAYOUT.select(groupElement("propertyInt64"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LONGLONG propertyInt64
         * }
         */
        public static final OfLong propertyInt64$layout() {
            return propertyInt64$LAYOUT;
        }

        private static final long propertyInt64$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LONGLONG propertyInt64
         * }
         */
        public static final long propertyInt64$offset() {
            return propertyInt64$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LONGLONG propertyInt64
         * }
         */
        public static long propertyInt64(MemorySegment union) {
            return union.get(propertyInt64$LAYOUT, propertyInt64$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LONGLONG propertyInt64
         * }
         */
        public static void propertyInt64(MemorySegment union, long fieldValue) {
            union.set(propertyInt64$LAYOUT, propertyInt64$OFFSET, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * }
         * }
         */
        public static class propertyBlob {

            propertyBlob() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                Windows_h.C_LONG.withName("cbBuf"),
                MemoryLayout.paddingLayout(4),
                Windows_h.C_POINTER.withName("pBuf")
            ).withName("$anon$3721:13");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfInt cbBuf$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbBuf"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * DWORD cbBuf
             * }
             */
            public static final OfInt cbBuf$layout() {
                return cbBuf$LAYOUT;
            }

            private static final long cbBuf$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * DWORD cbBuf
             * }
             */
            public static final long cbBuf$offset() {
                return cbBuf$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * DWORD cbBuf
             * }
             */
            public static int cbBuf(MemorySegment struct) {
                return struct.get(cbBuf$LAYOUT, cbBuf$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * DWORD cbBuf
             * }
             */
            public static void cbBuf(MemorySegment struct, int fieldValue) {
                struct.set(cbBuf$LAYOUT, cbBuf$OFFSET, fieldValue);
            }

            private static final AddressLayout pBuf$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pBuf"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * LPVOID pBuf
             * }
             */
            public static final AddressLayout pBuf$layout() {
                return pBuf$LAYOUT;
            }

            private static final long pBuf$OFFSET = 8;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * LPVOID pBuf
             * }
             */
            public static final long pBuf$offset() {
                return pBuf$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * LPVOID pBuf
             * }
             */
            public static MemorySegment pBuf(MemorySegment struct) {
                return struct.get(pBuf$LAYOUT, pBuf$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * LPVOID pBuf
             * }
             */
            public static void pBuf(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(pBuf$LAYOUT, pBuf$OFFSET, fieldValue);
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

        private static final GroupLayout propertyBlob$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("propertyBlob"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * } propertyBlob
         * }
         */
        public static final GroupLayout propertyBlob$layout() {
            return propertyBlob$LAYOUT;
        }

        private static final long propertyBlob$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * } propertyBlob
         * }
         */
        public static final long propertyBlob$offset() {
            return propertyBlob$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * } propertyBlob
         * }
         */
        public static MemorySegment propertyBlob(MemorySegment union) {
            return union.asSlice(propertyBlob$OFFSET, propertyBlob$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * } propertyBlob
         * }
         */
        public static void propertyBlob(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, propertyBlob$OFFSET, propertyBlob$LAYOUT.byteSize());
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

    private static final GroupLayout value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     BYTE propertyByte;
     *     PWSTR propertyString;
     *     LONG propertyInt32;
     *     LONGLONG propertyInt64;
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } propertyBlob;
     * } value
     * }
     */
    public static final GroupLayout value$layout() {
        return value$LAYOUT;
    }

    private static final long value$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     BYTE propertyByte;
     *     PWSTR propertyString;
     *     LONG propertyInt32;
     *     LONGLONG propertyInt64;
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } propertyBlob;
     * } value
     * }
     */
    public static final long value$offset() {
        return value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     BYTE propertyByte;
     *     PWSTR propertyString;
     *     LONG propertyInt32;
     *     LONGLONG propertyInt64;
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } propertyBlob;
     * } value
     * }
     */
    public static MemorySegment value(MemorySegment struct) {
        return struct.asSlice(value$OFFSET, value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     BYTE propertyByte;
     *     PWSTR propertyString;
     *     LONG propertyInt32;
     *     LONGLONG propertyInt64;
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } propertyBlob;
     * } value
     * }
     */
    public static void value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, value$OFFSET, value$LAYOUT.byteSize());
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

