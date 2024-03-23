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
 * struct _SERVICE_STATUS_PROCESS {
 *     DWORD dwServiceType;
 *     DWORD dwCurrentState;
 *     DWORD dwControlsAccepted;
 *     DWORD dwWin32ExitCode;
 *     DWORD dwServiceSpecificExitCode;
 *     DWORD dwCheckPoint;
 *     DWORD dwWaitHint;
 *     DWORD dwProcessId;
 *     DWORD dwServiceFlags;
 * }
 * }
 */
public class _SERVICE_STATUS_PROCESS {

    _SERVICE_STATUS_PROCESS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwServiceType"),
        Windows_h.C_LONG.withName("dwCurrentState"),
        Windows_h.C_LONG.withName("dwControlsAccepted"),
        Windows_h.C_LONG.withName("dwWin32ExitCode"),
        Windows_h.C_LONG.withName("dwServiceSpecificExitCode"),
        Windows_h.C_LONG.withName("dwCheckPoint"),
        Windows_h.C_LONG.withName("dwWaitHint"),
        Windows_h.C_LONG.withName("dwProcessId"),
        Windows_h.C_LONG.withName("dwServiceFlags")
    ).withName("_SERVICE_STATUS_PROCESS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwServiceType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwServiceType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwServiceType
     * }
     */
    public static final OfInt dwServiceType$layout() {
        return dwServiceType$LAYOUT;
    }

    private static final long dwServiceType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwServiceType
     * }
     */
    public static final long dwServiceType$offset() {
        return dwServiceType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwServiceType
     * }
     */
    public static int dwServiceType(MemorySegment struct) {
        return struct.get(dwServiceType$LAYOUT, dwServiceType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwServiceType
     * }
     */
    public static void dwServiceType(MemorySegment struct, int fieldValue) {
        struct.set(dwServiceType$LAYOUT, dwServiceType$OFFSET, fieldValue);
    }

    private static final OfInt dwCurrentState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCurrentState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwCurrentState
     * }
     */
    public static final OfInt dwCurrentState$layout() {
        return dwCurrentState$LAYOUT;
    }

    private static final long dwCurrentState$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwCurrentState
     * }
     */
    public static final long dwCurrentState$offset() {
        return dwCurrentState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwCurrentState
     * }
     */
    public static int dwCurrentState(MemorySegment struct) {
        return struct.get(dwCurrentState$LAYOUT, dwCurrentState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwCurrentState
     * }
     */
    public static void dwCurrentState(MemorySegment struct, int fieldValue) {
        struct.set(dwCurrentState$LAYOUT, dwCurrentState$OFFSET, fieldValue);
    }

    private static final OfInt dwControlsAccepted$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwControlsAccepted"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwControlsAccepted
     * }
     */
    public static final OfInt dwControlsAccepted$layout() {
        return dwControlsAccepted$LAYOUT;
    }

    private static final long dwControlsAccepted$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwControlsAccepted
     * }
     */
    public static final long dwControlsAccepted$offset() {
        return dwControlsAccepted$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwControlsAccepted
     * }
     */
    public static int dwControlsAccepted(MemorySegment struct) {
        return struct.get(dwControlsAccepted$LAYOUT, dwControlsAccepted$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwControlsAccepted
     * }
     */
    public static void dwControlsAccepted(MemorySegment struct, int fieldValue) {
        struct.set(dwControlsAccepted$LAYOUT, dwControlsAccepted$OFFSET, fieldValue);
    }

    private static final OfInt dwWin32ExitCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwWin32ExitCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwWin32ExitCode
     * }
     */
    public static final OfInt dwWin32ExitCode$layout() {
        return dwWin32ExitCode$LAYOUT;
    }

    private static final long dwWin32ExitCode$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwWin32ExitCode
     * }
     */
    public static final long dwWin32ExitCode$offset() {
        return dwWin32ExitCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwWin32ExitCode
     * }
     */
    public static int dwWin32ExitCode(MemorySegment struct) {
        return struct.get(dwWin32ExitCode$LAYOUT, dwWin32ExitCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwWin32ExitCode
     * }
     */
    public static void dwWin32ExitCode(MemorySegment struct, int fieldValue) {
        struct.set(dwWin32ExitCode$LAYOUT, dwWin32ExitCode$OFFSET, fieldValue);
    }

    private static final OfInt dwServiceSpecificExitCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwServiceSpecificExitCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwServiceSpecificExitCode
     * }
     */
    public static final OfInt dwServiceSpecificExitCode$layout() {
        return dwServiceSpecificExitCode$LAYOUT;
    }

    private static final long dwServiceSpecificExitCode$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwServiceSpecificExitCode
     * }
     */
    public static final long dwServiceSpecificExitCode$offset() {
        return dwServiceSpecificExitCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwServiceSpecificExitCode
     * }
     */
    public static int dwServiceSpecificExitCode(MemorySegment struct) {
        return struct.get(dwServiceSpecificExitCode$LAYOUT, dwServiceSpecificExitCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwServiceSpecificExitCode
     * }
     */
    public static void dwServiceSpecificExitCode(MemorySegment struct, int fieldValue) {
        struct.set(dwServiceSpecificExitCode$LAYOUT, dwServiceSpecificExitCode$OFFSET, fieldValue);
    }

    private static final OfInt dwCheckPoint$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCheckPoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwCheckPoint
     * }
     */
    public static final OfInt dwCheckPoint$layout() {
        return dwCheckPoint$LAYOUT;
    }

    private static final long dwCheckPoint$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwCheckPoint
     * }
     */
    public static final long dwCheckPoint$offset() {
        return dwCheckPoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwCheckPoint
     * }
     */
    public static int dwCheckPoint(MemorySegment struct) {
        return struct.get(dwCheckPoint$LAYOUT, dwCheckPoint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwCheckPoint
     * }
     */
    public static void dwCheckPoint(MemorySegment struct, int fieldValue) {
        struct.set(dwCheckPoint$LAYOUT, dwCheckPoint$OFFSET, fieldValue);
    }

    private static final OfInt dwWaitHint$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwWaitHint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwWaitHint
     * }
     */
    public static final OfInt dwWaitHint$layout() {
        return dwWaitHint$LAYOUT;
    }

    private static final long dwWaitHint$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwWaitHint
     * }
     */
    public static final long dwWaitHint$offset() {
        return dwWaitHint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwWaitHint
     * }
     */
    public static int dwWaitHint(MemorySegment struct) {
        return struct.get(dwWaitHint$LAYOUT, dwWaitHint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwWaitHint
     * }
     */
    public static void dwWaitHint(MemorySegment struct, int fieldValue) {
        struct.set(dwWaitHint$LAYOUT, dwWaitHint$OFFSET, fieldValue);
    }

    private static final OfInt dwProcessId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwProcessId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwProcessId
     * }
     */
    public static final OfInt dwProcessId$layout() {
        return dwProcessId$LAYOUT;
    }

    private static final long dwProcessId$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwProcessId
     * }
     */
    public static final long dwProcessId$offset() {
        return dwProcessId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwProcessId
     * }
     */
    public static int dwProcessId(MemorySegment struct) {
        return struct.get(dwProcessId$LAYOUT, dwProcessId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwProcessId
     * }
     */
    public static void dwProcessId(MemorySegment struct, int fieldValue) {
        struct.set(dwProcessId$LAYOUT, dwProcessId$OFFSET, fieldValue);
    }

    private static final OfInt dwServiceFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwServiceFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwServiceFlags
     * }
     */
    public static final OfInt dwServiceFlags$layout() {
        return dwServiceFlags$LAYOUT;
    }

    private static final long dwServiceFlags$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwServiceFlags
     * }
     */
    public static final long dwServiceFlags$offset() {
        return dwServiceFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwServiceFlags
     * }
     */
    public static int dwServiceFlags(MemorySegment struct) {
        return struct.get(dwServiceFlags$LAYOUT, dwServiceFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwServiceFlags
     * }
     */
    public static void dwServiceFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwServiceFlags$LAYOUT, dwServiceFlags$OFFSET, fieldValue);
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

