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
 * struct _ENUM_SERVICE_STATUS_PROCESSW {
 *     LPWSTR lpServiceName;
 *     LPWSTR lpDisplayName;
 *     SERVICE_STATUS_PROCESS ServiceStatusProcess;
 * }
 * }
 */
public class _ENUM_SERVICE_STATUS_PROCESSW {

    _ENUM_SERVICE_STATUS_PROCESSW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("lpServiceName"),
        Windows_h.C_POINTER.withName("lpDisplayName"),
        _SERVICE_STATUS_PROCESS.layout().withName("ServiceStatusProcess"),
        MemoryLayout.paddingLayout(4)
    ).withName("_ENUM_SERVICE_STATUS_PROCESSW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout lpServiceName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpServiceName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpServiceName
     * }
     */
    public static final AddressLayout lpServiceName$layout() {
        return lpServiceName$LAYOUT;
    }

    private static final long lpServiceName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpServiceName
     * }
     */
    public static final long lpServiceName$offset() {
        return lpServiceName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpServiceName
     * }
     */
    public static MemorySegment lpServiceName(MemorySegment struct) {
        return struct.get(lpServiceName$LAYOUT, lpServiceName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpServiceName
     * }
     */
    public static void lpServiceName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpServiceName$LAYOUT, lpServiceName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpDisplayName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpDisplayName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpDisplayName
     * }
     */
    public static final AddressLayout lpDisplayName$layout() {
        return lpDisplayName$LAYOUT;
    }

    private static final long lpDisplayName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpDisplayName
     * }
     */
    public static final long lpDisplayName$offset() {
        return lpDisplayName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpDisplayName
     * }
     */
    public static MemorySegment lpDisplayName(MemorySegment struct) {
        return struct.get(lpDisplayName$LAYOUT, lpDisplayName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpDisplayName
     * }
     */
    public static void lpDisplayName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpDisplayName$LAYOUT, lpDisplayName$OFFSET, fieldValue);
    }

    private static final GroupLayout ServiceStatusProcess$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ServiceStatusProcess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SERVICE_STATUS_PROCESS ServiceStatusProcess
     * }
     */
    public static final GroupLayout ServiceStatusProcess$layout() {
        return ServiceStatusProcess$LAYOUT;
    }

    private static final long ServiceStatusProcess$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SERVICE_STATUS_PROCESS ServiceStatusProcess
     * }
     */
    public static final long ServiceStatusProcess$offset() {
        return ServiceStatusProcess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SERVICE_STATUS_PROCESS ServiceStatusProcess
     * }
     */
    public static MemorySegment ServiceStatusProcess(MemorySegment struct) {
        return struct.asSlice(ServiceStatusProcess$OFFSET, ServiceStatusProcess$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SERVICE_STATUS_PROCESS ServiceStatusProcess
     * }
     */
    public static void ServiceStatusProcess(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ServiceStatusProcess$OFFSET, ServiceStatusProcess$LAYOUT.byteSize());
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

