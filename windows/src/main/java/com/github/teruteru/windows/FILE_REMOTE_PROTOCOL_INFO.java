// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _FILE_REMOTE_PROTOCOL_INFO {
 *     USHORT StructureVersion;
 *     USHORT StructureSize;
 *     ULONG Protocol;
 *     USHORT ProtocolMajorVersion;
 *     USHORT ProtocolMinorVersion;
 *     USHORT ProtocolRevision;
 *     USHORT Reserved;
 *     ULONG Flags;
 *     struct {
 *         ULONG Reserved[8];
 *     } GenericReserved;
 *     union {
 *         struct {
 *             struct {
 *                 ULONG Capabilities;
 *             } Server;
 *             struct {
 *                 ULONG Capabilities;
 *                 ULONG CachingFlags;
 *             } Share;
 *         } Smb2;
 *         ULONG Reserved[16];
 *     } ProtocolSpecific;
 * } FILE_REMOTE_PROTOCOL_INFO
 * }
 */
public class FILE_REMOTE_PROTOCOL_INFO extends _FILE_REMOTE_PROTOCOL_INFO {

    FILE_REMOTE_PROTOCOL_INFO() {
        // Should not be called directly
    }
}

