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
 * struct IOleCacheVtbl {
 *     HRESULT (*QueryInterface)(IOleCache *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(IOleCache *) __attribute__((stdcall));
 *     ULONG (*Release)(IOleCache *) __attribute__((stdcall));
 *     HRESULT (*Cache)(IOleCache *, FORMATETC *, DWORD, DWORD *) __attribute__((stdcall));
 *     HRESULT (*Uncache)(IOleCache *, DWORD) __attribute__((stdcall));
 *     HRESULT (*EnumCache)(IOleCache *, IEnumSTATDATA **) __attribute__((stdcall));
 *     HRESULT (*InitCache)(IOleCache *, IDataObject *) __attribute__((stdcall));
 *     HRESULT (*SetData)(IOleCache *, FORMATETC *, STGMEDIUM *, BOOL) __attribute__((stdcall));
 * }
 * }
 */
public class IOleCacheVtbl {

    IOleCacheVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("QueryInterface"),
        Windows_h.C_POINTER.withName("AddRef"),
        Windows_h.C_POINTER.withName("Release"),
        Windows_h.C_POINTER.withName("Cache"),
        Windows_h.C_POINTER.withName("Uncache"),
        Windows_h.C_POINTER.withName("EnumCache"),
        Windows_h.C_POINTER.withName("InitCache"),
        Windows_h.C_POINTER.withName("SetData")
    ).withName("IOleCacheVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IOleCache *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static class QueryInterface {

        QueryInterface() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(QueryInterface.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(QueryInterface.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout QueryInterface$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("QueryInterface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IOleCache *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IOleCache *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IOleCache *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IOleCache *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static class AddRef {

        AddRef() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(AddRef.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(AddRef.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout AddRef$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("AddRef"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static class Release {

        Release() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(Release.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Release.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Release$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Release"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IOleCache *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*Cache)(IOleCache *, FORMATETC *, DWORD, DWORD *) __attribute__((stdcall))
     * }
     */
    public static class Cache {

        Cache() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER,
            Windows_h.C_LONG,
            Windows_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(Cache.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Cache.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Cache$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Cache"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*Cache)(IOleCache *, FORMATETC *, DWORD, DWORD *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Cache$layout() {
        return Cache$LAYOUT;
    }

    private static final long Cache$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*Cache)(IOleCache *, FORMATETC *, DWORD, DWORD *) __attribute__((stdcall))
     * }
     */
    public static final long Cache$offset() {
        return Cache$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*Cache)(IOleCache *, FORMATETC *, DWORD, DWORD *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Cache(MemorySegment struct) {
        return struct.get(Cache$LAYOUT, Cache$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*Cache)(IOleCache *, FORMATETC *, DWORD, DWORD *) __attribute__((stdcall))
     * }
     */
    public static void Cache(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Cache$LAYOUT, Cache$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*Uncache)(IOleCache *, DWORD) __attribute__((stdcall))
     * }
     */
    public static class Uncache {

        Uncache() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(Uncache.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Uncache.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Uncache$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Uncache"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*Uncache)(IOleCache *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Uncache$layout() {
        return Uncache$LAYOUT;
    }

    private static final long Uncache$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*Uncache)(IOleCache *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final long Uncache$offset() {
        return Uncache$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*Uncache)(IOleCache *, DWORD) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Uncache(MemorySegment struct) {
        return struct.get(Uncache$LAYOUT, Uncache$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*Uncache)(IOleCache *, DWORD) __attribute__((stdcall))
     * }
     */
    public static void Uncache(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Uncache$LAYOUT, Uncache$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*EnumCache)(IOleCache *, IEnumSTATDATA **) __attribute__((stdcall))
     * }
     */
    public static class EnumCache {

        EnumCache() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(EnumCache.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(EnumCache.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout EnumCache$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("EnumCache"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*EnumCache)(IOleCache *, IEnumSTATDATA **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout EnumCache$layout() {
        return EnumCache$LAYOUT;
    }

    private static final long EnumCache$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*EnumCache)(IOleCache *, IEnumSTATDATA **) __attribute__((stdcall))
     * }
     */
    public static final long EnumCache$offset() {
        return EnumCache$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*EnumCache)(IOleCache *, IEnumSTATDATA **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment EnumCache(MemorySegment struct) {
        return struct.get(EnumCache$LAYOUT, EnumCache$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*EnumCache)(IOleCache *, IEnumSTATDATA **) __attribute__((stdcall))
     * }
     */
    public static void EnumCache(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(EnumCache$LAYOUT, EnumCache$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*InitCache)(IOleCache *, IDataObject *) __attribute__((stdcall))
     * }
     */
    public static class InitCache {

        InitCache() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(InitCache.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(InitCache.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout InitCache$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("InitCache"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*InitCache)(IOleCache *, IDataObject *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout InitCache$layout() {
        return InitCache$LAYOUT;
    }

    private static final long InitCache$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*InitCache)(IOleCache *, IDataObject *) __attribute__((stdcall))
     * }
     */
    public static final long InitCache$offset() {
        return InitCache$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*InitCache)(IOleCache *, IDataObject *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment InitCache(MemorySegment struct) {
        return struct.get(InitCache$LAYOUT, InitCache$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*InitCache)(IOleCache *, IDataObject *) __attribute__((stdcall))
     * }
     */
    public static void InitCache(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(InitCache$LAYOUT, InitCache$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*SetData)(IOleCache *, FORMATETC *, STGMEDIUM *, BOOL) __attribute__((stdcall))
     * }
     */
    public static class SetData {

        SetData() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER,
            Windows_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(SetData.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(SetData.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout SetData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SetData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*SetData)(IOleCache *, FORMATETC *, STGMEDIUM *, BOOL) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout SetData$layout() {
        return SetData$LAYOUT;
    }

    private static final long SetData$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*SetData)(IOleCache *, FORMATETC *, STGMEDIUM *, BOOL) __attribute__((stdcall))
     * }
     */
    public static final long SetData$offset() {
        return SetData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*SetData)(IOleCache *, FORMATETC *, STGMEDIUM *, BOOL) __attribute__((stdcall))
     * }
     */
    public static MemorySegment SetData(MemorySegment struct) {
        return struct.get(SetData$LAYOUT, SetData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*SetData)(IOleCache *, FORMATETC *, STGMEDIUM *, BOOL) __attribute__((stdcall))
     * }
     */
    public static void SetData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SetData$LAYOUT, SetData$OFFSET, fieldValue);
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

