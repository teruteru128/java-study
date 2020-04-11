package com.twitter.teruteru128.test.random;

/**
 * @author Teruteru
 *
 */
public class MT {
    public final static long Max = 0xffffffff;
    /**ベクター長*/
    final static int MT_N = 624; // length of state vector
    /**期間パラメータ*/
    final static int MT_M = 397; // a period parameter
    /**定数ベクトルA*/
    final static long MT_MATRIX_A = 0x9908B0DFL; // constant vector a
    /**状態ベクトル*/
    long[] sv = new long[MT_N]; // state vector
    int N, M; // random value is computed from here

    public MT(long _s) {
        N = 0;
        M = MT_M;
        for (int i = 0; i < MT_N; i++)
            sv[i] = _s = ((1812433253L * (_s ^ (_s >> 30)) + (long) (i))) & 0xffffffffL;
    }

    public long Next() {
        int P = N;
        if (++N == MT_N)
            N = 0;
        // move hi bit of u to hi bit of v
        sv[P] = sv[M]
                ^ (((sv[P] & 0x80000000L) | (sv[N] & ~(0x80000000L))) >> 1)
                ^ (((sv[N] & 1L) != 0) ? MT_MATRIX_A : 0);
        if (++M == MT_N)
            M = 0;
        // Tempering
        long y = sv[P];
        y ^= (y >> 11);
        y ^= (y << 7) & 0x9D2C5680L;
        y ^= (y << 15) & 0xEFC60000L;
        y ^= (y >> 18);
        return ((long) (y));
    }

    public long NextL(long _max) {
        return (Next() % (_max + 1));
    }

    public long NextL(long _min, long _max) {
        long range = _max - _min + 1;
        return (Next() % range + _min);
    }

    public int Next(int _max) {
        return ((int) (Next() % (_max + 1)));
    }

    public int Next(int _min, int _max) {
        int range = _max - _min + 1;
        return ((int) (Next() % range + _min));
    }

    public float Next(float _max) {
        return ((float) (Next()) * _max / 0x100000000L);
    }

    public float Next(float _min, float _max) {
        float range = _max - _min;
        return ((float) (Next()) * range / 0x100000000L + _min);
    }
}