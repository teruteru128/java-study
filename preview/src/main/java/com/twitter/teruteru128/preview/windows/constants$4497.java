// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4497 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4497() {}
    static final VarHandle const$0 = constants$4495.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpDependencies"));
    static final VarHandle const$1 = constants$4495.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpServiceStartName"));
    static final VarHandle const$2 = constants$4495.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpDisplayName"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(SERVICE_MAIN_FUNCTIONW.class, "apply", constants$605.const$4);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(SERVICE_MAIN_FUNCTIONA.class, "apply", constants$605.const$4);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(LPSERVICE_MAIN_FUNCTIONW.class, "apply", constants$605.const$4);
}


