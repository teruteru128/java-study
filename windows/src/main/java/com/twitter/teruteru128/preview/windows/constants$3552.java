// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3552 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3552() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("RecordInit"),
        RuntimeHelper.POINTER.withName("RecordClear"),
        RuntimeHelper.POINTER.withName("RecordCopy"),
        RuntimeHelper.POINTER.withName("GetGuid"),
        RuntimeHelper.POINTER.withName("GetName"),
        RuntimeHelper.POINTER.withName("GetSize"),
        RuntimeHelper.POINTER.withName("GetTypeInfo"),
        RuntimeHelper.POINTER.withName("GetField"),
        RuntimeHelper.POINTER.withName("GetFieldNoCopy"),
        RuntimeHelper.POINTER.withName("PutField"),
        RuntimeHelper.POINTER.withName("PutFieldNoCopy"),
        RuntimeHelper.POINTER.withName("GetFieldNames"),
        RuntimeHelper.POINTER.withName("IsMatchingType"),
        RuntimeHelper.POINTER.withName("RecordCreate"),
        RuntimeHelper.POINTER.withName("RecordCreateCopy"),
        RuntimeHelper.POINTER.withName("RecordDestroy")
    ).withName("IRecordInfoVtbl");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IRecordInfoVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$2 = constants$3552.const$0.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IRecordInfoVtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$3552.const$0.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IRecordInfoVtbl.Release.class, "apply", constants$18.const$5);
}

