// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3743 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3743() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_servprov_0000_0001_v0_0_s_ifspec", RuntimeHelper.POINTER);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "IServiceProvider_QueryService_Proxy",
        constants$1.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "IServiceProvider_QueryService_Stub",
        constants$1.const$3
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("_nLine"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("_pchBuf"),
        JAVA_INT.withName("_cchBuf"),
        JAVA_INT.withName("_ich"),
        RuntimeHelper.POINTER.withName("_pszFound"),
        RuntimeHelper.POINTER.withName("_pszExpected"),
        JAVA_INT.withName("_reserved1"),
        JAVA_INT.withName("_reserved2")
    ).withName("_xml_error");
    static final VarHandle const$4 = constants$3743.const$3.varHandle(MemoryLayout.PathElement.groupElement("_nLine"));
    static final VarHandle const$5 = constants$3743.const$3.varHandle(MemoryLayout.PathElement.groupElement("_pchBuf"));
}

