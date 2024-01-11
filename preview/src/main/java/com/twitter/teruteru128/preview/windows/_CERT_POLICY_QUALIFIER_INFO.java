// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_POLICY_QUALIFIER_INFO {
 *     LPSTR pszPolicyQualifierId;
 *     CRYPT_OBJID_BLOB Qualifier;
 * };
 * }
 */
public class _CERT_POLICY_QUALIFIER_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2029.const$4;
    }
    public static VarHandle pszPolicyQualifierId$VH() {
        return constants$2029.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszPolicyQualifierId;
     * }
     */
    public static MemorySegment pszPolicyQualifierId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2029.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszPolicyQualifierId;
     * }
     */
    public static void pszPolicyQualifierId$set(MemorySegment seg, MemorySegment x) {
        constants$2029.const$5.set(seg, x);
    }
    public static MemorySegment pszPolicyQualifierId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2029.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pszPolicyQualifierId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2029.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Qualifier$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

