// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1289 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1289() {}
    static final VarHandle const$0 = constants$1288.const$3.varHandle(MemoryLayout.PathElement.groupElement("iCtrlId"));
    static final VarHandle const$1 = constants$1288.const$3.varHandle(MemoryLayout.PathElement.groupElement("hItemHandle"));
    static final VarHandle const$2 = constants$1288.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwContextId"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SetWindowContextHelpId",
        constants$65.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetWindowContextHelpId",
        constants$18.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SetMenuContextHelpId",
        constants$65.const$2
    );
}


