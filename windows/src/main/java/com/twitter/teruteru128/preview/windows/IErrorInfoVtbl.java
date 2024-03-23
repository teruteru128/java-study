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
 * struct IErrorInfoVtbl {
 *     HRESULT (*QueryInterface)(IErrorInfo *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(IErrorInfo *) __attribute__((stdcall));
 *     ULONG (*Release)(IErrorInfo *) __attribute__((stdcall));
 *     HRESULT (*GetGUID)(IErrorInfo *, GUID *) __attribute__((stdcall));
 *     HRESULT (*GetSource)(IErrorInfo *, BSTR *) __attribute__((stdcall));
 *     HRESULT (*GetDescription)(IErrorInfo *, BSTR *) __attribute__((stdcall));
 *     HRESULT (*GetHelpFile)(IErrorInfo *, BSTR *) __attribute__((stdcall));
 *     HRESULT (*GetHelpContext)(IErrorInfo *, DWORD *) __attribute__((stdcall));
 * }
 * }
 */
public class IErrorInfoVtbl {

    IErrorInfoVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("QueryInterface"),
        Windows_h.C_POINTER.withName("AddRef"),
        Windows_h.C_POINTER.withName("Release"),
        Windows_h.C_POINTER.withName("GetGUID"),
        Windows_h.C_POINTER.withName("GetSource"),
        Windows_h.C_POINTER.withName("GetDescription"),
        Windows_h.C_POINTER.withName("GetHelpFile"),
        Windows_h.C_POINTER.withName("GetHelpContext")
    ).withName("IErrorInfoVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IErrorInfo *, const IID *const, void **) __attribute__((stdcall))
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
     * HRESULT (*QueryInterface)(IErrorInfo *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IErrorInfo *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IErrorInfo *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IErrorInfo *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(IErrorInfo *) __attribute__((stdcall))
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
     * ULONG (*AddRef)(IErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(IErrorInfo *) __attribute__((stdcall))
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
     * ULONG (*Release)(IErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetGUID)(IErrorInfo *, GUID *) __attribute__((stdcall))
     * }
     */
    public static class GetGUID {

        GetGUID() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetGUID.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetGUID.Function fi, Arena arena) {
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

    private static final AddressLayout GetGUID$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetGUID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetGUID)(IErrorInfo *, GUID *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetGUID$layout() {
        return GetGUID$LAYOUT;
    }

    private static final long GetGUID$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetGUID)(IErrorInfo *, GUID *) __attribute__((stdcall))
     * }
     */
    public static final long GetGUID$offset() {
        return GetGUID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetGUID)(IErrorInfo *, GUID *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetGUID(MemorySegment struct) {
        return struct.get(GetGUID$LAYOUT, GetGUID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetGUID)(IErrorInfo *, GUID *) __attribute__((stdcall))
     * }
     */
    public static void GetGUID(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetGUID$LAYOUT, GetGUID$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetSource)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class GetSource {

        GetSource() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetSource.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetSource.Function fi, Arena arena) {
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

    private static final AddressLayout GetSource$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetSource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetSource)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetSource$layout() {
        return GetSource$LAYOUT;
    }

    private static final long GetSource$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetSource)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long GetSource$offset() {
        return GetSource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetSource)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetSource(MemorySegment struct) {
        return struct.get(GetSource$LAYOUT, GetSource$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetSource)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void GetSource(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetSource$LAYOUT, GetSource$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetDescription)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class GetDescription {

        GetDescription() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetDescription.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetDescription.Function fi, Arena arena) {
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

    private static final AddressLayout GetDescription$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetDescription"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetDescription)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetDescription$layout() {
        return GetDescription$LAYOUT;
    }

    private static final long GetDescription$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetDescription)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long GetDescription$offset() {
        return GetDescription$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetDescription)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetDescription(MemorySegment struct) {
        return struct.get(GetDescription$LAYOUT, GetDescription$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetDescription)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void GetDescription(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetDescription$LAYOUT, GetDescription$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetHelpFile)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class GetHelpFile {

        GetHelpFile() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetHelpFile.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetHelpFile.Function fi, Arena arena) {
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

    private static final AddressLayout GetHelpFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetHelpFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpFile)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetHelpFile$layout() {
        return GetHelpFile$LAYOUT;
    }

    private static final long GetHelpFile$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpFile)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long GetHelpFile$offset() {
        return GetHelpFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpFile)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetHelpFile(MemorySegment struct) {
        return struct.get(GetHelpFile$LAYOUT, GetHelpFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpFile)(IErrorInfo *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void GetHelpFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetHelpFile$LAYOUT, GetHelpFile$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetHelpContext)(IErrorInfo *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static class GetHelpContext {

        GetHelpContext() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetHelpContext.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetHelpContext.Function fi, Arena arena) {
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

    private static final AddressLayout GetHelpContext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetHelpContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpContext)(IErrorInfo *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetHelpContext$layout() {
        return GetHelpContext$LAYOUT;
    }

    private static final long GetHelpContext$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpContext)(IErrorInfo *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static final long GetHelpContext$offset() {
        return GetHelpContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpContext)(IErrorInfo *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetHelpContext(MemorySegment struct) {
        return struct.get(GetHelpContext$LAYOUT, GetHelpContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpContext)(IErrorInfo *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static void GetHelpContext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetHelpContext$LAYOUT, GetHelpContext$OFFSET, fieldValue);
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

