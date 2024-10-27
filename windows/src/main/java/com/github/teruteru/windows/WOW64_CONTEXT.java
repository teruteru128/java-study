// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _WOW64_CONTEXT {
 *     DWORD ContextFlags;
 *     DWORD Dr0;
 *     DWORD Dr1;
 *     DWORD Dr2;
 *     DWORD Dr3;
 *     DWORD Dr6;
 *     DWORD Dr7;
 *     WOW64_FLOATING_SAVE_AREA FloatSave;
 *     DWORD SegGs;
 *     DWORD SegFs;
 *     DWORD SegEs;
 *     DWORD SegDs;
 *     DWORD Edi;
 *     DWORD Esi;
 *     DWORD Ebx;
 *     DWORD Edx;
 *     DWORD Ecx;
 *     DWORD Eax;
 *     DWORD Ebp;
 *     DWORD Eip;
 *     DWORD SegCs;
 *     DWORD EFlags;
 *     DWORD Esp;
 *     DWORD SegSs;
 *     BYTE ExtendedRegisters[512];
 * } WOW64_CONTEXT
 * }
 */
public class WOW64_CONTEXT extends _WOW64_CONTEXT {

    WOW64_CONTEXT() {
        // Should not be called directly
    }
}

