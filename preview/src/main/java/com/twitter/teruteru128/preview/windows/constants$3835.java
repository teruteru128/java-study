// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3835 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3835() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IXMLDOMCharacterData");
    static final VarHandle const$1 = constants$3835.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("IID_IXMLDOMAttribute", constants$27.const$0);
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetTypeInfoCount"),
        RuntimeHelper.POINTER.withName("GetTypeInfo"),
        RuntimeHelper.POINTER.withName("GetIDsOfNames"),
        RuntimeHelper.POINTER.withName("Invoke"),
        RuntimeHelper.POINTER.withName("get_nodeName"),
        RuntimeHelper.POINTER.withName("get_nodeValue"),
        RuntimeHelper.POINTER.withName("put_nodeValue"),
        RuntimeHelper.POINTER.withName("get_nodeType"),
        RuntimeHelper.POINTER.withName("get_parentNode"),
        RuntimeHelper.POINTER.withName("get_childNodes"),
        RuntimeHelper.POINTER.withName("get_firstChild"),
        RuntimeHelper.POINTER.withName("get_lastChild"),
        RuntimeHelper.POINTER.withName("get_previousSibling"),
        RuntimeHelper.POINTER.withName("get_nextSibling"),
        RuntimeHelper.POINTER.withName("get_attributes"),
        RuntimeHelper.POINTER.withName("insertBefore"),
        RuntimeHelper.POINTER.withName("replaceChild"),
        RuntimeHelper.POINTER.withName("removeChild"),
        RuntimeHelper.POINTER.withName("appendChild"),
        RuntimeHelper.POINTER.withName("hasChildNodes"),
        RuntimeHelper.POINTER.withName("get_ownerDocument"),
        RuntimeHelper.POINTER.withName("cloneNode"),
        RuntimeHelper.POINTER.withName("get_nodeTypeString"),
        RuntimeHelper.POINTER.withName("get_text"),
        RuntimeHelper.POINTER.withName("put_text"),
        RuntimeHelper.POINTER.withName("get_specified"),
        RuntimeHelper.POINTER.withName("get_definition"),
        RuntimeHelper.POINTER.withName("get_nodeTypedValue"),
        RuntimeHelper.POINTER.withName("put_nodeTypedValue"),
        RuntimeHelper.POINTER.withName("get_dataType"),
        RuntimeHelper.POINTER.withName("put_dataType"),
        RuntimeHelper.POINTER.withName("get_xml"),
        RuntimeHelper.POINTER.withName("transformNode"),
        RuntimeHelper.POINTER.withName("selectNodes"),
        RuntimeHelper.POINTER.withName("selectSingleNode"),
        RuntimeHelper.POINTER.withName("get_parsed"),
        RuntimeHelper.POINTER.withName("get_namespaceURI"),
        RuntimeHelper.POINTER.withName("get_prefix"),
        RuntimeHelper.POINTER.withName("get_baseName"),
        RuntimeHelper.POINTER.withName("transformNodeToObject"),
        RuntimeHelper.POINTER.withName("get_name"),
        RuntimeHelper.POINTER.withName("get_value"),
        RuntimeHelper.POINTER.withName("put_value")
    ).withName("IXMLDOMAttributeVtbl");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IXMLDOMAttributeVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$5 = constants$3835.const$3.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
}


