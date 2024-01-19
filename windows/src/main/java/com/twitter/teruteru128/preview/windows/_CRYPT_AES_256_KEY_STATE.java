// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_AES_256_KEY_STATE {
 *     unsigned char Key[32];
 *     unsigned char IV[16];
 *     unsigned char  EncryptionState[15][16];
 *     unsigned char  DecryptionState[15][16];
 *     unsigned char Feedback[16];
 * };
 * }
 */
public class _CRYPT_AES_256_KEY_STATE {

    public static MemoryLayout $LAYOUT() {
        return constants$1929.const$0;
    }
    public static MemorySegment Key$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static MemorySegment IV$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static MemorySegment EncryptionState$slice(MemorySegment seg) {
        return seg.asSlice(48, 240);
    }
    public static MemorySegment DecryptionState$slice(MemorySegment seg) {
        return seg.asSlice(288, 240);
    }
    public static MemorySegment Feedback$slice(MemorySegment seg) {
        return seg.asSlice(528, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

