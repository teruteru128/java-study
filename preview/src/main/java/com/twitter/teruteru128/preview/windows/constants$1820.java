// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1820 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1820() {}
    static final UnionLayout const$0 = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("NotificationRoutine"),
            RuntimeHelper.POINTER.withName("hThread")
        ).withName("APC"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("hIOPort"),
            JAVA_INT.withName("dwNumberOfBytesTransferred"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("dwCompletionKey"),
            RuntimeHelper.POINTER.withName("lpOverlapped")
        ).withName("IOC"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("hWnd"),
            JAVA_INT.withName("Msg"),
            MemoryLayout.paddingLayout(4)
        ).withName("HWND"),
        RuntimeHelper.POINTER.withName("hEvent"),
        RuntimeHelper.POINTER.withName("NotificationRoutine")
    ).withName("_RPC_ASYNC_NOTIFICATION_INFO");
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("NotificationRoutine"),
        RuntimeHelper.POINTER.withName("hThread")
    ).withName("");
    static final VarHandle const$2 = constants$1820.const$1.varHandle(MemoryLayout.PathElement.groupElement("NotificationRoutine"));
    static final VarHandle const$3 = constants$1820.const$1.varHandle(MemoryLayout.PathElement.groupElement("hThread"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("hIOPort"),
        JAVA_INT.withName("dwNumberOfBytesTransferred"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("dwCompletionKey"),
        RuntimeHelper.POINTER.withName("lpOverlapped")
    ).withName("");
    static final VarHandle const$5 = constants$1820.const$4.varHandle(MemoryLayout.PathElement.groupElement("hIOPort"));
}

