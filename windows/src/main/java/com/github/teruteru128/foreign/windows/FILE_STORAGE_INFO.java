// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * typedef struct _FILE_STORAGE_INFO {
 *     ULONG LogicalBytesPerSector;
 *     ULONG PhysicalBytesPerSectorForAtomicity;
 *     ULONG PhysicalBytesPerSectorForPerformance;
 *     ULONG FileSystemEffectivePhysicalBytesPerSectorForAtomicity;
 *     ULONG Flags;
 *     ULONG ByteOffsetForSectorAlignment;
 *     ULONG ByteOffsetForPartitionAlignment;
 * } FILE_STORAGE_INFO
 * }
 */
public class FILE_STORAGE_INFO extends _FILE_STORAGE_INFO {

    FILE_STORAGE_INFO() {
        // Should not be called directly
    }
}
