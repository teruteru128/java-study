// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DCB {
 *     DWORD DCBlength;
 *     DWORD BaudRate;
 *      *     DWORD fBinary;
 *     DWORD fParity;
 *     DWORD fOutxCtsFlow;
 *     DWORD fOutxDsrFlow;
 *     DWORD fDtrControl;
 *     DWORD fDsrSensitivity;
 *     DWORD fTXContinueOnXoff;
 *     DWORD fOutX;
 *     DWORD fInX;
 *     DWORD fErrorChar;
 *     DWORD fNull;
 *     DWORD fRtsControl;
 *     DWORD fAbortOnError;
 *     DWORD fDummy2;
 *     WORD wReserved;
 *     WORD XonLim;
 *     WORD XoffLim;
 *     BYTE ByteSize;
 *     BYTE Parity;
 *     BYTE StopBits;
 *     char XonChar;
 *     char XoffChar;
 *     char ErrorChar;
 *     char EofChar;
 *     char EvtChar;
 *     WORD wReserved1;
 * };
 * }
 */
public class _DCB {

    public static MemoryLayout $LAYOUT() {
        return constants$746.const$5;
    }
    public static VarHandle DCBlength$VH() {
        return constants$747.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DCBlength;
     * }
     */
    public static int DCBlength$get(MemorySegment seg) {
        return (int)constants$747.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DCBlength;
     * }
     */
    public static void DCBlength$set(MemorySegment seg, int x) {
        constants$747.const$0.set(seg, x);
    }
    public static int DCBlength$get(MemorySegment seg, long index) {
        return (int)constants$747.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void DCBlength$set(MemorySegment seg, long index, int x) {
        constants$747.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle BaudRate$VH() {
        return constants$747.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BaudRate;
     * }
     */
    public static int BaudRate$get(MemorySegment seg) {
        return (int)constants$747.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BaudRate;
     * }
     */
    public static void BaudRate$set(MemorySegment seg, int x) {
        constants$747.const$1.set(seg, x);
    }
    public static int BaudRate$get(MemorySegment seg, long index) {
        return (int)constants$747.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void BaudRate$set(MemorySegment seg, long index, int x) {
        constants$747.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wReserved$VH() {
        return constants$747.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static short wReserved$get(MemorySegment seg) {
        return (short)constants$747.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static void wReserved$set(MemorySegment seg, short x) {
        constants$747.const$2.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)constants$747.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        constants$747.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle XonLim$VH() {
        return constants$747.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD XonLim;
     * }
     */
    public static short XonLim$get(MemorySegment seg) {
        return (short)constants$747.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD XonLim;
     * }
     */
    public static void XonLim$set(MemorySegment seg, short x) {
        constants$747.const$3.set(seg, x);
    }
    public static short XonLim$get(MemorySegment seg, long index) {
        return (short)constants$747.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void XonLim$set(MemorySegment seg, long index, short x) {
        constants$747.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle XoffLim$VH() {
        return constants$747.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD XoffLim;
     * }
     */
    public static short XoffLim$get(MemorySegment seg) {
        return (short)constants$747.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD XoffLim;
     * }
     */
    public static void XoffLim$set(MemorySegment seg, short x) {
        constants$747.const$4.set(seg, x);
    }
    public static short XoffLim$get(MemorySegment seg, long index) {
        return (short)constants$747.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void XoffLim$set(MemorySegment seg, long index, short x) {
        constants$747.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ByteSize$VH() {
        return constants$747.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE ByteSize;
     * }
     */
    public static byte ByteSize$get(MemorySegment seg) {
        return (byte)constants$747.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE ByteSize;
     * }
     */
    public static void ByteSize$set(MemorySegment seg, byte x) {
        constants$747.const$5.set(seg, x);
    }
    public static byte ByteSize$get(MemorySegment seg, long index) {
        return (byte)constants$747.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteSize$set(MemorySegment seg, long index, byte x) {
        constants$747.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Parity$VH() {
        return constants$748.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Parity;
     * }
     */
    public static byte Parity$get(MemorySegment seg) {
        return (byte)constants$748.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Parity;
     * }
     */
    public static void Parity$set(MemorySegment seg, byte x) {
        constants$748.const$0.set(seg, x);
    }
    public static byte Parity$get(MemorySegment seg, long index) {
        return (byte)constants$748.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Parity$set(MemorySegment seg, long index, byte x) {
        constants$748.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle StopBits$VH() {
        return constants$748.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE StopBits;
     * }
     */
    public static byte StopBits$get(MemorySegment seg) {
        return (byte)constants$748.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE StopBits;
     * }
     */
    public static void StopBits$set(MemorySegment seg, byte x) {
        constants$748.const$1.set(seg, x);
    }
    public static byte StopBits$get(MemorySegment seg, long index) {
        return (byte)constants$748.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void StopBits$set(MemorySegment seg, long index, byte x) {
        constants$748.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle XonChar$VH() {
        return constants$748.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char XonChar;
     * }
     */
    public static byte XonChar$get(MemorySegment seg) {
        return (byte)constants$748.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char XonChar;
     * }
     */
    public static void XonChar$set(MemorySegment seg, byte x) {
        constants$748.const$2.set(seg, x);
    }
    public static byte XonChar$get(MemorySegment seg, long index) {
        return (byte)constants$748.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void XonChar$set(MemorySegment seg, long index, byte x) {
        constants$748.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle XoffChar$VH() {
        return constants$748.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char XoffChar;
     * }
     */
    public static byte XoffChar$get(MemorySegment seg) {
        return (byte)constants$748.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char XoffChar;
     * }
     */
    public static void XoffChar$set(MemorySegment seg, byte x) {
        constants$748.const$3.set(seg, x);
    }
    public static byte XoffChar$get(MemorySegment seg, long index) {
        return (byte)constants$748.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void XoffChar$set(MemorySegment seg, long index, byte x) {
        constants$748.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ErrorChar$VH() {
        return constants$748.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char ErrorChar;
     * }
     */
    public static byte ErrorChar$get(MemorySegment seg) {
        return (byte)constants$748.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char ErrorChar;
     * }
     */
    public static void ErrorChar$set(MemorySegment seg, byte x) {
        constants$748.const$4.set(seg, x);
    }
    public static byte ErrorChar$get(MemorySegment seg, long index) {
        return (byte)constants$748.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorChar$set(MemorySegment seg, long index, byte x) {
        constants$748.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle EofChar$VH() {
        return constants$748.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char EofChar;
     * }
     */
    public static byte EofChar$get(MemorySegment seg) {
        return (byte)constants$748.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char EofChar;
     * }
     */
    public static void EofChar$set(MemorySegment seg, byte x) {
        constants$748.const$5.set(seg, x);
    }
    public static byte EofChar$get(MemorySegment seg, long index) {
        return (byte)constants$748.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void EofChar$set(MemorySegment seg, long index, byte x) {
        constants$748.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle EvtChar$VH() {
        return constants$749.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char EvtChar;
     * }
     */
    public static byte EvtChar$get(MemorySegment seg) {
        return (byte)constants$749.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char EvtChar;
     * }
     */
    public static void EvtChar$set(MemorySegment seg, byte x) {
        constants$749.const$0.set(seg, x);
    }
    public static byte EvtChar$get(MemorySegment seg, long index) {
        return (byte)constants$749.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void EvtChar$set(MemorySegment seg, long index, byte x) {
        constants$749.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wReserved1$VH() {
        return constants$749.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static short wReserved1$get(MemorySegment seg) {
        return (short)constants$749.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static void wReserved1$set(MemorySegment seg, short x) {
        constants$749.const$1.set(seg, x);
    }
    public static short wReserved1$get(MemorySegment seg, long index) {
        return (short)constants$749.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved1$set(MemorySegment seg, long index, short x) {
        constants$749.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

