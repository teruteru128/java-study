// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2192 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2192() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwObjectType"),
        JAVA_INT.withName("dwError"),
        JAVA_INT.withName("dwReserved"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("ThisUpdateTime"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("NextUpdateTime"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("PublishTime")
    ).withName("_CRYPTNET_URL_CACHE_PRE_FETCH_INFO");
    static final VarHandle const$1 = constants$2192.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$2 = constants$2192.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwObjectType"));
    static final VarHandle const$3 = constants$2192.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwError"));
    static final VarHandle const$4 = constants$2192.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwExemptSeconds"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("ExpireTime")
    ).withName("_CRYPTNET_URL_CACHE_FLUSH_INFO");
}


