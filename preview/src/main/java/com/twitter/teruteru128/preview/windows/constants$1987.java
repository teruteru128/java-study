// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1987 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1987() {}
    static final VarHandle const$0 = constants$1986.const$4.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$1 = constants$1986.const$4.varHandle(MemoryLayout.PathElement.groupElement("pcrAlg"));
    static final VarHandle const$2 = constants$1986.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbSignature"));
    static final VarHandle const$3 = constants$1986.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbQuote"));
    static final VarHandle const$4 = constants$1986.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbPcrs"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "NCryptOpenStorageProvider",
        constants$570.const$5
    );
}

