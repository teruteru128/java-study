// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4460 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4460() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IPrintDialogServicesVtbl.GetCurrentPrinterName.class, "apply", constants$37.const$3);
    static final VarHandle const$1 = constants$4458.const$3.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentPrinterName"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IPrintDialogServicesVtbl.GetCurrentPortName.class, "apply", constants$37.const$3);
    static final VarHandle const$3 = constants$4458.const$3.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentPortName"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("nFromPage"),
        JAVA_INT.withName("nToPage")
    ).withName("tagPRINTPAGERANGE");
    static final VarHandle const$5 = constants$4460.const$4.varHandle(MemoryLayout.PathElement.groupElement("nFromPage"));
}

