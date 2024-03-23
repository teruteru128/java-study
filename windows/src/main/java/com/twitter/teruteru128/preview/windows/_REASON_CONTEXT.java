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
 * struct _REASON_CONTEXT {
 *     ULONG Version;
 *     DWORD Flags;
 *     union {
 *         struct {
 *             HMODULE LocalizedReasonModule;
 *             ULONG LocalizedReasonId;
 *             ULONG ReasonStringCount;
 *             LPWSTR *ReasonStrings;
 *         } Detailed;
 *         LPWSTR SimpleReasonString;
 *     } Reason;
 * }
 * }
 */
public class _REASON_CONTEXT {

    _REASON_CONTEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("Flags"),
        _REASON_CONTEXT.Reason.layout().withName("Reason")
    ).withName("_REASON_CONTEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     struct {
     *         HMODULE LocalizedReasonModule;
     *         ULONG LocalizedReasonId;
     *         ULONG ReasonStringCount;
     *         LPWSTR *ReasonStrings;
     *     } Detailed;
     *     LPWSTR SimpleReasonString;
     * }
     * }
     */
    public static class Reason {

        Reason() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            _REASON_CONTEXT.Reason.Detailed.layout().withName("Detailed"),
            Windows_h.C_POINTER.withName("SimpleReasonString")
        ).withName("$anon$268:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     HMODULE LocalizedReasonModule;
         *     ULONG LocalizedReasonId;
         *     ULONG ReasonStringCount;
         *     LPWSTR *ReasonStrings;
         * }
         * }
         */
        public static class Detailed {

            Detailed() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                Windows_h.C_POINTER.withName("LocalizedReasonModule"),
                Windows_h.C_LONG.withName("LocalizedReasonId"),
                Windows_h.C_LONG.withName("ReasonStringCount"),
                Windows_h.C_POINTER.withName("ReasonStrings")
            ).withName("$anon$269:9");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final AddressLayout LocalizedReasonModule$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("LocalizedReasonModule"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * HMODULE LocalizedReasonModule
             * }
             */
            public static final AddressLayout LocalizedReasonModule$layout() {
                return LocalizedReasonModule$LAYOUT;
            }

            private static final long LocalizedReasonModule$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * HMODULE LocalizedReasonModule
             * }
             */
            public static final long LocalizedReasonModule$offset() {
                return LocalizedReasonModule$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * HMODULE LocalizedReasonModule
             * }
             */
            public static MemorySegment LocalizedReasonModule(MemorySegment struct) {
                return struct.get(LocalizedReasonModule$LAYOUT, LocalizedReasonModule$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * HMODULE LocalizedReasonModule
             * }
             */
            public static void LocalizedReasonModule(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(LocalizedReasonModule$LAYOUT, LocalizedReasonModule$OFFSET, fieldValue);
            }

            private static final OfInt LocalizedReasonId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LocalizedReasonId"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * ULONG LocalizedReasonId
             * }
             */
            public static final OfInt LocalizedReasonId$layout() {
                return LocalizedReasonId$LAYOUT;
            }

            private static final long LocalizedReasonId$OFFSET = 8;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * ULONG LocalizedReasonId
             * }
             */
            public static final long LocalizedReasonId$offset() {
                return LocalizedReasonId$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * ULONG LocalizedReasonId
             * }
             */
            public static int LocalizedReasonId(MemorySegment struct) {
                return struct.get(LocalizedReasonId$LAYOUT, LocalizedReasonId$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * ULONG LocalizedReasonId
             * }
             */
            public static void LocalizedReasonId(MemorySegment struct, int fieldValue) {
                struct.set(LocalizedReasonId$LAYOUT, LocalizedReasonId$OFFSET, fieldValue);
            }

            private static final OfInt ReasonStringCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ReasonStringCount"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * ULONG ReasonStringCount
             * }
             */
            public static final OfInt ReasonStringCount$layout() {
                return ReasonStringCount$LAYOUT;
            }

            private static final long ReasonStringCount$OFFSET = 12;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * ULONG ReasonStringCount
             * }
             */
            public static final long ReasonStringCount$offset() {
                return ReasonStringCount$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * ULONG ReasonStringCount
             * }
             */
            public static int ReasonStringCount(MemorySegment struct) {
                return struct.get(ReasonStringCount$LAYOUT, ReasonStringCount$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * ULONG ReasonStringCount
             * }
             */
            public static void ReasonStringCount(MemorySegment struct, int fieldValue) {
                struct.set(ReasonStringCount$LAYOUT, ReasonStringCount$OFFSET, fieldValue);
            }

            private static final AddressLayout ReasonStrings$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ReasonStrings"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * LPWSTR *ReasonStrings
             * }
             */
            public static final AddressLayout ReasonStrings$layout() {
                return ReasonStrings$LAYOUT;
            }

            private static final long ReasonStrings$OFFSET = 16;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * LPWSTR *ReasonStrings
             * }
             */
            public static final long ReasonStrings$offset() {
                return ReasonStrings$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * LPWSTR *ReasonStrings
             * }
             */
            public static MemorySegment ReasonStrings(MemorySegment struct) {
                return struct.get(ReasonStrings$LAYOUT, ReasonStrings$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * LPWSTR *ReasonStrings
             * }
             */
            public static void ReasonStrings(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(ReasonStrings$LAYOUT, ReasonStrings$OFFSET, fieldValue);
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

        private static final GroupLayout Detailed$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Detailed"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     HMODULE LocalizedReasonModule;
         *     ULONG LocalizedReasonId;
         *     ULONG ReasonStringCount;
         *     LPWSTR *ReasonStrings;
         * } Detailed
         * }
         */
        public static final GroupLayout Detailed$layout() {
            return Detailed$LAYOUT;
        }

        private static final long Detailed$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     HMODULE LocalizedReasonModule;
         *     ULONG LocalizedReasonId;
         *     ULONG ReasonStringCount;
         *     LPWSTR *ReasonStrings;
         * } Detailed
         * }
         */
        public static final long Detailed$offset() {
            return Detailed$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     HMODULE LocalizedReasonModule;
         *     ULONG LocalizedReasonId;
         *     ULONG ReasonStringCount;
         *     LPWSTR *ReasonStrings;
         * } Detailed
         * }
         */
        public static MemorySegment Detailed(MemorySegment union) {
            return union.asSlice(Detailed$OFFSET, Detailed$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     HMODULE LocalizedReasonModule;
         *     ULONG LocalizedReasonId;
         *     ULONG ReasonStringCount;
         *     LPWSTR *ReasonStrings;
         * } Detailed
         * }
         */
        public static void Detailed(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, Detailed$OFFSET, Detailed$LAYOUT.byteSize());
        }

        private static final AddressLayout SimpleReasonString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SimpleReasonString"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LPWSTR SimpleReasonString
         * }
         */
        public static final AddressLayout SimpleReasonString$layout() {
            return SimpleReasonString$LAYOUT;
        }

        private static final long SimpleReasonString$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LPWSTR SimpleReasonString
         * }
         */
        public static final long SimpleReasonString$offset() {
            return SimpleReasonString$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LPWSTR SimpleReasonString
         * }
         */
        public static MemorySegment SimpleReasonString(MemorySegment union) {
            return union.get(SimpleReasonString$LAYOUT, SimpleReasonString$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LPWSTR SimpleReasonString
         * }
         */
        public static void SimpleReasonString(MemorySegment union, MemorySegment fieldValue) {
            union.set(SimpleReasonString$LAYOUT, SimpleReasonString$OFFSET, fieldValue);
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

    private static final GroupLayout Reason$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Reason"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         HMODULE LocalizedReasonModule;
     *         ULONG LocalizedReasonId;
     *         ULONG ReasonStringCount;
     *         LPWSTR *ReasonStrings;
     *     } Detailed;
     *     LPWSTR SimpleReasonString;
     * } Reason
     * }
     */
    public static final GroupLayout Reason$layout() {
        return Reason$LAYOUT;
    }

    private static final long Reason$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         HMODULE LocalizedReasonModule;
     *         ULONG LocalizedReasonId;
     *         ULONG ReasonStringCount;
     *         LPWSTR *ReasonStrings;
     *     } Detailed;
     *     LPWSTR SimpleReasonString;
     * } Reason
     * }
     */
    public static final long Reason$offset() {
        return Reason$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         HMODULE LocalizedReasonModule;
     *         ULONG LocalizedReasonId;
     *         ULONG ReasonStringCount;
     *         LPWSTR *ReasonStrings;
     *     } Detailed;
     *     LPWSTR SimpleReasonString;
     * } Reason
     * }
     */
    public static MemorySegment Reason(MemorySegment struct) {
        return struct.asSlice(Reason$OFFSET, Reason$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         HMODULE LocalizedReasonModule;
     *         ULONG LocalizedReasonId;
     *         ULONG ReasonStringCount;
     *         LPWSTR *ReasonStrings;
     *     } Detailed;
     *     LPWSTR SimpleReasonString;
     * } Reason
     * }
     */
    public static void Reason(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reason$OFFSET, Reason$LAYOUT.byteSize());
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

