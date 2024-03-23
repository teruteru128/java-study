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
 * struct _CERT_BIOMETRIC_EXT_INFO {
 *     DWORD cBiometricData;
 *     PCERT_BIOMETRIC_DATA rgBiometricData;
 * }
 * }
 */
public class _CERT_BIOMETRIC_EXT_INFO {

    _CERT_BIOMETRIC_EXT_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cBiometricData"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgBiometricData")
    ).withName("_CERT_BIOMETRIC_EXT_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cBiometricData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cBiometricData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cBiometricData
     * }
     */
    public static final OfInt cBiometricData$layout() {
        return cBiometricData$LAYOUT;
    }

    private static final long cBiometricData$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cBiometricData
     * }
     */
    public static final long cBiometricData$offset() {
        return cBiometricData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cBiometricData
     * }
     */
    public static int cBiometricData(MemorySegment struct) {
        return struct.get(cBiometricData$LAYOUT, cBiometricData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cBiometricData
     * }
     */
    public static void cBiometricData(MemorySegment struct, int fieldValue) {
        struct.set(cBiometricData$LAYOUT, cBiometricData$OFFSET, fieldValue);
    }

    private static final AddressLayout rgBiometricData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgBiometricData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_BIOMETRIC_DATA rgBiometricData
     * }
     */
    public static final AddressLayout rgBiometricData$layout() {
        return rgBiometricData$LAYOUT;
    }

    private static final long rgBiometricData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_BIOMETRIC_DATA rgBiometricData
     * }
     */
    public static final long rgBiometricData$offset() {
        return rgBiometricData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_BIOMETRIC_DATA rgBiometricData
     * }
     */
    public static MemorySegment rgBiometricData(MemorySegment struct) {
        return struct.get(rgBiometricData$LAYOUT, rgBiometricData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_BIOMETRIC_DATA rgBiometricData
     * }
     */
    public static void rgBiometricData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgBiometricData$LAYOUT, rgBiometricData$OFFSET, fieldValue);
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

