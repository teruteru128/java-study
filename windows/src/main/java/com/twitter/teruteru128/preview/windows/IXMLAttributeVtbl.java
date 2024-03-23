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
 * struct IXMLAttributeVtbl {
 *     HRESULT (*QueryInterface)(IXMLAttribute *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(IXMLAttribute *) __attribute__((stdcall));
 *     ULONG (*Release)(IXMLAttribute *) __attribute__((stdcall));
 *     HRESULT (*GetTypeInfoCount)(IXMLAttribute *, UINT *) __attribute__((stdcall));
 *     HRESULT (*GetTypeInfo)(IXMLAttribute *, UINT, LCID, ITypeInfo **) __attribute__((stdcall));
 *     HRESULT (*GetIDsOfNames)(IXMLAttribute *, const IID *const, LPOLESTR *, UINT, LCID, DISPID *) __attribute__((stdcall));
 *     HRESULT (*Invoke)(IXMLAttribute *, DISPID, const IID *const, LCID, WORD, DISPPARAMS *, VARIANT *, EXCEPINFO *, UINT *) __attribute__((stdcall));
 *     HRESULT (*get_name)(IXMLAttribute *, BSTR *) __attribute__((stdcall));
 *     HRESULT (*get_value)(IXMLAttribute *, BSTR *) __attribute__((stdcall));
 * }
 * }
 */
public class IXMLAttributeVtbl {

    IXMLAttributeVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("QueryInterface"),
        Windows_h.C_POINTER.withName("AddRef"),
        Windows_h.C_POINTER.withName("Release"),
        Windows_h.C_POINTER.withName("GetTypeInfoCount"),
        Windows_h.C_POINTER.withName("GetTypeInfo"),
        Windows_h.C_POINTER.withName("GetIDsOfNames"),
        Windows_h.C_POINTER.withName("Invoke"),
        Windows_h.C_POINTER.withName("get_name"),
        Windows_h.C_POINTER.withName("get_value")
    ).withName("IXMLAttributeVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IXMLAttribute *, const IID *const, void **) __attribute__((stdcall))
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
     * HRESULT (*QueryInterface)(IXMLAttribute *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IXMLAttribute *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IXMLAttribute *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IXMLAttribute *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(IXMLAttribute *) __attribute__((stdcall))
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
     * ULONG (*AddRef)(IXMLAttribute *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IXMLAttribute *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IXMLAttribute *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IXMLAttribute *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(IXMLAttribute *) __attribute__((stdcall))
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
     * ULONG (*Release)(IXMLAttribute *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IXMLAttribute *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IXMLAttribute *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IXMLAttribute *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfoCount)(IXMLAttribute *, UINT *) __attribute__((stdcall))
     * }
     */
    public static class GetTypeInfoCount {

        GetTypeInfoCount() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetTypeInfoCount.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetTypeInfoCount.Function fi, Arena arena) {
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

    private static final AddressLayout GetTypeInfoCount$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetTypeInfoCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfoCount)(IXMLAttribute *, UINT *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetTypeInfoCount$layout() {
        return GetTypeInfoCount$LAYOUT;
    }

    private static final long GetTypeInfoCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfoCount)(IXMLAttribute *, UINT *) __attribute__((stdcall))
     * }
     */
    public static final long GetTypeInfoCount$offset() {
        return GetTypeInfoCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfoCount)(IXMLAttribute *, UINT *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetTypeInfoCount(MemorySegment struct) {
        return struct.get(GetTypeInfoCount$LAYOUT, GetTypeInfoCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfoCount)(IXMLAttribute *, UINT *) __attribute__((stdcall))
     * }
     */
    public static void GetTypeInfoCount(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetTypeInfoCount$LAYOUT, GetTypeInfoCount$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfo)(IXMLAttribute *, UINT, LCID, ITypeInfo **) __attribute__((stdcall))
     * }
     */
    public static class GetTypeInfo {

        GetTypeInfo() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1, int _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_INT,
            Windows_h.C_LONG,
            Windows_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetTypeInfo.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetTypeInfo.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2, MemorySegment _x3) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout GetTypeInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetTypeInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfo)(IXMLAttribute *, UINT, LCID, ITypeInfo **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetTypeInfo$layout() {
        return GetTypeInfo$LAYOUT;
    }

    private static final long GetTypeInfo$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfo)(IXMLAttribute *, UINT, LCID, ITypeInfo **) __attribute__((stdcall))
     * }
     */
    public static final long GetTypeInfo$offset() {
        return GetTypeInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfo)(IXMLAttribute *, UINT, LCID, ITypeInfo **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetTypeInfo(MemorySegment struct) {
        return struct.get(GetTypeInfo$LAYOUT, GetTypeInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetTypeInfo)(IXMLAttribute *, UINT, LCID, ITypeInfo **) __attribute__((stdcall))
     * }
     */
    public static void GetTypeInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetTypeInfo$LAYOUT, GetTypeInfo$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetIDsOfNames)(IXMLAttribute *, const IID *const, LPOLESTR *, UINT, LCID, DISPID *) __attribute__((stdcall))
     * }
     */
    public static class GetIDsOfNames {

        GetIDsOfNames() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3, int _x4, MemorySegment _x5);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER,
            Windows_h.C_POINTER,
            Windows_h.C_INT,
            Windows_h.C_LONG,
            Windows_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(GetIDsOfNames.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetIDsOfNames.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, int _x3, int _x4, MemorySegment _x5) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout GetIDsOfNames$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetIDsOfNames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetIDsOfNames)(IXMLAttribute *, const IID *const, LPOLESTR *, UINT, LCID, DISPID *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetIDsOfNames$layout() {
        return GetIDsOfNames$LAYOUT;
    }

    private static final long GetIDsOfNames$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetIDsOfNames)(IXMLAttribute *, const IID *const, LPOLESTR *, UINT, LCID, DISPID *) __attribute__((stdcall))
     * }
     */
    public static final long GetIDsOfNames$offset() {
        return GetIDsOfNames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetIDsOfNames)(IXMLAttribute *, const IID *const, LPOLESTR *, UINT, LCID, DISPID *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetIDsOfNames(MemorySegment struct) {
        return struct.get(GetIDsOfNames$LAYOUT, GetIDsOfNames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetIDsOfNames)(IXMLAttribute *, const IID *const, LPOLESTR *, UINT, LCID, DISPID *) __attribute__((stdcall))
     * }
     */
    public static void GetIDsOfNames(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetIDsOfNames$LAYOUT, GetIDsOfNames$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*Invoke)(IXMLAttribute *, DISPID, const IID *const, LCID, WORD, DISPPARAMS *, VARIANT *, EXCEPINFO *, UINT *) __attribute__((stdcall))
     * }
     */
    public static class Invoke {

        Invoke() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1, MemorySegment _x2, int _x3, short _x4, MemorySegment _x5, MemorySegment _x6, MemorySegment _x7, MemorySegment _x8);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_LONG,
            Windows_h.C_POINTER,
            Windows_h.C_LONG,
            Windows_h.C_SHORT,
            Windows_h.C_POINTER,
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(Invoke.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Invoke.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, int _x3, short _x4, MemorySegment _x5, MemorySegment _x6, MemorySegment _x7, MemorySegment _x8) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5, _x6, _x7, _x8);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Invoke$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Invoke"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*Invoke)(IXMLAttribute *, DISPID, const IID *const, LCID, WORD, DISPPARAMS *, VARIANT *, EXCEPINFO *, UINT *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Invoke$layout() {
        return Invoke$LAYOUT;
    }

    private static final long Invoke$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*Invoke)(IXMLAttribute *, DISPID, const IID *const, LCID, WORD, DISPPARAMS *, VARIANT *, EXCEPINFO *, UINT *) __attribute__((stdcall))
     * }
     */
    public static final long Invoke$offset() {
        return Invoke$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*Invoke)(IXMLAttribute *, DISPID, const IID *const, LCID, WORD, DISPPARAMS *, VARIANT *, EXCEPINFO *, UINT *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Invoke(MemorySegment struct) {
        return struct.get(Invoke$LAYOUT, Invoke$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*Invoke)(IXMLAttribute *, DISPID, const IID *const, LCID, WORD, DISPPARAMS *, VARIANT *, EXCEPINFO *, UINT *) __attribute__((stdcall))
     * }
     */
    public static void Invoke(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Invoke$LAYOUT, Invoke$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*get_name)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class get_name {

        get_name() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(get_name.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_name.Function fi, Arena arena) {
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

    private static final AddressLayout get_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*get_name)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout get_name$layout() {
        return get_name$LAYOUT;
    }

    private static final long get_name$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*get_name)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long get_name$offset() {
        return get_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*get_name)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment get_name(MemorySegment struct) {
        return struct.get(get_name$LAYOUT, get_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*get_name)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void get_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_name$LAYOUT, get_name$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*get_value)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static class get_value {

        get_value() {
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

        private static final MethodHandle UP$MH = Windows_h.upcallHandle(get_value.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_value.Function fi, Arena arena) {
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

    private static final AddressLayout get_value$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*get_value)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout get_value$layout() {
        return get_value$LAYOUT;
    }

    private static final long get_value$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*get_value)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static final long get_value$offset() {
        return get_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*get_value)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment get_value(MemorySegment struct) {
        return struct.get(get_value$LAYOUT, get_value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*get_value)(IXMLAttribute *, BSTR *) __attribute__((stdcall))
     * }
     */
    public static void get_value(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_value$LAYOUT, get_value$OFFSET, fieldValue);
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

