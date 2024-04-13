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
 * struct _CERT_DSS_PARAMETERS {
 *     CRYPT_UINT_BLOB p;
 *     CRYPT_UINT_BLOB q;
 *     CRYPT_UINT_BLOB g;
 * }
 * }
 */
public class _CERT_DSS_PARAMETERS {

    _CERT_DSS_PARAMETERS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CRYPTOAPI_BLOB.layout().withName("p"),
        _CRYPTOAPI_BLOB.layout().withName("q"),
        _CRYPTOAPI_BLOB.layout().withName("g")
    ).withName("_CERT_DSS_PARAMETERS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout p$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("p"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB p
     * }
     */
    public static final GroupLayout p$layout() {
        return p$LAYOUT;
    }

    private static final long p$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB p
     * }
     */
    public static final long p$offset() {
        return p$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB p
     * }
     */
    public static MemorySegment p(MemorySegment struct) {
        return struct.asSlice(p$OFFSET, p$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB p
     * }
     */
    public static void p(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, p$OFFSET, p$LAYOUT.byteSize());
    }

    private static final GroupLayout q$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("q"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB q
     * }
     */
    public static final GroupLayout q$layout() {
        return q$LAYOUT;
    }

    private static final long q$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB q
     * }
     */
    public static final long q$offset() {
        return q$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB q
     * }
     */
    public static MemorySegment q(MemorySegment struct) {
        return struct.asSlice(q$OFFSET, q$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB q
     * }
     */
    public static void q(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, q$OFFSET, q$LAYOUT.byteSize());
    }

    private static final GroupLayout g$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("g"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB g
     * }
     */
    public static final GroupLayout g$layout() {
        return g$LAYOUT;
    }

    private static final long g$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB g
     * }
     */
    public static final long g$offset() {
        return g$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB g
     * }
     */
    public static MemorySegment g(MemorySegment struct) {
        return struct.asSlice(g$OFFSET, g$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB g
     * }
     */
    public static void g(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, g$OFFSET, g$LAYOUT.byteSize());
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
