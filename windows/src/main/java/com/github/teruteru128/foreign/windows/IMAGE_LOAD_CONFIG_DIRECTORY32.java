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
 * typedef struct _IMAGE_LOAD_CONFIG_DIRECTORY32 {
 *     DWORD Size;
 *     DWORD TimeDateStamp;
 *     WORD MajorVersion;
 *     WORD MinorVersion;
 *     DWORD GlobalFlagsClear;
 *     DWORD GlobalFlagsSet;
 *     DWORD CriticalSectionDefaultTimeout;
 *     DWORD DeCommitFreeBlockThreshold;
 *     DWORD DeCommitTotalFreeThreshold;
 *     DWORD LockPrefixTable;
 *     DWORD MaximumAllocationSize;
 *     DWORD VirtualMemoryThreshold;
 *     DWORD ProcessHeapFlags;
 *     DWORD ProcessAffinityMask;
 *     WORD CSDVersion;
 *     WORD DependentLoadFlags;
 *     DWORD EditList;
 *     DWORD SecurityCookie;
 *     DWORD SEHandlerTable;
 *     DWORD SEHandlerCount;
 *     DWORD GuardCFCheckFunctionPointer;
 *     DWORD GuardCFDispatchFunctionPointer;
 *     DWORD GuardCFFunctionTable;
 *     DWORD GuardCFFunctionCount;
 *     DWORD GuardFlags;
 *     IMAGE_LOAD_CONFIG_CODE_INTEGRITY CodeIntegrity;
 *     DWORD GuardAddressTakenIatEntryTable;
 *     DWORD GuardAddressTakenIatEntryCount;
 *     DWORD GuardLongJumpTargetTable;
 *     DWORD GuardLongJumpTargetCount;
 *     DWORD DynamicValueRelocTable;
 *     DWORD CHPEMetadataPointer;
 *     DWORD GuardRFFailureRoutine;
 *     DWORD GuardRFFailureRoutineFunctionPointer;
 *     DWORD DynamicValueRelocTableOffset;
 *     WORD DynamicValueRelocTableSection;
 *     WORD Reserved2;
 *     DWORD GuardRFVerifyStackPointerFunctionPointer;
 *     DWORD HotPatchTableOffset;
 *     DWORD Reserved3;
 *     DWORD EnclaveConfigurationPointer;
 *     DWORD VolatileMetadataPointer;
 *     DWORD GuardEHContinuationTable;
 *     DWORD GuardEHContinuationCount;
 *     DWORD GuardXFGCheckFunctionPointer;
 *     DWORD GuardXFGDispatchFunctionPointer;
 *     DWORD GuardXFGTableDispatchFunctionPointer;
 *     DWORD CastGuardOsDeterminedFailureMode;
 * } IMAGE_LOAD_CONFIG_DIRECTORY32
 * }
 */
public class IMAGE_LOAD_CONFIG_DIRECTORY32 extends _IMAGE_LOAD_CONFIG_DIRECTORY32 {

    IMAGE_LOAD_CONFIG_DIRECTORY32() {
        // Should not be called directly
    }
}
