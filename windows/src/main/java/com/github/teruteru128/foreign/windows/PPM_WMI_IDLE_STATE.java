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
 * struct {
 *     DWORD Latency;
 *     DWORD Power;
 *     DWORD TimeCheck;
 *     BYTE PromotePercent;
 *     BYTE DemotePercent;
 *     BYTE StateType;
 *     BYTE Reserved;
 *     DWORD StateFlags;
 *     DWORD Context;
 *     DWORD IdleHandler;
 *     DWORD Reserved1;
 * }
 * }
 */
public class PPM_WMI_IDLE_STATE {

    PPM_WMI_IDLE_STATE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Latency"),
        Windows_h.C_LONG.withName("Power"),
        Windows_h.C_LONG.withName("TimeCheck"),
        Windows_h.C_CHAR.withName("PromotePercent"),
        Windows_h.C_CHAR.withName("DemotePercent"),
        Windows_h.C_CHAR.withName("StateType"),
        Windows_h.C_CHAR.withName("Reserved"),
        Windows_h.C_LONG.withName("StateFlags"),
        Windows_h.C_LONG.withName("Context"),
        Windows_h.C_LONG.withName("IdleHandler"),
        Windows_h.C_LONG.withName("Reserved1")
    ).withName("$anon$17326:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Latency$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Latency"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Latency
     * }
     */
    public static final OfInt Latency$layout() {
        return Latency$LAYOUT;
    }

    private static final long Latency$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Latency
     * }
     */
    public static final long Latency$offset() {
        return Latency$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Latency
     * }
     */
    public static int Latency(MemorySegment struct) {
        return struct.get(Latency$LAYOUT, Latency$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Latency
     * }
     */
    public static void Latency(MemorySegment struct, int fieldValue) {
        struct.set(Latency$LAYOUT, Latency$OFFSET, fieldValue);
    }

    private static final OfInt Power$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Power"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Power
     * }
     */
    public static final OfInt Power$layout() {
        return Power$LAYOUT;
    }

    private static final long Power$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Power
     * }
     */
    public static final long Power$offset() {
        return Power$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Power
     * }
     */
    public static int Power(MemorySegment struct) {
        return struct.get(Power$LAYOUT, Power$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Power
     * }
     */
    public static void Power(MemorySegment struct, int fieldValue) {
        struct.set(Power$LAYOUT, Power$OFFSET, fieldValue);
    }

    private static final OfInt TimeCheck$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimeCheck"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static final OfInt TimeCheck$layout() {
        return TimeCheck$LAYOUT;
    }

    private static final long TimeCheck$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static final long TimeCheck$offset() {
        return TimeCheck$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static int TimeCheck(MemorySegment struct) {
        return struct.get(TimeCheck$LAYOUT, TimeCheck$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static void TimeCheck(MemorySegment struct, int fieldValue) {
        struct.set(TimeCheck$LAYOUT, TimeCheck$OFFSET, fieldValue);
    }

    private static final OfByte PromotePercent$LAYOUT = (OfByte)$LAYOUT.select(groupElement("PromotePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE PromotePercent
     * }
     */
    public static final OfByte PromotePercent$layout() {
        return PromotePercent$LAYOUT;
    }

    private static final long PromotePercent$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE PromotePercent
     * }
     */
    public static final long PromotePercent$offset() {
        return PromotePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE PromotePercent
     * }
     */
    public static byte PromotePercent(MemorySegment struct) {
        return struct.get(PromotePercent$LAYOUT, PromotePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE PromotePercent
     * }
     */
    public static void PromotePercent(MemorySegment struct, byte fieldValue) {
        struct.set(PromotePercent$LAYOUT, PromotePercent$OFFSET, fieldValue);
    }

    private static final OfByte DemotePercent$LAYOUT = (OfByte)$LAYOUT.select(groupElement("DemotePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE DemotePercent
     * }
     */
    public static final OfByte DemotePercent$layout() {
        return DemotePercent$LAYOUT;
    }

    private static final long DemotePercent$OFFSET = 13;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE DemotePercent
     * }
     */
    public static final long DemotePercent$offset() {
        return DemotePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE DemotePercent
     * }
     */
    public static byte DemotePercent(MemorySegment struct) {
        return struct.get(DemotePercent$LAYOUT, DemotePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE DemotePercent
     * }
     */
    public static void DemotePercent(MemorySegment struct, byte fieldValue) {
        struct.set(DemotePercent$LAYOUT, DemotePercent$OFFSET, fieldValue);
    }

    private static final OfByte StateType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("StateType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE StateType
     * }
     */
    public static final OfByte StateType$layout() {
        return StateType$LAYOUT;
    }

    private static final long StateType$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE StateType
     * }
     */
    public static final long StateType$offset() {
        return StateType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE StateType
     * }
     */
    public static byte StateType(MemorySegment struct) {
        return struct.get(StateType$LAYOUT, StateType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE StateType
     * }
     */
    public static void StateType(MemorySegment struct, byte fieldValue) {
        struct.set(StateType$LAYOUT, StateType$OFFSET, fieldValue);
    }

    private static final OfByte Reserved$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved
     * }
     */
    public static final OfByte Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 15;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved
     * }
     */
    public static byte Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, byte fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfInt StateFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StateFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StateFlags
     * }
     */
    public static final OfInt StateFlags$layout() {
        return StateFlags$LAYOUT;
    }

    private static final long StateFlags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StateFlags
     * }
     */
    public static final long StateFlags$offset() {
        return StateFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StateFlags
     * }
     */
    public static int StateFlags(MemorySegment struct) {
        return struct.get(StateFlags$LAYOUT, StateFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StateFlags
     * }
     */
    public static void StateFlags(MemorySegment struct, int fieldValue) {
        struct.set(StateFlags$LAYOUT, StateFlags$OFFSET, fieldValue);
    }

    private static final OfInt Context$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Context
     * }
     */
    public static final OfInt Context$layout() {
        return Context$LAYOUT;
    }

    private static final long Context$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Context
     * }
     */
    public static final long Context$offset() {
        return Context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Context
     * }
     */
    public static int Context(MemorySegment struct) {
        return struct.get(Context$LAYOUT, Context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Context
     * }
     */
    public static void Context(MemorySegment struct, int fieldValue) {
        struct.set(Context$LAYOUT, Context$OFFSET, fieldValue);
    }

    private static final OfInt IdleHandler$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IdleHandler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD IdleHandler
     * }
     */
    public static final OfInt IdleHandler$layout() {
        return IdleHandler$LAYOUT;
    }

    private static final long IdleHandler$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD IdleHandler
     * }
     */
    public static final long IdleHandler$offset() {
        return IdleHandler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD IdleHandler
     * }
     */
    public static int IdleHandler(MemorySegment struct) {
        return struct.get(IdleHandler$LAYOUT, IdleHandler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD IdleHandler
     * }
     */
    public static void IdleHandler(MemorySegment struct, int fieldValue) {
        struct.set(IdleHandler$LAYOUT, IdleHandler$OFFSET, fieldValue);
    }

    private static final OfInt Reserved1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static final OfInt Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static int Reserved1(MemorySegment struct) {
        return struct.get(Reserved1$LAYOUT, Reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static void Reserved1(MemorySegment struct, int fieldValue) {
        struct.set(Reserved1$LAYOUT, Reserved1$OFFSET, fieldValue);
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
