// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4253 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4253() {}
    static final VarHandle const$0 = constants$4251.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetSecuritySite"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IInternetSecurityManagerExVtbl.MapUrlToZone.class, "apply", constants$607.const$3);
    static final VarHandle const$2 = constants$4251.const$2.varHandle(MemoryLayout.PathElement.groupElement("MapUrlToZone"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IInternetSecurityManagerExVtbl.GetSecurityId.class, "apply", constants$791.const$4);
    static final VarHandle const$4 = constants$4251.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetSecurityId"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IInternetSecurityManagerExVtbl.ProcessUrlAction.class, "apply", constants$4248.const$4);
}

