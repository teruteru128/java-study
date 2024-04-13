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
 * struct tagNEWTEXTMETRICEXA {
 *     NEWTEXTMETRICA ntmTm;
 *     FONTSIGNATURE ntmFontSig;
 * }
 * }
 */
public class tagNEWTEXTMETRICEXA {

    tagNEWTEXTMETRICEXA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagNEWTEXTMETRICA.layout().withName("ntmTm"),
        tagFONTSIGNATURE.layout().withName("ntmFontSig")
    ).withName("tagNEWTEXTMETRICEXA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout ntmTm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ntmTm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NEWTEXTMETRICA ntmTm
     * }
     */
    public static final GroupLayout ntmTm$layout() {
        return ntmTm$LAYOUT;
    }

    private static final long ntmTm$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NEWTEXTMETRICA ntmTm
     * }
     */
    public static final long ntmTm$offset() {
        return ntmTm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NEWTEXTMETRICA ntmTm
     * }
     */
    public static MemorySegment ntmTm(MemorySegment struct) {
        return struct.asSlice(ntmTm$OFFSET, ntmTm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NEWTEXTMETRICA ntmTm
     * }
     */
    public static void ntmTm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ntmTm$OFFSET, ntmTm$LAYOUT.byteSize());
    }

    private static final GroupLayout ntmFontSig$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ntmFontSig"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FONTSIGNATURE ntmFontSig
     * }
     */
    public static final GroupLayout ntmFontSig$layout() {
        return ntmFontSig$LAYOUT;
    }

    private static final long ntmFontSig$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FONTSIGNATURE ntmFontSig
     * }
     */
    public static final long ntmFontSig$offset() {
        return ntmFontSig$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FONTSIGNATURE ntmFontSig
     * }
     */
    public static MemorySegment ntmFontSig(MemorySegment struct) {
        return struct.asSlice(ntmFontSig$OFFSET, ntmFontSig$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FONTSIGNATURE ntmFontSig
     * }
     */
    public static void ntmFontSig(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ntmFontSig$OFFSET, ntmFontSig$LAYOUT.byteSize());
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
