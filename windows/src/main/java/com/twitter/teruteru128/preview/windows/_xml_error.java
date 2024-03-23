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
 * struct _xml_error {
 *     unsigned int _nLine;
 *     BSTR _pchBuf;
 *     unsigned int _cchBuf;
 *     unsigned int _ich;
 *     BSTR _pszFound;
 *     BSTR _pszExpected;
 *     DWORD _reserved1;
 *     DWORD _reserved2;
 * }
 * }
 */
public class _xml_error {

    _xml_error() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("_nLine"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("_pchBuf"),
        Windows_h.C_INT.withName("_cchBuf"),
        Windows_h.C_INT.withName("_ich"),
        Windows_h.C_POINTER.withName("_pszFound"),
        Windows_h.C_POINTER.withName("_pszExpected"),
        Windows_h.C_LONG.withName("_reserved1"),
        Windows_h.C_LONG.withName("_reserved2")
    ).withName("_xml_error");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt _nLine$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_nLine"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int _nLine
     * }
     */
    public static final OfInt _nLine$layout() {
        return _nLine$LAYOUT;
    }

    private static final long _nLine$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int _nLine
     * }
     */
    public static final long _nLine$offset() {
        return _nLine$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int _nLine
     * }
     */
    public static int _nLine(MemorySegment struct) {
        return struct.get(_nLine$LAYOUT, _nLine$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int _nLine
     * }
     */
    public static void _nLine(MemorySegment struct, int fieldValue) {
        struct.set(_nLine$LAYOUT, _nLine$OFFSET, fieldValue);
    }

    private static final AddressLayout _pchBuf$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_pchBuf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BSTR _pchBuf
     * }
     */
    public static final AddressLayout _pchBuf$layout() {
        return _pchBuf$LAYOUT;
    }

    private static final long _pchBuf$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BSTR _pchBuf
     * }
     */
    public static final long _pchBuf$offset() {
        return _pchBuf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BSTR _pchBuf
     * }
     */
    public static MemorySegment _pchBuf(MemorySegment struct) {
        return struct.get(_pchBuf$LAYOUT, _pchBuf$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BSTR _pchBuf
     * }
     */
    public static void _pchBuf(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_pchBuf$LAYOUT, _pchBuf$OFFSET, fieldValue);
    }

    private static final OfInt _cchBuf$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_cchBuf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int _cchBuf
     * }
     */
    public static final OfInt _cchBuf$layout() {
        return _cchBuf$LAYOUT;
    }

    private static final long _cchBuf$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int _cchBuf
     * }
     */
    public static final long _cchBuf$offset() {
        return _cchBuf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int _cchBuf
     * }
     */
    public static int _cchBuf(MemorySegment struct) {
        return struct.get(_cchBuf$LAYOUT, _cchBuf$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int _cchBuf
     * }
     */
    public static void _cchBuf(MemorySegment struct, int fieldValue) {
        struct.set(_cchBuf$LAYOUT, _cchBuf$OFFSET, fieldValue);
    }

    private static final OfInt _ich$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_ich"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int _ich
     * }
     */
    public static final OfInt _ich$layout() {
        return _ich$LAYOUT;
    }

    private static final long _ich$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int _ich
     * }
     */
    public static final long _ich$offset() {
        return _ich$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int _ich
     * }
     */
    public static int _ich(MemorySegment struct) {
        return struct.get(_ich$LAYOUT, _ich$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int _ich
     * }
     */
    public static void _ich(MemorySegment struct, int fieldValue) {
        struct.set(_ich$LAYOUT, _ich$OFFSET, fieldValue);
    }

    private static final AddressLayout _pszFound$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_pszFound"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BSTR _pszFound
     * }
     */
    public static final AddressLayout _pszFound$layout() {
        return _pszFound$LAYOUT;
    }

    private static final long _pszFound$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BSTR _pszFound
     * }
     */
    public static final long _pszFound$offset() {
        return _pszFound$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BSTR _pszFound
     * }
     */
    public static MemorySegment _pszFound(MemorySegment struct) {
        return struct.get(_pszFound$LAYOUT, _pszFound$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BSTR _pszFound
     * }
     */
    public static void _pszFound(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_pszFound$LAYOUT, _pszFound$OFFSET, fieldValue);
    }

    private static final AddressLayout _pszExpected$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_pszExpected"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BSTR _pszExpected
     * }
     */
    public static final AddressLayout _pszExpected$layout() {
        return _pszExpected$LAYOUT;
    }

    private static final long _pszExpected$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BSTR _pszExpected
     * }
     */
    public static final long _pszExpected$offset() {
        return _pszExpected$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BSTR _pszExpected
     * }
     */
    public static MemorySegment _pszExpected(MemorySegment struct) {
        return struct.get(_pszExpected$LAYOUT, _pszExpected$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BSTR _pszExpected
     * }
     */
    public static void _pszExpected(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_pszExpected$LAYOUT, _pszExpected$OFFSET, fieldValue);
    }

    private static final OfInt _reserved1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD _reserved1
     * }
     */
    public static final OfInt _reserved1$layout() {
        return _reserved1$LAYOUT;
    }

    private static final long _reserved1$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD _reserved1
     * }
     */
    public static final long _reserved1$offset() {
        return _reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD _reserved1
     * }
     */
    public static int _reserved1(MemorySegment struct) {
        return struct.get(_reserved1$LAYOUT, _reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD _reserved1
     * }
     */
    public static void _reserved1(MemorySegment struct, int fieldValue) {
        struct.set(_reserved1$LAYOUT, _reserved1$OFFSET, fieldValue);
    }

    private static final OfInt _reserved2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD _reserved2
     * }
     */
    public static final OfInt _reserved2$layout() {
        return _reserved2$LAYOUT;
    }

    private static final long _reserved2$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD _reserved2
     * }
     */
    public static final long _reserved2$offset() {
        return _reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD _reserved2
     * }
     */
    public static int _reserved2(MemorySegment struct) {
        return struct.get(_reserved2$LAYOUT, _reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD _reserved2
     * }
     */
    public static void _reserved2(MemorySegment struct, int fieldValue) {
        struct.set(_reserved2$LAYOUT, _reserved2$OFFSET, fieldValue);
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

