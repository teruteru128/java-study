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
 * struct _SECURITY_QUALITY_OF_SERVICE {
 *     DWORD Length;
 *     SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
 *     SECURITY_CONTEXT_TRACKING_MODE ContextTrackingMode;
 *     BOOLEAN EffectiveOnly;
 * }
 * }
 */
public class _SECURITY_QUALITY_OF_SERVICE {

    _SECURITY_QUALITY_OF_SERVICE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Length"),
        Windows_h.C_INT.withName("ImpersonationLevel"),
        Windows_h.C_CHAR.withName("ContextTrackingMode"),
        Windows_h.C_CHAR.withName("EffectiveOnly"),
        MemoryLayout.paddingLayout(2)
    ).withName("_SECURITY_QUALITY_OF_SERVICE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Length$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static final OfInt Length$layout() {
        return Length$LAYOUT;
    }

    private static final long Length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static final long Length$offset() {
        return Length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static int Length(MemorySegment struct) {
        return struct.get(Length$LAYOUT, Length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static void Length(MemorySegment struct, int fieldValue) {
        struct.set(Length$LAYOUT, Length$OFFSET, fieldValue);
    }

    private static final OfInt ImpersonationLevel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ImpersonationLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel
     * }
     */
    public static final OfInt ImpersonationLevel$layout() {
        return ImpersonationLevel$LAYOUT;
    }

    private static final long ImpersonationLevel$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel
     * }
     */
    public static final long ImpersonationLevel$offset() {
        return ImpersonationLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel
     * }
     */
    public static int ImpersonationLevel(MemorySegment struct) {
        return struct.get(ImpersonationLevel$LAYOUT, ImpersonationLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel
     * }
     */
    public static void ImpersonationLevel(MemorySegment struct, int fieldValue) {
        struct.set(ImpersonationLevel$LAYOUT, ImpersonationLevel$OFFSET, fieldValue);
    }

    private static final OfByte ContextTrackingMode$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ContextTrackingMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SECURITY_CONTEXT_TRACKING_MODE ContextTrackingMode
     * }
     */
    public static final OfByte ContextTrackingMode$layout() {
        return ContextTrackingMode$LAYOUT;
    }

    private static final long ContextTrackingMode$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SECURITY_CONTEXT_TRACKING_MODE ContextTrackingMode
     * }
     */
    public static final long ContextTrackingMode$offset() {
        return ContextTrackingMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SECURITY_CONTEXT_TRACKING_MODE ContextTrackingMode
     * }
     */
    public static byte ContextTrackingMode(MemorySegment struct) {
        return struct.get(ContextTrackingMode$LAYOUT, ContextTrackingMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SECURITY_CONTEXT_TRACKING_MODE ContextTrackingMode
     * }
     */
    public static void ContextTrackingMode(MemorySegment struct, byte fieldValue) {
        struct.set(ContextTrackingMode$LAYOUT, ContextTrackingMode$OFFSET, fieldValue);
    }

    private static final OfByte EffectiveOnly$LAYOUT = (OfByte)$LAYOUT.select(groupElement("EffectiveOnly"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN EffectiveOnly
     * }
     */
    public static final OfByte EffectiveOnly$layout() {
        return EffectiveOnly$LAYOUT;
    }

    private static final long EffectiveOnly$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN EffectiveOnly
     * }
     */
    public static final long EffectiveOnly$offset() {
        return EffectiveOnly$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN EffectiveOnly
     * }
     */
    public static byte EffectiveOnly(MemorySegment struct) {
        return struct.get(EffectiveOnly$LAYOUT, EffectiveOnly$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN EffectiveOnly
     * }
     */
    public static void EffectiveOnly(MemorySegment struct, byte fieldValue) {
        struct.set(EffectiveOnly$LAYOUT, EffectiveOnly$OFFSET, fieldValue);
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

