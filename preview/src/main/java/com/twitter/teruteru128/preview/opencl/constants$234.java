// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$234 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$234() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "clGetKernelSubGroupInfoKHR",
        constants$192.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("version"),
        MemoryLayout.sequenceLayout(64, JAVA_BYTE).withName("name")
    ).withName("_cl_name_version_khr");
    static final VarHandle const$2 = constants$234.const$1.varHandle(MemoryLayout.PathElement.groupElement("version"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("pci_domain"),
        JAVA_INT.withName("pci_bus"),
        JAVA_INT.withName("pci_device"),
        JAVA_INT.withName("pci_function")
    ).withName("_cl_device_pci_bus_info_khr");
    static final VarHandle const$4 = constants$234.const$3.varHandle(MemoryLayout.PathElement.groupElement("pci_domain"));
    static final VarHandle const$5 = constants$234.const$3.varHandle(MemoryLayout.PathElement.groupElement("pci_bus"));
}


