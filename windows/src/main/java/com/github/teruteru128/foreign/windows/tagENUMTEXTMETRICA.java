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
 * struct tagENUMTEXTMETRICA {
 *     NEWTEXTMETRICEXA etmNewTextMetricEx;
 *     AXESLISTA etmAxesList;
 * }
 * }
 */
public class tagENUMTEXTMETRICA {

    tagENUMTEXTMETRICA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagNEWTEXTMETRICEXA.layout().withName("etmNewTextMetricEx"),
        tagAXESLISTA.layout().withName("etmAxesList")
    ).withName("tagENUMTEXTMETRICA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout etmNewTextMetricEx$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("etmNewTextMetricEx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NEWTEXTMETRICEXA etmNewTextMetricEx
     * }
     */
    public static final GroupLayout etmNewTextMetricEx$layout() {
        return etmNewTextMetricEx$LAYOUT;
    }

    private static final long etmNewTextMetricEx$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NEWTEXTMETRICEXA etmNewTextMetricEx
     * }
     */
    public static final long etmNewTextMetricEx$offset() {
        return etmNewTextMetricEx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NEWTEXTMETRICEXA etmNewTextMetricEx
     * }
     */
    public static MemorySegment etmNewTextMetricEx(MemorySegment struct) {
        return struct.asSlice(etmNewTextMetricEx$OFFSET, etmNewTextMetricEx$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NEWTEXTMETRICEXA etmNewTextMetricEx
     * }
     */
    public static void etmNewTextMetricEx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, etmNewTextMetricEx$OFFSET, etmNewTextMetricEx$LAYOUT.byteSize());
    }

    private static final GroupLayout etmAxesList$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("etmAxesList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AXESLISTA etmAxesList
     * }
     */
    public static final GroupLayout etmAxesList$layout() {
        return etmAxesList$LAYOUT;
    }

    private static final long etmAxesList$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AXESLISTA etmAxesList
     * }
     */
    public static final long etmAxesList$offset() {
        return etmAxesList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AXESLISTA etmAxesList
     * }
     */
    public static MemorySegment etmAxesList(MemorySegment struct) {
        return struct.asSlice(etmAxesList$OFFSET, etmAxesList$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AXESLISTA etmAxesList
     * }
     */
    public static void etmAxesList(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, etmAxesList$OFFSET, etmAxesList$LAYOUT.byteSize());
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
