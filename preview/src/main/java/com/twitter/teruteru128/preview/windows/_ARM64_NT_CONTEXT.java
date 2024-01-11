// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ARM64_NT_CONTEXT {
 *     DWORD ContextFlags;
 *     DWORD Cpsr;
 *     union {
 *         struct {
 *             DWORD64 X0;
 *             DWORD64 X1;
 *             DWORD64 X2;
 *             DWORD64 X3;
 *             DWORD64 X4;
 *             DWORD64 X5;
 *             DWORD64 X6;
 *             DWORD64 X7;
 *             DWORD64 X8;
 *             DWORD64 X9;
 *             DWORD64 X10;
 *             DWORD64 X11;
 *             DWORD64 X12;
 *             DWORD64 X13;
 *             DWORD64 X14;
 *             DWORD64 X15;
 *             DWORD64 X16;
 *             DWORD64 X17;
 *             DWORD64 X18;
 *             DWORD64 X19;
 *             DWORD64 X20;
 *             DWORD64 X21;
 *             DWORD64 X22;
 *             DWORD64 X23;
 *             DWORD64 X24;
 *             DWORD64 X25;
 *             DWORD64 X26;
 *             DWORD64 X27;
 *             DWORD64 X28;
 *             DWORD64 Fp;
 *             DWORD64 Lr;
 *         };
 *         DWORD64 X[31];
 *     };
 *     DWORD64 Sp;
 *     DWORD64 Pc;
 *     ARM64_NT_NEON128 V[32];
 *     DWORD Fpcr;
 *     DWORD Fpsr;
 *     DWORD Bcr[8];
 *     DWORD64 Bvr[8];
 *     DWORD Wcr[2];
 *     DWORD64 Wvr[2];
 * };
 * }
 */
