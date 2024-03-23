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
 *     unsigned long Version;
 *     RPC_CSTR ProtSeq;
 *     RPC_CSTR Endpoint;
 *     void *SecurityDescriptor;
 *     unsigned long Backlog;
 * }
 * }
 */
public class RPC_ENDPOINT_TEMPLATEA {

    RPC_ENDPOINT_TEMPLATEA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("ProtSeq"),
        Windows_h.C_POINTER.withName("Endpoint"),
        Windows_h.C_POINTER.withName("SecurityDescriptor"),
        Windows_h.C_LONG.withName("Backlog"),
        MemoryLayout.paddingLayout(4)
    ).withName("$anon$3165:9");

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
     * unsigned long Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final AddressLayout ProtSeq$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ProtSeq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_CSTR ProtSeq
     * }
     */
    public static final AddressLayout ProtSeq$layout() {
        return ProtSeq$LAYOUT;
    }

    private static final long ProtSeq$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_CSTR ProtSeq
     * }
     */
    public static final long ProtSeq$offset() {
        return ProtSeq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_CSTR ProtSeq
     * }
     */
    public static MemorySegment ProtSeq(MemorySegment struct) {
        return struct.get(ProtSeq$LAYOUT, ProtSeq$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_CSTR ProtSeq
     * }
     */
    public static void ProtSeq(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ProtSeq$LAYOUT, ProtSeq$OFFSET, fieldValue);
    }

    private static final AddressLayout Endpoint$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Endpoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_CSTR Endpoint
     * }
     */
    public static final AddressLayout Endpoint$layout() {
        return Endpoint$LAYOUT;
    }

    private static final long Endpoint$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_CSTR Endpoint
     * }
     */
    public static final long Endpoint$offset() {
        return Endpoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_CSTR Endpoint
     * }
     */
    public static MemorySegment Endpoint(MemorySegment struct) {
        return struct.get(Endpoint$LAYOUT, Endpoint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_CSTR Endpoint
     * }
     */
    public static void Endpoint(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Endpoint$LAYOUT, Endpoint$OFFSET, fieldValue);
    }

    private static final AddressLayout SecurityDescriptor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SecurityDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *SecurityDescriptor
     * }
     */
    public static final AddressLayout SecurityDescriptor$layout() {
        return SecurityDescriptor$LAYOUT;
    }

    private static final long SecurityDescriptor$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *SecurityDescriptor
     * }
     */
    public static final long SecurityDescriptor$offset() {
        return SecurityDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *SecurityDescriptor
     * }
     */
    public static MemorySegment SecurityDescriptor(MemorySegment struct) {
        return struct.get(SecurityDescriptor$LAYOUT, SecurityDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *SecurityDescriptor
     * }
     */
    public static void SecurityDescriptor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SecurityDescriptor$LAYOUT, SecurityDescriptor$OFFSET, fieldValue);
    }

    private static final OfInt Backlog$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Backlog"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Backlog
     * }
     */
    public static final OfInt Backlog$layout() {
        return Backlog$LAYOUT;
    }

    private static final long Backlog$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Backlog
     * }
     */
    public static final long Backlog$offset() {
        return Backlog$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Backlog
     * }
     */
    public static int Backlog(MemorySegment struct) {
        return struct.get(Backlog$LAYOUT, Backlog$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Backlog
     * }
     */
    public static void Backlog(MemorySegment struct, int fieldValue) {
        struct.set(Backlog$LAYOUT, Backlog$OFFSET, fieldValue);
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

