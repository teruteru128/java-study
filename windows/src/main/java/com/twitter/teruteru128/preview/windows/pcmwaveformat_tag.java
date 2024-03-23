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
 * struct pcmwaveformat_tag {
 *     WAVEFORMAT wf;
 *     WORD wBitsPerSample;
 * }
 * }
 */
public class pcmwaveformat_tag {

    pcmwaveformat_tag() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        waveformat_tag.layout().withName("wf"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("wBitsPerSample")
    ).withName("pcmwaveformat_tag");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout wf$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("wf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WAVEFORMAT wf
     * }
     */
    public static final GroupLayout wf$layout() {
        return wf$LAYOUT;
    }

    private static final long wf$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WAVEFORMAT wf
     * }
     */
    public static final long wf$offset() {
        return wf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WAVEFORMAT wf
     * }
     */
    public static MemorySegment wf(MemorySegment struct) {
        return struct.asSlice(wf$OFFSET, wf$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WAVEFORMAT wf
     * }
     */
    public static void wf(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, wf$OFFSET, wf$LAYOUT.byteSize());
    }

    private static final OfShort wBitsPerSample$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wBitsPerSample"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wBitsPerSample
     * }
     */
    public static final OfShort wBitsPerSample$layout() {
        return wBitsPerSample$LAYOUT;
    }

    private static final long wBitsPerSample$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wBitsPerSample
     * }
     */
    public static final long wBitsPerSample$offset() {
        return wBitsPerSample$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wBitsPerSample
     * }
     */
    public static short wBitsPerSample(MemorySegment struct) {
        return struct.get(wBitsPerSample$LAYOUT, wBitsPerSample$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wBitsPerSample
     * }
     */
    public static void wBitsPerSample(MemorySegment struct, short fieldValue) {
        struct.set(wBitsPerSample$LAYOUT, wBitsPerSample$OFFSET, fieldValue);
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

