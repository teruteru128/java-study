// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2245 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2245() {}
    static final VarHandle const$0 = constants$2244.const$5.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$1 = constants$2244.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwPromptFlags"));
    static final VarHandle const$2 = constants$2244.const$5.varHandle(MemoryLayout.PathElement.groupElement("hwndApp"));
    static final VarHandle const$3 = constants$2244.const$5.varHandle(MemoryLayout.PathElement.groupElement("szPrompt"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CryptProtectData",
        constants$807.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CryptUnprotectData",
        constants$807.const$5
    );
}


