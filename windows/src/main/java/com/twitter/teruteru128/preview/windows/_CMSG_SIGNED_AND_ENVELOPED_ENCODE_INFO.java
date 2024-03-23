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
 * struct _CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO {
 *     DWORD cbSize;
 *     CMSG_SIGNED_ENCODE_INFO SignedInfo;
 *     CMSG_ENVELOPED_ENCODE_INFO EnvelopedInfo;
 * }
 * }
 */
public class _CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO {

    _CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        _CMSG_SIGNED_ENCODE_INFO.layout().withName("SignedInfo"),
        _CMSG_ENVELOPED_ENCODE_INFO.layout().withName("EnvelopedInfo")
    ).withName("_CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final GroupLayout SignedInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SignedInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CMSG_SIGNED_ENCODE_INFO SignedInfo
     * }
     */
    public static final GroupLayout SignedInfo$layout() {
        return SignedInfo$LAYOUT;
    }

    private static final long SignedInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CMSG_SIGNED_ENCODE_INFO SignedInfo
     * }
     */
    public static final long SignedInfo$offset() {
        return SignedInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CMSG_SIGNED_ENCODE_INFO SignedInfo
     * }
     */
    public static MemorySegment SignedInfo(MemorySegment struct) {
        return struct.asSlice(SignedInfo$OFFSET, SignedInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CMSG_SIGNED_ENCODE_INFO SignedInfo
     * }
     */
    public static void SignedInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SignedInfo$OFFSET, SignedInfo$LAYOUT.byteSize());
    }

    private static final GroupLayout EnvelopedInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("EnvelopedInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CMSG_ENVELOPED_ENCODE_INFO EnvelopedInfo
     * }
     */
    public static final GroupLayout EnvelopedInfo$layout() {
        return EnvelopedInfo$LAYOUT;
    }

    private static final long EnvelopedInfo$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CMSG_ENVELOPED_ENCODE_INFO EnvelopedInfo
     * }
     */
    public static final long EnvelopedInfo$offset() {
        return EnvelopedInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CMSG_ENVELOPED_ENCODE_INFO EnvelopedInfo
     * }
     */
    public static MemorySegment EnvelopedInfo(MemorySegment struct) {
        return struct.asSlice(EnvelopedInfo$OFFSET, EnvelopedInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CMSG_ENVELOPED_ENCODE_INFO EnvelopedInfo
     * }
     */
    public static void EnvelopedInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, EnvelopedInfo$OFFSET, EnvelopedInfo$LAYOUT.byteSize());
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

