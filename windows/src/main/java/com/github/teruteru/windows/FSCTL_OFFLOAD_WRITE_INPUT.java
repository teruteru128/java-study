// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _FSCTL_OFFLOAD_WRITE_INPUT {
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORDLONG FileOffset;
 *     DWORDLONG CopyLength;
 *     DWORDLONG TransferOffset;
 *     BYTE Token[512];
 * } FSCTL_OFFLOAD_WRITE_INPUT
 * }
 */
public class FSCTL_OFFLOAD_WRITE_INPUT extends _FSCTL_OFFLOAD_WRITE_INPUT {

    FSCTL_OFFLOAD_WRITE_INPUT() {
        // Should not be called directly
    }
}

