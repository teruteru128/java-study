// Generated by jextract

package com.github.teruteru128.preview.opencl;

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
 * typedef struct _cl_queue_family_properties_intel {
 *     cl_command_queue_properties properties;
 *     cl_command_queue_capabilities_intel capabilities;
 *     cl_uint count;
 *     char name[64];
 * } cl_queue_family_properties_intel
 * }
 */
public class cl_queue_family_properties_intel extends _cl_queue_family_properties_intel {

    cl_queue_family_properties_intel() {
        // Should not be called directly
    }
}
