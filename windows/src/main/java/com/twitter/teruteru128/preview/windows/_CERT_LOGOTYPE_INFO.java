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
 * struct _CERT_LOGOTYPE_INFO {
 *     DWORD dwLogotypeInfoChoice;
 *     union {
 *         PCERT_LOGOTYPE_DATA pLogotypeDirectInfo;
 *         PCERT_LOGOTYPE_REFERENCE pLogotypeIndirectInfo;
 *     };
 * }
 * }
 */
public class _CERT_LOGOTYPE_INFO {

    _CERT_LOGOTYPE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwLogotypeInfoChoice"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            Windows_h.C_POINTER.withName("pLogotypeDirectInfo"),
            Windows_h.C_POINTER.withName("pLogotypeIndirectInfo")
        ).withName("$anon$5514:5")
    ).withName("_CERT_LOGOTYPE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwLogotypeInfoChoice$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwLogotypeInfoChoice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwLogotypeInfoChoice
     * }
     */
    public static final OfInt dwLogotypeInfoChoice$layout() {
        return dwLogotypeInfoChoice$LAYOUT;
    }

    private static final long dwLogotypeInfoChoice$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwLogotypeInfoChoice
     * }
     */
    public static final long dwLogotypeInfoChoice$offset() {
        return dwLogotypeInfoChoice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwLogotypeInfoChoice
     * }
     */
    public static int dwLogotypeInfoChoice(MemorySegment struct) {
        return struct.get(dwLogotypeInfoChoice$LAYOUT, dwLogotypeInfoChoice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwLogotypeInfoChoice
     * }
     */
    public static void dwLogotypeInfoChoice(MemorySegment struct, int fieldValue) {
        struct.set(dwLogotypeInfoChoice$LAYOUT, dwLogotypeInfoChoice$OFFSET, fieldValue);
    }

    private static final AddressLayout pLogotypeDirectInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$5514:5"), groupElement("pLogotypeDirectInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_DATA pLogotypeDirectInfo
     * }
     */
    public static final AddressLayout pLogotypeDirectInfo$layout() {
        return pLogotypeDirectInfo$LAYOUT;
    }

    private static final long pLogotypeDirectInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_DATA pLogotypeDirectInfo
     * }
     */
    public static final long pLogotypeDirectInfo$offset() {
        return pLogotypeDirectInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_DATA pLogotypeDirectInfo
     * }
     */
    public static MemorySegment pLogotypeDirectInfo(MemorySegment struct) {
        return struct.get(pLogotypeDirectInfo$LAYOUT, pLogotypeDirectInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_DATA pLogotypeDirectInfo
     * }
     */
    public static void pLogotypeDirectInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pLogotypeDirectInfo$LAYOUT, pLogotypeDirectInfo$OFFSET, fieldValue);
    }

    private static final AddressLayout pLogotypeIndirectInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$5514:5"), groupElement("pLogotypeIndirectInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_REFERENCE pLogotypeIndirectInfo
     * }
     */
    public static final AddressLayout pLogotypeIndirectInfo$layout() {
        return pLogotypeIndirectInfo$LAYOUT;
    }

    private static final long pLogotypeIndirectInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_REFERENCE pLogotypeIndirectInfo
     * }
     */
    public static final long pLogotypeIndirectInfo$offset() {
        return pLogotypeIndirectInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_REFERENCE pLogotypeIndirectInfo
     * }
     */
    public static MemorySegment pLogotypeIndirectInfo(MemorySegment struct) {
        return struct.get(pLogotypeIndirectInfo$LAYOUT, pLogotypeIndirectInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_LOGOTYPE_REFERENCE pLogotypeIndirectInfo
     * }
     */
    public static void pLogotypeIndirectInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pLogotypeIndirectInfo$LAYOUT, pLogotypeIndirectInfo$OFFSET, fieldValue);
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

