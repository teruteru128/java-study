// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_DELAYLOAD_DESCRIPTOR {
 *     union  Attributes;
 *     DWORD DllNameRVA;
 *     DWORD ModuleHandleRVA;
 *     DWORD ImportAddressTableRVA;
 *     DWORD ImportNameTableRVA;
 *     DWORD BoundImportAddressTableRVA;
 *     DWORD UnloadInformationTableRVA;
 *     DWORD TimeDateStamp;
 * };
 * }
 */
public class _IMAGE_DELAYLOAD_DESCRIPTOR {

    public static MemoryLayout $LAYOUT() {
        return constants$411.const$5;
    }
    /**
     * {@snippet :
     * union {
     *     DWORD AllAttributes;
     *     struct {
     *              *         DWORD RvaBased;
     *         DWORD ReservedAttributes;
     *     };
     * };
     * }
     */
    public static final class Attributes {

        // Suppresses default constructor, ensuring non-instantiability.
        private Attributes() {}
        public static MemoryLayout $LAYOUT() {
            return constants$412.const$0;
        }
        public static VarHandle AllAttributes$VH() {
            return constants$412.const$1;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD AllAttributes;
         * }
         */
        public static int AllAttributes$get(MemorySegment seg) {
            return (int)constants$412.const$1.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD AllAttributes;
         * }
         */
        public static void AllAttributes$set(MemorySegment seg, int x) {
            constants$412.const$1.set(seg, x);
        }
        public static int AllAttributes$get(MemorySegment seg, long index) {
            return (int)constants$412.const$1.get(seg.asSlice(index*sizeof()));
        }
        public static void AllAttributes$set(MemorySegment seg, long index, int x) {
            constants$412.const$1.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment Attributes$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static VarHandle DllNameRVA$VH() {
        return constants$412.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DllNameRVA;
     * }
     */
    public static int DllNameRVA$get(MemorySegment seg) {
        return (int)constants$412.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DllNameRVA;
     * }
     */
    public static void DllNameRVA$set(MemorySegment seg, int x) {
        constants$412.const$2.set(seg, x);
    }
    public static int DllNameRVA$get(MemorySegment seg, long index) {
        return (int)constants$412.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void DllNameRVA$set(MemorySegment seg, long index, int x) {
        constants$412.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ModuleHandleRVA$VH() {
        return constants$412.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ModuleHandleRVA;
     * }
     */
    public static int ModuleHandleRVA$get(MemorySegment seg) {
        return (int)constants$412.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ModuleHandleRVA;
     * }
     */
    public static void ModuleHandleRVA$set(MemorySegment seg, int x) {
        constants$412.const$3.set(seg, x);
    }
    public static int ModuleHandleRVA$get(MemorySegment seg, long index) {
        return (int)constants$412.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ModuleHandleRVA$set(MemorySegment seg, long index, int x) {
        constants$412.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ImportAddressTableRVA$VH() {
        return constants$412.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ImportAddressTableRVA;
     * }
     */
    public static int ImportAddressTableRVA$get(MemorySegment seg) {
        return (int)constants$412.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ImportAddressTableRVA;
     * }
     */
    public static void ImportAddressTableRVA$set(MemorySegment seg, int x) {
        constants$412.const$4.set(seg, x);
    }
    public static int ImportAddressTableRVA$get(MemorySegment seg, long index) {
        return (int)constants$412.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ImportAddressTableRVA$set(MemorySegment seg, long index, int x) {
        constants$412.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ImportNameTableRVA$VH() {
        return constants$412.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ImportNameTableRVA;
     * }
     */
    public static int ImportNameTableRVA$get(MemorySegment seg) {
        return (int)constants$412.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ImportNameTableRVA;
     * }
     */
    public static void ImportNameTableRVA$set(MemorySegment seg, int x) {
        constants$412.const$5.set(seg, x);
    }
    public static int ImportNameTableRVA$get(MemorySegment seg, long index) {
        return (int)constants$412.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ImportNameTableRVA$set(MemorySegment seg, long index, int x) {
        constants$412.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle BoundImportAddressTableRVA$VH() {
        return constants$413.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BoundImportAddressTableRVA;
     * }
     */
    public static int BoundImportAddressTableRVA$get(MemorySegment seg) {
        return (int)constants$413.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BoundImportAddressTableRVA;
     * }
     */
    public static void BoundImportAddressTableRVA$set(MemorySegment seg, int x) {
        constants$413.const$0.set(seg, x);
    }
    public static int BoundImportAddressTableRVA$get(MemorySegment seg, long index) {
        return (int)constants$413.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void BoundImportAddressTableRVA$set(MemorySegment seg, long index, int x) {
        constants$413.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UnloadInformationTableRVA$VH() {
        return constants$413.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UnloadInformationTableRVA;
     * }
     */
    public static int UnloadInformationTableRVA$get(MemorySegment seg) {
        return (int)constants$413.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UnloadInformationTableRVA;
     * }
     */
    public static void UnloadInformationTableRVA$set(MemorySegment seg, int x) {
        constants$413.const$1.set(seg, x);
    }
    public static int UnloadInformationTableRVA$get(MemorySegment seg, long index) {
        return (int)constants$413.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void UnloadInformationTableRVA$set(MemorySegment seg, long index, int x) {
        constants$413.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TimeDateStamp$VH() {
        return constants$413.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)constants$413.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        constants$413.const$2.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)constants$413.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        constants$413.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

