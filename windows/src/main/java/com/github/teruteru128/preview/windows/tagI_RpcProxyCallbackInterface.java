// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * struct tagI_RpcProxyCallbackInterface {
 *     I_RpcProxyIsValidMachineFn IsValidMachineFn;
 *     I_RpcProxyGetClientAddressFn GetClientAddressFn;
 *     I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn;
 *     I_RpcPerformCalloutFn PerformCalloutFn;
 *     I_RpcFreeCalloutStateFn FreeCalloutStateFn;
 *     I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn;
 *     I_RpcProxyFilterIfFn ProxyFilterIfFn;
 *     I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn;
 *     I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn;
 * }
 * }
 */
public class tagI_RpcProxyCallbackInterface {

    tagI_RpcProxyCallbackInterface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("IsValidMachineFn"),
        Windows_h.C_POINTER.withName("GetClientAddressFn"),
        Windows_h.C_POINTER.withName("GetConnectionTimeoutFn"),
        Windows_h.C_POINTER.withName("PerformCalloutFn"),
        Windows_h.C_POINTER.withName("FreeCalloutStateFn"),
        Windows_h.C_POINTER.withName("GetClientSessionAndResourceUUIDFn"),
        Windows_h.C_POINTER.withName("ProxyFilterIfFn"),
        Windows_h.C_POINTER.withName("RpcProxyUpdatePerfCounterFn"),
        Windows_h.C_POINTER.withName("RpcProxyUpdatePerfCounterBackendServerFn")
    ).withName("tagI_RpcProxyCallbackInterface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout IsValidMachineFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("IsValidMachineFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcProxyIsValidMachineFn IsValidMachineFn
     * }
     */
    public static final AddressLayout IsValidMachineFn$layout() {
        return IsValidMachineFn$LAYOUT;
    }

    private static final long IsValidMachineFn$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcProxyIsValidMachineFn IsValidMachineFn
     * }
     */
    public static final long IsValidMachineFn$offset() {
        return IsValidMachineFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcProxyIsValidMachineFn IsValidMachineFn
     * }
     */
    public static MemorySegment IsValidMachineFn(MemorySegment struct) {
        return struct.get(IsValidMachineFn$LAYOUT, IsValidMachineFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcProxyIsValidMachineFn IsValidMachineFn
     * }
     */
    public static void IsValidMachineFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(IsValidMachineFn$LAYOUT, IsValidMachineFn$OFFSET, fieldValue);
    }

    private static final AddressLayout GetClientAddressFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetClientAddressFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcProxyGetClientAddressFn GetClientAddressFn
     * }
     */
    public static final AddressLayout GetClientAddressFn$layout() {
        return GetClientAddressFn$LAYOUT;
    }

    private static final long GetClientAddressFn$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcProxyGetClientAddressFn GetClientAddressFn
     * }
     */
    public static final long GetClientAddressFn$offset() {
        return GetClientAddressFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcProxyGetClientAddressFn GetClientAddressFn
     * }
     */
    public static MemorySegment GetClientAddressFn(MemorySegment struct) {
        return struct.get(GetClientAddressFn$LAYOUT, GetClientAddressFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcProxyGetClientAddressFn GetClientAddressFn
     * }
     */
    public static void GetClientAddressFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetClientAddressFn$LAYOUT, GetClientAddressFn$OFFSET, fieldValue);
    }

    private static final AddressLayout GetConnectionTimeoutFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetConnectionTimeoutFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn
     * }
     */
    public static final AddressLayout GetConnectionTimeoutFn$layout() {
        return GetConnectionTimeoutFn$LAYOUT;
    }

    private static final long GetConnectionTimeoutFn$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn
     * }
     */
    public static final long GetConnectionTimeoutFn$offset() {
        return GetConnectionTimeoutFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn
     * }
     */
    public static MemorySegment GetConnectionTimeoutFn(MemorySegment struct) {
        return struct.get(GetConnectionTimeoutFn$LAYOUT, GetConnectionTimeoutFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn
     * }
     */
    public static void GetConnectionTimeoutFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetConnectionTimeoutFn$LAYOUT, GetConnectionTimeoutFn$OFFSET, fieldValue);
    }

    private static final AddressLayout PerformCalloutFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("PerformCalloutFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcPerformCalloutFn PerformCalloutFn
     * }
     */
    public static final AddressLayout PerformCalloutFn$layout() {
        return PerformCalloutFn$LAYOUT;
    }

    private static final long PerformCalloutFn$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcPerformCalloutFn PerformCalloutFn
     * }
     */
    public static final long PerformCalloutFn$offset() {
        return PerformCalloutFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcPerformCalloutFn PerformCalloutFn
     * }
     */
    public static MemorySegment PerformCalloutFn(MemorySegment struct) {
        return struct.get(PerformCalloutFn$LAYOUT, PerformCalloutFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcPerformCalloutFn PerformCalloutFn
     * }
     */
    public static void PerformCalloutFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(PerformCalloutFn$LAYOUT, PerformCalloutFn$OFFSET, fieldValue);
    }

    private static final AddressLayout FreeCalloutStateFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("FreeCalloutStateFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcFreeCalloutStateFn FreeCalloutStateFn
     * }
     */
    public static final AddressLayout FreeCalloutStateFn$layout() {
        return FreeCalloutStateFn$LAYOUT;
    }

    private static final long FreeCalloutStateFn$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcFreeCalloutStateFn FreeCalloutStateFn
     * }
     */
    public static final long FreeCalloutStateFn$offset() {
        return FreeCalloutStateFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcFreeCalloutStateFn FreeCalloutStateFn
     * }
     */
    public static MemorySegment FreeCalloutStateFn(MemorySegment struct) {
        return struct.get(FreeCalloutStateFn$LAYOUT, FreeCalloutStateFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcFreeCalloutStateFn FreeCalloutStateFn
     * }
     */
    public static void FreeCalloutStateFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(FreeCalloutStateFn$LAYOUT, FreeCalloutStateFn$OFFSET, fieldValue);
    }

    private static final AddressLayout GetClientSessionAndResourceUUIDFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetClientSessionAndResourceUUIDFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn
     * }
     */
    public static final AddressLayout GetClientSessionAndResourceUUIDFn$layout() {
        return GetClientSessionAndResourceUUIDFn$LAYOUT;
    }

    private static final long GetClientSessionAndResourceUUIDFn$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn
     * }
     */
    public static final long GetClientSessionAndResourceUUIDFn$offset() {
        return GetClientSessionAndResourceUUIDFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn
     * }
     */
    public static MemorySegment GetClientSessionAndResourceUUIDFn(MemorySegment struct) {
        return struct.get(GetClientSessionAndResourceUUIDFn$LAYOUT, GetClientSessionAndResourceUUIDFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn
     * }
     */
    public static void GetClientSessionAndResourceUUIDFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetClientSessionAndResourceUUIDFn$LAYOUT, GetClientSessionAndResourceUUIDFn$OFFSET, fieldValue);
    }

    private static final AddressLayout ProxyFilterIfFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ProxyFilterIfFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcProxyFilterIfFn ProxyFilterIfFn
     * }
     */
    public static final AddressLayout ProxyFilterIfFn$layout() {
        return ProxyFilterIfFn$LAYOUT;
    }

    private static final long ProxyFilterIfFn$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcProxyFilterIfFn ProxyFilterIfFn
     * }
     */
    public static final long ProxyFilterIfFn$offset() {
        return ProxyFilterIfFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcProxyFilterIfFn ProxyFilterIfFn
     * }
     */
    public static MemorySegment ProxyFilterIfFn(MemorySegment struct) {
        return struct.get(ProxyFilterIfFn$LAYOUT, ProxyFilterIfFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcProxyFilterIfFn ProxyFilterIfFn
     * }
     */
    public static void ProxyFilterIfFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ProxyFilterIfFn$LAYOUT, ProxyFilterIfFn$OFFSET, fieldValue);
    }

    private static final AddressLayout RpcProxyUpdatePerfCounterFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("RpcProxyUpdatePerfCounterFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn
     * }
     */
    public static final AddressLayout RpcProxyUpdatePerfCounterFn$layout() {
        return RpcProxyUpdatePerfCounterFn$LAYOUT;
    }

    private static final long RpcProxyUpdatePerfCounterFn$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn
     * }
     */
    public static final long RpcProxyUpdatePerfCounterFn$offset() {
        return RpcProxyUpdatePerfCounterFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn
     * }
     */
    public static MemorySegment RpcProxyUpdatePerfCounterFn(MemorySegment struct) {
        return struct.get(RpcProxyUpdatePerfCounterFn$LAYOUT, RpcProxyUpdatePerfCounterFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn
     * }
     */
    public static void RpcProxyUpdatePerfCounterFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(RpcProxyUpdatePerfCounterFn$LAYOUT, RpcProxyUpdatePerfCounterFn$OFFSET, fieldValue);
    }

    private static final AddressLayout RpcProxyUpdatePerfCounterBackendServerFn$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("RpcProxyUpdatePerfCounterBackendServerFn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn
     * }
     */
    public static final AddressLayout RpcProxyUpdatePerfCounterBackendServerFn$layout() {
        return RpcProxyUpdatePerfCounterBackendServerFn$LAYOUT;
    }

    private static final long RpcProxyUpdatePerfCounterBackendServerFn$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn
     * }
     */
    public static final long RpcProxyUpdatePerfCounterBackendServerFn$offset() {
        return RpcProxyUpdatePerfCounterBackendServerFn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn
     * }
     */
    public static MemorySegment RpcProxyUpdatePerfCounterBackendServerFn(MemorySegment struct) {
        return struct.get(RpcProxyUpdatePerfCounterBackendServerFn$LAYOUT, RpcProxyUpdatePerfCounterBackendServerFn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn
     * }
     */
    public static void RpcProxyUpdatePerfCounterBackendServerFn(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(RpcProxyUpdatePerfCounterBackendServerFn$LAYOUT, RpcProxyUpdatePerfCounterBackendServerFn$OFFSET, fieldValue);
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
