// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1381 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1381() {}
    static final VarHandle const$0 = constants$1380.const$4.varHandle(MemoryLayout.PathElement.groupElement("stateButton"));
    static final VarHandle const$1 = constants$1380.const$4.varHandle(MemoryLayout.PathElement.groupElement("hwndCombo"));
    static final VarHandle const$2 = constants$1380.const$4.varHandle(MemoryLayout.PathElement.groupElement("hwndItem"));
    static final VarHandle const$3 = constants$1380.const$4.varHandle(MemoryLayout.PathElement.groupElement("hwndList"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetComboBoxInfo",
        constants$34.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "GetAncestor",
        constants$30.const$0
    );
}

