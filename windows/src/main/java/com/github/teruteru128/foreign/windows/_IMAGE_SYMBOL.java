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
 * struct _IMAGE_SYMBOL {
 *     union {
 *         BYTE ShortName[8];
 *         struct {
 *             DWORD Short;
 *             DWORD Long;
 *         } Name;
 *         DWORD LongName[2];
 *     } N;
 *     DWORD Value;
 *     SHORT SectionNumber;
 *     WORD Type;
 *     BYTE StorageClass;
 *     BYTE NumberOfAuxSymbols;
 * }
 * }
 */
public class _IMAGE_SYMBOL {

    _IMAGE_SYMBOL() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _IMAGE_SYMBOL.N.layout().withName("N"),
        Windows_h.align(Windows_h.C_LONG, 2).withName("Value"),
        Windows_h.C_SHORT.withName("SectionNumber"),
        Windows_h.C_SHORT.withName("Type"),
        Windows_h.C_CHAR.withName("StorageClass"),
        Windows_h.C_CHAR.withName("NumberOfAuxSymbols")
    ).withName("_IMAGE_SYMBOL");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * union {
     *     BYTE ShortName[8];
     *     struct {
     *         DWORD Short;
     *         DWORD Long;
     *     } Name;
     *     DWORD LongName[2];
     * }
     * }
     */
    public static class N {

        N() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(8, Windows_h.C_CHAR).withName("ShortName"),
            _IMAGE_SYMBOL.N.Name.layout().withName("Name"),
            MemoryLayout.sequenceLayout(2, Windows_h.align(Windows_h.C_LONG, 2)).withName("LongName")
        ).withName("$anon$18508:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final SequenceLayout ShortName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ShortName"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE ShortName[8]
         * }
         */
        public static final SequenceLayout ShortName$layout() {
            return ShortName$LAYOUT;
        }

        private static final long ShortName$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE ShortName[8]
         * }
         */
        public static final long ShortName$offset() {
            return ShortName$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE ShortName[8]
         * }
         */
        public static MemorySegment ShortName(MemorySegment union) {
            return union.asSlice(ShortName$OFFSET, ShortName$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE ShortName[8]
         * }
         */
        public static void ShortName(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ShortName$OFFSET, ShortName$LAYOUT.byteSize());
        }

        private static long[] ShortName$DIMS = { 8 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * BYTE ShortName[8]
         * }
         */
        public static long[] ShortName$dimensions() {
            return ShortName$DIMS;
        }
        private static final VarHandle ShortName$ELEM_HANDLE = ShortName$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * BYTE ShortName[8]
         * }
         */
        public static byte ShortName(MemorySegment union, long index0) {
            return (byte)ShortName$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * BYTE ShortName[8]
         * }
         */
        public static void ShortName(MemorySegment union, long index0, byte fieldValue) {
            ShortName$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     DWORD Short;
         *     DWORD Long;
         * }
         * }
         */
        public static class Name {

            Name() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                Windows_h.align(Windows_h.C_LONG, 2).withName("Short"),
                Windows_h.align(Windows_h.C_LONG, 2).withName("Long")
            ).withName("$anon$18510:9");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfInt Short$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Short"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * DWORD Short
             * }
             */
            public static final OfInt Short$layout() {
                return Short$LAYOUT;
            }

            private static final long Short$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * DWORD Short
             * }
             */
            public static final long Short$offset() {
                return Short$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * DWORD Short
             * }
             */
            public static int Short(MemorySegment struct) {
                return struct.get(Short$LAYOUT, Short$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * DWORD Short
             * }
             */
            public static void Short(MemorySegment struct, int fieldValue) {
                struct.set(Short$LAYOUT, Short$OFFSET, fieldValue);
            }

            private static final OfInt Long$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Long"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * DWORD Long
             * }
             */
            public static final OfInt Long$layout() {
                return Long$LAYOUT;
            }

            private static final long Long$OFFSET = 4;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * DWORD Long
             * }
             */
            public static final long Long$offset() {
                return Long$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * DWORD Long
             * }
             */
            public static int Long(MemorySegment struct) {
                return struct.get(Long$LAYOUT, Long$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * DWORD Long
             * }
             */
            public static void Long(MemorySegment struct, int fieldValue) {
                struct.set(Long$LAYOUT, Long$OFFSET, fieldValue);
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

        private static final GroupLayout Name$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Name"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD Short;
         *     DWORD Long;
         * } Name
         * }
         */
        public static final GroupLayout Name$layout() {
            return Name$LAYOUT;
        }

        private static final long Name$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD Short;
         *     DWORD Long;
         * } Name
         * }
         */
        public static final long Name$offset() {
            return Name$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD Short;
         *     DWORD Long;
         * } Name
         * }
         */
        public static MemorySegment Name(MemorySegment union) {
            return union.asSlice(Name$OFFSET, Name$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD Short;
         *     DWORD Long;
         * } Name
         * }
         */
        public static void Name(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, Name$OFFSET, Name$LAYOUT.byteSize());
        }

        private static final SequenceLayout LongName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("LongName"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD LongName[2]
         * }
         */
        public static final SequenceLayout LongName$layout() {
            return LongName$LAYOUT;
        }

        private static final long LongName$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD LongName[2]
         * }
         */
        public static final long LongName$offset() {
            return LongName$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD LongName[2]
         * }
         */
        public static MemorySegment LongName(MemorySegment union) {
            return union.asSlice(LongName$OFFSET, LongName$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD LongName[2]
         * }
         */
        public static void LongName(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, LongName$OFFSET, LongName$LAYOUT.byteSize());
        }

        private static long[] LongName$DIMS = { 2 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * DWORD LongName[2]
         * }
         */
        public static long[] LongName$dimensions() {
            return LongName$DIMS;
        }
        private static final VarHandle LongName$ELEM_HANDLE = LongName$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * DWORD LongName[2]
         * }
         */
        public static int LongName(MemorySegment union, long index0) {
            return (int)LongName$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * DWORD LongName[2]
         * }
         */
        public static void LongName(MemorySegment union, long index0, int fieldValue) {
            LongName$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
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

    private static final GroupLayout N$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("N"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     BYTE ShortName[8];
     *     struct {
     *         DWORD Short;
     *         DWORD Long;
     *     } Name;
     *     DWORD LongName[2];
     * } N
     * }
     */
    public static final GroupLayout N$layout() {
        return N$LAYOUT;
    }

    private static final long N$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     BYTE ShortName[8];
     *     struct {
     *         DWORD Short;
     *         DWORD Long;
     *     } Name;
     *     DWORD LongName[2];
     * } N
     * }
     */
    public static final long N$offset() {
        return N$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     BYTE ShortName[8];
     *     struct {
     *         DWORD Short;
     *         DWORD Long;
     *     } Name;
     *     DWORD LongName[2];
     * } N
     * }
     */
    public static MemorySegment N(MemorySegment struct) {
        return struct.asSlice(N$OFFSET, N$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     BYTE ShortName[8];
     *     struct {
     *         DWORD Short;
     *         DWORD Long;
     *     } Name;
     *     DWORD LongName[2];
     * } N
     * }
     */
    public static void N(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, N$OFFSET, N$LAYOUT.byteSize());
    }

    private static final OfInt Value$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Value
     * }
     */
    public static final OfInt Value$layout() {
        return Value$LAYOUT;
    }

    private static final long Value$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Value
     * }
     */
    public static final long Value$offset() {
        return Value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Value
     * }
     */
    public static int Value(MemorySegment struct) {
        return struct.get(Value$LAYOUT, Value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Value
     * }
     */
    public static void Value(MemorySegment struct, int fieldValue) {
        struct.set(Value$LAYOUT, Value$OFFSET, fieldValue);
    }

    private static final OfShort SectionNumber$LAYOUT = (OfShort)$LAYOUT.select(groupElement("SectionNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SHORT SectionNumber
     * }
     */
    public static final OfShort SectionNumber$layout() {
        return SectionNumber$LAYOUT;
    }

    private static final long SectionNumber$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SHORT SectionNumber
     * }
     */
    public static final long SectionNumber$offset() {
        return SectionNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SHORT SectionNumber
     * }
     */
    public static short SectionNumber(MemorySegment struct) {
        return struct.get(SectionNumber$LAYOUT, SectionNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SHORT SectionNumber
     * }
     */
    public static void SectionNumber(MemorySegment struct, short fieldValue) {
        struct.set(SectionNumber$LAYOUT, SectionNumber$OFFSET, fieldValue);
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

    private static final long Type$OFFSET = 14;

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

    private static final OfByte StorageClass$LAYOUT = (OfByte)$LAYOUT.select(groupElement("StorageClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE StorageClass
     * }
     */
    public static final OfByte StorageClass$layout() {
        return StorageClass$LAYOUT;
    }

    private static final long StorageClass$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE StorageClass
     * }
     */
    public static final long StorageClass$offset() {
        return StorageClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE StorageClass
     * }
     */
    public static byte StorageClass(MemorySegment struct) {
        return struct.get(StorageClass$LAYOUT, StorageClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE StorageClass
     * }
     */
    public static void StorageClass(MemorySegment struct, byte fieldValue) {
        struct.set(StorageClass$LAYOUT, StorageClass$OFFSET, fieldValue);
    }

    private static final OfByte NumberOfAuxSymbols$LAYOUT = (OfByte)$LAYOUT.select(groupElement("NumberOfAuxSymbols"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE NumberOfAuxSymbols
     * }
     */
    public static final OfByte NumberOfAuxSymbols$layout() {
        return NumberOfAuxSymbols$LAYOUT;
    }

    private static final long NumberOfAuxSymbols$OFFSET = 17;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE NumberOfAuxSymbols
     * }
     */
    public static final long NumberOfAuxSymbols$offset() {
        return NumberOfAuxSymbols$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE NumberOfAuxSymbols
     * }
     */
    public static byte NumberOfAuxSymbols(MemorySegment struct) {
        return struct.get(NumberOfAuxSymbols$LAYOUT, NumberOfAuxSymbols$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE NumberOfAuxSymbols
     * }
     */
    public static void NumberOfAuxSymbols(MemorySegment struct, byte fieldValue) {
        struct.set(NumberOfAuxSymbols$LAYOUT, NumberOfAuxSymbols$OFFSET, fieldValue);
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
