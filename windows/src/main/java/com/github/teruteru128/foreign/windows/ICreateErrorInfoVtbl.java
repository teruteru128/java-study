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
 * struct ICreateErrorInfoVtbl {
 *     HRESULT (*QueryInterface)(ICreateErrorInfo *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(ICreateErrorInfo *) __attribute__((stdcall));
 *     ULONG (*Release)(ICreateErrorInfo *) __attribute__((stdcall));
 *     HRESULT (*SetGUID)(ICreateErrorInfo *, const GUID *const) __attribute__((stdcall));
 *     HRESULT (*SetSource)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall));
 *     HRESULT (*SetDescription)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall));
 *     HRESULT (*SetHelpFile)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall));
 *     HRESULT (*SetHelpContext)(ICreateErrorInfo *, DWORD) __attribute__((stdcall));
 * }
 * }
 */
public class ICreateErrorInfoVtbl {

    ICreateErrorInfoVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("QueryInterface"),
        Windows_h.C_POINTER.withName("AddRef"),
        Windows_h.C_POINTER.withName("Release"),
        Windows_h.C_POINTER.withName("SetGUID"),
        Windows_h.C_POINTER.withName("SetSource"),
        Windows_h.C_POINTER.withName("SetDescription"),
        Windows_h.C_POINTER.withName("SetHelpFile"),
        Windows_h.C_POINTER.withName("SetHelpContext")
    ).withName("ICreateErrorInfoVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ICreateErrorInfo *, const IID *const, void **) __attribute__((stdcall))
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
     * HRESULT (*QueryInterface)(ICreateErrorInfo *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ICreateErrorInfo *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ICreateErrorInfo *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ICreateErrorInfo *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(ICreateErrorInfo *) __attribute__((stdcall))
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
     * ULONG (*AddRef)(ICreateErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ICreateErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ICreateErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ICreateErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(ICreateErrorInfo *) __attribute__((stdcall))
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
     * ULONG (*Release)(ICreateErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ICreateErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ICreateErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ICreateErrorInfo *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*SetGUID)(ICreateErrorInfo *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static class SetGUID {

        SetGUID() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(SetGUID.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(SetGUID.Function fi, Arena arena) {
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

    private static final AddressLayout SetGUID$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SetGUID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*SetGUID)(ICreateErrorInfo *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout SetGUID$layout() {
        return SetGUID$LAYOUT;
    }

    private static final long SetGUID$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*SetGUID)(ICreateErrorInfo *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static final long SetGUID$offset() {
        return SetGUID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*SetGUID)(ICreateErrorInfo *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static MemorySegment SetGUID(MemorySegment struct) {
        return struct.get(SetGUID$LAYOUT, SetGUID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*SetGUID)(ICreateErrorInfo *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static void SetGUID(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SetGUID$LAYOUT, SetGUID$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*SetSource)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static class SetSource {

        SetSource() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(SetSource.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(SetSource.Function fi, Arena arena) {
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

    private static final AddressLayout SetSource$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SetSource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*SetSource)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout SetSource$layout() {
        return SetSource$LAYOUT;
    }

    private static final long SetSource$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*SetSource)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static final long SetSource$offset() {
        return SetSource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*SetSource)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static MemorySegment SetSource(MemorySegment struct) {
        return struct.get(SetSource$LAYOUT, SetSource$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*SetSource)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static void SetSource(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SetSource$LAYOUT, SetSource$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*SetDescription)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static class SetDescription {

        SetDescription() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(SetDescription.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(SetDescription.Function fi, Arena arena) {
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

    private static final AddressLayout SetDescription$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SetDescription"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*SetDescription)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout SetDescription$layout() {
        return SetDescription$LAYOUT;
    }

    private static final long SetDescription$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*SetDescription)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static final long SetDescription$offset() {
        return SetDescription$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*SetDescription)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static MemorySegment SetDescription(MemorySegment struct) {
        return struct.get(SetDescription$LAYOUT, SetDescription$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*SetDescription)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static void SetDescription(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SetDescription$LAYOUT, SetDescription$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*SetHelpFile)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static class SetHelpFile {

        SetHelpFile() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(SetHelpFile.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(SetHelpFile.Function fi, Arena arena) {
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

    private static final AddressLayout SetHelpFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SetHelpFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*SetHelpFile)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout SetHelpFile$layout() {
        return SetHelpFile$LAYOUT;
    }

    private static final long SetHelpFile$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*SetHelpFile)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static final long SetHelpFile$offset() {
        return SetHelpFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*SetHelpFile)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static MemorySegment SetHelpFile(MemorySegment struct) {
        return struct.get(SetHelpFile$LAYOUT, SetHelpFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*SetHelpFile)(ICreateErrorInfo *, LPOLESTR) __attribute__((stdcall))
     * }
     */
    public static void SetHelpFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SetHelpFile$LAYOUT, SetHelpFile$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*SetHelpContext)(ICreateErrorInfo *, DWORD) __attribute__((stdcall))
     * }
     */
    public static class SetHelpContext {

        SetHelpContext() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(SetHelpContext.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(SetHelpContext.Function fi, Arena arena) {
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

    private static final AddressLayout SetHelpContext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SetHelpContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*SetHelpContext)(ICreateErrorInfo *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout SetHelpContext$layout() {
        return SetHelpContext$LAYOUT;
    }

    private static final long SetHelpContext$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*SetHelpContext)(ICreateErrorInfo *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final long SetHelpContext$offset() {
        return SetHelpContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*SetHelpContext)(ICreateErrorInfo *, DWORD) __attribute__((stdcall))
     * }
     */
    public static MemorySegment SetHelpContext(MemorySegment struct) {
        return struct.get(SetHelpContext$LAYOUT, SetHelpContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*SetHelpContext)(ICreateErrorInfo *, DWORD) __attribute__((stdcall))
     * }
     */
    public static void SetHelpContext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SetHelpContext$LAYOUT, SetHelpContext$OFFSET, fieldValue);
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
