package com.github.teruteru128.foreign;

import static com.github.teruteru128.foreign.opencl.opencl_h.clGetPlatformIDs;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.CL_DEVICE_TYPE_ALL;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clBuildProgram;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateCommandQueueWithProperties;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateContext;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateKernel;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clCreateProgramWithSource;
import static com.github.teruteru128.foreign.opencl.opencl_h_1.clGetDeviceIDs;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

import com.github.teruteru128.foreign.opencl.opencl_h;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.Map;
import java.util.Objects;
import org.junit.jupiter.api.BeforeAll;

public class RIPEMD160Test {

  static final Arena LIBRARY_ARENA = Arena.ofAuto();

  @BeforeAll
  static void initClass() throws IOException, URISyntaxException {
    int ret;
    var retPtr = LIBRARY_ARENA.allocate(JAVA_INT);
    var numPlatformPtr = LIBRARY_ARENA.allocate(JAVA_INT);
    if ((ret = clGetPlatformIDs(0, NULL, numPlatformPtr)) != 0) {
      throw new RuntimeException();
    }
    var numEntries = numPlatformPtr.get(JAVA_INT, 0);
    var platformIds = LIBRARY_ARENA.allocate(ADDRESS, numEntries);

    if ((ret = clGetPlatformIDs(numEntries, platformIds, NULL)) != 0) {
      throw new RuntimeException();
    }
    var deviceNum = LIBRARY_ARENA.allocate(JAVA_INT);
    var platform = platformIds.get(ADDRESS, 0);
    if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), 0, NULL, deviceNum)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    var numDevices = deviceNum.get(JAVA_INT, 0);
    var deviceIds = LIBRARY_ARENA.allocate(ADDRESS, numDevices);
    if ((ret = clGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL(), numDevices, deviceIds, NULL)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    var context = clCreateContext(NULL, numDevices, deviceIds, NULL, NULL, retPtr).reinterpret(
        LIBRARY_ARENA, opencl_h::clReleaseCommandQueue);
    if (retPtr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException();
    }
    var commandQueue = clCreateCommandQueueWithProperties(context, deviceIds.get(ADDRESS, 0), NULL,
        retPtr).reinterpret(LIBRARY_ARENA, opencl_h::clReleaseCommandQueue);
    if (retPtr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException();
    }
    String s;
    var uri = Objects.requireNonNull(RIPEMD160Test.class.getResource("ripemd160.cl")).toURI();
    try (var jarFS = FileSystems.newFileSystem(uri, Map.of("create", "true"))) {
      s = Files.readString(jarFS.provider().getPath(uri));
    }
    var sourcePtr = LIBRARY_ARENA.allocateFrom(s);
    var program = clCreateProgramWithSource(context, 1,
        LIBRARY_ARENA.allocateFrom(ADDRESS, sourcePtr), NULL, retPtr).reinterpret(LIBRARY_ARENA,
        opencl_h::clReleaseProgram);
    if ((ret = retPtr.get(JAVA_INT, 0)) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    if((ret = clBuildProgram(program, numDevices, deviceIds, NULL, NULL, NULL)) != 0){
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
    var kernel = clCreateKernel(program, LIBRARY_ARENA.allocateFrom("func"), retPtr);
    if (retPtr.get(JAVA_INT, 0) != 0) {
      throw new RuntimeException(CLMessage.clGetErrorString(ret));
    }
  }
}
