// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {
 *     DWORD ControlFlags;
 *     union {
 *         DWORD CpuRate;
 *         DWORD Weight;
 *         struct {
 *             WORD MinRate;
 *             WORD MaxRate;
 *         };
 *     };
 * } JOBOBJECT_CPU_RATE_CONTROL_INFORMATION
 * }
 */
public class JOBOBJECT_CPU_RATE_CONTROL_INFORMATION extends _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {

    JOBOBJECT_CPU_RATE_CONTROL_INFORMATION() {
        // Should not be called directly
    }
}