public class _ARM64_NT_CONTEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$99.const$4;
    }
    public static VarHandle ContextFlags$VH() {
        return constants$99.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ContextFlags;
     * }
     */
    public static int ContextFlags$get(MemorySegment seg) {
        return (int)constants$99.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ContextFlags;
     * }
     */
    public static void ContextFlags$set(MemorySegment seg, int x) {
        constants$99.const$5.set(seg, x);
    }
    public static int ContextFlags$get(MemorySegment seg, long index) {
        return (int)constants$99.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextFlags$set(MemorySegment seg, long index, int x) {
        constants$99.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Cpsr$VH() {
        return constants$100.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Cpsr;
     * }
     */
    public static int Cpsr$get(MemorySegment seg) {
        return (int)constants$100.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Cpsr;
     * }
     */
    public static void Cpsr$set(MemorySegment seg, int x) {
        constants$100.const$0.set(seg, x);
    }
    public static int Cpsr$get(MemorySegment seg, long index) {
        return (int)constants$100.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Cpsr$set(MemorySegment seg, long index, int x) {
        constants$100.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X0$VH() {
        return constants$100.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X0;
     * }
     */
    public static long X0$get(MemorySegment seg) {
        return (long)constants$100.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X0;
     * }
     */
    public static void X0$set(MemorySegment seg, long x) {
        constants$100.const$1.set(seg, x);
    }
    public static long X0$get(MemorySegment seg, long index) {
        return (long)constants$100.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void X0$set(MemorySegment seg, long index, long x) {
        constants$100.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X1$VH() {
        return constants$100.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X1;
     * }
     */
    public static long X1$get(MemorySegment seg) {
        return (long)constants$100.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X1;
     * }
     */
    public static void X1$set(MemorySegment seg, long x) {
        constants$100.const$2.set(seg, x);
    }
    public static long X1$get(MemorySegment seg, long index) {
        return (long)constants$100.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void X1$set(MemorySegment seg, long index, long x) {
        constants$100.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X2$VH() {
        return constants$100.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X2;
     * }
     */
    public static long X2$get(MemorySegment seg) {
        return (long)constants$100.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X2;
     * }
     */
    public static void X2$set(MemorySegment seg, long x) {
        constants$100.const$3.set(seg, x);
    }
    public static long X2$get(MemorySegment seg, long index) {
        return (long)constants$100.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void X2$set(MemorySegment seg, long index, long x) {
        constants$100.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X3$VH() {
        return constants$100.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X3;
     * }
     */
    public static long X3$get(MemorySegment seg) {
        return (long)constants$100.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X3;
     * }
     */
    public static void X3$set(MemorySegment seg, long x) {
        constants$100.const$4.set(seg, x);
    }
    public static long X3$get(MemorySegment seg, long index) {
        return (long)constants$100.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void X3$set(MemorySegment seg, long index, long x) {
        constants$100.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X4$VH() {
        return constants$100.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X4;
     * }
     */
    public static long X4$get(MemorySegment seg) {
        return (long)constants$100.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X4;
     * }
     */
    public static void X4$set(MemorySegment seg, long x) {
        constants$100.const$5.set(seg, x);
    }
    public static long X4$get(MemorySegment seg, long index) {
        return (long)constants$100.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void X4$set(MemorySegment seg, long index, long x) {
        constants$100.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X5$VH() {
        return constants$101.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X5;
     * }
     */
    public static long X5$get(MemorySegment seg) {
        return (long)constants$101.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X5;
     * }
     */
    public static void X5$set(MemorySegment seg, long x) {
        constants$101.const$0.set(seg, x);
    }
    public static long X5$get(MemorySegment seg, long index) {
        return (long)constants$101.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void X5$set(MemorySegment seg, long index, long x) {
        constants$101.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X6$VH() {
        return constants$101.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X6;
     * }
     */
    public static long X6$get(MemorySegment seg) {
        return (long)constants$101.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X6;
     * }
     */
    public static void X6$set(MemorySegment seg, long x) {
        constants$101.const$1.set(seg, x);
    }
    public static long X6$get(MemorySegment seg, long index) {
        return (long)constants$101.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void X6$set(MemorySegment seg, long index, long x) {
        constants$101.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X7$VH() {
        return constants$101.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X7;
     * }
     */
    public static long X7$get(MemorySegment seg) {
        return (long)constants$101.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X7;
     * }
     */
    public static void X7$set(MemorySegment seg, long x) {
        constants$101.const$2.set(seg, x);
    }
    public static long X7$get(MemorySegment seg, long index) {
        return (long)constants$101.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void X7$set(MemorySegment seg, long index, long x) {
        constants$101.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X8$VH() {
        return constants$101.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X8;
     * }
     */
    public static long X8$get(MemorySegment seg) {
        return (long)constants$101.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X8;
     * }
     */
    public static void X8$set(MemorySegment seg, long x) {
        constants$101.const$3.set(seg, x);
    }
    public static long X8$get(MemorySegment seg, long index) {
        return (long)constants$101.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void X8$set(MemorySegment seg, long index, long x) {
        constants$101.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X9$VH() {
        return constants$101.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X9;
     * }
     */
    public static long X9$get(MemorySegment seg) {
        return (long)constants$101.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X9;
     * }
     */
    public static void X9$set(MemorySegment seg, long x) {
        constants$101.const$4.set(seg, x);
    }
    public static long X9$get(MemorySegment seg, long index) {
        return (long)constants$101.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void X9$set(MemorySegment seg, long index, long x) {
        constants$101.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X10$VH() {
        return constants$101.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X10;
     * }
     */
    public static long X10$get(MemorySegment seg) {
        return (long)constants$101.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X10;
     * }
     */
    public static void X10$set(MemorySegment seg, long x) {
        constants$101.const$5.set(seg, x);
    }
    public static long X10$get(MemorySegment seg, long index) {
        return (long)constants$101.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void X10$set(MemorySegment seg, long index, long x) {
        constants$101.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X11$VH() {
        return constants$102.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X11;
     * }
     */
    public static long X11$get(MemorySegment seg) {
        return (long)constants$102.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X11;
     * }
     */
    public static void X11$set(MemorySegment seg, long x) {
        constants$102.const$0.set(seg, x);
    }
    public static long X11$get(MemorySegment seg, long index) {
        return (long)constants$102.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void X11$set(MemorySegment seg, long index, long x) {
        constants$102.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X12$VH() {
        return constants$102.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X12;
     * }
     */
    public static long X12$get(MemorySegment seg) {
        return (long)constants$102.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X12;
     * }
     */
    public static void X12$set(MemorySegment seg, long x) {
        constants$102.const$1.set(seg, x);
    }
    public static long X12$get(MemorySegment seg, long index) {
        return (long)constants$102.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void X12$set(MemorySegment seg, long index, long x) {
        constants$102.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X13$VH() {
        return constants$102.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X13;
     * }
     */
    public static long X13$get(MemorySegment seg) {
        return (long)constants$102.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X13;
     * }
     */
    public static void X13$set(MemorySegment seg, long x) {
        constants$102.const$2.set(seg, x);
    }
    public static long X13$get(MemorySegment seg, long index) {
        return (long)constants$102.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void X13$set(MemorySegment seg, long index, long x) {
        constants$102.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X14$VH() {
        return constants$102.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X14;
     * }
     */
    public static long X14$get(MemorySegment seg) {
        return (long)constants$102.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X14;
     * }
     */
    public static void X14$set(MemorySegment seg, long x) {
        constants$102.const$3.set(seg, x);
    }
    public static long X14$get(MemorySegment seg, long index) {
        return (long)constants$102.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void X14$set(MemorySegment seg, long index, long x) {
        constants$102.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X15$VH() {
        return constants$102.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X15;
     * }
     */
    public static long X15$get(MemorySegment seg) {
        return (long)constants$102.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X15;
     * }
     */
    public static void X15$set(MemorySegment seg, long x) {
        constants$102.const$4.set(seg, x);
    }
    public static long X15$get(MemorySegment seg, long index) {
        return (long)constants$102.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void X15$set(MemorySegment seg, long index, long x) {
        constants$102.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X16$VH() {
        return constants$102.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X16;
     * }
     */
    public static long X16$get(MemorySegment seg) {
        return (long)constants$102.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X16;
     * }
     */
    public static void X16$set(MemorySegment seg, long x) {
        constants$102.const$5.set(seg, x);
    }
    public static long X16$get(MemorySegment seg, long index) {
        return (long)constants$102.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void X16$set(MemorySegment seg, long index, long x) {
        constants$102.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X17$VH() {
        return constants$103.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X17;
     * }
     */
    public static long X17$get(MemorySegment seg) {
        return (long)constants$103.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X17;
     * }
     */
    public static void X17$set(MemorySegment seg, long x) {
        constants$103.const$0.set(seg, x);
    }
    public static long X17$get(MemorySegment seg, long index) {
        return (long)constants$103.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void X17$set(MemorySegment seg, long index, long x) {
        constants$103.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X18$VH() {
        return constants$103.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X18;
     * }
     */
    public static long X18$get(MemorySegment seg) {
        return (long)constants$103.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X18;
     * }
     */
    public static void X18$set(MemorySegment seg, long x) {
        constants$103.const$1.set(seg, x);
    }
    public static long X18$get(MemorySegment seg, long index) {
        return (long)constants$103.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void X18$set(MemorySegment seg, long index, long x) {
        constants$103.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X19$VH() {
        return constants$103.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X19;
     * }
     */
    public static long X19$get(MemorySegment seg) {
        return (long)constants$103.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X19;
     * }
     */
    public static void X19$set(MemorySegment seg, long x) {
        constants$103.const$2.set(seg, x);
    }
    public static long X19$get(MemorySegment seg, long index) {
        return (long)constants$103.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void X19$set(MemorySegment seg, long index, long x) {
        constants$103.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X20$VH() {
        return constants$103.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X20;
     * }
     */
    public static long X20$get(MemorySegment seg) {
        return (long)constants$103.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X20;
     * }
     */
    public static void X20$set(MemorySegment seg, long x) {
        constants$103.const$3.set(seg, x);
    }
    public static long X20$get(MemorySegment seg, long index) {
        return (long)constants$103.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void X20$set(MemorySegment seg, long index, long x) {
        constants$103.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X21$VH() {
        return constants$103.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X21;
     * }
     */
    public static long X21$get(MemorySegment seg) {
        return (long)constants$103.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X21;
     * }
     */
    public static void X21$set(MemorySegment seg, long x) {
        constants$103.const$4.set(seg, x);
    }
    public static long X21$get(MemorySegment seg, long index) {
        return (long)constants$103.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void X21$set(MemorySegment seg, long index, long x) {
        constants$103.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X22$VH() {
        return constants$103.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X22;
     * }
     */
    public static long X22$get(MemorySegment seg) {
        return (long)constants$103.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X22;
     * }
     */
    public static void X22$set(MemorySegment seg, long x) {
        constants$103.const$5.set(seg, x);
    }
    public static long X22$get(MemorySegment seg, long index) {
        return (long)constants$103.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void X22$set(MemorySegment seg, long index, long x) {
        constants$103.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X23$VH() {
        return constants$104.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X23;
     * }
     */
    public static long X23$get(MemorySegment seg) {
        return (long)constants$104.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X23;
     * }
     */
    public static void X23$set(MemorySegment seg, long x) {
        constants$104.const$0.set(seg, x);
    }
    public static long X23$get(MemorySegment seg, long index) {
        return (long)constants$104.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void X23$set(MemorySegment seg, long index, long x) {
        constants$104.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X24$VH() {
        return constants$104.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X24;
     * }
     */
    public static long X24$get(MemorySegment seg) {
        return (long)constants$104.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X24;
     * }
     */
    public static void X24$set(MemorySegment seg, long x) {
        constants$104.const$1.set(seg, x);
    }
    public static long X24$get(MemorySegment seg, long index) {
        return (long)constants$104.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void X24$set(MemorySegment seg, long index, long x) {
        constants$104.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X25$VH() {
        return constants$104.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X25;
     * }
     */
    public static long X25$get(MemorySegment seg) {
        return (long)constants$104.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X25;
     * }
     */
    public static void X25$set(MemorySegment seg, long x) {
        constants$104.const$2.set(seg, x);
    }
    public static long X25$get(MemorySegment seg, long index) {
        return (long)constants$104.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void X25$set(MemorySegment seg, long index, long x) {
        constants$104.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X26$VH() {
        return constants$104.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X26;
     * }
     */
    public static long X26$get(MemorySegment seg) {
        return (long)constants$104.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X26;
     * }
     */
    public static void X26$set(MemorySegment seg, long x) {
        constants$104.const$3.set(seg, x);
    }
    public static long X26$get(MemorySegment seg, long index) {
        return (long)constants$104.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void X26$set(MemorySegment seg, long index, long x) {
        constants$104.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X27$VH() {
        return constants$104.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X27;
     * }
     */
    public static long X27$get(MemorySegment seg) {
        return (long)constants$104.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X27;
     * }
     */
    public static void X27$set(MemorySegment seg, long x) {
        constants$104.const$4.set(seg, x);
    }
    public static long X27$get(MemorySegment seg, long index) {
        return (long)constants$104.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void X27$set(MemorySegment seg, long index, long x) {
        constants$104.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle X28$VH() {
        return constants$104.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 X28;
     * }
     */
    public static long X28$get(MemorySegment seg) {
        return (long)constants$104.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 X28;
     * }
     */
    public static void X28$set(MemorySegment seg, long x) {
        constants$104.const$5.set(seg, x);
    }
    public static long X28$get(MemorySegment seg, long index) {
        return (long)constants$104.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void X28$set(MemorySegment seg, long index, long x) {
        constants$104.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Fp$VH() {
        return constants$105.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 Fp;
     * }
     */
    public static long Fp$get(MemorySegment seg) {
        return (long)constants$105.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 Fp;
     * }
     */
    public static void Fp$set(MemorySegment seg, long x) {
        constants$105.const$0.set(seg, x);
    }
    public static long Fp$get(MemorySegment seg, long index) {
        return (long)constants$105.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Fp$set(MemorySegment seg, long index, long x) {
        constants$105.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Lr$VH() {
        return constants$105.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 Lr;
     * }
     */
    public static long Lr$get(MemorySegment seg) {
        return (long)constants$105.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 Lr;
     * }
     */
    public static void Lr$set(MemorySegment seg, long x) {
        constants$105.const$1.set(seg, x);
    }
    public static long Lr$get(MemorySegment seg, long index) {
        return (long)constants$105.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Lr$set(MemorySegment seg, long index, long x) {
        constants$105.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment X$slice(MemorySegment seg) {
        return seg.asSlice(8, 248);
    }
    public static VarHandle Sp$VH() {
        return constants$105.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 Sp;
     * }
     */
    public static long Sp$get(MemorySegment seg) {
        return (long)constants$105.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 Sp;
     * }
     */
    public static void Sp$set(MemorySegment seg, long x) {
        constants$105.const$2.set(seg, x);
    }
    public static long Sp$get(MemorySegment seg, long index) {
        return (long)constants$105.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Sp$set(MemorySegment seg, long index, long x) {
        constants$105.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Pc$VH() {
        return constants$105.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 Pc;
     * }
     */
    public static long Pc$get(MemorySegment seg) {
        return (long)constants$105.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 Pc;
     * }
     */
    public static void Pc$set(MemorySegment seg, long x) {
        constants$105.const$3.set(seg, x);
    }
    public static long Pc$get(MemorySegment seg, long index) {
        return (long)constants$105.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Pc$set(MemorySegment seg, long index, long x) {
        constants$105.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment V$slice(MemorySegment seg) {
        return seg.asSlice(272, 512);
    }
    public static VarHandle Fpcr$VH() {
        return constants$105.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Fpcr;
     * }
     */
    public static int Fpcr$get(MemorySegment seg) {
        return (int)constants$105.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Fpcr;
     * }
     */
    public static void Fpcr$set(MemorySegment seg, int x) {
        constants$105.const$4.set(seg, x);
    }
    public static int Fpcr$get(MemorySegment seg, long index) {
        return (int)constants$105.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Fpcr$set(MemorySegment seg, long index, int x) {
        constants$105.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Fpsr$VH() {
        return constants$105.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Fpsr;
     * }
     */
    public static int Fpsr$get(MemorySegment seg) {
        return (int)constants$105.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Fpsr;
     * }
     */
    public static void Fpsr$set(MemorySegment seg, int x) {
        constants$105.const$5.set(seg, x);
    }
    public static int Fpsr$get(MemorySegment seg, long index) {
        return (int)constants$105.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Fpsr$set(MemorySegment seg, long index, int x) {
        constants$105.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Bcr$slice(MemorySegment seg) {
        return seg.asSlice(792, 32);
    }
    public static MemorySegment Bvr$slice(MemorySegment seg) {
        return seg.asSlice(824, 64);
    }
    public static MemorySegment Wcr$slice(MemorySegment seg) {
        return seg.asSlice(888, 8);
    }
    public static MemorySegment Wvr$slice(MemorySegment seg) {
        return seg.asSlice(896, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


