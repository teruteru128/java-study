// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_MEDIA_INFO {
 *     union  DeviceSpecific;
 * };
 * }
 */
public class _DEVICE_MEDIA_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2378.const$4;
    }
    /**
     * {@snippet :
     * union {
     *     struct  DiskInfo;
     *     struct  RemovableDiskInfo;
     *     struct  TapeInfo;
     * };
     * }
     */
    public static final class DeviceSpecific {

        // Suppresses default constructor, ensuring non-instantiability.
        private DeviceSpecific() {}
        public static MemoryLayout $LAYOUT() {
            return constants$2378.const$5;
        }
        /**
         * {@snippet :
         * struct {
         *     LARGE_INTEGER Cylinders;
         *     STORAGE_MEDIA_TYPE MediaType;
         *     DWORD TracksPerCylinder;
         *     DWORD SectorsPerTrack;
         *     DWORD BytesPerSector;
         *     DWORD NumberMediaSides;
         *     DWORD MediaCharacteristics;
         * };
         * }
         */
        public static final class DiskInfo {

            // Suppresses default constructor, ensuring non-instantiability.
            private DiskInfo() {}
            public static MemoryLayout $LAYOUT() {
                return constants$2379.const$0;
            }
            public static MemorySegment Cylinders$slice(MemorySegment seg) {
                return seg.asSlice(0, 8);
            }
            public static VarHandle MediaType$VH() {
                return constants$2379.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * STORAGE_MEDIA_TYPE MediaType;
             * }
             */
            public static int MediaType$get(MemorySegment seg) {
                return (int)constants$2379.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * STORAGE_MEDIA_TYPE MediaType;
             * }
             */
            public static void MediaType$set(MemorySegment seg, int x) {
                constants$2379.const$1.set(seg, x);
            }
            public static int MediaType$get(MemorySegment seg, long index) {
                return (int)constants$2379.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaType$set(MemorySegment seg, long index, int x) {
                constants$2379.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle TracksPerCylinder$VH() {
                return constants$2379.const$2;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD TracksPerCylinder;
             * }
             */
            public static int TracksPerCylinder$get(MemorySegment seg) {
                return (int)constants$2379.const$2.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD TracksPerCylinder;
             * }
             */
            public static void TracksPerCylinder$set(MemorySegment seg, int x) {
                constants$2379.const$2.set(seg, x);
            }
            public static int TracksPerCylinder$get(MemorySegment seg, long index) {
                return (int)constants$2379.const$2.get(seg.asSlice(index*sizeof()));
            }
            public static void TracksPerCylinder$set(MemorySegment seg, long index, int x) {
                constants$2379.const$2.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle SectorsPerTrack$VH() {
                return constants$2379.const$3;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD SectorsPerTrack;
             * }
             */
            public static int SectorsPerTrack$get(MemorySegment seg) {
                return (int)constants$2379.const$3.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD SectorsPerTrack;
             * }
             */
            public static void SectorsPerTrack$set(MemorySegment seg, int x) {
                constants$2379.const$3.set(seg, x);
            }
            public static int SectorsPerTrack$get(MemorySegment seg, long index) {
                return (int)constants$2379.const$3.get(seg.asSlice(index*sizeof()));
            }
            public static void SectorsPerTrack$set(MemorySegment seg, long index, int x) {
                constants$2379.const$3.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle BytesPerSector$VH() {
                return constants$2379.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD BytesPerSector;
             * }
             */
            public static int BytesPerSector$get(MemorySegment seg) {
                return (int)constants$2379.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD BytesPerSector;
             * }
             */
            public static void BytesPerSector$set(MemorySegment seg, int x) {
                constants$2379.const$4.set(seg, x);
            }
            public static int BytesPerSector$get(MemorySegment seg, long index) {
                return (int)constants$2379.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void BytesPerSector$set(MemorySegment seg, long index, int x) {
                constants$2379.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle NumberMediaSides$VH() {
                return constants$2379.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD NumberMediaSides;
             * }
             */
            public static int NumberMediaSides$get(MemorySegment seg) {
                return (int)constants$2379.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD NumberMediaSides;
             * }
             */
            public static void NumberMediaSides$set(MemorySegment seg, int x) {
                constants$2379.const$5.set(seg, x);
            }
            public static int NumberMediaSides$get(MemorySegment seg, long index) {
                return (int)constants$2379.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void NumberMediaSides$set(MemorySegment seg, long index, int x) {
                constants$2379.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle MediaCharacteristics$VH() {
                return constants$2380.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD MediaCharacteristics;
             * }
             */
            public static int MediaCharacteristics$get(MemorySegment seg) {
                return (int)constants$2380.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD MediaCharacteristics;
             * }
             */
            public static void MediaCharacteristics$set(MemorySegment seg, int x) {
                constants$2380.const$0.set(seg, x);
            }
            public static int MediaCharacteristics$get(MemorySegment seg, long index) {
                return (int)constants$2380.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaCharacteristics$set(MemorySegment seg, long index, int x) {
                constants$2380.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment DiskInfo$slice(MemorySegment seg) {
            return seg.asSlice(0, 32);
        }
        /**
         * {@snippet :
         * struct {
         *     LARGE_INTEGER Cylinders;
         *     STORAGE_MEDIA_TYPE MediaType;
         *     DWORD TracksPerCylinder;
         *     DWORD SectorsPerTrack;
         *     DWORD BytesPerSector;
         *     DWORD NumberMediaSides;
         *     DWORD MediaCharacteristics;
         * };
         * }
         */
        public static final class RemovableDiskInfo {

            // Suppresses default constructor, ensuring non-instantiability.
            private RemovableDiskInfo() {}
            public static MemoryLayout $LAYOUT() {
                return constants$2379.const$0;
            }
            public static MemorySegment Cylinders$slice(MemorySegment seg) {
                return seg.asSlice(0, 8);
            }
            public static VarHandle MediaType$VH() {
                return constants$2380.const$1;
            }
            /**
             * Getter for field:
             * {@snippet :
             * STORAGE_MEDIA_TYPE MediaType;
             * }
             */
            public static int MediaType$get(MemorySegment seg) {
                return (int)constants$2380.const$1.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * STORAGE_MEDIA_TYPE MediaType;
             * }
             */
            public static void MediaType$set(MemorySegment seg, int x) {
                constants$2380.const$1.set(seg, x);
            }
            public static int MediaType$get(MemorySegment seg, long index) {
                return (int)constants$2380.const$1.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaType$set(MemorySegment seg, long index, int x) {
                constants$2380.const$1.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle TracksPerCylinder$VH() {
                return constants$2380.const$2;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD TracksPerCylinder;
             * }
             */
            public static int TracksPerCylinder$get(MemorySegment seg) {
                return (int)constants$2380.const$2.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD TracksPerCylinder;
             * }
             */
            public static void TracksPerCylinder$set(MemorySegment seg, int x) {
                constants$2380.const$2.set(seg, x);
            }
            public static int TracksPerCylinder$get(MemorySegment seg, long index) {
                return (int)constants$2380.const$2.get(seg.asSlice(index*sizeof()));
            }
            public static void TracksPerCylinder$set(MemorySegment seg, long index, int x) {
                constants$2380.const$2.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle SectorsPerTrack$VH() {
                return constants$2380.const$3;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD SectorsPerTrack;
             * }
             */
            public static int SectorsPerTrack$get(MemorySegment seg) {
                return (int)constants$2380.const$3.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD SectorsPerTrack;
             * }
             */
            public static void SectorsPerTrack$set(MemorySegment seg, int x) {
                constants$2380.const$3.set(seg, x);
            }
            public static int SectorsPerTrack$get(MemorySegment seg, long index) {
                return (int)constants$2380.const$3.get(seg.asSlice(index*sizeof()));
            }
            public static void SectorsPerTrack$set(MemorySegment seg, long index, int x) {
                constants$2380.const$3.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle BytesPerSector$VH() {
                return constants$2380.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD BytesPerSector;
             * }
             */
            public static int BytesPerSector$get(MemorySegment seg) {
                return (int)constants$2380.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD BytesPerSector;
             * }
             */
            public static void BytesPerSector$set(MemorySegment seg, int x) {
                constants$2380.const$4.set(seg, x);
            }
            public static int BytesPerSector$get(MemorySegment seg, long index) {
                return (int)constants$2380.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void BytesPerSector$set(MemorySegment seg, long index, int x) {
                constants$2380.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle NumberMediaSides$VH() {
                return constants$2380.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD NumberMediaSides;
             * }
             */
            public static int NumberMediaSides$get(MemorySegment seg) {
                return (int)constants$2380.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD NumberMediaSides;
             * }
             */
            public static void NumberMediaSides$set(MemorySegment seg, int x) {
                constants$2380.const$5.set(seg, x);
            }
            public static int NumberMediaSides$get(MemorySegment seg, long index) {
                return (int)constants$2380.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void NumberMediaSides$set(MemorySegment seg, long index, int x) {
                constants$2380.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle MediaCharacteristics$VH() {
                return constants$2381.const$0;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD MediaCharacteristics;
             * }
             */
            public static int MediaCharacteristics$get(MemorySegment seg) {
                return (int)constants$2381.const$0.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD MediaCharacteristics;
             * }
             */
            public static void MediaCharacteristics$set(MemorySegment seg, int x) {
                constants$2381.const$0.set(seg, x);
            }
            public static int MediaCharacteristics$get(MemorySegment seg, long index) {
                return (int)constants$2381.const$0.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaCharacteristics$set(MemorySegment seg, long index, int x) {
                constants$2381.const$0.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment RemovableDiskInfo$slice(MemorySegment seg) {
            return seg.asSlice(0, 32);
        }
        /**
         * {@snippet :
         * struct {
         *     STORAGE_MEDIA_TYPE MediaType;
         *     DWORD MediaCharacteristics;
         *     DWORD CurrentBlockSize;
         *     STORAGE_BUS_TYPE BusType;
         *     union  BusSpecificData;
         * };
         * }
         */
        public static final class TapeInfo {

            // Suppresses default constructor, ensuring non-instantiability.
            private TapeInfo() {}
            public static MemoryLayout $LAYOUT() {
                return constants$2381.const$1;
            }
            public static VarHandle MediaType$VH() {
                return constants$2381.const$2;
            }
            /**
             * Getter for field:
             * {@snippet :
             * STORAGE_MEDIA_TYPE MediaType;
             * }
             */
            public static int MediaType$get(MemorySegment seg) {
                return (int)constants$2381.const$2.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * STORAGE_MEDIA_TYPE MediaType;
             * }
             */
            public static void MediaType$set(MemorySegment seg, int x) {
                constants$2381.const$2.set(seg, x);
            }
            public static int MediaType$get(MemorySegment seg, long index) {
                return (int)constants$2381.const$2.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaType$set(MemorySegment seg, long index, int x) {
                constants$2381.const$2.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle MediaCharacteristics$VH() {
                return constants$2381.const$3;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD MediaCharacteristics;
             * }
             */
            public static int MediaCharacteristics$get(MemorySegment seg) {
                return (int)constants$2381.const$3.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD MediaCharacteristics;
             * }
             */
            public static void MediaCharacteristics$set(MemorySegment seg, int x) {
                constants$2381.const$3.set(seg, x);
            }
            public static int MediaCharacteristics$get(MemorySegment seg, long index) {
                return (int)constants$2381.const$3.get(seg.asSlice(index*sizeof()));
            }
            public static void MediaCharacteristics$set(MemorySegment seg, long index, int x) {
                constants$2381.const$3.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle CurrentBlockSize$VH() {
                return constants$2381.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * DWORD CurrentBlockSize;
             * }
             */
            public static int CurrentBlockSize$get(MemorySegment seg) {
                return (int)constants$2381.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * DWORD CurrentBlockSize;
             * }
             */
            public static void CurrentBlockSize$set(MemorySegment seg, int x) {
                constants$2381.const$4.set(seg, x);
            }
            public static int CurrentBlockSize$get(MemorySegment seg, long index) {
                return (int)constants$2381.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void CurrentBlockSize$set(MemorySegment seg, long index, int x) {
                constants$2381.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle BusType$VH() {
                return constants$2381.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * STORAGE_BUS_TYPE BusType;
             * }
             */
            public static int BusType$get(MemorySegment seg) {
                return (int)constants$2381.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * STORAGE_BUS_TYPE BusType;
             * }
             */
            public static void BusType$set(MemorySegment seg, int x) {
                constants$2381.const$5.set(seg, x);
            }
            public static int BusType$get(MemorySegment seg, long index) {
                return (int)constants$2381.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void BusType$set(MemorySegment seg, long index, int x) {
                constants$2381.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            /**
             * {@snippet :
             * union {
             *     struct  ScsiInformation;
             * };
             * }
             */
            public static final class BusSpecificData {

                // Suppresses default constructor, ensuring non-instantiability.
                private BusSpecificData() {}
                public static MemoryLayout $LAYOUT() {
                    return constants$2382.const$0;
                }
                /**
                 * {@snippet :
                 * struct {
                 *     BYTE MediumType;
                 *     BYTE DensityCode;
                 * };
                 * }
                 */
                public static final class ScsiInformation {

                    // Suppresses default constructor, ensuring non-instantiability.
                    private ScsiInformation() {}
                    public static MemoryLayout $LAYOUT() {
                        return constants$2382.const$1;
                    }
                    public static VarHandle MediumType$VH() {
                        return constants$2382.const$2;
                    }
                    /**
                     * Getter for field:
                     * {@snippet :
                     * BYTE MediumType;
                     * }
                     */
                    public static byte MediumType$get(MemorySegment seg) {
                        return (byte)constants$2382.const$2.get(seg);
                    }
                    /**
                     * Setter for field:
                     * {@snippet :
                     * BYTE MediumType;
                     * }
                     */
                    public static void MediumType$set(MemorySegment seg, byte x) {
                        constants$2382.const$2.set(seg, x);
                    }
                    public static byte MediumType$get(MemorySegment seg, long index) {
                        return (byte)constants$2382.const$2.get(seg.asSlice(index*sizeof()));
                    }
                    public static void MediumType$set(MemorySegment seg, long index, byte x) {
                        constants$2382.const$2.set(seg.asSlice(index*sizeof()), x);
                    }
                    public static VarHandle DensityCode$VH() {
                        return constants$2382.const$3;
                    }
                    /**
                     * Getter for field:
                     * {@snippet :
                     * BYTE DensityCode;
                     * }
                     */
                    public static byte DensityCode$get(MemorySegment seg) {
                        return (byte)constants$2382.const$3.get(seg);
                    }
                    /**
                     * Setter for field:
                     * {@snippet :
                     * BYTE DensityCode;
                     * }
                     */
                    public static void DensityCode$set(MemorySegment seg, byte x) {
                        constants$2382.const$3.set(seg, x);
                    }
                    public static byte DensityCode$get(MemorySegment seg, long index) {
                        return (byte)constants$2382.const$3.get(seg.asSlice(index*sizeof()));
                    }
                    public static void DensityCode$set(MemorySegment seg, long index, byte x) {
                        constants$2382.const$3.set(seg.asSlice(index*sizeof()), x);
                    }
                    public static long sizeof() { return $LAYOUT().byteSize(); }
                    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                    }
                    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
                }

                public static MemorySegment ScsiInformation$slice(MemorySegment seg) {
                    return seg.asSlice(0, 2);
                }
                public static long sizeof() { return $LAYOUT().byteSize(); }
                public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                    return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                }
                public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
            }

            public static MemorySegment BusSpecificData$slice(MemorySegment seg) {
                return seg.asSlice(16, 2);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
        }

        public static MemorySegment TapeInfo$slice(MemorySegment seg) {
            return seg.asSlice(0, 20);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment DeviceSpecific$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


