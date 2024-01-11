// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AsyncIAdviseSinkVtbl {
 *     HRESULT (*QueryInterface)(AsyncIAdviseSink*,const IID*,void**);
 *     ULONG (*AddRef)(AsyncIAdviseSink*);
 *     ULONG (*Release)(AsyncIAdviseSink*);
 *     void (*Begin_OnDataChange)(AsyncIAdviseSink*,FORMATETC*,STGMEDIUM*);
 *     void (*Finish_OnDataChange)(AsyncIAdviseSink*);
 *     void (*Begin_OnViewChange)(AsyncIAdviseSink*,DWORD,LONG);
 *     void (*Finish_OnViewChange)(AsyncIAdviseSink*);
 *     void (*Begin_OnRename)(AsyncIAdviseSink*,IMoniker*);
 *     void (*Finish_OnRename)(AsyncIAdviseSink*);
 *     void (*Begin_OnSave)(AsyncIAdviseSink*);
 *     void (*Finish_OnSave)(AsyncIAdviseSink*);
 *     void (*Begin_OnClose)(AsyncIAdviseSink*);
 *     void (*Finish_OnClose)(AsyncIAdviseSink*);
 * };
 * }
 */
public class AsyncIAdviseSinkVtbl {

    public static MemoryLayout $LAYOUT() {
        return constants$3308.const$2;
    }
    /**
     * {@snippet :
 * HRESULT (*QueryInterface)(AsyncIAdviseSink*,const IID*,void**);
     * }
     */
    public interface QueryInterface {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(QueryInterface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3308.const$3, fi, constants$37.const$3, scope);
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
        return constants$3308.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(AsyncIAdviseSink*,const IID*,void**);
     * }
     */
    public static MemorySegment QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3308.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HRESULT (*QueryInterface)(AsyncIAdviseSink*,const IID*,void**);
     * }
     */
    public static void QueryInterface$set(MemorySegment seg, MemorySegment x) {
        constants$3308.const$4.set(seg, x);
    }
    public static MemorySegment QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3308.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3308.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface(MemorySegment segment, Arena scope) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*AddRef)(AsyncIAdviseSink*);
     * }
     */
    public interface AddRef {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(AddRef fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3308.const$5, fi, constants$18.const$5, scope);
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
        return constants$3309.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*AddRef)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3309.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*AddRef)(AsyncIAdviseSink*);
     * }
     */
    public static void AddRef$set(MemorySegment seg, MemorySegment x) {
        constants$3309.const$0.set(seg, x);
    }
    public static MemorySegment AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3309.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3309.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef(MemorySegment segment, Arena scope) {
        return AddRef.ofAddress(AddRef$get(segment), scope);
    }
    /**
     * {@snippet :
 * ULONG (*Release)(AsyncIAdviseSink*);
     * }
     */
    public interface Release {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(Release fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3309.const$1, fi, constants$18.const$5, scope);
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
        return constants$3309.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG (*Release)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3309.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG (*Release)(AsyncIAdviseSink*);
     * }
     */
    public static void Release$set(MemorySegment seg, MemorySegment x) {
        constants$3309.const$2.set(seg, x);
    }
    public static MemorySegment Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3309.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3309.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release(MemorySegment segment, Arena scope) {
        return Release.ofAddress(Release$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Begin_OnDataChange)(AsyncIAdviseSink*,FORMATETC*,STGMEDIUM*);
     * }
     */
    public interface Begin_OnDataChange {

        void apply(java.lang.foreign.MemorySegment pszObjectOid, java.lang.foreign.MemorySegment pObject, java.lang.foreign.MemorySegment pvFreeContext);
        static MemorySegment allocate(Begin_OnDataChange fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3309.const$3, fi, constants$508.const$5, scope);
        }
        static Begin_OnDataChange ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pszObjectOid, java.lang.foreign.MemorySegment _pObject, java.lang.foreign.MemorySegment _pvFreeContext) -> {
                try {
                    constants$534.const$5.invokeExact(symbol, _pszObjectOid, _pObject, _pvFreeContext);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Begin_OnDataChange$VH() {
        return constants$3309.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Begin_OnDataChange)(AsyncIAdviseSink*,FORMATETC*,STGMEDIUM*);
     * }
     */
    public static MemorySegment Begin_OnDataChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3309.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Begin_OnDataChange)(AsyncIAdviseSink*,FORMATETC*,STGMEDIUM*);
     * }
     */
    public static void Begin_OnDataChange$set(MemorySegment seg, MemorySegment x) {
        constants$3309.const$4.set(seg, x);
    }
    public static MemorySegment Begin_OnDataChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3309.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_OnDataChange$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3309.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_OnDataChange Begin_OnDataChange(MemorySegment segment, Arena scope) {
        return Begin_OnDataChange.ofAddress(Begin_OnDataChange$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Finish_OnDataChange)(AsyncIAdviseSink*);
     * }
     */
    public interface Finish_OnDataChange {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(Finish_OnDataChange fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3309.const$5, fi, constants$0.const$0, scope);
        }
        static Finish_OnDataChange ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    constants$496.const$2.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Finish_OnDataChange$VH() {
        return constants$3310.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Finish_OnDataChange)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment Finish_OnDataChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3310.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Finish_OnDataChange)(AsyncIAdviseSink*);
     * }
     */
    public static void Finish_OnDataChange$set(MemorySegment seg, MemorySegment x) {
        constants$3310.const$0.set(seg, x);
    }
    public static MemorySegment Finish_OnDataChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3310.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_OnDataChange$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3310.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_OnDataChange Finish_OnDataChange(MemorySegment segment, Arena scope) {
        return Finish_OnDataChange.ofAddress(Finish_OnDataChange$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Begin_OnViewChange)(AsyncIAdviseSink*,DWORD,LONG);
     * }
     */
    public interface Begin_OnViewChange {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(Begin_OnViewChange fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3310.const$1, fi, constants$71.const$0, scope);
        }
        static Begin_OnViewChange ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    constants$625.const$5.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Begin_OnViewChange$VH() {
        return constants$3310.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Begin_OnViewChange)(AsyncIAdviseSink*,DWORD,LONG);
     * }
     */
    public static MemorySegment Begin_OnViewChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3310.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Begin_OnViewChange)(AsyncIAdviseSink*,DWORD,LONG);
     * }
     */
    public static void Begin_OnViewChange$set(MemorySegment seg, MemorySegment x) {
        constants$3310.const$2.set(seg, x);
    }
    public static MemorySegment Begin_OnViewChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3310.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_OnViewChange$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3310.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_OnViewChange Begin_OnViewChange(MemorySegment segment, Arena scope) {
        return Begin_OnViewChange.ofAddress(Begin_OnViewChange$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Finish_OnViewChange)(AsyncIAdviseSink*);
     * }
     */
    public interface Finish_OnViewChange {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(Finish_OnViewChange fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3310.const$3, fi, constants$0.const$0, scope);
        }
        static Finish_OnViewChange ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    constants$496.const$2.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Finish_OnViewChange$VH() {
        return constants$3310.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Finish_OnViewChange)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment Finish_OnViewChange$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3310.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Finish_OnViewChange)(AsyncIAdviseSink*);
     * }
     */
    public static void Finish_OnViewChange$set(MemorySegment seg, MemorySegment x) {
        constants$3310.const$4.set(seg, x);
    }
    public static MemorySegment Finish_OnViewChange$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3310.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_OnViewChange$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3310.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_OnViewChange Finish_OnViewChange(MemorySegment segment, Arena scope) {
        return Finish_OnViewChange.ofAddress(Finish_OnViewChange$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Begin_OnRename)(AsyncIAdviseSink*,IMoniker*);
     * }
     */
    public interface Begin_OnRename {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(Begin_OnRename fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3310.const$5, fi, constants$469.const$2, scope);
        }
        static Begin_OnRename ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    constants$531.const$5.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Begin_OnRename$VH() {
        return constants$3311.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Begin_OnRename)(AsyncIAdviseSink*,IMoniker*);
     * }
     */
    public static MemorySegment Begin_OnRename$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3311.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Begin_OnRename)(AsyncIAdviseSink*,IMoniker*);
     * }
     */
    public static void Begin_OnRename$set(MemorySegment seg, MemorySegment x) {
        constants$3311.const$0.set(seg, x);
    }
    public static MemorySegment Begin_OnRename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3311.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_OnRename$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3311.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_OnRename Begin_OnRename(MemorySegment segment, Arena scope) {
        return Begin_OnRename.ofAddress(Begin_OnRename$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Finish_OnRename)(AsyncIAdviseSink*);
     * }
     */
    public interface Finish_OnRename {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(Finish_OnRename fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3311.const$1, fi, constants$0.const$0, scope);
        }
        static Finish_OnRename ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    constants$496.const$2.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Finish_OnRename$VH() {
        return constants$3311.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Finish_OnRename)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment Finish_OnRename$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3311.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Finish_OnRename)(AsyncIAdviseSink*);
     * }
     */
    public static void Finish_OnRename$set(MemorySegment seg, MemorySegment x) {
        constants$3311.const$2.set(seg, x);
    }
    public static MemorySegment Finish_OnRename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3311.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_OnRename$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3311.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_OnRename Finish_OnRename(MemorySegment segment, Arena scope) {
        return Finish_OnRename.ofAddress(Finish_OnRename$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Begin_OnSave)(AsyncIAdviseSink*);
     * }
     */
    public interface Begin_OnSave {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(Begin_OnSave fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3311.const$3, fi, constants$0.const$0, scope);
        }
        static Begin_OnSave ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    constants$496.const$2.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Begin_OnSave$VH() {
        return constants$3311.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Begin_OnSave)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment Begin_OnSave$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3311.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Begin_OnSave)(AsyncIAdviseSink*);
     * }
     */
    public static void Begin_OnSave$set(MemorySegment seg, MemorySegment x) {
        constants$3311.const$4.set(seg, x);
    }
    public static MemorySegment Begin_OnSave$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3311.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_OnSave$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3311.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_OnSave Begin_OnSave(MemorySegment segment, Arena scope) {
        return Begin_OnSave.ofAddress(Begin_OnSave$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Finish_OnSave)(AsyncIAdviseSink*);
     * }
     */
    public interface Finish_OnSave {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(Finish_OnSave fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3311.const$5, fi, constants$0.const$0, scope);
        }
        static Finish_OnSave ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    constants$496.const$2.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Finish_OnSave$VH() {
        return constants$3312.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Finish_OnSave)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment Finish_OnSave$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3312.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Finish_OnSave)(AsyncIAdviseSink*);
     * }
     */
    public static void Finish_OnSave$set(MemorySegment seg, MemorySegment x) {
        constants$3312.const$0.set(seg, x);
    }
    public static MemorySegment Finish_OnSave$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3312.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_OnSave$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3312.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_OnSave Finish_OnSave(MemorySegment segment, Arena scope) {
        return Finish_OnSave.ofAddress(Finish_OnSave$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Begin_OnClose)(AsyncIAdviseSink*);
     * }
     */
    public interface Begin_OnClose {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(Begin_OnClose fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3312.const$1, fi, constants$0.const$0, scope);
        }
        static Begin_OnClose ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    constants$496.const$2.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Begin_OnClose$VH() {
        return constants$3312.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Begin_OnClose)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment Begin_OnClose$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3312.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Begin_OnClose)(AsyncIAdviseSink*);
     * }
     */
    public static void Begin_OnClose$set(MemorySegment seg, MemorySegment x) {
        constants$3312.const$2.set(seg, x);
    }
    public static MemorySegment Begin_OnClose$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3312.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Begin_OnClose$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3312.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static Begin_OnClose Begin_OnClose(MemorySegment segment, Arena scope) {
        return Begin_OnClose.ofAddress(Begin_OnClose$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*Finish_OnClose)(AsyncIAdviseSink*);
     * }
     */
    public interface Finish_OnClose {

        void apply(java.lang.foreign.MemorySegment pParameter);
        static MemorySegment allocate(Finish_OnClose fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3312.const$3, fi, constants$0.const$0, scope);
        }
        static Finish_OnClose ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pParameter) -> {
                try {
                    constants$496.const$2.invokeExact(symbol, _pParameter);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle Finish_OnClose$VH() {
        return constants$3312.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*Finish_OnClose)(AsyncIAdviseSink*);
     * }
     */
    public static MemorySegment Finish_OnClose$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3312.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*Finish_OnClose)(AsyncIAdviseSink*);
     * }
     */
    public static void Finish_OnClose$set(MemorySegment seg, MemorySegment x) {
        constants$3312.const$4.set(seg, x);
    }
    public static MemorySegment Finish_OnClose$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3312.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Finish_OnClose$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3312.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static Finish_OnClose Finish_OnClose(MemorySegment segment, Arena scope) {
        return Finish_OnClose.ofAddress(Finish_OnClose$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


