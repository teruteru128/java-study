// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IBindStatusCallbackExVtbl {
 *     HRESULT (*QueryInterface)(IBindStatusCallbackEx*,const IID*,void**);
 *     ULONG (*AddRef)(IBindStatusCallbackEx*);
 *     ULONG (*Release)(IBindStatusCallbackEx*);
 *     HRESULT (*OnStartBinding)(IBindStatusCallbackEx*,DWORD,IBinding*);
 *     HRESULT (*GetPriority)(IBindStatusCallbackEx*,LONG*);
 *     HRESULT (*OnLowResource)(IBindStatusCallbackEx*,DWORD);
 *     HRESULT (*OnProgress)(IBindStatusCallbackEx*,ULONG,ULONG,ULONG,LPCWSTR);
 *     HRESULT (*OnStopBinding)(IBindStatusCallbackEx*,HRESULT,LPCWSTR);
 *     HRESULT (*GetBindInfo)(IBindStatusCallbackEx*,DWORD*,BINDINFO*);
 *     HRESULT (*OnDataAvailable)(IBindStatusCallbackEx*,DWORD,DWORD,FORMATETC*,STGMEDIUM*);
 *     HRESULT (*OnObjectAvailable)(IBindStatusCallbackEx*,const IID*,IUnknown*);
 *     HRESULT (*GetBindInfoEx)(IBindStatusCallbackEx*,DWORD*,BINDINFO*,DWORD*,DWORD*);
 * };
 * }
 */
