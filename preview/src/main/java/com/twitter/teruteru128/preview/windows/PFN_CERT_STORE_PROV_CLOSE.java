// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_CERT_STORE_PROV_CLOSE)(void* hStoreProv,unsigned long dwFlags);
 * }
 */
public interface PFN_CERT_STORE_PROV_CLOSE {

    void apply(java.lang.foreign.MemorySegment hStoreProv, int dwFlags);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_CLOSE fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2129.const$2, fi, constants$72.const$3, scope);
    }
    static PFN_CERT_STORE_PROV_CLOSE ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _hStoreProv, int _dwFlags) -> {
            try {
                constants$1805.const$4.invokeExact(symbol, _hStoreProv, _dwFlags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

