// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4037 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4037() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("CLSID_XMLHTTPRequest", constants$27.const$0);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("IID_IXMLDSOControl", constants$27.const$0);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetTypeInfoCount"),
        RuntimeHelper.POINTER.withName("GetTypeInfo"),
        RuntimeHelper.POINTER.withName("GetIDsOfNames"),
        RuntimeHelper.POINTER.withName("Invoke"),
        RuntimeHelper.POINTER.withName("get_XMLDocument"),
        RuntimeHelper.POINTER.withName("put_XMLDocument"),
        RuntimeHelper.POINTER.withName("get_JavaDSOCompatible"),
        RuntimeHelper.POINTER.withName("put_JavaDSOCompatible"),
        RuntimeHelper.POINTER.withName("get_readyState")
    ).withName("IXMLDSOControlVtbl");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IXMLDSOControlVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$4 = constants$4037.const$2.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IXMLDSOControlVtbl.AddRef.class, "apply", constants$18.const$5);
}