public class IBindStatusCallbackExVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$4118.const$3;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(IBindStatusCallbackEx*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4118.const$4, fi, constants$37.const$3, scope);
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
        return constants$4118.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IBindStatusCallbackEx*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4118.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(IBindStatusCallbackEx*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$4118.const$5.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4118.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4118.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(IBindStatusCallbackEx*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4119.const$0, fi, constants$18.const$5, scope);
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
        return constants$4119.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(IBindStatusCallbackEx*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4119.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(IBindStatusCallbackEx*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$4119.const$1.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4119.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4119.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(IBindStatusCallbackEx*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4119.const$2, fi, constants$18.const$5, scope);
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
        return constants$4119.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(IBindStatusCallbackEx*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4119.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(IBindStatusCallbackEx*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$4119.const$3.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4119.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4119.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OnStartBinding)(IBindStatusCallbackEx*,DWORD,IBinding*);
     * }
     */
    public interface OnStartBinding {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(OnStartBinding fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4119.const$4, fi, constants$485.const$5, scope);
        }
        static OnStartBinding ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$1770.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle OnStartBinding$VH() {
        return constants$4119.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OnStartBinding)(IBindStatusCallbackEx*,DWORD,IBinding*);
     * }
     */
    public static MemorySegment OnStartBinding$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4119.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OnStartBinding)(IBindStatusCallbackEx*,DWORD,IBinding*);
     * }
     */
    public static void OnStartBinding$set(MemorySegment seg, MemorySegment x) {
        constants$4119.const$5.set(seg, x);
    }
    public static MemorySegment OnStartBinding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4119.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void OnStartBinding$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4119.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnStartBinding OnStartBinding(MemorySegment segment, Arena scope) {
        return OnStartBinding.ofAddress(OnStartBinding$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetPriority)(IBindStatusCallbackEx*,LONG*);
     * }
     */
    public interface GetPriority {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(GetPriority fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4120.const$0, fi, constants$34.const$0, scope);
        }
        static GetPriority ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetPriority$VH() {
        return constants$4120.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetPriority)(IBindStatusCallbackEx*,LONG*);
     * }
     */
    public static MemorySegment GetPriority$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4120.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetPriority)(IBindStatusCallbackEx*,LONG*);
     * }
     */
    public static void GetPriority$set(MemorySegment seg, MemorySegment x) {
        constants$4120.const$1.set(seg, x);
    }
    public static MemorySegment GetPriority$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4120.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void GetPriority$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4120.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetPriority GetPriority(MemorySegment segment, Arena scope) {
        return GetPriority.ofAddress(GetPriority$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OnLowResource)(IBindStatusCallbackEx*,DWORD);
     * }
     */
    public interface OnLowResource {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(OnLowResource fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4120.const$2, fi, constants$65.const$2, scope);
        }
        static OnLowResource ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle OnLowResource$VH() {
        return constants$4120.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OnLowResource)(IBindStatusCallbackEx*,DWORD);
     * }
     */
    public static MemorySegment OnLowResource$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4120.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OnLowResource)(IBindStatusCallbackEx*,DWORD);
     * }
     */
    public static void OnLowResource$set(MemorySegment seg, MemorySegment x) {
        constants$4120.const$3.set(seg, x);
    }
    public static MemorySegment OnLowResource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4120.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void OnLowResource$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4120.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnLowResource OnLowResource(MemorySegment segment, Arena scope) {
        return OnLowResource.ofAddress(OnLowResource$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OnProgress)(IBindStatusCallbackEx*,ULONG,ULONG,ULONG,LPCWSTR);
     * }
     */
    public interface OnProgress {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, int _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(OnProgress fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4120.const$4, fi, constants$591.const$2, scope);
        }
        static OnProgress ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, int __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$4115.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle OnProgress$VH() {
        return constants$4120.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OnProgress)(IBindStatusCallbackEx*,ULONG,ULONG,ULONG,LPCWSTR);
     * }
     */
    public static MemorySegment OnProgress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4120.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OnProgress)(IBindStatusCallbackEx*,ULONG,ULONG,ULONG,LPCWSTR);
     * }
     */
    public static void OnProgress$set(MemorySegment seg, MemorySegment x) {
        constants$4120.const$5.set(seg, x);
    }
    public static MemorySegment OnProgress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4120.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void OnProgress$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4120.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnProgress OnProgress(MemorySegment segment, Arena scope) {
        return OnProgress.ofAddress(OnProgress$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OnStopBinding)(IBindStatusCallbackEx*,HRESULT,LPCWSTR);
     * }
     */
    public interface OnStopBinding {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(OnStopBinding fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4121.const$0, fi, constants$485.const$5, scope);
        }
        static OnStopBinding ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$1770.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle OnStopBinding$VH() {
        return constants$4121.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OnStopBinding)(IBindStatusCallbackEx*,HRESULT,LPCWSTR);
     * }
     */
    public static MemorySegment OnStopBinding$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4121.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OnStopBinding)(IBindStatusCallbackEx*,HRESULT,LPCWSTR);
     * }
     */
    public static void OnStopBinding$set(MemorySegment seg, MemorySegment x) {
        constants$4121.const$1.set(seg, x);
    }
    public static MemorySegment OnStopBinding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4121.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void OnStopBinding$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4121.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnStopBinding OnStopBinding(MemorySegment segment, Arena scope) {
        return OnStopBinding.ofAddress(OnStopBinding$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetBindInfo)(IBindStatusCallbackEx*,DWORD*,BINDINFO*);
     * }
     */
    public interface GetBindInfo {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(GetBindInfo fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4121.const$2, fi, constants$37.const$3, scope);
        }
        static GetBindInfo ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle GetBindInfo$VH() {
        return constants$4121.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetBindInfo)(IBindStatusCallbackEx*,DWORD*,BINDINFO*);
     * }
     */
    public static MemorySegment GetBindInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4121.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetBindInfo)(IBindStatusCallbackEx*,DWORD*,BINDINFO*);
     * }
     */
    public static void GetBindInfo$set(MemorySegment seg, MemorySegment x) {
        constants$4121.const$3.set(seg, x);
    }
    public static MemorySegment GetBindInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4121.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4121.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindInfo GetBindInfo(MemorySegment segment, Arena scope) {
        return GetBindInfo.ofAddress(GetBindInfo$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OnDataAvailable)(IBindStatusCallbackEx*,DWORD,DWORD,FORMATETC*,STGMEDIUM*);
     * }
     */
    public interface OnDataAvailable {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(OnDataAvailable fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4121.const$4, fi, constants$1007.const$4, scope);
        }
        static OnDataAvailable ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$3467.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle OnDataAvailable$VH() {
        return constants$4121.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OnDataAvailable)(IBindStatusCallbackEx*,DWORD,DWORD,FORMATETC*,STGMEDIUM*);
     * }
     */
    public static MemorySegment OnDataAvailable$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4121.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OnDataAvailable)(IBindStatusCallbackEx*,DWORD,DWORD,FORMATETC*,STGMEDIUM*);
     * }
     */
    public static void OnDataAvailable$set(MemorySegment seg, MemorySegment x) {
        constants$4121.const$5.set(seg, x);
    }
    public static MemorySegment OnDataAvailable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4121.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void OnDataAvailable$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4121.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnDataAvailable OnDataAvailable(MemorySegment segment, Arena scope) {
        return OnDataAvailable.ofAddress(OnDataAvailable$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*OnObjectAvailable)(IBindStatusCallbackEx*,const IID*,IUnknown*);
     * }
     */
    public interface OnObjectAvailable {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(OnObjectAvailable fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4122.const$0, fi, constants$37.const$3, scope);
        }
        static OnObjectAvailable ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle OnObjectAvailable$VH() {
        return constants$4122.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*OnObjectAvailable)(IBindStatusCallbackEx*,const IID*,IUnknown*);
     * }
     */
    public static MemorySegment OnObjectAvailable$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4122.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*OnObjectAvailable)(IBindStatusCallbackEx*,const IID*,IUnknown*);
     * }
     */
    public static void OnObjectAvailable$set(MemorySegment seg, MemorySegment x) {
        constants$4122.const$1.set(seg, x);
    }
    public static MemorySegment OnObjectAvailable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4122.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void OnObjectAvailable$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4122.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnObjectAvailable OnObjectAvailable(MemorySegment segment, Arena scope) {
        return OnObjectAvailable.ofAddress(OnObjectAvailable$get(segment), scope);
    }
    /**
     * {@snippet :
 * HRESULT (*GetBindInfoEx)(IBindStatusCallbackEx*,DWORD*,BINDINFO*,DWORD*,DWORD*);
     * }
     */
    public interface GetBindInfoEx {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(GetBindInfoEx fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$4122.const$2, fi, constants$577.const$5, scope);
        }
        static GetBindInfoEx ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$1781.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle GetBindInfoEx$VH() {
        return constants$4122.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*GetBindInfoEx)(IBindStatusCallbackEx*,DWORD*,BINDINFO*,DWORD*,DWORD*);
     * }
     */
    public static MemorySegment GetBindInfoEx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4122.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*GetBindInfoEx)(IBindStatusCallbackEx*,DWORD*,BINDINFO*,DWORD*,DWORD*);
     * }
     */
    public static void GetBindInfoEx$set(MemorySegment seg, MemorySegment x) {
        constants$4122.const$3.set(seg, x);
    }
    public static MemorySegment GetBindInfoEx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4122.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindInfoEx$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4122.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindInfoEx GetBindInfoEx(MemorySegment segment, Arena scope) {
        return GetBindInfoEx.ofAddress(GetBindInfoEx$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


