// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3239 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3239() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IRunnableObject");
    static final VarHandle const$1 = constants$3239.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "IRunnableObject_RemoteIsRunning_Proxy",
        constants$18.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "IRunnableObject_RemoteIsRunning_Stub",
        constants$467.const$0
    );
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("IID_IRunningObjectTable", constants$27.const$0);
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("Register"),
        RuntimeHelper.POINTER.withName("Revoke"),
        RuntimeHelper.POINTER.withName("IsRunning"),
        RuntimeHelper.POINTER.withName("GetObjectA"),
        RuntimeHelper.POINTER.withName("NoteChangeTime"),
        RuntimeHelper.POINTER.withName("GetTimeOfLastChange"),
        RuntimeHelper.POINTER.withName("EnumRunning")
    ).withName("IRunningObjectTableVtbl");
}


