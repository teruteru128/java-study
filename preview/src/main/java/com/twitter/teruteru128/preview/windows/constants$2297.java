// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2297 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2297() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("Data1"),
                JAVA_SHORT.withName("Data2"),
                JAVA_SHORT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
            ).withName("SyntaxGUID"),
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("MajorVersion"),
                JAVA_SHORT.withName("MinorVersion")
            ).withName("SyntaxVersion")
        ).withName("TransferSyntax"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("DispatchTable"),
        RuntimeHelper.POINTER.withName("ProcString"),
        RuntimeHelper.POINTER.withName("FmtStringOffset"),
        RuntimeHelper.POINTER.withName("TypeString"),
        RuntimeHelper.POINTER.withName("aUserMarshalQuadruple"),
        RuntimeHelper.POINTER.withName("pMethodProperties"),
        JAVA_LONG.withName("pReserved2")
    ).withName("_MIDL_SYNTAX_INFO");
    static final VarHandle const$1 = constants$2297.const$0.varHandle(MemoryLayout.PathElement.groupElement("DispatchTable"));
    static final VarHandle const$2 = constants$2297.const$0.varHandle(MemoryLayout.PathElement.groupElement("ProcString"));
    static final VarHandle const$3 = constants$2297.const$0.varHandle(MemoryLayout.PathElement.groupElement("FmtStringOffset"));
    static final VarHandle const$4 = constants$2297.const$0.varHandle(MemoryLayout.PathElement.groupElement("TypeString"));
    static final VarHandle const$5 = constants$2297.const$0.varHandle(MemoryLayout.PathElement.groupElement("aUserMarshalQuadruple"));
}


