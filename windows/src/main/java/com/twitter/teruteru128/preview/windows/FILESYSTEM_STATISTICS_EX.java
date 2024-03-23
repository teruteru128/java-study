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
 * typedef struct _FILESYSTEM_STATISTICS_EX {
 *     WORD FileSystemType;
 *     WORD Version;
 *     DWORD SizeOfCompleteStructure;
 *     DWORDLONG UserFileReads;
 *     DWORDLONG UserFileReadBytes;
 *     DWORDLONG UserDiskReads;
 *     DWORDLONG UserFileWrites;
 *     DWORDLONG UserFileWriteBytes;
 *     DWORDLONG UserDiskWrites;
 *     DWORDLONG MetaDataReads;
 *     DWORDLONG MetaDataReadBytes;
 *     DWORDLONG MetaDataDiskReads;
 *     DWORDLONG MetaDataWrites;
 *     DWORDLONG MetaDataWriteBytes;
 *     DWORDLONG MetaDataDiskWrites;
 * } FILESYSTEM_STATISTICS_EX
 * }
 */
public class FILESYSTEM_STATISTICS_EX extends _FILESYSTEM_STATISTICS_EX {

    FILESYSTEM_STATISTICS_EX() {
        // Should not be called directly
    }
}

