// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * struct _PRINTER_NOTIFY_INFO_DATA {
 *     WORD Type;
 *     WORD Field;
 *     DWORD Reserved;
 *     DWORD Id;
 *     union {
 *         DWORD adwData[2];
 *         struct {
 *             DWORD cbBuf;
 *             LPVOID pBuf;
 *         } Data;
 *     } NotifyData;
 * }
 * }
 */
public class _PRINTER_NOTIFY_INFO_DATA {

    _PRINTER_NOTIFY_INFO_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("Type"),
        Windows_h.C_SHORT.withName("Field"),
        Windows_h.C_LONG.withName("Reserved"),
        Windows_h.C_LONG.withName("Id"),
        MemoryLayout.paddingLayout(4),
        _PRINTER_NOTIFY_INFO_DATA.NotifyData.layout().withName("NotifyData")
    ).withName("_PRINTER_NOTIFY_INFO_DATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Type$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static final OfShort Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static short Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static void Type(MemorySegment struct, short fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final OfShort Field$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Field"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Field
     * }
     */
    public static final OfShort Field$layout() {
        return Field$LAYOUT;
    }

    private static final long Field$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Field
     * }
     */
    public static final long Field$offset() {
        return Field$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Field
     * }
     */
    public static short Field(MemorySegment struct) {
        return struct.get(Field$LAYOUT, Field$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Field
     * }
     */
    public static void Field(MemorySegment struct, short fieldValue) {
        struct.set(Field$LAYOUT, Field$OFFSET, fieldValue);
    }

    private static final OfInt Reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final OfInt Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static int Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, int fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfInt Id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Id
     * }
     */
    public static final OfInt Id$layout() {
        return Id$LAYOUT;
    }

    private static final long Id$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Id
     * }
     */
    public static final long Id$offset() {
        return Id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Id
     * }
     */
    public static int Id(MemorySegment struct) {
        return struct.get(Id$LAYOUT, Id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Id
     * }
     */
    public static void Id(MemorySegment struct, int fieldValue) {
        struct.set(Id$LAYOUT, Id$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     DWORD adwData[2];
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } Data;
     * }
     * }
     */
    public static class NotifyData {

        NotifyData() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(2, Windows_h.C_LONG).withName("adwData"),
            _PRINTER_NOTIFY_INFO_DATA.NotifyData.Data.layout().withName("Data")
        ).withName("$anon$2433:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final SequenceLayout adwData$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("adwData"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD adwData[2]
         * }
         */
        public static final SequenceLayout adwData$layout() {
            return adwData$LAYOUT;
        }

        private static final long adwData$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD adwData[2]
         * }
         */
        public static final long adwData$offset() {
            return adwData$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD adwData[2]
         * }
         */
        public static MemorySegment adwData(MemorySegment union) {
            return union.asSlice(adwData$OFFSET, adwData$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD adwData[2]
         * }
         */
        public static void adwData(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, adwData$OFFSET, adwData$LAYOUT.byteSize());
        }

        private static long[] adwData$DIMS = { 2 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * DWORD adwData[2]
         * }
         */
        public static long[] adwData$dimensions() {
            return adwData$DIMS;
        }
        private static final VarHandle adwData$ELEM_HANDLE = adwData$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * DWORD adwData[2]
         * }
         */
        public static int adwData(MemorySegment union, long index0) {
            return (int)adwData$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * DWORD adwData[2]
         * }
         */
        public static void adwData(MemorySegment union, long index0, int fieldValue) {
            adwData$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * }
         * }
         */
        public static class Data {

            Data() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                Windows_h.C_LONG.withName("cbBuf"),
                MemoryLayout.paddingLayout(4),
                Windows_h.C_POINTER.withName("pBuf")
            ).withName("$anon$2435:9");

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

        private static final GroupLayout Data$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Data"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * } Data
         * }
         */
        public static final GroupLayout Data$layout() {
            return Data$LAYOUT;
        }

        private static final long Data$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * } Data
         * }
         */
        public static final long Data$offset() {
            return Data$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * } Data
         * }
         */
        public static MemorySegment Data(MemorySegment union) {
            return union.asSlice(Data$OFFSET, Data$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD cbBuf;
         *     LPVOID pBuf;
         * } Data
         * }
         */
        public static void Data(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, Data$OFFSET, Data$LAYOUT.byteSize());
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

    private static final GroupLayout NotifyData$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("NotifyData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     DWORD adwData[2];
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } Data;
     * } NotifyData
     * }
     */
    public static final GroupLayout NotifyData$layout() {
        return NotifyData$LAYOUT;
    }

    private static final long NotifyData$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     DWORD adwData[2];
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } Data;
     * } NotifyData
     * }
     */
    public static final long NotifyData$offset() {
        return NotifyData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     DWORD adwData[2];
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } Data;
     * } NotifyData
     * }
     */
    public static MemorySegment NotifyData(MemorySegment struct) {
        return struct.asSlice(NotifyData$OFFSET, NotifyData$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     DWORD adwData[2];
     *     struct {
     *         DWORD cbBuf;
     *         LPVOID pBuf;
     *     } Data;
     * } NotifyData
     * }
     */
    public static void NotifyData(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, NotifyData$OFFSET, NotifyData$LAYOUT.byteSize());
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
