// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1203 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1203() {}
    static final VarHandle const$0 = constants$1202.const$2.varHandle(MemoryLayout.PathElement.groupElement("uCount"));
    static final VarHandle const$1 = constants$1202.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwTimeout"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "FlashWindowEx",
        constants$18.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ShowOwnedPopups",
        constants$65.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "OpenIcon",
        constants$18.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CloseWindow",
        constants$18.const$5
    );
}


