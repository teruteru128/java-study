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
 * typedef struct _JOB_INFO_1A {
 *     DWORD JobId;
 *     LPSTR pPrinterName;
 *     LPSTR pMachineName;
 *     LPSTR pUserName;
 *     LPSTR pDocument;
 *     LPSTR pDatatype;
 *     LPSTR pStatus;
 *     DWORD Status;
 *     DWORD Priority;
 *     DWORD Position;
 *     DWORD TotalPages;
 *     DWORD PagesPrinted;
 *     SYSTEMTIME Submitted;
 * } JOB_INFO_1A
 * }
 */
public class JOB_INFO_1A extends _JOB_INFO_1A {

    JOB_INFO_1A() {
        // Should not be called directly
    }
}
