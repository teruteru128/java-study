// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class opencl_h_2 extends opencl_h_1 {

    /**
     * {@snippet :
     * #define CL_QCOM_EXT_HOST_PTR_EXTENSION_NAME "cl_qcom_ext_host_ptr"
     * }
     */
    public static MemorySegment CL_QCOM_EXT_HOST_PTR_EXTENSION_NAME() {
        return constants$262.const$0;
    }
    /**
     * {@snippet :
     * #define CL_MEM_EXT_HOST_PTR_QCOM 536870912
     * }
     */
    public static int CL_MEM_EXT_HOST_PTR_QCOM() {
        return (int)536870912L;
    }
    /**
     * {@snippet :
     * #define CL_QCOM_EXT_HOST_PTR_IOCOHERENT_EXTENSION_NAME "cl_qcom_ext_host_ptr_iocoherent"
     * }
     */
    public static MemorySegment CL_QCOM_EXT_HOST_PTR_IOCOHERENT_EXTENSION_NAME() {
        return constants$262.const$1;
    }
    /**
     * {@snippet :
     * #define CL_QCOM_ION_HOST_PTR_EXTENSION_NAME "cl_qcom_ion_host_ptr"
     * }
     */
    public static MemorySegment CL_QCOM_ION_HOST_PTR_EXTENSION_NAME() {
        return constants$262.const$2;
    }
    /**
     * {@snippet :
     * #define CL_QCOM_ANDROID_NATIVE_BUFFER_HOST_PTR_EXTENSION_NAME "cl_qcom_android_native_buffer_host_ptr"
     * }
     */
    public static MemorySegment CL_QCOM_ANDROID_NATIVE_BUFFER_HOST_PTR_EXTENSION_NAME() {
        return constants$262.const$3;
    }
    /**
     * {@snippet :
     * #define CL_IMG_YUV_IMAGE_EXTENSION_NAME "cl_img_yuv_image"
     * }
     */
    public static MemorySegment CL_IMG_YUV_IMAGE_EXTENSION_NAME() {
        return constants$262.const$4;
    }
    /**
     * {@snippet :
     * #define CL_IMG_CACHED_ALLOCATIONS_EXTENSION_NAME "cl_img_cached_allocations"
     * }
     */
    public static MemorySegment CL_IMG_CACHED_ALLOCATIONS_EXTENSION_NAME() {
        return constants$262.const$5;
    }
    /**
     * {@snippet :
     * #define CL_MEM_USE_UNCACHED_CPU_MEMORY_IMG 67108864
     * }
     */
    public static int CL_MEM_USE_UNCACHED_CPU_MEMORY_IMG() {
        return (int)67108864L;
    }
    /**
     * {@snippet :
     * #define CL_MEM_USE_CACHED_CPU_MEMORY_IMG 134217728
     * }
     */
    public static int CL_MEM_USE_CACHED_CPU_MEMORY_IMG() {
        return (int)134217728L;
    }
    /**
     * {@snippet :
     * #define CL_IMG_USE_GRALLOC_PTR_EXTENSION_NAME "cl_img_use_gralloc_ptr"
     * }
     */
    public static MemorySegment CL_IMG_USE_GRALLOC_PTR_EXTENSION_NAME() {
        return constants$263.const$0;
    }
    /**
     * {@snippet :
     * #define CL_MEM_USE_GRALLOC_PTR_IMG 268435456
     * }
     */
    public static int CL_MEM_USE_GRALLOC_PTR_IMG() {
        return (int)268435456L;
    }
    /**
     * {@snippet :
     * #define CL_IMG_GENERATE_MIPMAP_EXTENSION_NAME "cl_img_generate_mipmap"
     * }
     */
    public static MemorySegment CL_IMG_GENERATE_MIPMAP_EXTENSION_NAME() {
        return constants$263.const$1;
    }
    /**
     * {@snippet :
     * #define CL_IMG_MEM_PROPERTIES_EXTENSION_NAME "cl_img_mem_properties"
     * }
     */
    public static MemorySegment CL_IMG_MEM_PROPERTIES_EXTENSION_NAME() {
        return constants$263.const$2;
    }
    /**
     * {@snippet :
     * #define CL_MEM_ALLOC_RELAX_REQUIREMENTS_IMG 1
     * }
     */
    public static int CL_MEM_ALLOC_RELAX_REQUIREMENTS_IMG() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_KHR_SUBGROUPS_EXTENSION_NAME "cl_khr_subgroups"
     * }
     */
    public static MemorySegment CL_KHR_SUBGROUPS_EXTENSION_NAME() {
        return constants$263.const$3;
    }
    /**
     * {@snippet :
     * #define CL_KHR_MIPMAP_IMAGE_EXTENSION_NAME "cl_khr_mipmap_image"
     * }
     */
    public static MemorySegment CL_KHR_MIPMAP_IMAGE_EXTENSION_NAME() {
        return constants$263.const$4;
    }
    /**
     * {@snippet :
     * #define CL_KHR_PRIORITY_HINTS_EXTENSION_NAME "cl_khr_priority_hints"
     * }
     */
    public static MemorySegment CL_KHR_PRIORITY_HINTS_EXTENSION_NAME() {
        return constants$263.const$5;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_PRIORITY_HIGH_KHR 1
     * }
     */
    public static int CL_QUEUE_PRIORITY_HIGH_KHR() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_PRIORITY_MED_KHR 2
     * }
     */
    public static int CL_QUEUE_PRIORITY_MED_KHR() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_PRIORITY_LOW_KHR 4
     * }
     */
    public static int CL_QUEUE_PRIORITY_LOW_KHR() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_KHR_THROTTLE_HINTS_EXTENSION_NAME "cl_khr_throttle_hints"
     * }
     */
    public static MemorySegment CL_KHR_THROTTLE_HINTS_EXTENSION_NAME() {
        return constants$264.const$0;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_THROTTLE_HIGH_KHR 1
     * }
     */
    public static int CL_QUEUE_THROTTLE_HIGH_KHR() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_THROTTLE_MED_KHR 2
     * }
     */
    public static int CL_QUEUE_THROTTLE_MED_KHR() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_THROTTLE_LOW_KHR 4
     * }
     */
    public static int CL_QUEUE_THROTTLE_LOW_KHR() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_KHR_SUBGROUP_NAMED_BARRIER_EXTENSION_NAME "cl_khr_subgroup_named_barrier"
     * }
     */
    public static MemorySegment CL_KHR_SUBGROUP_NAMED_BARRIER_EXTENSION_NAME() {
        return constants$264.const$1;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTENDED_VERSIONING_EXTENSION_NAME "cl_khr_extended_versioning"
     * }
     */
    public static MemorySegment CL_KHR_EXTENDED_VERSIONING_EXTENSION_NAME() {
        return constants$264.const$2;
    }
    /**
     * {@snippet :
     * #define CL_VERSION_MAJOR_MASK_KHR 1023
     * }
     */
    public static int CL_VERSION_MAJOR_MASK_KHR() {
        return (int)1023L;
    }
    /**
     * {@snippet :
     * #define CL_VERSION_MINOR_MASK_KHR 1023
     * }
     */
    public static int CL_VERSION_MINOR_MASK_KHR() {
        return (int)1023L;
    }
    /**
     * {@snippet :
     * #define CL_VERSION_PATCH_MASK_KHR 4095
     * }
     */
    public static int CL_VERSION_PATCH_MASK_KHR() {
        return (int)4095L;
    }
    /**
     * {@snippet :
     * #define CL_KHR_DEVICE_UUID_EXTENSION_NAME "cl_khr_device_uuid"
     * }
     */
    public static MemorySegment CL_KHR_DEVICE_UUID_EXTENSION_NAME() {
        return constants$264.const$3;
    }
    /**
     * {@snippet :
     * #define CL_KHR_PCI_BUS_INFO_EXTENSION_NAME "cl_khr_pci_bus_info"
     * }
     */
    public static MemorySegment CL_KHR_PCI_BUS_INFO_EXTENSION_NAME() {
        return constants$264.const$4;
    }
    /**
     * {@snippet :
     * #define CL_KHR_SUGGESTED_LOCAL_WORK_SIZE_EXTENSION_NAME "cl_khr_suggested_local_work_size"
     * }
     */
    public static MemorySegment CL_KHR_SUGGESTED_LOCAL_WORK_SIZE_EXTENSION_NAME() {
        return constants$264.const$5;
    }
    /**
     * {@snippet :
     * #define CL_KHR_INTEGER_DOT_PRODUCT_EXTENSION_NAME "cl_khr_integer_dot_product"
     * }
     */
    public static MemorySegment CL_KHR_INTEGER_DOT_PRODUCT_EXTENSION_NAME() {
        return constants$265.const$0;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_PACKED_KHR 1
     * }
     */
    public static int CL_DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_PACKED_KHR() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_KHR 2
     * }
     */
    public static int CL_DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_KHR() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_MEMORY_EXTENSION_NAME "cl_khr_external_memory"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_MEMORY_EXTENSION_NAME() {
        return constants$265.const$1;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME "cl_khr_external_memory_dma_buf"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME() {
        return constants$265.const$2;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_MEMORY_DX_EXTENSION_NAME "cl_khr_external_memory_dx"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_MEMORY_DX_EXTENSION_NAME() {
        return constants$265.const$3;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_MEMORY_OPAQUE_FD_EXTENSION_NAME "cl_khr_external_memory_opaque_fd"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_MEMORY_OPAQUE_FD_EXTENSION_NAME() {
        return constants$265.const$4;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME "cl_khr_external_memory_win32"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME() {
        return constants$265.const$5;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME "cl_khr_external_semaphore"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME() {
        return constants$266.const$0;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_SEMAPHORE_DX_FENCE_EXTENSION_NAME "cl_khr_external_semaphore_dx_fence"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_SEMAPHORE_DX_FENCE_EXTENSION_NAME() {
        return constants$266.const$1;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_SEMAPHORE_OPAQUE_FD_EXTENSION_NAME "cl_khr_external_semaphore_opaque_fd"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_SEMAPHORE_OPAQUE_FD_EXTENSION_NAME() {
        return constants$266.const$2;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_SEMAPHORE_SYNC_FD_EXTENSION_NAME "cl_khr_external_semaphore_sync_fd"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_SEMAPHORE_SYNC_FD_EXTENSION_NAME() {
        return constants$266.const$3;
    }
    /**
     * {@snippet :
     * #define CL_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME "cl_khr_external_semaphore_win32"
     * }
     */
    public static MemorySegment CL_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME() {
        return constants$266.const$4;
    }
    /**
     * {@snippet :
     * #define CL_KHR_SEMAPHORE_EXTENSION_NAME "cl_khr_semaphore"
     * }
     */
    public static MemorySegment CL_KHR_SEMAPHORE_EXTENSION_NAME() {
        return constants$266.const$5;
    }
    /**
     * {@snippet :
     * #define CL_INVALID_SEMAPHORE_KHR -1142
     * }
     */
    public static int CL_INVALID_SEMAPHORE_KHR() {
        return (int)-1142L;
    }
    /**
     * {@snippet :
     * #define CL_ARM_IMPORT_MEMORY_EXTENSION_NAME "cl_arm_import_memory"
     * }
     */
    public static MemorySegment CL_ARM_IMPORT_MEMORY_EXTENSION_NAME() {
        return constants$267.const$0;
    }
    /**
     * {@snippet :
     * #define CL_IMPORT_MEMORY_WHOLE_ALLOCATION_ARM -1
     * }
     */
    public static long CL_IMPORT_MEMORY_WHOLE_ALLOCATION_ARM() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define CL_ARM_SHARED_VIRTUAL_MEMORY_EXTENSION_NAME "cl_arm_shared_virtual_memory"
     * }
     */
    public static MemorySegment CL_ARM_SHARED_VIRTUAL_MEMORY_EXTENSION_NAME() {
        return constants$267.const$1;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SVM_COARSE_GRAIN_BUFFER_ARM 1
     * }
     */
    public static int CL_DEVICE_SVM_COARSE_GRAIN_BUFFER_ARM() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SVM_FINE_GRAIN_BUFFER_ARM 2
     * }
     */
    public static int CL_DEVICE_SVM_FINE_GRAIN_BUFFER_ARM() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SVM_FINE_GRAIN_SYSTEM_ARM 4
     * }
     */
    public static int CL_DEVICE_SVM_FINE_GRAIN_SYSTEM_ARM() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SVM_ATOMICS_ARM 8
     * }
     */
    public static int CL_DEVICE_SVM_ATOMICS_ARM() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define CL_MEM_SVM_FINE_GRAIN_BUFFER_ARM 1024
     * }
     */
    public static int CL_MEM_SVM_FINE_GRAIN_BUFFER_ARM() {
        return (int)1024L;
    }
    /**
     * {@snippet :
     * #define CL_MEM_SVM_ATOMICS_ARM 2048
     * }
     */
    public static int CL_MEM_SVM_ATOMICS_ARM() {
        return (int)2048L;
    }
    /**
     * {@snippet :
     * #define CL_ARM_GET_CORE_ID_EXTENSION_NAME "cl_arm_get_core_id"
     * }
     */
    public static MemorySegment CL_ARM_GET_CORE_ID_EXTENSION_NAME() {
        return constants$267.const$2;
    }
    /**
     * {@snippet :
     * #define CL_ARM_JOB_SLOT_SELECTION_EXTENSION_NAME "cl_arm_job_slot_selection"
     * }
     */
    public static MemorySegment CL_ARM_JOB_SLOT_SELECTION_EXTENSION_NAME() {
        return constants$267.const$3;
    }
    /**
     * {@snippet :
     * #define CL_ARM_SCHEDULING_CONTROLS_EXTENSION_NAME "cl_arm_scheduling_controls"
     * }
     */
    public static MemorySegment CL_ARM_SCHEDULING_CONTROLS_EXTENSION_NAME() {
        return constants$267.const$4;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SCHEDULING_KERNEL_BATCHING_ARM 1
     * }
     */
    public static int CL_DEVICE_SCHEDULING_KERNEL_BATCHING_ARM() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_ARM 2
     * }
     */
    public static int CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_ARM() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_MODIFIER_ARM 4
     * }
     */
    public static int CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_MODIFIER_ARM() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SCHEDULING_DEFERRED_FLUSH_ARM 8
     * }
     */
    public static int CL_DEVICE_SCHEDULING_DEFERRED_FLUSH_ARM() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SCHEDULING_REGISTER_ALLOCATION_ARM 16
     * }
     */
    public static int CL_DEVICE_SCHEDULING_REGISTER_ALLOCATION_ARM() {
        return (int)16L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SCHEDULING_WARP_THROTTLING_ARM 32
     * }
     */
    public static int CL_DEVICE_SCHEDULING_WARP_THROTTLING_ARM() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_SCHEDULING_COMPUTE_UNIT_BATCH_QUEUE_SIZE_ARM 64
     * }
     */
    public static int CL_DEVICE_SCHEDULING_COMPUTE_UNIT_BATCH_QUEUE_SIZE_ARM() {
        return (int)64L;
    }
    /**
     * {@snippet :
     * #define CL_ARM_CONTROLLED_KERNEL_TERMINATION_EXTENSION_NAME "cl_arm_controlled_kernel_termination"
     * }
     */
    public static MemorySegment CL_ARM_CONTROLLED_KERNEL_TERMINATION_EXTENSION_NAME() {
        return constants$267.const$5;
    }
    /**
     * {@snippet :
     * #define CL_COMMAND_TERMINATED_ITSELF_WITH_FAILURE_ARM -1108
     * }
     */
    public static int CL_COMMAND_TERMINATED_ITSELF_WITH_FAILURE_ARM() {
        return (int)-1108L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_CONTROLLED_TERMINATION_SUCCESS_ARM 1
     * }
     */
    public static int CL_DEVICE_CONTROLLED_TERMINATION_SUCCESS_ARM() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_CONTROLLED_TERMINATION_FAILURE_ARM 2
     * }
     */
    public static int CL_DEVICE_CONTROLLED_TERMINATION_FAILURE_ARM() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_CONTROLLED_TERMINATION_QUERY_ARM 4
     * }
     */
    public static int CL_DEVICE_CONTROLLED_TERMINATION_QUERY_ARM() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_ARM_PROTECTED_MEMORY_ALLOCATION_EXTENSION_NAME "cl_arm_protected_memory_allocation"
     * }
     */
    public static MemorySegment CL_ARM_PROTECTED_MEMORY_ALLOCATION_EXTENSION_NAME() {
        return constants$268.const$0;
    }
    /**
     * {@snippet :
     * #define CL_MEM_PROTECTED_ALLOC_ARM 68719476736
     * }
     */
    public static long CL_MEM_PROTECTED_ALLOC_ARM() {
        return 68719476736L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_EXEC_BY_LOCAL_THREAD_EXTENSION_NAME "cl_intel_exec_by_local_thread"
     * }
     */
    public static MemorySegment CL_INTEL_EXEC_BY_LOCAL_THREAD_EXTENSION_NAME() {
        return constants$268.const$1;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_THREAD_LOCAL_EXEC_ENABLE_INTEL 2147483648
     * }
     */
    public static long CL_QUEUE_THREAD_LOCAL_EXEC_ENABLE_INTEL() {
        return 2147483648L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_DEVICE_ATTRIBUTE_QUERY_EXTENSION_NAME "cl_intel_device_attribute_query"
     * }
     */
    public static MemorySegment CL_INTEL_DEVICE_ATTRIBUTE_QUERY_EXTENSION_NAME() {
        return constants$268.const$2;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_FEATURE_FLAG_DP4A_INTEL 1
     * }
     */
    public static int CL_DEVICE_FEATURE_FLAG_DP4A_INTEL() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_FEATURE_FLAG_DPAS_INTEL 2
     * }
     */
    public static int CL_DEVICE_FEATURE_FLAG_DPAS_INTEL() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_DEVICE_PARTITION_BY_NAMES_EXTENSION_NAME "cl_intel_device_partition_by_names"
     * }
     */
    public static MemorySegment CL_INTEL_DEVICE_PARTITION_BY_NAMES_EXTENSION_NAME() {
        return constants$268.const$3;
    }
    /**
     * {@snippet :
     * #define CL_PARTITION_BY_NAMES_LIST_END_INTEL -1
     * }
     */
    public static int CL_PARTITION_BY_NAMES_LIST_END_INTEL() {
        return (int)-1L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_ACCELERATOR_EXTENSION_NAME "cl_intel_accelerator"
     * }
     */
    public static MemorySegment CL_INTEL_ACCELERATOR_EXTENSION_NAME() {
        return constants$268.const$4;
    }
    /**
     * {@snippet :
     * #define CL_INVALID_ACCELERATOR_INTEL -1094
     * }
     */
    public static int CL_INVALID_ACCELERATOR_INTEL() {
        return (int)-1094L;
    }
    /**
     * {@snippet :
     * #define CL_INVALID_ACCELERATOR_TYPE_INTEL -1095
     * }
     */
    public static int CL_INVALID_ACCELERATOR_TYPE_INTEL() {
        return (int)-1095L;
    }
    /**
     * {@snippet :
     * #define CL_INVALID_ACCELERATOR_DESCRIPTOR_INTEL -1096
     * }
     */
    public static int CL_INVALID_ACCELERATOR_DESCRIPTOR_INTEL() {
        return (int)-1096L;
    }
    /**
     * {@snippet :
     * #define CL_ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL -1097
     * }
     */
    public static int CL_ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL() {
        return (int)-1097L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_MOTION_ESTIMATION_EXTENSION_NAME "cl_intel_motion_estimation"
     * }
     */
    public static MemorySegment CL_INTEL_MOTION_ESTIMATION_EXTENSION_NAME() {
        return constants$268.const$5;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_ADVANCED_MOTION_ESTIMATION_EXTENSION_NAME "cl_intel_advanced_motion_estimation"
     * }
     */
    public static MemorySegment CL_INTEL_ADVANCED_MOTION_ESTIMATION_EXTENSION_NAME() {
        return constants$269.const$0;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_SIMULTANEOUS_SHARING_EXTENSION_NAME "cl_intel_simultaneous_sharing"
     * }
     */
    public static MemorySegment CL_INTEL_SIMULTANEOUS_SHARING_EXTENSION_NAME() {
        return constants$269.const$1;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_EGL_IMAGE_YUV_EXTENSION_NAME "cl_intel_egl_image_yuv"
     * }
     */
    public static MemorySegment CL_INTEL_EGL_IMAGE_YUV_EXTENSION_NAME() {
        return constants$269.const$2;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_PACKED_YUV_EXTENSION_NAME "cl_intel_packed_yuv"
     * }
     */
    public static MemorySegment CL_INTEL_PACKED_YUV_EXTENSION_NAME() {
        return constants$269.const$3;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_REQUIRED_SUBGROUP_SIZE_EXTENSION_NAME "cl_intel_required_subgroup_size"
     * }
     */
    public static MemorySegment CL_INTEL_REQUIRED_SUBGROUP_SIZE_EXTENSION_NAME() {
        return constants$269.const$4;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_DRIVER_DIAGNOSTICS_EXTENSION_NAME "cl_intel_driver_diagnostics"
     * }
     */
    public static MemorySegment CL_INTEL_DRIVER_DIAGNOSTICS_EXTENSION_NAME() {
        return constants$269.const$5;
    }
    /**
     * {@snippet :
     * #define CL_CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL 1
     * }
     */
    public static int CL_CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL 2
     * }
     */
    public static int CL_CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL 4
     * }
     */
    public static int CL_CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_PLANAR_YUV_EXTENSION_NAME "cl_intel_planar_yuv"
     * }
     */
    public static MemorySegment CL_INTEL_PLANAR_YUV_EXTENSION_NAME() {
        return constants$270.const$0;
    }
    /**
     * {@snippet :
     * #define CL_MEM_NO_ACCESS_INTEL 16777216
     * }
     */
    public static int CL_MEM_NO_ACCESS_INTEL() {
        return (int)16777216L;
    }
    /**
     * {@snippet :
     * #define CL_MEM_ACCESS_FLAGS_UNRESTRICTED_INTEL 33554432
     * }
     */
    public static int CL_MEM_ACCESS_FLAGS_UNRESTRICTED_INTEL() {
        return (int)33554432L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_DEVICE_SIDE_AVC_MOTION_ESTIMATION_EXTENSION_NAME "cl_intel_device_side_avc_motion_estimation"
     * }
     */
    public static MemorySegment CL_INTEL_DEVICE_SIDE_AVC_MOTION_ESTIMATION_EXTENSION_NAME() {
        return constants$270.const$1;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_16x16_FORWARD_ENABLE_INTEL 16777216
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_16x16_FORWARD_ENABLE_INTEL() {
        return (int)16777216L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_16x16_BACKWARD_ENABLE_INTEL 33554432
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_16x16_BACKWARD_ENABLE_INTEL() {
        return (int)33554432L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_16x16_DUAL_ENABLE_INTEL 50331648
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_16x16_DUAL_ENABLE_INTEL() {
        return (int)50331648L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_FORWARD_ENABLE_INTEL 1426063360
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_FORWARD_ENABLE_INTEL() {
        return (int)1426063360L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_BACKWARD_ENABLE_INTEL -1442840576
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_BACKWARD_ENABLE_INTEL() {
        return (int)-1442840576L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_DUAL_ENABLE_INTEL -16777216
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_DUAL_ENABLE_INTEL() {
        return (int)-16777216L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_0_FORWARD_ENABLE_INTEL 16777216
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_0_FORWARD_ENABLE_INTEL() {
        return (int)16777216L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_0_BACKWARD_ENABLE_INTEL 33554432
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_0_BACKWARD_ENABLE_INTEL() {
        return (int)33554432L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_1_FORWARD_ENABLE_INTEL 67108864
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_1_FORWARD_ENABLE_INTEL() {
        return (int)67108864L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_1_BACKWARD_ENABLE_INTEL 134217728
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_1_BACKWARD_ENABLE_INTEL() {
        return (int)134217728L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_2_FORWARD_ENABLE_INTEL 268435456
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_2_FORWARD_ENABLE_INTEL() {
        return (int)268435456L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_2_BACKWARD_ENABLE_INTEL 536870912
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_2_BACKWARD_ENABLE_INTEL() {
        return (int)536870912L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_3_FORWARD_ENABLE_INTEL 1073741824
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_3_FORWARD_ENABLE_INTEL() {
        return (int)1073741824L;
    }
    /**
     * {@snippet :
     * #define CL_AVC_ME_SKIP_BLOCK_8x8_3_BACKWARD_ENABLE_INTEL -2147483648
     * }
     */
    public static int CL_AVC_ME_SKIP_BLOCK_8x8_3_BACKWARD_ENABLE_INTEL() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_UNIFIED_SHARED_MEMORY_EXTENSION_NAME "cl_intel_unified_shared_memory"
     * }
     */
    public static MemorySegment CL_INTEL_UNIFIED_SHARED_MEMORY_EXTENSION_NAME() {
        return constants$270.const$2;
    }
    /**
     * {@snippet :
     * #define CL_UNIFIED_SHARED_MEMORY_ACCESS_INTEL 1
     * }
     */
    public static int CL_UNIFIED_SHARED_MEMORY_ACCESS_INTEL() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_UNIFIED_SHARED_MEMORY_ATOMIC_ACCESS_INTEL 2
     * }
     */
    public static int CL_UNIFIED_SHARED_MEMORY_ATOMIC_ACCESS_INTEL() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_UNIFIED_SHARED_MEMORY_CONCURRENT_ACCESS_INTEL 4
     * }
     */
    public static int CL_UNIFIED_SHARED_MEMORY_CONCURRENT_ACCESS_INTEL() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_UNIFIED_SHARED_MEMORY_CONCURRENT_ATOMIC_ACCESS_INTEL 8
     * }
     */
    public static int CL_UNIFIED_SHARED_MEMORY_CONCURRENT_ATOMIC_ACCESS_INTEL() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define CL_MEM_ALLOC_WRITE_COMBINED_INTEL 1
     * }
     */
    public static int CL_MEM_ALLOC_WRITE_COMBINED_INTEL() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL 2
     * }
     */
    public static int CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL 4
     * }
     */
    public static int CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_MEM_ALLOC_BUFFER_LOCATION_EXTENSION_NAME "cl_intel_mem_alloc_buffer_location"
     * }
     */
    public static MemorySegment CL_INTEL_MEM_ALLOC_BUFFER_LOCATION_EXTENSION_NAME() {
        return constants$270.const$3;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_CREATE_BUFFER_WITH_PROPERTIES_EXTENSION_NAME "cl_intel_create_buffer_with_properties"
     * }
     */
    public static MemorySegment CL_INTEL_CREATE_BUFFER_WITH_PROPERTIES_EXTENSION_NAME() {
        return constants$270.const$4;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_PROGRAM_SCOPE_HOST_PIPE_EXTENSION_NAME "cl_intel_program_scope_host_pipe"
     * }
     */
    public static MemorySegment CL_INTEL_PROGRAM_SCOPE_HOST_PIPE_EXTENSION_NAME() {
        return constants$270.const$5;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_MEM_CHANNEL_PROPERTY_EXTENSION_NAME "cl_intel_mem_channel_property"
     * }
     */
    public static MemorySegment CL_INTEL_MEM_CHANNEL_PROPERTY_EXTENSION_NAME() {
        return constants$271.const$0;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_MEM_FORCE_HOST_MEMORY_EXTENSION_NAME "cl_intel_mem_force_host_memory"
     * }
     */
    public static MemorySegment CL_INTEL_MEM_FORCE_HOST_MEMORY_EXTENSION_NAME() {
        return constants$271.const$1;
    }
    /**
     * {@snippet :
     * #define CL_MEM_FORCE_HOST_MEMORY_INTEL 1048576
     * }
     */
    public static int CL_MEM_FORCE_HOST_MEMORY_INTEL() {
        return (int)1048576L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_COMMAND_QUEUE_FAMILIES_EXTENSION_NAME "cl_intel_command_queue_families"
     * }
     */
    public static MemorySegment CL_INTEL_COMMAND_QUEUE_FAMILIES_EXTENSION_NAME() {
        return constants$271.const$2;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_CREATE_SINGLE_QUEUE_EVENTS_INTEL 1
     * }
     */
    public static int CL_QUEUE_CAPABILITY_CREATE_SINGLE_QUEUE_EVENTS_INTEL() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_CREATE_CROSS_QUEUE_EVENTS_INTEL 2
     * }
     */
    public static int CL_QUEUE_CAPABILITY_CREATE_CROSS_QUEUE_EVENTS_INTEL() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_SINGLE_QUEUE_EVENT_WAIT_LIST_INTEL 4
     * }
     */
    public static int CL_QUEUE_CAPABILITY_SINGLE_QUEUE_EVENT_WAIT_LIST_INTEL() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_CROSS_QUEUE_EVENT_WAIT_LIST_INTEL 8
     * }
     */
    public static int CL_QUEUE_CAPABILITY_CROSS_QUEUE_EVENT_WAIT_LIST_INTEL() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_INTEL 256
     * }
     */
    public static int CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_INTEL() {
        return (int)256L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_RECT_INTEL 512
     * }
     */
    public static int CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_RECT_INTEL() {
        return (int)512L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_MAP_BUFFER_INTEL 1024
     * }
     */
    public static int CL_QUEUE_CAPABILITY_MAP_BUFFER_INTEL() {
        return (int)1024L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_FILL_BUFFER_INTEL 2048
     * }
     */
    public static int CL_QUEUE_CAPABILITY_FILL_BUFFER_INTEL() {
        return (int)2048L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_TRANSFER_IMAGE_INTEL 4096
     * }
     */
    public static int CL_QUEUE_CAPABILITY_TRANSFER_IMAGE_INTEL() {
        return (int)4096L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_MAP_IMAGE_INTEL 8192
     * }
     */
    public static int CL_QUEUE_CAPABILITY_MAP_IMAGE_INTEL() {
        return (int)8192L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_FILL_IMAGE_INTEL 16384
     * }
     */
    public static int CL_QUEUE_CAPABILITY_FILL_IMAGE_INTEL() {
        return (int)16384L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_IMAGE_INTEL 32768
     * }
     */
    public static int CL_QUEUE_CAPABILITY_TRANSFER_BUFFER_IMAGE_INTEL() {
        return (int)32768L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_TRANSFER_IMAGE_BUFFER_INTEL 65536
     * }
     */
    public static int CL_QUEUE_CAPABILITY_TRANSFER_IMAGE_BUFFER_INTEL() {
        return (int)65536L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_MARKER_INTEL 16777216
     * }
     */
    public static int CL_QUEUE_CAPABILITY_MARKER_INTEL() {
        return (int)16777216L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_BARRIER_INTEL 33554432
     * }
     */
    public static int CL_QUEUE_CAPABILITY_BARRIER_INTEL() {
        return (int)33554432L;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_CAPABILITY_KERNEL_INTEL 67108864
     * }
     */
    public static int CL_QUEUE_CAPABILITY_KERNEL_INTEL() {
        return (int)67108864L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_QUEUE_NO_SYNC_OPERATIONS_EXTENSION_NAME "cl_intel_queue_no_sync_operations"
     * }
     */
    public static MemorySegment CL_INTEL_QUEUE_NO_SYNC_OPERATIONS_EXTENSION_NAME() {
        return constants$271.const$3;
    }
    /**
     * {@snippet :
     * #define CL_QUEUE_NO_SYNC_OPERATIONS_INTEL 536870912
     * }
     */
    public static int CL_QUEUE_NO_SYNC_OPERATIONS_INTEL() {
        return (int)536870912L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_SHARING_FORMAT_QUERY_EXTENSION_NAME "cl_intel_sharing_format_query"
     * }
     */
    public static MemorySegment CL_INTEL_SHARING_FORMAT_QUERY_EXTENSION_NAME() {
        return constants$271.const$4;
    }
    /**
     * {@snippet :
     * #define CL_EXT_IMAGE_REQUIREMENTS_INFO_EXTENSION_NAME "cl_ext_image_requirements_info"
     * }
     */
    public static MemorySegment CL_EXT_IMAGE_REQUIREMENTS_INFO_EXTENSION_NAME() {
        return constants$271.const$5;
    }
    /**
     * {@snippet :
     * #define CL_EXT_IMAGE_FROM_BUFFER_EXTENSION_NAME "cl_ext_image_from_buffer"
     * }
     */
    public static MemorySegment CL_EXT_IMAGE_FROM_BUFFER_EXTENSION_NAME() {
        return constants$272.const$0;
    }
    /**
     * {@snippet :
     * #define CL_LOADER_INFO_EXTENSION_NAME "cl_loader_info"
     * }
     */
    public static MemorySegment CL_LOADER_INFO_EXTENSION_NAME() {
        return constants$272.const$1;
    }
    /**
     * {@snippet :
     * #define CL_KHR_DEPTH_IMAGES_EXTENSION_NAME "cl_khr_depth_images"
     * }
     */
    public static MemorySegment CL_KHR_DEPTH_IMAGES_EXTENSION_NAME() {
        return constants$272.const$2;
    }
    /**
     * {@snippet :
     * #define CL_EXT_FLOAT_ATOMICS_EXTENSION_NAME "cl_ext_float_atomics"
     * }
     */
    public static MemorySegment CL_EXT_FLOAT_ATOMICS_EXTENSION_NAME() {
        return constants$272.const$3;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_GLOBAL_FP_ATOMIC_LOAD_STORE_EXT 1
     * }
     */
    public static int CL_DEVICE_GLOBAL_FP_ATOMIC_LOAD_STORE_EXT() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_GLOBAL_FP_ATOMIC_ADD_EXT 2
     * }
     */
    public static int CL_DEVICE_GLOBAL_FP_ATOMIC_ADD_EXT() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_GLOBAL_FP_ATOMIC_MIN_MAX_EXT 4
     * }
     */
    public static int CL_DEVICE_GLOBAL_FP_ATOMIC_MIN_MAX_EXT() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_LOCAL_FP_ATOMIC_LOAD_STORE_EXT 65536
     * }
     */
    public static int CL_DEVICE_LOCAL_FP_ATOMIC_LOAD_STORE_EXT() {
        return (int)65536L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_LOCAL_FP_ATOMIC_ADD_EXT 131072
     * }
     */
    public static int CL_DEVICE_LOCAL_FP_ATOMIC_ADD_EXT() {
        return (int)131072L;
    }
    /**
     * {@snippet :
     * #define CL_DEVICE_LOCAL_FP_ATOMIC_MIN_MAX_EXT 262144
     * }
     */
    public static int CL_DEVICE_LOCAL_FP_ATOMIC_MIN_MAX_EXT() {
        return (int)262144L;
    }
    /**
     * {@snippet :
     * #define CL_INTEL_CREATE_MEM_OBJECT_PROPERTIES_EXTENSION_NAME "cl_intel_create_mem_object_properties"
     * }
     */
    public static MemorySegment CL_INTEL_CREATE_MEM_OBJECT_PROPERTIES_EXTENSION_NAME() {
        return constants$272.const$4;
    }
    /**
     * {@snippet :
     * #define CL_POCL_CONTENT_SIZE_EXTENSION_NAME "cl_pocl_content_size"
     * }
     */
    public static MemorySegment CL_POCL_CONTENT_SIZE_EXTENSION_NAME() {
        return constants$272.const$5;
    }
}


