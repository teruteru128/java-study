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
 * struct _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION {
 *     DWORD ulFlags;
 *     DWORD ulEncodedAssemblyIdentityLength;
 *     DWORD ulManifestPathType;
 *     DWORD ulManifestPathLength;
 *     LARGE_INTEGER liManifestLastWriteTime;
 *     DWORD ulPolicyPathType;
 *     DWORD ulPolicyPathLength;
 *     LARGE_INTEGER liPolicyLastWriteTime;
 *     DWORD ulMetadataSatelliteRosterIndex;
 *     DWORD ulManifestVersionMajor;
 *     DWORD ulManifestVersionMinor;
 *     DWORD ulPolicyVersionMajor;
 *     DWORD ulPolicyVersionMinor;
 *     DWORD ulAssemblyDirectoryNameLength;
 *     PCWSTR lpAssemblyEncodedAssemblyIdentity;
 *     PCWSTR lpAssemblyManifestPath;
 *     PCWSTR lpAssemblyPolicyPath;
 *     PCWSTR lpAssemblyDirectoryName;
 *     DWORD ulFileCount;
 * }
 * }
 */
public class _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION {

    _ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("ulFlags"),
        Windows_h.C_LONG.withName("ulEncodedAssemblyIdentityLength"),
        Windows_h.C_LONG.withName("ulManifestPathType"),
        Windows_h.C_LONG.withName("ulManifestPathLength"),
        _LARGE_INTEGER.layout().withName("liManifestLastWriteTime"),
        Windows_h.C_LONG.withName("ulPolicyPathType"),
        Windows_h.C_LONG.withName("ulPolicyPathLength"),
        _LARGE_INTEGER.layout().withName("liPolicyLastWriteTime"),
        Windows_h.C_LONG.withName("ulMetadataSatelliteRosterIndex"),
        Windows_h.C_LONG.withName("ulManifestVersionMajor"),
        Windows_h.C_LONG.withName("ulManifestVersionMinor"),
        Windows_h.C_LONG.withName("ulPolicyVersionMajor"),
        Windows_h.C_LONG.withName("ulPolicyVersionMinor"),
        Windows_h.C_LONG.withName("ulAssemblyDirectoryNameLength"),
        Windows_h.C_POINTER.withName("lpAssemblyEncodedAssemblyIdentity"),
        Windows_h.C_POINTER.withName("lpAssemblyManifestPath"),
        Windows_h.C_POINTER.withName("lpAssemblyPolicyPath"),
        Windows_h.C_POINTER.withName("lpAssemblyDirectoryName"),
        Windows_h.C_LONG.withName("ulFileCount"),
        MemoryLayout.paddingLayout(4)
    ).withName("_ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ulFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulFlags
     * }
     */
    public static final OfInt ulFlags$layout() {
        return ulFlags$LAYOUT;
    }

    private static final long ulFlags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulFlags
     * }
     */
    public static final long ulFlags$offset() {
        return ulFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulFlags
     * }
     */
    public static int ulFlags(MemorySegment struct) {
        return struct.get(ulFlags$LAYOUT, ulFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulFlags
     * }
     */
    public static void ulFlags(MemorySegment struct, int fieldValue) {
        struct.set(ulFlags$LAYOUT, ulFlags$OFFSET, fieldValue);
    }

    private static final OfInt ulEncodedAssemblyIdentityLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulEncodedAssemblyIdentityLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulEncodedAssemblyIdentityLength
     * }
     */
    public static final OfInt ulEncodedAssemblyIdentityLength$layout() {
        return ulEncodedAssemblyIdentityLength$LAYOUT;
    }

    private static final long ulEncodedAssemblyIdentityLength$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulEncodedAssemblyIdentityLength
     * }
     */
    public static final long ulEncodedAssemblyIdentityLength$offset() {
        return ulEncodedAssemblyIdentityLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulEncodedAssemblyIdentityLength
     * }
     */
    public static int ulEncodedAssemblyIdentityLength(MemorySegment struct) {
        return struct.get(ulEncodedAssemblyIdentityLength$LAYOUT, ulEncodedAssemblyIdentityLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulEncodedAssemblyIdentityLength
     * }
     */
    public static void ulEncodedAssemblyIdentityLength(MemorySegment struct, int fieldValue) {
        struct.set(ulEncodedAssemblyIdentityLength$LAYOUT, ulEncodedAssemblyIdentityLength$OFFSET, fieldValue);
    }

    private static final OfInt ulManifestPathType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulManifestPathType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulManifestPathType
     * }
     */
    public static final OfInt ulManifestPathType$layout() {
        return ulManifestPathType$LAYOUT;
    }

    private static final long ulManifestPathType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulManifestPathType
     * }
     */
    public static final long ulManifestPathType$offset() {
        return ulManifestPathType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulManifestPathType
     * }
     */
    public static int ulManifestPathType(MemorySegment struct) {
        return struct.get(ulManifestPathType$LAYOUT, ulManifestPathType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulManifestPathType
     * }
     */
    public static void ulManifestPathType(MemorySegment struct, int fieldValue) {
        struct.set(ulManifestPathType$LAYOUT, ulManifestPathType$OFFSET, fieldValue);
    }

    private static final OfInt ulManifestPathLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulManifestPathLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulManifestPathLength
     * }
     */
    public static final OfInt ulManifestPathLength$layout() {
        return ulManifestPathLength$LAYOUT;
    }

    private static final long ulManifestPathLength$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulManifestPathLength
     * }
     */
    public static final long ulManifestPathLength$offset() {
        return ulManifestPathLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulManifestPathLength
     * }
     */
    public static int ulManifestPathLength(MemorySegment struct) {
        return struct.get(ulManifestPathLength$LAYOUT, ulManifestPathLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulManifestPathLength
     * }
     */
    public static void ulManifestPathLength(MemorySegment struct, int fieldValue) {
        struct.set(ulManifestPathLength$LAYOUT, ulManifestPathLength$OFFSET, fieldValue);
    }

    private static final GroupLayout liManifestLastWriteTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("liManifestLastWriteTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER liManifestLastWriteTime
     * }
     */
    public static final GroupLayout liManifestLastWriteTime$layout() {
        return liManifestLastWriteTime$LAYOUT;
    }

    private static final long liManifestLastWriteTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER liManifestLastWriteTime
     * }
     */
    public static final long liManifestLastWriteTime$offset() {
        return liManifestLastWriteTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER liManifestLastWriteTime
     * }
     */
    public static MemorySegment liManifestLastWriteTime(MemorySegment struct) {
        return struct.asSlice(liManifestLastWriteTime$OFFSET, liManifestLastWriteTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER liManifestLastWriteTime
     * }
     */
    public static void liManifestLastWriteTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, liManifestLastWriteTime$OFFSET, liManifestLastWriteTime$LAYOUT.byteSize());
    }

    private static final OfInt ulPolicyPathType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulPolicyPathType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulPolicyPathType
     * }
     */
    public static final OfInt ulPolicyPathType$layout() {
        return ulPolicyPathType$LAYOUT;
    }

    private static final long ulPolicyPathType$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulPolicyPathType
     * }
     */
    public static final long ulPolicyPathType$offset() {
        return ulPolicyPathType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulPolicyPathType
     * }
     */
    public static int ulPolicyPathType(MemorySegment struct) {
        return struct.get(ulPolicyPathType$LAYOUT, ulPolicyPathType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulPolicyPathType
     * }
     */
    public static void ulPolicyPathType(MemorySegment struct, int fieldValue) {
        struct.set(ulPolicyPathType$LAYOUT, ulPolicyPathType$OFFSET, fieldValue);
    }

    private static final OfInt ulPolicyPathLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulPolicyPathLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulPolicyPathLength
     * }
     */
    public static final OfInt ulPolicyPathLength$layout() {
        return ulPolicyPathLength$LAYOUT;
    }

    private static final long ulPolicyPathLength$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulPolicyPathLength
     * }
     */
    public static final long ulPolicyPathLength$offset() {
        return ulPolicyPathLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulPolicyPathLength
     * }
     */
    public static int ulPolicyPathLength(MemorySegment struct) {
        return struct.get(ulPolicyPathLength$LAYOUT, ulPolicyPathLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulPolicyPathLength
     * }
     */
    public static void ulPolicyPathLength(MemorySegment struct, int fieldValue) {
        struct.set(ulPolicyPathLength$LAYOUT, ulPolicyPathLength$OFFSET, fieldValue);
    }

    private static final GroupLayout liPolicyLastWriteTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("liPolicyLastWriteTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER liPolicyLastWriteTime
     * }
     */
    public static final GroupLayout liPolicyLastWriteTime$layout() {
        return liPolicyLastWriteTime$LAYOUT;
    }

    private static final long liPolicyLastWriteTime$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER liPolicyLastWriteTime
     * }
     */
    public static final long liPolicyLastWriteTime$offset() {
        return liPolicyLastWriteTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER liPolicyLastWriteTime
     * }
     */
    public static MemorySegment liPolicyLastWriteTime(MemorySegment struct) {
        return struct.asSlice(liPolicyLastWriteTime$OFFSET, liPolicyLastWriteTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER liPolicyLastWriteTime
     * }
     */
    public static void liPolicyLastWriteTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, liPolicyLastWriteTime$OFFSET, liPolicyLastWriteTime$LAYOUT.byteSize());
    }

    private static final OfInt ulMetadataSatelliteRosterIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulMetadataSatelliteRosterIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulMetadataSatelliteRosterIndex
     * }
     */
    public static final OfInt ulMetadataSatelliteRosterIndex$layout() {
        return ulMetadataSatelliteRosterIndex$LAYOUT;
    }

    private static final long ulMetadataSatelliteRosterIndex$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulMetadataSatelliteRosterIndex
     * }
     */
    public static final long ulMetadataSatelliteRosterIndex$offset() {
        return ulMetadataSatelliteRosterIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulMetadataSatelliteRosterIndex
     * }
     */
    public static int ulMetadataSatelliteRosterIndex(MemorySegment struct) {
        return struct.get(ulMetadataSatelliteRosterIndex$LAYOUT, ulMetadataSatelliteRosterIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulMetadataSatelliteRosterIndex
     * }
     */
    public static void ulMetadataSatelliteRosterIndex(MemorySegment struct, int fieldValue) {
        struct.set(ulMetadataSatelliteRosterIndex$LAYOUT, ulMetadataSatelliteRosterIndex$OFFSET, fieldValue);
    }

    private static final OfInt ulManifestVersionMajor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulManifestVersionMajor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulManifestVersionMajor
     * }
     */
    public static final OfInt ulManifestVersionMajor$layout() {
        return ulManifestVersionMajor$LAYOUT;
    }

    private static final long ulManifestVersionMajor$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulManifestVersionMajor
     * }
     */
    public static final long ulManifestVersionMajor$offset() {
        return ulManifestVersionMajor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulManifestVersionMajor
     * }
     */
    public static int ulManifestVersionMajor(MemorySegment struct) {
        return struct.get(ulManifestVersionMajor$LAYOUT, ulManifestVersionMajor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulManifestVersionMajor
     * }
     */
    public static void ulManifestVersionMajor(MemorySegment struct, int fieldValue) {
        struct.set(ulManifestVersionMajor$LAYOUT, ulManifestVersionMajor$OFFSET, fieldValue);
    }

    private static final OfInt ulManifestVersionMinor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulManifestVersionMinor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulManifestVersionMinor
     * }
     */
    public static final OfInt ulManifestVersionMinor$layout() {
        return ulManifestVersionMinor$LAYOUT;
    }

    private static final long ulManifestVersionMinor$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulManifestVersionMinor
     * }
     */
    public static final long ulManifestVersionMinor$offset() {
        return ulManifestVersionMinor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulManifestVersionMinor
     * }
     */
    public static int ulManifestVersionMinor(MemorySegment struct) {
        return struct.get(ulManifestVersionMinor$LAYOUT, ulManifestVersionMinor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulManifestVersionMinor
     * }
     */
    public static void ulManifestVersionMinor(MemorySegment struct, int fieldValue) {
        struct.set(ulManifestVersionMinor$LAYOUT, ulManifestVersionMinor$OFFSET, fieldValue);
    }

    private static final OfInt ulPolicyVersionMajor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulPolicyVersionMajor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulPolicyVersionMajor
     * }
     */
    public static final OfInt ulPolicyVersionMajor$layout() {
        return ulPolicyVersionMajor$LAYOUT;
    }

    private static final long ulPolicyVersionMajor$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulPolicyVersionMajor
     * }
     */
    public static final long ulPolicyVersionMajor$offset() {
        return ulPolicyVersionMajor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulPolicyVersionMajor
     * }
     */
    public static int ulPolicyVersionMajor(MemorySegment struct) {
        return struct.get(ulPolicyVersionMajor$LAYOUT, ulPolicyVersionMajor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulPolicyVersionMajor
     * }
     */
    public static void ulPolicyVersionMajor(MemorySegment struct, int fieldValue) {
        struct.set(ulPolicyVersionMajor$LAYOUT, ulPolicyVersionMajor$OFFSET, fieldValue);
    }

    private static final OfInt ulPolicyVersionMinor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulPolicyVersionMinor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulPolicyVersionMinor
     * }
     */
    public static final OfInt ulPolicyVersionMinor$layout() {
        return ulPolicyVersionMinor$LAYOUT;
    }

    private static final long ulPolicyVersionMinor$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulPolicyVersionMinor
     * }
     */
    public static final long ulPolicyVersionMinor$offset() {
        return ulPolicyVersionMinor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulPolicyVersionMinor
     * }
     */
    public static int ulPolicyVersionMinor(MemorySegment struct) {
        return struct.get(ulPolicyVersionMinor$LAYOUT, ulPolicyVersionMinor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulPolicyVersionMinor
     * }
     */
    public static void ulPolicyVersionMinor(MemorySegment struct, int fieldValue) {
        struct.set(ulPolicyVersionMinor$LAYOUT, ulPolicyVersionMinor$OFFSET, fieldValue);
    }

    private static final OfInt ulAssemblyDirectoryNameLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulAssemblyDirectoryNameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulAssemblyDirectoryNameLength
     * }
     */
    public static final OfInt ulAssemblyDirectoryNameLength$layout() {
        return ulAssemblyDirectoryNameLength$LAYOUT;
    }

    private static final long ulAssemblyDirectoryNameLength$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulAssemblyDirectoryNameLength
     * }
     */
    public static final long ulAssemblyDirectoryNameLength$offset() {
        return ulAssemblyDirectoryNameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulAssemblyDirectoryNameLength
     * }
     */
    public static int ulAssemblyDirectoryNameLength(MemorySegment struct) {
        return struct.get(ulAssemblyDirectoryNameLength$LAYOUT, ulAssemblyDirectoryNameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulAssemblyDirectoryNameLength
     * }
     */
    public static void ulAssemblyDirectoryNameLength(MemorySegment struct, int fieldValue) {
        struct.set(ulAssemblyDirectoryNameLength$LAYOUT, ulAssemblyDirectoryNameLength$OFFSET, fieldValue);
    }

    private static final AddressLayout lpAssemblyEncodedAssemblyIdentity$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpAssemblyEncodedAssemblyIdentity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyEncodedAssemblyIdentity
     * }
     */
    public static final AddressLayout lpAssemblyEncodedAssemblyIdentity$layout() {
        return lpAssemblyEncodedAssemblyIdentity$LAYOUT;
    }

    private static final long lpAssemblyEncodedAssemblyIdentity$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyEncodedAssemblyIdentity
     * }
     */
    public static final long lpAssemblyEncodedAssemblyIdentity$offset() {
        return lpAssemblyEncodedAssemblyIdentity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyEncodedAssemblyIdentity
     * }
     */
    public static MemorySegment lpAssemblyEncodedAssemblyIdentity(MemorySegment struct) {
        return struct.get(lpAssemblyEncodedAssemblyIdentity$LAYOUT, lpAssemblyEncodedAssemblyIdentity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyEncodedAssemblyIdentity
     * }
     */
    public static void lpAssemblyEncodedAssemblyIdentity(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpAssemblyEncodedAssemblyIdentity$LAYOUT, lpAssemblyEncodedAssemblyIdentity$OFFSET, fieldValue);
    }

    private static final AddressLayout lpAssemblyManifestPath$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpAssemblyManifestPath"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyManifestPath
     * }
     */
    public static final AddressLayout lpAssemblyManifestPath$layout() {
        return lpAssemblyManifestPath$LAYOUT;
    }

    private static final long lpAssemblyManifestPath$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyManifestPath
     * }
     */
    public static final long lpAssemblyManifestPath$offset() {
        return lpAssemblyManifestPath$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyManifestPath
     * }
     */
    public static MemorySegment lpAssemblyManifestPath(MemorySegment struct) {
        return struct.get(lpAssemblyManifestPath$LAYOUT, lpAssemblyManifestPath$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyManifestPath
     * }
     */
    public static void lpAssemblyManifestPath(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpAssemblyManifestPath$LAYOUT, lpAssemblyManifestPath$OFFSET, fieldValue);
    }

    private static final AddressLayout lpAssemblyPolicyPath$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpAssemblyPolicyPath"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyPolicyPath
     * }
     */
    public static final AddressLayout lpAssemblyPolicyPath$layout() {
        return lpAssemblyPolicyPath$LAYOUT;
    }

    private static final long lpAssemblyPolicyPath$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyPolicyPath
     * }
     */
    public static final long lpAssemblyPolicyPath$offset() {
        return lpAssemblyPolicyPath$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyPolicyPath
     * }
     */
    public static MemorySegment lpAssemblyPolicyPath(MemorySegment struct) {
        return struct.get(lpAssemblyPolicyPath$LAYOUT, lpAssemblyPolicyPath$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyPolicyPath
     * }
     */
    public static void lpAssemblyPolicyPath(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpAssemblyPolicyPath$LAYOUT, lpAssemblyPolicyPath$OFFSET, fieldValue);
    }

    private static final AddressLayout lpAssemblyDirectoryName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpAssemblyDirectoryName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyDirectoryName
     * }
     */
    public static final AddressLayout lpAssemblyDirectoryName$layout() {
        return lpAssemblyDirectoryName$LAYOUT;
    }

    private static final long lpAssemblyDirectoryName$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyDirectoryName
     * }
     */
    public static final long lpAssemblyDirectoryName$offset() {
        return lpAssemblyDirectoryName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyDirectoryName
     * }
     */
    public static MemorySegment lpAssemblyDirectoryName(MemorySegment struct) {
        return struct.get(lpAssemblyDirectoryName$LAYOUT, lpAssemblyDirectoryName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCWSTR lpAssemblyDirectoryName
     * }
     */
    public static void lpAssemblyDirectoryName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpAssemblyDirectoryName$LAYOUT, lpAssemblyDirectoryName$OFFSET, fieldValue);
    }

    private static final OfInt ulFileCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulFileCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulFileCount
     * }
     */
    public static final OfInt ulFileCount$layout() {
        return ulFileCount$LAYOUT;
    }

    private static final long ulFileCount$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulFileCount
     * }
     */
    public static final long ulFileCount$offset() {
        return ulFileCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulFileCount
     * }
     */
    public static int ulFileCount(MemorySegment struct) {
        return struct.get(ulFileCount$LAYOUT, ulFileCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulFileCount
     * }
     */
    public static void ulFileCount(MemorySegment struct, int fieldValue) {
        struct.set(ulFileCount$LAYOUT, ulFileCount$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
