// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * struct _CSV_QUERY_REDIRECT_STATE {
 *     DWORD MdsNodeId;
 *     DWORD DsNodeId;
 *     BOOLEAN FileRedirected;
 * }
 * }
 */
public class _CSV_QUERY_REDIRECT_STATE {

    _CSV_QUERY_REDIRECT_STATE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("MdsNodeId"),
        Windows_h.C_LONG.withName("DsNodeId"),
        Windows_h.C_CHAR.withName("FileRedirected"),
        MemoryLayout.paddingLayout(3)
    ).withName("_CSV_QUERY_REDIRECT_STATE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt MdsNodeId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MdsNodeId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MdsNodeId
     * }
     */
    public static final OfInt MdsNodeId$layout() {
        return MdsNodeId$LAYOUT;
    }

    private static final long MdsNodeId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MdsNodeId
     * }
     */
    public static final long MdsNodeId$offset() {
        return MdsNodeId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MdsNodeId
     * }
     */
    public static int MdsNodeId(MemorySegment struct) {
        return struct.get(MdsNodeId$LAYOUT, MdsNodeId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MdsNodeId
     * }
     */
    public static void MdsNodeId(MemorySegment struct, int fieldValue) {
        struct.set(MdsNodeId$LAYOUT, MdsNodeId$OFFSET, fieldValue);
    }

    private static final OfInt DsNodeId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DsNodeId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DsNodeId
     * }
     */
    public static final OfInt DsNodeId$layout() {
        return DsNodeId$LAYOUT;
    }

    private static final long DsNodeId$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DsNodeId
     * }
     */
    public static final long DsNodeId$offset() {
        return DsNodeId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DsNodeId
     * }
     */
    public static int DsNodeId(MemorySegment struct) {
        return struct.get(DsNodeId$LAYOUT, DsNodeId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DsNodeId
     * }
     */
    public static void DsNodeId(MemorySegment struct, int fieldValue) {
        struct.set(DsNodeId$LAYOUT, DsNodeId$OFFSET, fieldValue);
    }

    private static final OfByte FileRedirected$LAYOUT = (OfByte)$LAYOUT.select(groupElement("FileRedirected"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN FileRedirected
     * }
     */
    public static final OfByte FileRedirected$layout() {
        return FileRedirected$LAYOUT;
    }

    private static final long FileRedirected$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN FileRedirected
     * }
     */
    public static final long FileRedirected$offset() {
        return FileRedirected$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN FileRedirected
     * }
     */
    public static byte FileRedirected(MemorySegment struct) {
        return struct.get(FileRedirected$LAYOUT, FileRedirected$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN FileRedirected
     * }
     */
    public static void FileRedirected(MemorySegment struct, byte fieldValue) {
        struct.set(FileRedirected$LAYOUT, FileRedirected$OFFSET, fieldValue);
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
