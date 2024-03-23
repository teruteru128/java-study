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
 * struct tagSTATSTG {
 *     LPOLESTR pwcsName;
 *     DWORD type;
 *     ULARGE_INTEGER cbSize;
 *     FILETIME mtime;
 *     FILETIME ctime;
 *     FILETIME atime;
 *     DWORD grfMode;
 *     DWORD grfLocksSupported;
 *     CLSID clsid;
 *     DWORD grfStateBits;
 *     DWORD reserved;
 * }
 * }
 */
public class tagSTATSTG {

    tagSTATSTG() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("pwcsName"),
        Windows_h.C_LONG.withName("type"),
        MemoryLayout.paddingLayout(4),
        _ULARGE_INTEGER.layout().withName("cbSize"),
        _FILETIME.layout().withName("mtime"),
        _FILETIME.layout().withName("ctime"),
        _FILETIME.layout().withName("atime"),
        Windows_h.C_LONG.withName("grfMode"),
        Windows_h.C_LONG.withName("grfLocksSupported"),
        _GUID.layout().withName("clsid"),
        Windows_h.C_LONG.withName("grfStateBits"),
        Windows_h.C_LONG.withName("reserved")
    ).withName("tagSTATSTG");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pwcsName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwcsName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOLESTR pwcsName
     * }
     */
    public static final AddressLayout pwcsName$layout() {
        return pwcsName$LAYOUT;
    }

    private static final long pwcsName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOLESTR pwcsName
     * }
     */
    public static final long pwcsName$offset() {
        return pwcsName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOLESTR pwcsName
     * }
     */
    public static MemorySegment pwcsName(MemorySegment struct) {
        return struct.get(pwcsName$LAYOUT, pwcsName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOLESTR pwcsName
     * }
     */
    public static void pwcsName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwcsName$LAYOUT, pwcsName$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final GroupLayout cbSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULARGE_INTEGER cbSize
     * }
     */
    public static final GroupLayout cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULARGE_INTEGER cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULARGE_INTEGER cbSize
     * }
     */
    public static MemorySegment cbSize(MemorySegment struct) {
        return struct.asSlice(cbSize$OFFSET, cbSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULARGE_INTEGER cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cbSize$OFFSET, cbSize$LAYOUT.byteSize());
    }

    private static final GroupLayout mtime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("mtime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME mtime
     * }
     */
    public static final GroupLayout mtime$layout() {
        return mtime$LAYOUT;
    }

    private static final long mtime$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME mtime
     * }
     */
    public static final long mtime$offset() {
        return mtime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME mtime
     * }
     */
    public static MemorySegment mtime(MemorySegment struct) {
        return struct.asSlice(mtime$OFFSET, mtime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME mtime
     * }
     */
    public static void mtime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, mtime$OFFSET, mtime$LAYOUT.byteSize());
    }

    private static final GroupLayout ctime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ctime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME ctime
     * }
     */
    public static final GroupLayout ctime$layout() {
        return ctime$LAYOUT;
    }

    private static final long ctime$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME ctime
     * }
     */
    public static final long ctime$offset() {
        return ctime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME ctime
     * }
     */
    public static MemorySegment ctime(MemorySegment struct) {
        return struct.asSlice(ctime$OFFSET, ctime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME ctime
     * }
     */
    public static void ctime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ctime$OFFSET, ctime$LAYOUT.byteSize());
    }

    private static final GroupLayout atime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("atime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME atime
     * }
     */
    public static final GroupLayout atime$layout() {
        return atime$LAYOUT;
    }

    private static final long atime$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME atime
     * }
     */
    public static final long atime$offset() {
        return atime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME atime
     * }
     */
    public static MemorySegment atime(MemorySegment struct) {
        return struct.asSlice(atime$OFFSET, atime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME atime
     * }
     */
    public static void atime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, atime$OFFSET, atime$LAYOUT.byteSize());
    }

    private static final OfInt grfMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("grfMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD grfMode
     * }
     */
    public static final OfInt grfMode$layout() {
        return grfMode$LAYOUT;
    }

    private static final long grfMode$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD grfMode
     * }
     */
    public static final long grfMode$offset() {
        return grfMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD grfMode
     * }
     */
    public static int grfMode(MemorySegment struct) {
        return struct.get(grfMode$LAYOUT, grfMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD grfMode
     * }
     */
    public static void grfMode(MemorySegment struct, int fieldValue) {
        struct.set(grfMode$LAYOUT, grfMode$OFFSET, fieldValue);
    }

    private static final OfInt grfLocksSupported$LAYOUT = (OfInt)$LAYOUT.select(groupElement("grfLocksSupported"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD grfLocksSupported
     * }
     */
    public static final OfInt grfLocksSupported$layout() {
        return grfLocksSupported$LAYOUT;
    }

    private static final long grfLocksSupported$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD grfLocksSupported
     * }
     */
    public static final long grfLocksSupported$offset() {
        return grfLocksSupported$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD grfLocksSupported
     * }
     */
    public static int grfLocksSupported(MemorySegment struct) {
        return struct.get(grfLocksSupported$LAYOUT, grfLocksSupported$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD grfLocksSupported
     * }
     */
    public static void grfLocksSupported(MemorySegment struct, int fieldValue) {
        struct.set(grfLocksSupported$LAYOUT, grfLocksSupported$OFFSET, fieldValue);
    }

    private static final GroupLayout clsid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clsid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CLSID clsid
     * }
     */
    public static final GroupLayout clsid$layout() {
        return clsid$LAYOUT;
    }

    private static final long clsid$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CLSID clsid
     * }
     */
    public static final long clsid$offset() {
        return clsid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CLSID clsid
     * }
     */
    public static MemorySegment clsid(MemorySegment struct) {
        return struct.asSlice(clsid$OFFSET, clsid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CLSID clsid
     * }
     */
    public static void clsid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clsid$OFFSET, clsid$LAYOUT.byteSize());
    }

    private static final OfInt grfStateBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("grfStateBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD grfStateBits
     * }
     */
    public static final OfInt grfStateBits$layout() {
        return grfStateBits$LAYOUT;
    }

    private static final long grfStateBits$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD grfStateBits
     * }
     */
    public static final long grfStateBits$offset() {
        return grfStateBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD grfStateBits
     * }
     */
    public static int grfStateBits(MemorySegment struct) {
        return struct.get(grfStateBits$LAYOUT, grfStateBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD grfStateBits
     * }
     */
    public static void grfStateBits(MemorySegment struct, int fieldValue) {
        struct.set(grfStateBits$LAYOUT, grfStateBits$OFFSET, fieldValue);
    }

    private static final OfInt reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD reserved
     * }
     */
    public static final OfInt reserved$layout() {
        return reserved$LAYOUT;
    }

    private static final long reserved$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD reserved
     * }
     */
    public static final long reserved$offset() {
        return reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD reserved
     * }
     */
    public static int reserved(MemorySegment struct) {
        return struct.get(reserved$LAYOUT, reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD reserved
     * }
     */
    public static void reserved(MemorySegment struct, int fieldValue) {
        struct.set(reserved$LAYOUT, reserved$OFFSET, fieldValue);
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

