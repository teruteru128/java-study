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
 * struct tagHSZPAIR {
 *     HSZ hszSvc;
 *     HSZ hszTopic;
 * }
 * }
 */
public class tagHSZPAIR {

    tagHSZPAIR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("hszSvc"),
        Windows_h.C_POINTER.withName("hszTopic")
    ).withName("tagHSZPAIR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout hszSvc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hszSvc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hszSvc
     * }
     */
    public static final AddressLayout hszSvc$layout() {
        return hszSvc$LAYOUT;
    }

    private static final long hszSvc$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hszSvc
     * }
     */
    public static final long hszSvc$offset() {
        return hszSvc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hszSvc
     * }
     */
    public static MemorySegment hszSvc(MemorySegment struct) {
        return struct.get(hszSvc$LAYOUT, hszSvc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hszSvc
     * }
     */
    public static void hszSvc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hszSvc$LAYOUT, hszSvc$OFFSET, fieldValue);
    }

    private static final AddressLayout hszTopic$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hszTopic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hszTopic
     * }
     */
    public static final AddressLayout hszTopic$layout() {
        return hszTopic$LAYOUT;
    }

    private static final long hszTopic$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hszTopic
     * }
     */
    public static final long hszTopic$offset() {
        return hszTopic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hszTopic
     * }
     */
    public static MemorySegment hszTopic(MemorySegment struct) {
        return struct.get(hszTopic$LAYOUT, hszTopic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hszTopic
     * }
     */
    public static void hszTopic(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hszTopic$LAYOUT, hszTopic$OFFSET, fieldValue);
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
