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
 * struct _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT {
 *     ULONG Magic;
 *     ULONG Version;
 *     ULONG pcrAlg;
 *     ULONG cbSignature;
 *     ULONG cbQuote;
 *     ULONG cbPcrs;
 * }
 * }
 */
public class _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT {

    _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Magic"),
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("pcrAlg"),
        Windows_h.C_LONG.withName("cbSignature"),
        Windows_h.C_LONG.withName("cbQuote"),
        Windows_h.C_LONG.withName("cbPcrs")
    ).withName("_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Magic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG Magic
     * }
     */
    public static final OfInt Magic$layout() {
        return Magic$LAYOUT;
    }

    private static final long Magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG Magic
     * }
     */
    public static final long Magic$offset() {
        return Magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG Magic
     * }
     */
    public static int Magic(MemorySegment struct) {
        return struct.get(Magic$LAYOUT, Magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG Magic
     * }
     */
    public static void Magic(MemorySegment struct, int fieldValue) {
        struct.set(Magic$LAYOUT, Magic$OFFSET, fieldValue);
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt pcrAlg$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pcrAlg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG pcrAlg
     * }
     */
    public static final OfInt pcrAlg$layout() {
        return pcrAlg$LAYOUT;
    }

    private static final long pcrAlg$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG pcrAlg
     * }
     */
    public static final long pcrAlg$offset() {
        return pcrAlg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG pcrAlg
     * }
     */
    public static int pcrAlg(MemorySegment struct) {
        return struct.get(pcrAlg$LAYOUT, pcrAlg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG pcrAlg
     * }
     */
    public static void pcrAlg(MemorySegment struct, int fieldValue) {
        struct.set(pcrAlg$LAYOUT, pcrAlg$OFFSET, fieldValue);
    }

    private static final OfInt cbSignature$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSignature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbSignature
     * }
     */
    public static final OfInt cbSignature$layout() {
        return cbSignature$LAYOUT;
    }

    private static final long cbSignature$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbSignature
     * }
     */
    public static final long cbSignature$offset() {
        return cbSignature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbSignature
     * }
     */
    public static int cbSignature(MemorySegment struct) {
        return struct.get(cbSignature$LAYOUT, cbSignature$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbSignature
     * }
     */
    public static void cbSignature(MemorySegment struct, int fieldValue) {
        struct.set(cbSignature$LAYOUT, cbSignature$OFFSET, fieldValue);
    }

    private static final OfInt cbQuote$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbQuote"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbQuote
     * }
     */
    public static final OfInt cbQuote$layout() {
        return cbQuote$LAYOUT;
    }

    private static final long cbQuote$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbQuote
     * }
     */
    public static final long cbQuote$offset() {
        return cbQuote$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbQuote
     * }
     */
    public static int cbQuote(MemorySegment struct) {
        return struct.get(cbQuote$LAYOUT, cbQuote$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbQuote
     * }
     */
    public static void cbQuote(MemorySegment struct, int fieldValue) {
        struct.set(cbQuote$LAYOUT, cbQuote$OFFSET, fieldValue);
    }

    private static final OfInt cbPcrs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbPcrs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbPcrs
     * }
     */
    public static final OfInt cbPcrs$layout() {
        return cbPcrs$LAYOUT;
    }

    private static final long cbPcrs$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbPcrs
     * }
     */
    public static final long cbPcrs$offset() {
        return cbPcrs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbPcrs
     * }
     */
    public static int cbPcrs(MemorySegment struct) {
        return struct.get(cbPcrs$LAYOUT, cbPcrs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbPcrs
     * }
     */
    public static void cbPcrs(MemorySegment struct, int fieldValue) {
        struct.set(cbPcrs$LAYOUT, cbPcrs$OFFSET, fieldValue);
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

