// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4469 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4469() {}
    static final VarHandle const$0 = constants$4468.const$5.varHandle(MemoryLayout.PathElement.groupElement("wDriverOffset"));
    static final VarHandle const$1 = constants$4468.const$5.varHandle(MemoryLayout.PathElement.groupElement("wDeviceOffset"));
    static final VarHandle const$2 = constants$4468.const$5.varHandle(MemoryLayout.PathElement.groupElement("wOutputOffset"));
    static final VarHandle const$3 = constants$4468.const$5.varHandle(MemoryLayout.PathElement.groupElement("wDefault"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CommDlgExtendedError",
        constants$1.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(LPPAGEPAINTHOOK.class, "apply", constants$1131.const$4);
}

