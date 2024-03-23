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
 * struct ITypeLibRegistrationVtbl {
 *     HRESULT (*QueryInterface)(ITypeLibRegistration *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(ITypeLibRegistration *) __attribute__((stdcall));
 *     ULONG (*Release)(ITypeLibRegistration *) __attribute__((stdcall));
 *     HRESULT (*GetGuid)(ITypeLibRegistration *, GUID *) __attribute__((stdcall));
 *     HRESULT (*GetVersion)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall));
 *     HRESULT (*GetLcid)(ITypeLibRegistration *, LCID *) __attribute__((stdcall));
 *     HRESULT (*GetWin32Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall));
 *     HRESULT (*GetWin64Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall));
 *     HRESULT (*GetDisplayName)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall));
 *     HRESULT (*GetFlags)(ITypeLibRegistration *, DWORD *) __attribute__((stdcall));
 *     HRESULT (*GetHelpDir)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall));
 * }
 * }
 */
public class ITypeLibRegistrationVtbl {

    ITypeLibRegistrationVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("QueryInterface"),
        Windows_h.C_POINTER.withName("AddRef"),
        Windows_h.C_POINTER.withName("Release"),
        Windows_h.C_POINTER.withName("GetGuid"),
        Windows_h.C_POINTER.withName("GetVersion"),
        Windows_h.C_POINTER.withName("GetLcid"),
        Windows_h.C_POINTER.withName("GetWin32Path"),
        Windows_h.C_POINTER.withName("GetWin64Path"),
        Windows_h.C_POINTER.withName("GetDisplayName"),
        Windows_h.C_POINTER.withName("GetFlags"),
        Windows_h.C_POINTER.withName("GetHelpDir")
    ).withName("ITypeLibRegistrationVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ITypeLibRegistration *, const IID *const, void **) __attribute__((stdcall))
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
     * HRESULT (*QueryInterface)(ITypeLibRegistration *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ITypeLibRegistration *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ITypeLibRegistration *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ITypeLibRegistration *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(ITypeLibRegistration *) __attribute__((stdcall))
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
     * ULONG (*AddRef)(ITypeLibRegistration *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ITypeLibRegistration *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ITypeLibRegistration *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ITypeLibRegistration *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(ITypeLibRegistration *) __attribute__((stdcall))
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
     * ULONG (*Release)(ITypeLibRegistration *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ITypeLibRegistration *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ITypeLibRegistration *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ITypeLibRegistration *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetGuid)(ITypeLibRegistration *, GUID *) __attribute__((stdcall))
     * }
     */
    public static class GetGuid {

        GetGuid() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetGuid.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetGuid.Function fi, Arena arena) {
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

    private static final AddressLayout GetGuid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetGuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetGuid)(ITypeLibRegistration *, GUID *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetGuid$layout() {
        return GetGuid$LAYOUT;
    }

    private static final long GetGuid$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetGuid)(ITypeLibRegistration *, GUID *) __attribute__((stdcall))
     * }
     */
    public static final long GetGuid$offset() {
        return GetGuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetGuid)(ITypeLibRegistration *, GUID *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetGuid(MemorySegment struct) {
        return struct.get(GetGuid$LAYOUT, GetGuid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetGuid)(ITypeLibRegistration *, GUID *) __attribute__((stdcall))
     * }
     */
    public static void GetGuid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetGuid$LAYOUT, GetGuid$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetVersion)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class GetVersion {

        GetVersion() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetVersion.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetVersion.Function fi, Arena arena) {
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

    private static final AddressLayout GetVersion$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetVersion)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetVersion$layout() {
        return GetVersion$LAYOUT;
    }

    private static final long GetVersion$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetVersion)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long GetVersion$offset() {
        return GetVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetVersion)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetVersion(MemorySegment struct) {
        return struct.get(GetVersion$LAYOUT, GetVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetVersion)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void GetVersion(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetVersion$LAYOUT, GetVersion$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetLcid)(ITypeLibRegistration *, LCID *) __attribute__((stdcall))
     * }
     */
    public static class GetLcid {

        GetLcid() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetLcid.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetLcid.Function fi, Arena arena) {
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

    private static final AddressLayout GetLcid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetLcid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetLcid)(ITypeLibRegistration *, LCID *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetLcid$layout() {
        return GetLcid$LAYOUT;
    }

    private static final long GetLcid$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetLcid)(ITypeLibRegistration *, LCID *) __attribute__((stdcall))
     * }
     */
    public static final long GetLcid$offset() {
        return GetLcid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetLcid)(ITypeLibRegistration *, LCID *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetLcid(MemorySegment struct) {
        return struct.get(GetLcid$LAYOUT, GetLcid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetLcid)(ITypeLibRegistration *, LCID *) __attribute__((stdcall))
     * }
     */
    public static void GetLcid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetLcid$LAYOUT, GetLcid$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetWin32Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class GetWin32Path {

        GetWin32Path() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetWin32Path.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetWin32Path.Function fi, Arena arena) {
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

    private static final AddressLayout GetWin32Path$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetWin32Path"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetWin32Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetWin32Path$layout() {
        return GetWin32Path$LAYOUT;
    }

    private static final long GetWin32Path$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetWin32Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long GetWin32Path$offset() {
        return GetWin32Path$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetWin32Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetWin32Path(MemorySegment struct) {
        return struct.get(GetWin32Path$LAYOUT, GetWin32Path$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetWin32Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void GetWin32Path(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetWin32Path$LAYOUT, GetWin32Path$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetWin64Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class GetWin64Path {

        GetWin64Path() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetWin64Path.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetWin64Path.Function fi, Arena arena) {
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

    private static final AddressLayout GetWin64Path$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetWin64Path"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetWin64Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetWin64Path$layout() {
        return GetWin64Path$LAYOUT;
    }

    private static final long GetWin64Path$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetWin64Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long GetWin64Path$offset() {
        return GetWin64Path$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetWin64Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetWin64Path(MemorySegment struct) {
        return struct.get(GetWin64Path$LAYOUT, GetWin64Path$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetWin64Path)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void GetWin64Path(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetWin64Path$LAYOUT, GetWin64Path$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetDisplayName)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class GetDisplayName {

        GetDisplayName() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetDisplayName.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetDisplayName.Function fi, Arena arena) {
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

    private static final AddressLayout GetDisplayName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetDisplayName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetDisplayName)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetDisplayName$layout() {
        return GetDisplayName$LAYOUT;
    }

    private static final long GetDisplayName$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetDisplayName)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long GetDisplayName$offset() {
        return GetDisplayName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetDisplayName)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetDisplayName(MemorySegment struct) {
        return struct.get(GetDisplayName$LAYOUT, GetDisplayName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetDisplayName)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void GetDisplayName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetDisplayName$LAYOUT, GetDisplayName$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetFlags)(ITypeLibRegistration *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static class GetFlags {

        GetFlags() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetFlags.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetFlags.Function fi, Arena arena) {
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

    private static final AddressLayout GetFlags$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetFlags)(ITypeLibRegistration *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetFlags$layout() {
        return GetFlags$LAYOUT;
    }

    private static final long GetFlags$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetFlags)(ITypeLibRegistration *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static final long GetFlags$offset() {
        return GetFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetFlags)(ITypeLibRegistration *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetFlags(MemorySegment struct) {
        return struct.get(GetFlags$LAYOUT, GetFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetFlags)(ITypeLibRegistration *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static void GetFlags(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetFlags$LAYOUT, GetFlags$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetHelpDir)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class GetHelpDir {

        GetHelpDir() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetHelpDir.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetHelpDir.Function fi, Arena arena) {
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

    private static final AddressLayout GetHelpDir$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetHelpDir"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpDir)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetHelpDir$layout() {
        return GetHelpDir$LAYOUT;
    }

    private static final long GetHelpDir$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpDir)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long GetHelpDir$offset() {
        return GetHelpDir$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpDir)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetHelpDir(MemorySegment struct) {
        return struct.get(GetHelpDir$LAYOUT, GetHelpDir$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetHelpDir)(ITypeLibRegistration *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void GetHelpDir(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetHelpDir$LAYOUT, GetHelpDir$OFFSET, fieldValue);
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

