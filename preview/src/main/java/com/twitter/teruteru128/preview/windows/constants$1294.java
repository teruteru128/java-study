// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1294 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1294() {}
    static final VarHandle const$0 = constants$1293.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwStyle"));
    static final VarHandle const$1 = constants$1293.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpszIcon"));
    static final VarHandle const$2 = constants$1293.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwContextHelpId"));
    static final VarHandle const$3 = constants$1293.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpfnMsgBoxCallback"));
    static final VarHandle const$4 = constants$1293.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwLanguageId"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "MessageBoxIndirectA",
        constants$18.const$5
    );
}

