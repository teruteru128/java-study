// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2030 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2030() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pszPolicyIdentifier"),
        JAVA_INT.withName("cPolicyQualifier"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgPolicyQualifier")
    ).withName("_CERT_POLICY_INFO");
    static final VarHandle const$1 = constants$2030.const$0.varHandle(MemoryLayout.PathElement.groupElement("pszPolicyIdentifier"));
    static final VarHandle const$2 = constants$2030.const$0.varHandle(MemoryLayout.PathElement.groupElement("cPolicyQualifier"));
    static final VarHandle const$3 = constants$2030.const$0.varHandle(MemoryLayout.PathElement.groupElement("rgPolicyQualifier"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cPolicyInfo"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgPolicyInfo")
    ).withName("_CERT_POLICIES_INFO");
    static final VarHandle const$5 = constants$2030.const$4.varHandle(MemoryLayout.PathElement.groupElement("cPolicyInfo"));
}


