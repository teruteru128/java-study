// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4306 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4306() {}
    static final VarHandle const$0 = constants$4305.const$2.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(ICatalogFileInfoVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$4305.const$2.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(ICatalogFileInfoVtbl.GetCatalogFile.class, "apply", constants$34.const$0);
    static final VarHandle const$4 = constants$4305.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetCatalogFile"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(ICatalogFileInfoVtbl.GetJavaTrust.class, "apply", constants$34.const$0);
}


