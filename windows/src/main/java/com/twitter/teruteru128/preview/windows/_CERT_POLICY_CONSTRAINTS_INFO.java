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
 * struct _CERT_POLICY_CONSTRAINTS_INFO {
 *     BOOL fRequireExplicitPolicy;
 *     DWORD dwRequireExplicitPolicySkipCerts;
 *     BOOL fInhibitPolicyMapping;
 *     DWORD dwInhibitPolicyMappingSkipCerts;
 * }
 * }
 */
public class _CERT_POLICY_CONSTRAINTS_INFO {

    _CERT_POLICY_CONSTRAINTS_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("fRequireExplicitPolicy"),
        Windows_h.C_LONG.withName("dwRequireExplicitPolicySkipCerts"),
        Windows_h.C_INT.withName("fInhibitPolicyMapping"),
        Windows_h.C_LONG.withName("dwInhibitPolicyMappingSkipCerts")
    ).withName("_CERT_POLICY_CONSTRAINTS_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fRequireExplicitPolicy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fRequireExplicitPolicy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fRequireExplicitPolicy
     * }
     */
    public static final OfInt fRequireExplicitPolicy$layout() {
        return fRequireExplicitPolicy$LAYOUT;
    }

    private static final long fRequireExplicitPolicy$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fRequireExplicitPolicy
     * }
     */
    public static final long fRequireExplicitPolicy$offset() {
        return fRequireExplicitPolicy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fRequireExplicitPolicy
     * }
     */
    public static int fRequireExplicitPolicy(MemorySegment struct) {
        return struct.get(fRequireExplicitPolicy$LAYOUT, fRequireExplicitPolicy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fRequireExplicitPolicy
     * }
     */
    public static void fRequireExplicitPolicy(MemorySegment struct, int fieldValue) {
        struct.set(fRequireExplicitPolicy$LAYOUT, fRequireExplicitPolicy$OFFSET, fieldValue);
    }

    private static final OfInt dwRequireExplicitPolicySkipCerts$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwRequireExplicitPolicySkipCerts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwRequireExplicitPolicySkipCerts
     * }
     */
    public static final OfInt dwRequireExplicitPolicySkipCerts$layout() {
        return dwRequireExplicitPolicySkipCerts$LAYOUT;
    }

    private static final long dwRequireExplicitPolicySkipCerts$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwRequireExplicitPolicySkipCerts
     * }
     */
    public static final long dwRequireExplicitPolicySkipCerts$offset() {
        return dwRequireExplicitPolicySkipCerts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwRequireExplicitPolicySkipCerts
     * }
     */
    public static int dwRequireExplicitPolicySkipCerts(MemorySegment struct) {
        return struct.get(dwRequireExplicitPolicySkipCerts$LAYOUT, dwRequireExplicitPolicySkipCerts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwRequireExplicitPolicySkipCerts
     * }
     */
    public static void dwRequireExplicitPolicySkipCerts(MemorySegment struct, int fieldValue) {
        struct.set(dwRequireExplicitPolicySkipCerts$LAYOUT, dwRequireExplicitPolicySkipCerts$OFFSET, fieldValue);
    }

    private static final OfInt fInhibitPolicyMapping$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fInhibitPolicyMapping"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fInhibitPolicyMapping
     * }
     */
    public static final OfInt fInhibitPolicyMapping$layout() {
        return fInhibitPolicyMapping$LAYOUT;
    }

    private static final long fInhibitPolicyMapping$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fInhibitPolicyMapping
     * }
     */
    public static final long fInhibitPolicyMapping$offset() {
        return fInhibitPolicyMapping$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fInhibitPolicyMapping
     * }
     */
    public static int fInhibitPolicyMapping(MemorySegment struct) {
        return struct.get(fInhibitPolicyMapping$LAYOUT, fInhibitPolicyMapping$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fInhibitPolicyMapping
     * }
     */
    public static void fInhibitPolicyMapping(MemorySegment struct, int fieldValue) {
        struct.set(fInhibitPolicyMapping$LAYOUT, fInhibitPolicyMapping$OFFSET, fieldValue);
    }

    private static final OfInt dwInhibitPolicyMappingSkipCerts$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwInhibitPolicyMappingSkipCerts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwInhibitPolicyMappingSkipCerts
     * }
     */
    public static final OfInt dwInhibitPolicyMappingSkipCerts$layout() {
        return dwInhibitPolicyMappingSkipCerts$LAYOUT;
    }

    private static final long dwInhibitPolicyMappingSkipCerts$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwInhibitPolicyMappingSkipCerts
     * }
     */
    public static final long dwInhibitPolicyMappingSkipCerts$offset() {
        return dwInhibitPolicyMappingSkipCerts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwInhibitPolicyMappingSkipCerts
     * }
     */
    public static int dwInhibitPolicyMappingSkipCerts(MemorySegment struct) {
        return struct.get(dwInhibitPolicyMappingSkipCerts$LAYOUT, dwInhibitPolicyMappingSkipCerts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwInhibitPolicyMappingSkipCerts
     * }
     */
    public static void dwInhibitPolicyMappingSkipCerts(MemorySegment struct, int fieldValue) {
        struct.set(dwInhibitPolicyMappingSkipCerts$LAYOUT, dwInhibitPolicyMappingSkipCerts$OFFSET, fieldValue);
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

