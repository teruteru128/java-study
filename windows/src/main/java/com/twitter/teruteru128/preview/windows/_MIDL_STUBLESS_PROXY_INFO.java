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
 * struct _MIDL_STUBLESS_PROXY_INFO {
 *     PMIDL_STUB_DESC pStubDesc;
 *     PFORMAT_STRING ProcFormatString;
 *     const unsigned short *FormatStringOffset;
 *     PRPC_SYNTAX_IDENTIFIER pTransferSyntax;
 *     ULONG_PTR nCount;
 *     PMIDL_SYNTAX_INFO pSyntaxInfo;
 * }
 * }
 */
public class _MIDL_STUBLESS_PROXY_INFO {

    _MIDL_STUBLESS_PROXY_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("pStubDesc"),
        Windows_h.C_POINTER.withName("ProcFormatString"),
        Windows_h.C_POINTER.withName("FormatStringOffset"),
        Windows_h.C_POINTER.withName("pTransferSyntax"),
        Windows_h.C_LONG_LONG.withName("nCount"),
        Windows_h.C_POINTER.withName("pSyntaxInfo")
    ).withName("_MIDL_STUBLESS_PROXY_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pStubDesc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStubDesc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PMIDL_STUB_DESC pStubDesc
     * }
     */
    public static final AddressLayout pStubDesc$layout() {
        return pStubDesc$LAYOUT;
    }

    private static final long pStubDesc$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PMIDL_STUB_DESC pStubDesc
     * }
     */
    public static final long pStubDesc$offset() {
        return pStubDesc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PMIDL_STUB_DESC pStubDesc
     * }
     */
    public static MemorySegment pStubDesc(MemorySegment struct) {
        return struct.get(pStubDesc$LAYOUT, pStubDesc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PMIDL_STUB_DESC pStubDesc
     * }
     */
    public static void pStubDesc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pStubDesc$LAYOUT, pStubDesc$OFFSET, fieldValue);
    }

    private static final AddressLayout ProcFormatString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ProcFormatString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFORMAT_STRING ProcFormatString
     * }
     */
    public static final AddressLayout ProcFormatString$layout() {
        return ProcFormatString$LAYOUT;
    }

    private static final long ProcFormatString$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFORMAT_STRING ProcFormatString
     * }
     */
    public static final long ProcFormatString$offset() {
        return ProcFormatString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFORMAT_STRING ProcFormatString
     * }
     */
    public static MemorySegment ProcFormatString(MemorySegment struct) {
        return struct.get(ProcFormatString$LAYOUT, ProcFormatString$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFORMAT_STRING ProcFormatString
     * }
     */
    public static void ProcFormatString(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ProcFormatString$LAYOUT, ProcFormatString$OFFSET, fieldValue);
    }

    private static final AddressLayout FormatStringOffset$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("FormatStringOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const unsigned short *FormatStringOffset
     * }
     */
    public static final AddressLayout FormatStringOffset$layout() {
        return FormatStringOffset$LAYOUT;
    }

    private static final long FormatStringOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const unsigned short *FormatStringOffset
     * }
     */
    public static final long FormatStringOffset$offset() {
        return FormatStringOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const unsigned short *FormatStringOffset
     * }
     */
    public static MemorySegment FormatStringOffset(MemorySegment struct) {
        return struct.get(FormatStringOffset$LAYOUT, FormatStringOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const unsigned short *FormatStringOffset
     * }
     */
    public static void FormatStringOffset(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(FormatStringOffset$LAYOUT, FormatStringOffset$OFFSET, fieldValue);
    }

    private static final AddressLayout pTransferSyntax$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pTransferSyntax"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PRPC_SYNTAX_IDENTIFIER pTransferSyntax
     * }
     */
    public static final AddressLayout pTransferSyntax$layout() {
        return pTransferSyntax$LAYOUT;
    }

    private static final long pTransferSyntax$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PRPC_SYNTAX_IDENTIFIER pTransferSyntax
     * }
     */
    public static final long pTransferSyntax$offset() {
        return pTransferSyntax$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PRPC_SYNTAX_IDENTIFIER pTransferSyntax
     * }
     */
    public static MemorySegment pTransferSyntax(MemorySegment struct) {
        return struct.get(pTransferSyntax$LAYOUT, pTransferSyntax$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PRPC_SYNTAX_IDENTIFIER pTransferSyntax
     * }
     */
    public static void pTransferSyntax(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pTransferSyntax$LAYOUT, pTransferSyntax$OFFSET, fieldValue);
    }

    private static final OfLong nCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("nCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR nCount
     * }
     */
    public static final OfLong nCount$layout() {
        return nCount$LAYOUT;
    }

    private static final long nCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR nCount
     * }
     */
    public static final long nCount$offset() {
        return nCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR nCount
     * }
     */
    public static long nCount(MemorySegment struct) {
        return struct.get(nCount$LAYOUT, nCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR nCount
     * }
     */
    public static void nCount(MemorySegment struct, long fieldValue) {
        struct.set(nCount$LAYOUT, nCount$OFFSET, fieldValue);
    }

    private static final AddressLayout pSyntaxInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pSyntaxInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PMIDL_SYNTAX_INFO pSyntaxInfo
     * }
     */
    public static final AddressLayout pSyntaxInfo$layout() {
        return pSyntaxInfo$LAYOUT;
    }

    private static final long pSyntaxInfo$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PMIDL_SYNTAX_INFO pSyntaxInfo
     * }
     */
    public static final long pSyntaxInfo$offset() {
        return pSyntaxInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PMIDL_SYNTAX_INFO pSyntaxInfo
     * }
     */
    public static MemorySegment pSyntaxInfo(MemorySegment struct) {
        return struct.get(pSyntaxInfo$LAYOUT, pSyntaxInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PMIDL_SYNTAX_INFO pSyntaxInfo
     * }
     */
    public static void pSyntaxInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pSyntaxInfo$LAYOUT, pSyntaxInfo$OFFSET, fieldValue);
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

