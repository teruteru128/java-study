// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1898 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1898() {}
    static final VarHandle const$0 = constants$1897.const$4.varHandle(MemoryLayout.PathElement.groupElement("tv_usec"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("h_name"),
        RuntimeHelper.POINTER.withName("h_aliases"),
        JAVA_SHORT.withName("h_addrtype"),
        JAVA_SHORT.withName("h_length"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("h_addr_list")
    ).withName("hostent");
    static final VarHandle const$2 = constants$1898.const$1.varHandle(MemoryLayout.PathElement.groupElement("h_name"));
    static final VarHandle const$3 = constants$1898.const$1.varHandle(MemoryLayout.PathElement.groupElement("h_aliases"));
    static final VarHandle const$4 = constants$1898.const$1.varHandle(MemoryLayout.PathElement.groupElement("h_addrtype"));
    static final VarHandle const$5 = constants$1898.const$1.varHandle(MemoryLayout.PathElement.groupElement("h_length"));
}


