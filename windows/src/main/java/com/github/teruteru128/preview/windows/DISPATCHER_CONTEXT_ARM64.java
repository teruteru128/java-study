// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * typedef struct _DISPATCHER_CONTEXT_ARM64 {
 *     ULONG_PTR ControlPc;
 *     ULONG_PTR ImageBase;
 *     PARM64_RUNTIME_FUNCTION FunctionEntry;
 *     ULONG_PTR EstablisherFrame;
 *     ULONG_PTR TargetPc;
 *     PARM64_NT_CONTEXT ContextRecord;
 *     PEXCEPTION_ROUTINE LanguageHandler;
 *     PVOID HandlerData;
 *     struct _UNWIND_HISTORY_TABLE *HistoryTable;
 *     DWORD ScopeIndex;
 *     BOOLEAN ControlPcIsUnwound;
 *     PBYTE NonVolatileRegisters;
 * } DISPATCHER_CONTEXT_ARM64
 * }
 */
public class DISPATCHER_CONTEXT_ARM64 extends _DISPATCHER_CONTEXT_ARM64 {

    DISPATCHER_CONTEXT_ARM64() {
        // Should not be called directly
    }
}
