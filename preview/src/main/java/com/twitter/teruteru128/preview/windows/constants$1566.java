// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1566 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1566() {}
    static final VarHandle const$0 = constants$1565.const$4.varHandle(MemoryLayout.PathElement.groupElement("nVirtKey"));
    static final VarHandle const$1 = constants$1565.const$4.varHandle(MemoryLayout.PathElement.groupElement("hwndBreak"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withByteAlignment(1).withName("dwCallback"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("lpfilename")
    ).withName("tagMCI_SAVE_PARMSA");
    static final VarHandle const$3 = constants$1566.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    static final VarHandle const$4 = constants$1566.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpfilename"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_LONG.withByteAlignment(1).withName("dwCallback"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("lpfilename")
    ).withName("tagMCI_SAVE_PARMSW");
}

