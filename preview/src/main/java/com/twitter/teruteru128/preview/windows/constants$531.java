// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$531 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$531() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("NumberOfTransactions"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("Data1"),
                JAVA_SHORT.withName("Data2"),
                JAVA_SHORT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
            ).withName("UOW")
        ).withName("_TRANSACTION_LIST_ENTRY")).withName("TransactionInformation")
    ).withName("_TRANSACTION_LIST_INFORMATION");
    static final VarHandle const$1 = constants$531.const$0.varHandle(MemoryLayout.PathElement.groupElement("NumberOfTransactions"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("LastQuery"),
        JAVA_INT.withName("ObjectIdCount"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("_GUID")).withName("ObjectIds")
    ).withName("_KTMOBJECT_CURSOR");
    static final VarHandle const$3 = constants$531.const$2.varHandle(MemoryLayout.PathElement.groupElement("ObjectIdCount"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(PTP_SIMPLE_CALLBACK.class, "apply", constants$469.const$2);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$469.const$2
    );
}


