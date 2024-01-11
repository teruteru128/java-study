// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IZoneIdentifier2Vtbl {
 *     HRESULT (*QueryInterface)(IZoneIdentifier2*,const IID*,void**);
 *     ULONG (*AddRef)(IZoneIdentifier2*);
 *     ULONG (*Release)(IZoneIdentifier2*);
 *     HRESULT (*GetId)(IZoneIdentifier2*,DWORD*);
 *     HRESULT (*SetId)(IZoneIdentifier2*,DWORD);
 *     HRESULT (*Remove)(IZoneIdentifier2*);
 *     HRESULT (*GetLastWriterPackageFamilyName)(IZoneIdentifier2*,LPWSTR*);
 *     HRESULT (*SetLastWriterPackageFamilyName)(IZoneIdentifier2*,LPCWSTR);
 *     HRESULT (*RemoveLastWriterPackageFamilyName)(IZoneIdentifier2*);
 *     HRESULT (*GetAppZoneId)(IZoneIdentifier2*,DWORD*);
 *     HRESULT (*SetAppZoneId)(IZoneIdentifier2*,DWORD);
 *     HRESULT (*RemoveAppZoneId)(IZoneIdentifier2*);
 * };
 * }
 */
public class IZoneIdentifier2Vtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$4266.const$4;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IZoneIdentifier2*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4266.const$5, fi, constants$37.const$3, scope);
        }
        static QueryInterface ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$620.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle QueryInterface$VH() {
        return constants$4267.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IZoneIdentifier2*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4267.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IZoneIdentifier2*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$4267.const$0.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4267.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4267.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IZoneIdentifier2*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4267.const$1, fi, constants$18.const$5, scope);
        }
        static AddRef ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle AddRef$VH() {
        return constants$4267.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IZoneIdentifier2*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4267.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IZoneIdentifier2*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$4267.const$2.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4267.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4267.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IZoneIdentifier2*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4267.const$3, fi, constants$18.const$5, scope);
        }
        static Release ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Release$VH() {
        return constants$4267.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IZoneIdentifier2*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4267.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IZoneIdentifier2*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$4267.const$4.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4267.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4267.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetId)(IZoneIdentifier2*,DWORD*);
     * }
     */
    public interface GetId {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetId fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4267.const$5, fi, constants$34.const$0, scope);
        }
        static GetId ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$92.const$2.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetId$VH() {
        return constants$4268.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetId)(IZoneIdentifier2*,DWORD*);
     * }
     */
    public static MemorySegment GetId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4268.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetId)(IZoneIdentifier2*,DWORD*);
     * }
     */
    public static void GetId$set(MemorySegment seg, MemorySegment x) {
        constants$4268.const$0.set(seg, x);
    }
    public static MemorySegment GetId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4268.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void GetId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4268.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetId GetId(MemorySegment segment, Arena scope) {
        return GetId.ofAddress(GetId$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetId)(IZoneIdentifier2*,DWORD);
     * }
     */
    public interface SetId {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(SetId fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4268.const$1, fi, constants$65.const$2, scope);
        }
        static SetId ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)constants$800.const$4.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SetId$VH() {
        return constants$4268.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetId)(IZoneIdentifier2*,DWORD);
     * }
     */
    public static MemorySegment SetId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4268.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetId)(IZoneIdentifier2*,DWORD);
     * }
     */
    public static void SetId$set(MemorySegment seg, MemorySegment x) {
        constants$4268.const$2.set(seg, x);
    }
    public static MemorySegment SetId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4268.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SetId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4268.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetId SetId(MemorySegment segment, Arena scope) {
        return SetId.ofAddress(SetId$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*Remove)(IZoneIdentifier2*);
     * }
     */
    public interface Remove {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Remove fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4268.const$3, fi, constants$18.const$5, scope);
        }
        static Remove ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Remove$VH() {
        return constants$4268.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*Remove)(IZoneIdentifier2*);
     * }
     */
    public static MemorySegment Remove$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4268.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*Remove)(IZoneIdentifier2*);
     * }
     */
    public static void Remove$set(MemorySegment seg, MemorySegment x) {
        constants$4268.const$4.set(seg, x);
    }
    public static MemorySegment Remove$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4268.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Remove$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4268.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Remove Remove(MemorySegment segment, Arena scope) {
        return Remove.ofAddress(Remove$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetLastWriterPackageFamilyName)(IZoneIdentifier2*,LPWSTR*);
     * }
     */
    public interface GetLastWriterPackageFamilyName {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetLastWriterPackageFamilyName fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4268.const$5, fi, constants$34.const$0, scope);
        }
        static GetLastWriterPackageFamilyName ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$92.const$2.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetLastWriterPackageFamilyName$VH() {
        return constants$4269.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetLastWriterPackageFamilyName)(IZoneIdentifier2*,LPWSTR*);
     * }
     */
    public static MemorySegment GetLastWriterPackageFamilyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4269.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetLastWriterPackageFamilyName)(IZoneIdentifier2*,LPWSTR*);
     * }
     */
    public static void GetLastWriterPackageFamilyName$set(MemorySegment seg, MemorySegment x) {
        constants$4269.const$0.set(seg, x);
    }
    public static MemorySegment GetLastWriterPackageFamilyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4269.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void GetLastWriterPackageFamilyName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4269.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetLastWriterPackageFamilyName GetLastWriterPackageFamilyName(MemorySegment segment, Arena scope) {
        return GetLastWriterPackageFamilyName.ofAddress(GetLastWriterPackageFamilyName$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetLastWriterPackageFamilyName)(IZoneIdentifier2*,LPCWSTR);
     * }
     */
    public interface SetLastWriterPackageFamilyName {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(SetLastWriterPackageFamilyName fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4269.const$1, fi, constants$34.const$0, scope);
        }
        static SetLastWriterPackageFamilyName ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$92.const$2.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SetLastWriterPackageFamilyName$VH() {
        return constants$4269.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetLastWriterPackageFamilyName)(IZoneIdentifier2*,LPCWSTR);
     * }
     */
    public static MemorySegment SetLastWriterPackageFamilyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4269.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetLastWriterPackageFamilyName)(IZoneIdentifier2*,LPCWSTR);
     * }
     */
    public static void SetLastWriterPackageFamilyName$set(MemorySegment seg, MemorySegment x) {
        constants$4269.const$2.set(seg, x);
    }
    public static MemorySegment SetLastWriterPackageFamilyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4269.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SetLastWriterPackageFamilyName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4269.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetLastWriterPackageFamilyName SetLastWriterPackageFamilyName(MemorySegment segment, Arena scope) {
        return SetLastWriterPackageFamilyName.ofAddress(SetLastWriterPackageFamilyName$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*RemoveLastWriterPackageFamilyName)(IZoneIdentifier2*);
     * }
     */
    public interface RemoveLastWriterPackageFamilyName {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(RemoveLastWriterPackageFamilyName fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4269.const$3, fi, constants$18.const$5, scope);
        }
        static RemoveLastWriterPackageFamilyName ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle RemoveLastWriterPackageFamilyName$VH() {
        return constants$4269.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*RemoveLastWriterPackageFamilyName)(IZoneIdentifier2*);
     * }
     */
    public static MemorySegment RemoveLastWriterPackageFamilyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4269.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*RemoveLastWriterPackageFamilyName)(IZoneIdentifier2*);
     * }
     */
    public static void RemoveLastWriterPackageFamilyName$set(MemorySegment seg, MemorySegment x) {
        constants$4269.const$4.set(seg, x);
    }
    public static MemorySegment RemoveLastWriterPackageFamilyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4269.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void RemoveLastWriterPackageFamilyName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4269.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static RemoveLastWriterPackageFamilyName RemoveLastWriterPackageFamilyName(MemorySegment segment, Arena scope) {
        return RemoveLastWriterPackageFamilyName.ofAddress(RemoveLastWriterPackageFamilyName$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetAppZoneId)(IZoneIdentifier2*,DWORD*);
     * }
     */
    public interface GetAppZoneId {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetAppZoneId fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4269.const$5, fi, constants$34.const$0, scope);
        }
        static GetAppZoneId ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$92.const$2.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetAppZoneId$VH() {
        return constants$4270.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetAppZoneId)(IZoneIdentifier2*,DWORD*);
     * }
     */
    public static MemorySegment GetAppZoneId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4270.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetAppZoneId)(IZoneIdentifier2*,DWORD*);
     * }
     */
    public static void GetAppZoneId$set(MemorySegment seg, MemorySegment x) {
        constants$4270.const$0.set(seg, x);
    }
    public static MemorySegment GetAppZoneId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4270.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void GetAppZoneId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4270.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetAppZoneId GetAppZoneId(MemorySegment segment, Arena scope) {
        return GetAppZoneId.ofAddress(GetAppZoneId$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*SetAppZoneId)(IZoneIdentifier2*,DWORD);
     * }
     */
    public interface SetAppZoneId {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(SetAppZoneId fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4270.const$1, fi, constants$65.const$2, scope);
        }
        static SetAppZoneId ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)constants$800.const$4.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle SetAppZoneId$VH() {
        return constants$4270.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*SetAppZoneId)(IZoneIdentifier2*,DWORD);
     * }
     */
    public static MemorySegment SetAppZoneId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4270.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*SetAppZoneId)(IZoneIdentifier2*,DWORD);
     * }
     */
    public static void SetAppZoneId$set(MemorySegment seg, MemorySegment x) {
        constants$4270.const$2.set(seg, x);
    }
    public static MemorySegment SetAppZoneId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4270.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SetAppZoneId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4270.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetAppZoneId SetAppZoneId(MemorySegment segment, Arena scope) {
        return SetAppZoneId.ofAddress(SetAppZoneId$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*RemoveAppZoneId)(IZoneIdentifier2*);
     * }
     */
    public interface RemoveAppZoneId {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(RemoveAppZoneId fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4270.const$3, fi, constants$18.const$5, scope);
        }
        static RemoveAppZoneId ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$495.const$0.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle RemoveAppZoneId$VH() {
        return constants$4270.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*RemoveAppZoneId)(IZoneIdentifier2*);
     * }
     */
    public static MemorySegment RemoveAppZoneId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4270.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*RemoveAppZoneId)(IZoneIdentifier2*);
     * }
     */
    public static void RemoveAppZoneId$set(MemorySegment seg, MemorySegment x) {
        constants$4270.const$4.set(seg, x);
    }
    public static MemorySegment RemoveAppZoneId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4270.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void RemoveAppZoneId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4270.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static RemoveAppZoneId RemoveAppZoneId(MemorySegment segment, Arena scope) {
        return RemoveAppZoneId.ofAddress(RemoveAppZoneId$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


