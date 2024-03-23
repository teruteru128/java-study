// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct _DISPATCHER_CONTEXT {
 *     DWORD64 ControlPc;
 *     DWORD64 ImageBase;
 *     PRUNTIME_FUNCTION FunctionEntry;
 *     DWORD64 EstablisherFrame;
 *     DWORD64 TargetIp;
 *     PCONTEXT ContextRecord;
 *     PEXCEPTION_ROUTINE LanguageHandler;
 *     PVOID HandlerData;
 *     struct _UNWIND_HISTORY_TABLE *HistoryTable;
 *     DWORD ScopeIndex;
 *     DWORD Fill0;
 * } DISPATCHER_CONTEXT
 * }
 */
public class DISPATCHER_CONTEXT extends _DISPATCHER_CONTEXT {

    DISPATCHER_CONTEXT() {
        // Should not be called directly
    }
}

