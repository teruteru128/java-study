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
 * union tagBINDPTR {
 *     FUNCDESC *lpfuncdesc;
 *     VARDESC *lpvardesc;
 *     ITypeComp *lptcomp;
 * }
 * }
 */
public class tagBINDPTR {

    tagBINDPTR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        Windows_h.C_POINTER.withName("lpfuncdesc"),
        Windows_h.C_POINTER.withName("lpvardesc"),
        Windows_h.C_POINTER.withName("lptcomp")
    ).withName("tagBINDPTR");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout lpfuncdesc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfuncdesc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FUNCDESC *lpfuncdesc
     * }
     */
    public static final AddressLayout lpfuncdesc$layout() {
        return lpfuncdesc$LAYOUT;
    }

    private static final long lpfuncdesc$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FUNCDESC *lpfuncdesc
     * }
     */
    public static final long lpfuncdesc$offset() {
        return lpfuncdesc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FUNCDESC *lpfuncdesc
     * }
     */
    public static MemorySegment lpfuncdesc(MemorySegment union) {
        return union.get(lpfuncdesc$LAYOUT, lpfuncdesc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FUNCDESC *lpfuncdesc
     * }
     */
    public static void lpfuncdesc(MemorySegment union, MemorySegment fieldValue) {
        union.set(lpfuncdesc$LAYOUT, lpfuncdesc$OFFSET, fieldValue);
    }

    private static final AddressLayout lpvardesc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpvardesc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VARDESC *lpvardesc
     * }
     */
    public static final AddressLayout lpvardesc$layout() {
        return lpvardesc$LAYOUT;
    }

    private static final long lpvardesc$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VARDESC *lpvardesc
     * }
     */
    public static final long lpvardesc$offset() {
        return lpvardesc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VARDESC *lpvardesc
     * }
     */
    public static MemorySegment lpvardesc(MemorySegment union) {
        return union.get(lpvardesc$LAYOUT, lpvardesc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VARDESC *lpvardesc
     * }
     */
    public static void lpvardesc(MemorySegment union, MemorySegment fieldValue) {
        union.set(lpvardesc$LAYOUT, lpvardesc$OFFSET, fieldValue);
    }

    private static final AddressLayout lptcomp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lptcomp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ITypeComp *lptcomp
     * }
     */
    public static final AddressLayout lptcomp$layout() {
        return lptcomp$LAYOUT;
    }

    private static final long lptcomp$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ITypeComp *lptcomp
     * }
     */
    public static final long lptcomp$offset() {
        return lptcomp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ITypeComp *lptcomp
     * }
     */
    public static MemorySegment lptcomp(MemorySegment union) {
        return union.get(lptcomp$LAYOUT, lptcomp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ITypeComp *lptcomp
     * }
     */
    public static void lptcomp(MemorySegment union, MemorySegment fieldValue) {
        union.set(lptcomp$LAYOUT, lptcomp$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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
