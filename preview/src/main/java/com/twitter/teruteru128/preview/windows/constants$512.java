// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$512 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$512() {}
    static final VarHandle const$0 = constants$509.const$3.varHandle(MemoryLayout.PathElement.groupElement("DataLength"));
    static final VarHandle const$1 = constants$509.const$3.varHandle(MemoryLayout.PathElement.groupElement("DataOffset"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("ulSize"),
        MemoryLayout.sequenceLayout(256, JAVA_SHORT).withName("szLogicalLogFile"),
        JAVA_INT.withName("ulNumRecords"),
        MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
            JAVA_INT.withName("Length"),
            JAVA_INT.withName("Reserved"),
            JAVA_INT.withName("RecordNumber"),
            JAVA_INT.withName("TimeGenerated"),
            JAVA_INT.withName("TimeWritten"),
            JAVA_INT.withName("EventID"),
            JAVA_SHORT.withName("EventType"),
            JAVA_SHORT.withName("NumStrings"),
            JAVA_SHORT.withName("EventCategory"),
            JAVA_SHORT.withName("ReservedFlags"),
            JAVA_INT.withName("ClosingRecordNumber"),
            JAVA_INT.withName("StringOffset"),
            JAVA_INT.withName("UserSidLength"),
            JAVA_INT.withName("UserSidOffset"),
            JAVA_INT.withName("DataLength"),
            JAVA_INT.withName("DataOffset")
        ).withName("_EVENTLOGRECORD")).withName("pEventLogRecords")
    ).withName("_EVENTSFORLOGFILE");
    static final VarHandle const$3 = constants$512.const$2.varHandle(MemoryLayout.PathElement.groupElement("ulSize"));
    static final VarHandle const$4 = constants$512.const$2.varHandle(MemoryLayout.PathElement.groupElement("ulNumRecords"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("ulSize"),
        JAVA_INT.withName("ulNumEventsForLogFile"),
        MemoryLayout.sequenceLayout(0, JAVA_INT).withName("ulOffsets")
    ).withName("_PACKEDEVENTINFO");
}

