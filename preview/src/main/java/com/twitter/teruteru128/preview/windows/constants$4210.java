// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4210 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4210() {}
    static final VarHandle const$0 = constants$4207.const$2.varHandle(MemoryLayout.PathElement.groupElement("Suspend"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IInternetProtocolVtbl.Resume.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$4207.const$2.varHandle(MemoryLayout.PathElement.groupElement("Resume"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IInternetProtocolVtbl.Read.class, "apply", constants$586.const$5);
    static final VarHandle const$4 = constants$4207.const$2.varHandle(MemoryLayout.PathElement.groupElement("Read"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IInternetProtocolVtbl.Seek.class, "apply", constants$3052.const$0);
}


