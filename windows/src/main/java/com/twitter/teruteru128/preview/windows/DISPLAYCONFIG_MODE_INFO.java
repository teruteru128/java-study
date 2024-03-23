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
 * struct DISPLAYCONFIG_MODE_INFO {
 *     DISPLAYCONFIG_MODE_INFO_TYPE infoType;
 *     UINT32 id;
 *     LUID adapterId;
 *     union {
 *         DISPLAYCONFIG_TARGET_MODE targetMode;
 *         DISPLAYCONFIG_SOURCE_MODE sourceMode;
 *         DISPLAYCONFIG_DESKTOP_IMAGE_INFO desktopImageInfo;
 *     };
 * }
 * }
 */
public class DISPLAYCONFIG_MODE_INFO {

    DISPLAYCONFIG_MODE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("infoType"),
        Windows_h.C_INT.withName("id"),
        _LUID.layout().withName("adapterId"),
        MemoryLayout.unionLayout(
            DISPLAYCONFIG_TARGET_MODE.layout().withName("targetMode"),
            DISPLAYCONFIG_SOURCE_MODE.layout().withName("sourceMode"),
            DISPLAYCONFIG_DESKTOP_IMAGE_INFO.layout().withName("desktopImageInfo")
        ).withName("$anon$2936:5")
    ).withName("DISPLAYCONFIG_MODE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt infoType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("infoType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_MODE_INFO_TYPE infoType
     * }
     */
    public static final OfInt infoType$layout() {
        return infoType$LAYOUT;
    }

    private static final long infoType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_MODE_INFO_TYPE infoType
     * }
     */
    public static final long infoType$offset() {
        return infoType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_MODE_INFO_TYPE infoType
     * }
     */
    public static int infoType(MemorySegment struct) {
        return struct.get(infoType$LAYOUT, infoType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_MODE_INFO_TYPE infoType
     * }
     */
    public static void infoType(MemorySegment struct, int fieldValue) {
        struct.set(infoType$LAYOUT, infoType$OFFSET, fieldValue);
    }

    private static final OfInt id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 id
     * }
     */
    public static final OfInt id$layout() {
        return id$LAYOUT;
    }

    private static final long id$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 id
     * }
     */
    public static final long id$offset() {
        return id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 id
     * }
     */
    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 id
     * }
     */
    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, id$OFFSET, fieldValue);
    }

    private static final GroupLayout adapterId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("adapterId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LUID adapterId
     * }
     */
    public static final GroupLayout adapterId$layout() {
        return adapterId$LAYOUT;
    }

    private static final long adapterId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LUID adapterId
     * }
     */
    public static final long adapterId$offset() {
        return adapterId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LUID adapterId
     * }
     */
    public static MemorySegment adapterId(MemorySegment struct) {
        return struct.asSlice(adapterId$OFFSET, adapterId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LUID adapterId
     * }
     */
    public static void adapterId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, adapterId$OFFSET, adapterId$LAYOUT.byteSize());
    }

    private static final GroupLayout targetMode$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$2936:5"), groupElement("targetMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_MODE targetMode
     * }
     */
    public static final GroupLayout targetMode$layout() {
        return targetMode$LAYOUT;
    }

    private static final long targetMode$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_MODE targetMode
     * }
     */
    public static final long targetMode$offset() {
        return targetMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_MODE targetMode
     * }
     */
    public static MemorySegment targetMode(MemorySegment struct) {
        return struct.asSlice(targetMode$OFFSET, targetMode$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_MODE targetMode
     * }
     */
    public static void targetMode(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, targetMode$OFFSET, targetMode$LAYOUT.byteSize());
    }

    private static final GroupLayout sourceMode$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$2936:5"), groupElement("sourceMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_SOURCE_MODE sourceMode
     * }
     */
    public static final GroupLayout sourceMode$layout() {
        return sourceMode$LAYOUT;
    }

    private static final long sourceMode$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_SOURCE_MODE sourceMode
     * }
     */
    public static final long sourceMode$offset() {
        return sourceMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_SOURCE_MODE sourceMode
     * }
     */
    public static MemorySegment sourceMode(MemorySegment struct) {
        return struct.asSlice(sourceMode$OFFSET, sourceMode$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_SOURCE_MODE sourceMode
     * }
     */
    public static void sourceMode(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sourceMode$OFFSET, sourceMode$LAYOUT.byteSize());
    }

    private static final GroupLayout desktopImageInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$2936:5"), groupElement("desktopImageInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DESKTOP_IMAGE_INFO desktopImageInfo
     * }
     */
    public static final GroupLayout desktopImageInfo$layout() {
        return desktopImageInfo$LAYOUT;
    }

    private static final long desktopImageInfo$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DESKTOP_IMAGE_INFO desktopImageInfo
     * }
     */
    public static final long desktopImageInfo$offset() {
        return desktopImageInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DESKTOP_IMAGE_INFO desktopImageInfo
     * }
     */
    public static MemorySegment desktopImageInfo(MemorySegment struct) {
        return struct.asSlice(desktopImageInfo$OFFSET, desktopImageInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DESKTOP_IMAGE_INFO desktopImageInfo
     * }
     */
    public static void desktopImageInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, desktopImageInfo$OFFSET, desktopImageInfo$LAYOUT.byteSize());
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

