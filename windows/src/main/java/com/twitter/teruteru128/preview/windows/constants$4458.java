// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4458 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4458() {}
    static final VarHandle const$0 = constants$4455.const$4.varHandle(MemoryLayout.PathElement.groupElement("HandleMessage"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IPrintDialogServices");
    static final VarHandle const$2 = constants$4458.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetCurrentDevMode"),
        RuntimeHelper.POINTER.withName("GetCurrentPrinterName"),
        RuntimeHelper.POINTER.withName("GetCurrentPortName")
    ).withName("IPrintDialogServicesVtbl");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IPrintDialogServicesVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$5 = constants$4458.const$3.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
}

