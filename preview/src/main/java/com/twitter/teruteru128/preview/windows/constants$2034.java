// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2034 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2034() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pszIssuerDomainPolicy"),
        RuntimeHelper.POINTER.withName("pszSubjectDomainPolicy")
    ).withName("_CERT_POLICY_MAPPING");
    static final VarHandle const$1 = constants$2034.const$0.varHandle(MemoryLayout.PathElement.groupElement("pszIssuerDomainPolicy"));
    static final VarHandle const$2 = constants$2034.const$0.varHandle(MemoryLayout.PathElement.groupElement("pszSubjectDomainPolicy"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cPolicyMapping"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgPolicyMapping")
    ).withName("_CERT_POLICY_MAPPINGS_INFO");
    static final VarHandle const$4 = constants$2034.const$3.varHandle(MemoryLayout.PathElement.groupElement("cPolicyMapping"));
    static final VarHandle const$5 = constants$2034.const$3.varHandle(MemoryLayout.PathElement.groupElement("rgPolicyMapping"));
}


