// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4042 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4042() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("IID_IXMLElementCollection", constants$27.const$0);
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetTypeInfoCount"),
        RuntimeHelper.POINTER.withName("GetTypeInfo"),
        RuntimeHelper.POINTER.withName("GetIDsOfNames"),
        RuntimeHelper.POINTER.withName("Invoke"),
        RuntimeHelper.POINTER.withName("put_length"),
        RuntimeHelper.POINTER.withName("get_length"),
        RuntimeHelper.POINTER.withName("get__newEnum"),
        RuntimeHelper.POINTER.withName("item")
    ).withName("IXMLElementCollectionVtbl");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IXMLElementCollectionVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$3 = constants$4042.const$1.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IXMLElementCollectionVtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$5 = constants$4042.const$1.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
}


