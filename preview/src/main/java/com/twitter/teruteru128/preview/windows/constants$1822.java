// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1822 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1822() {}
    static final VarHandle const$0 = constants$1820.const$0.varHandle(MemoryLayout.PathElement.groupElement("hEvent"));
    static final VarHandle const$1 = constants$1820.const$0.varHandle(MemoryLayout.PathElement.groupElement("NotificationRoutine"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("Signature"),
        JAVA_INT.withName("Lock"),
        JAVA_INT.withName("Flags"),
        RuntimeHelper.POINTER.withName("StubInfo"),
        RuntimeHelper.POINTER.withName("UserInfo"),
        RuntimeHelper.POINTER.withName("RuntimeInfo"),
        JAVA_INT.withName("Event"),
        JAVA_INT.withName("NotificationType"),
        MemoryLayout.unionLayout(
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
        ).withName("u"),
        MemoryLayout.sequenceLayout(4, JAVA_LONG).withName("Reserved")
    ).withName("_RPC_ASYNC_STATE");
    static final VarHandle const$3 = constants$1822.const$2.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$1822.const$2.varHandle(MemoryLayout.PathElement.groupElement("Signature"));
    static final VarHandle const$5 = constants$1822.const$2.varHandle(MemoryLayout.PathElement.groupElement("Lock"));
}

