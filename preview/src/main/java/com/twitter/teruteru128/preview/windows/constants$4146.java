// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4146 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4146() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("IID_IUri", constants$27.const$0);
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetPropertyBSTR"),
        RuntimeHelper.POINTER.withName("GetPropertyLength"),
        RuntimeHelper.POINTER.withName("GetPropertyDWORD"),
        RuntimeHelper.POINTER.withName("HasProperty"),
        RuntimeHelper.POINTER.withName("GetAbsoluteUri"),
        RuntimeHelper.POINTER.withName("GetAuthority"),
        RuntimeHelper.POINTER.withName("GetDisplayUri"),
        RuntimeHelper.POINTER.withName("GetDomain"),
        RuntimeHelper.POINTER.withName("GetExtension"),
        RuntimeHelper.POINTER.withName("GetFragment"),
        RuntimeHelper.POINTER.withName("GetHost"),
        RuntimeHelper.POINTER.withName("GetPassword"),
        RuntimeHelper.POINTER.withName("GetPath"),
        RuntimeHelper.POINTER.withName("GetPathAndQuery"),
        RuntimeHelper.POINTER.withName("GetQuery"),
        RuntimeHelper.POINTER.withName("GetRawUri"),
        RuntimeHelper.POINTER.withName("GetSchemeName"),
        RuntimeHelper.POINTER.withName("GetUserInfo"),
        RuntimeHelper.POINTER.withName("GetUserNameA"),
        RuntimeHelper.POINTER.withName("GetHostType"),
        RuntimeHelper.POINTER.withName("GetPort"),
        RuntimeHelper.POINTER.withName("GetScheme"),
        RuntimeHelper.POINTER.withName("GetZone"),
        RuntimeHelper.POINTER.withName("GetProperties"),
        RuntimeHelper.POINTER.withName("IsEqual")
    ).withName("IUriVtbl");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IUriVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$3 = constants$4146.const$1.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IUriVtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$5 = constants$4146.const$1.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
}


