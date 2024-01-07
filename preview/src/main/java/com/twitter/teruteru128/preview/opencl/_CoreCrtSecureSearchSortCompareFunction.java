// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*_CoreCrtSecureSearchSortCompareFunction)(void*,void*,void*);
 * }
 */
public interface _CoreCrtSecureSearchSortCompareFunction {

    int apply(java.lang.foreign.MemorySegment memobj, java.lang.foreign.MemorySegment pfn_notify, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(_CoreCrtSecureSearchSortCompareFunction fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$9.const$1, fi, constants$9.const$0, scope);
    }
    static _CoreCrtSecureSearchSortCompareFunction ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _memobj, java.lang.foreign.MemorySegment _pfn_notify, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$9.const$2.invokeExact(symbol, _memobj, _pfn_notify, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


