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
 * struct _CERT_LOGOTYPE_IMAGE {
 *     CERT_LOGOTYPE_DETAILS LogotypeDetails;
 *     PCERT_LOGOTYPE_IMAGE_INFO pLogotypeImageInfo;
 * }
 * }
 */
public class _CERT_LOGOTYPE_IMAGE {

    _CERT_LOGOTYPE_IMAGE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CERT_LOGOTYPE_DETAILS.layout().withName("LogotypeDetails"),
        Windows_h.C_POINTER.withName("pLogotypeImageInfo")
    ).withName("_CERT_LOGOTYPE_IMAGE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout LogotypeDetails$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("LogotypeDetails"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_LOGOTYPE_DETAILS LogotypeDetails
     * }
     */
    public static final GroupLayout LogotypeDetails$layout() {
        return LogotypeDetails$LAYOUT;
    }

    private static final long LogotypeDetails$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_LOGOTYPE_DETAILS LogotypeDetails
     * }
     */
    public static final long LogotypeDetails$offset() {
        return LogotypeDetails$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_LOGOTYPE_DETAILS LogotypeDetails
     * }
     */
    public static MemorySegment LogotypeDetails(MemorySegment struct) {
        return struct.asSlice(LogotypeDetails$OFFSET, LogotypeDetails$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_LOGOTYPE_DETAILS LogotypeDetails
     * }
     */
    public static void LogotypeDetails(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, LogotypeDetails$OFFSET, LogotypeDetails$LAYOUT.byteSize());
    }

    private static final AddressLayout pLogotypeImageInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pLogotypeImageInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_IMAGE_INFO pLogotypeImageInfo
     * }
     */
    public static final AddressLayout pLogotypeImageInfo$layout() {
        return pLogotypeImageInfo$LAYOUT;
    }

    private static final long pLogotypeImageInfo$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_IMAGE_INFO pLogotypeImageInfo
     * }
     */
    public static final long pLogotypeImageInfo$offset() {
        return pLogotypeImageInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_IMAGE_INFO pLogotypeImageInfo
     * }
     */
    public static MemorySegment pLogotypeImageInfo(MemorySegment struct) {
        return struct.get(pLogotypeImageInfo$LAYOUT, pLogotypeImageInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_IMAGE_INFO pLogotypeImageInfo
     * }
     */
    public static void pLogotypeImageInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pLogotypeImageInfo$LAYOUT, pLogotypeImageInfo$OFFSET, fieldValue);
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
