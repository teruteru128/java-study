// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1184 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1184() {}
    static final VarHandle const$0 = constants$1183.const$0.varHandle(MemoryLayout.PathElement.groupElement("itemID2"));
    static final VarHandle const$1 = constants$1183.const$0.varHandle(MemoryLayout.PathElement.groupElement("itemData2"));
    static final VarHandle const$2 = constants$1183.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwLocaleId"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetMessageA",
        constants$584.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetMessageW",
        constants$584.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "TranslateMessage",
        constants$18.const$5
    );
}

