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
 * struct _TRANSACTION_NOTIFICATION {
 *     PVOID TransactionKey;
 *     ULONG TransactionNotification;
 *     LARGE_INTEGER TmVirtualClock;
 *     ULONG ArgumentLength;
 * }
 * }
 */
public class _TRANSACTION_NOTIFICATION {

    _TRANSACTION_NOTIFICATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("TransactionKey"),
        Windows_h.C_LONG.withName("TransactionNotification"),
        MemoryLayout.paddingLayout(4),
        _LARGE_INTEGER.layout().withName("TmVirtualClock"),
        Windows_h.C_LONG.withName("ArgumentLength"),
        MemoryLayout.paddingLayout(4)
    ).withName("_TRANSACTION_NOTIFICATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout TransactionKey$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("TransactionKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID TransactionKey
     * }
     */
    public static final AddressLayout TransactionKey$layout() {
        return TransactionKey$LAYOUT;
    }

    private static final long TransactionKey$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID TransactionKey
     * }
     */
    public static final long TransactionKey$offset() {
        return TransactionKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID TransactionKey
     * }
     */
    public static MemorySegment TransactionKey(MemorySegment struct) {
        return struct.get(TransactionKey$LAYOUT, TransactionKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID TransactionKey
     * }
     */
    public static void TransactionKey(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(TransactionKey$LAYOUT, TransactionKey$OFFSET, fieldValue);
    }

    private static final OfInt TransactionNotification$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TransactionNotification"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG TransactionNotification
     * }
     */
    public static final OfInt TransactionNotification$layout() {
        return TransactionNotification$LAYOUT;
    }

    private static final long TransactionNotification$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG TransactionNotification
     * }
     */
    public static final long TransactionNotification$offset() {
        return TransactionNotification$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG TransactionNotification
     * }
     */
    public static int TransactionNotification(MemorySegment struct) {
        return struct.get(TransactionNotification$LAYOUT, TransactionNotification$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG TransactionNotification
     * }
     */
    public static void TransactionNotification(MemorySegment struct, int fieldValue) {
        struct.set(TransactionNotification$LAYOUT, TransactionNotification$OFFSET, fieldValue);
    }

    private static final GroupLayout TmVirtualClock$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TmVirtualClock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TmVirtualClock
     * }
     */
    public static final GroupLayout TmVirtualClock$layout() {
        return TmVirtualClock$LAYOUT;
    }

    private static final long TmVirtualClock$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TmVirtualClock
     * }
     */
    public static final long TmVirtualClock$offset() {
        return TmVirtualClock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TmVirtualClock
     * }
     */
    public static MemorySegment TmVirtualClock(MemorySegment struct) {
        return struct.asSlice(TmVirtualClock$OFFSET, TmVirtualClock$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TmVirtualClock
     * }
     */
    public static void TmVirtualClock(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TmVirtualClock$OFFSET, TmVirtualClock$LAYOUT.byteSize());
    }

    private static final OfInt ArgumentLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ArgumentLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ArgumentLength
     * }
     */
    public static final OfInt ArgumentLength$layout() {
        return ArgumentLength$LAYOUT;
    }

    private static final long ArgumentLength$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ArgumentLength
     * }
     */
    public static final long ArgumentLength$offset() {
        return ArgumentLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ArgumentLength
     * }
     */
    public static int ArgumentLength(MemorySegment struct) {
        return struct.get(ArgumentLength$LAYOUT, ArgumentLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ArgumentLength
     * }
     */
    public static void ArgumentLength(MemorySegment struct, int fieldValue) {
        struct.set(ArgumentLength$LAYOUT, ArgumentLength$OFFSET, fieldValue);
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

