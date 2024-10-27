// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY {
 *     DWORD BeginAddress;
 *     union {
 *         DWORD UnwindData;
 *         struct {
 *             DWORD Flag : 2;
 *             DWORD FunctionLength : 11;
 *             DWORD RegF : 3;
 *             DWORD RegI : 4;
 *             DWORD H : 1;
 *             DWORD CR : 2;
 *             DWORD FrameSize : 9;
 *         };
 *     };
 * } IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY
 * }
 */
public class IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY extends _IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY {

    IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY() {
        // Should not be called directly
    }
}

