// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4276 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4276() {}
    static final VarHandle const$0 = constants$4275.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("IID_IInternetZoneManager", constants$27.const$0);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetZoneAttributes"),
        RuntimeHelper.POINTER.withName("SetZoneAttributes"),
        RuntimeHelper.POINTER.withName("GetZoneCustomPolicy"),
        RuntimeHelper.POINTER.withName("SetZoneCustomPolicy"),
        RuntimeHelper.POINTER.withName("GetZoneActionPolicy"),
        RuntimeHelper.POINTER.withName("SetZoneActionPolicy"),
        RuntimeHelper.POINTER.withName("PromptAction"),
        RuntimeHelper.POINTER.withName("LogAction"),
        RuntimeHelper.POINTER.withName("CreateZoneEnumerator"),
        RuntimeHelper.POINTER.withName("GetZoneAt"),
        RuntimeHelper.POINTER.withName("DestroyZoneEnumerator"),
        RuntimeHelper.POINTER.withName("CopyTemplatePoliciesToZone")
    ).withName("IInternetZoneManagerVtbl");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IInternetZoneManagerVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$4 = constants$4276.const$2.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IInternetZoneManagerVtbl.AddRef.class, "apply", constants$18.const$5);
}

