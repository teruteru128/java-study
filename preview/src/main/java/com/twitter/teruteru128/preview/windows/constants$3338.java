// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3338 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3338() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IMessageFilterVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$1 = constants$3337.const$1.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IMessageFilterVtbl.HandleInComingCall.class, "apply", constants$703.const$2);
    static final VarHandle const$3 = constants$3337.const$1.varHandle(MemoryLayout.PathElement.groupElement("HandleInComingCall"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IMessageFilterVtbl.RetryRejectedCall.class, "apply", constants$584.const$5);
    static final VarHandle const$5 = constants$3337.const$1.varHandle(MemoryLayout.PathElement.groupElement("RetryRejectedCall"));
}


