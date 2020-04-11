package com.twitter.teruteru128.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class Utils {
    
    private Utils() {
    }
    private static char[] BIN_CODE = {'0','1'};
    public static String toBinString(byte s) {
        StringBuilder builder = new StringBuilder(32);
        builder.append(BIN_CODE[(s >> 7) & 0x1]);
        builder.append(BIN_CODE[(s >> 6) & 0x1]);
        builder.append(BIN_CODE[(s >> 5) & 0x1]);
        builder.append(BIN_CODE[(s >> 4) & 0x1]);
        builder.append(BIN_CODE[(s >> 3) & 0x1]);
        builder.append(BIN_CODE[(s >> 2) & 0x1]);
        builder.append(BIN_CODE[(s >> 1) & 0x1]);
        builder.append(BIN_CODE[(s >> 0) & 0x1]);
        return builder.toString();
    }

    public static String toBinString(short s) {
        StringBuilder builder = new StringBuilder(32);
        builder.append(Character.forDigit(s >> 15 & 0x1, 16));
        builder.append(Character.forDigit(s >> 14 & 0x1, 16));
        builder.append(Character.forDigit(s >> 13 & 0x1, 16));
        builder.append(Character.forDigit(s >> 12 & 0x1, 16));
        builder.append(Character.forDigit(s >> 11 & 0x1, 16));
        builder.append(Character.forDigit(s >> 10 & 0x1, 16));
        builder.append(Character.forDigit(s >> 9 & 0x1, 16));
        builder.append(Character.forDigit(s >> 8 & 0x1, 16));
        builder.append(Character.forDigit(s >> 7 & 0x1, 16));
        builder.append(Character.forDigit(s >> 6 & 0x1, 16));
        builder.append(Character.forDigit(s >> 5 & 0x1, 16));
        builder.append(Character.forDigit(s >> 4 & 0x1, 16));
        builder.append(Character.forDigit(s >> 3 & 0x1, 16));
        builder.append(Character.forDigit(s >> 2 & 0x1, 16));
        builder.append(Character.forDigit(s >> 1 & 0x1, 16));
        builder.append(Character.forDigit(s & 0x1, 16));
        return builder.toString();
    }

    public static String toBinString(int i) {
        StringBuilder builder = new StringBuilder(32);
        builder.append(Character.forDigit(i >> 31 & 0x1, 16));
        builder.append(Character.forDigit(i >> 30 & 0x1, 16));
        builder.append(Character.forDigit(i >> 29 & 0x1, 16));
        builder.append(Character.forDigit(i >> 28 & 0x1, 16));
        builder.append(Character.forDigit(i >> 27 & 0x1, 16));
        builder.append(Character.forDigit(i >> 26 & 0x1, 16));
        builder.append(Character.forDigit(i >> 25 & 0x1, 16));
        builder.append(Character.forDigit(i >> 24 & 0x1, 16));
        builder.append(Character.forDigit(i >> 23 & 0x1, 16));
        builder.append(Character.forDigit(i >> 22 & 0x1, 16));
        builder.append(Character.forDigit(i >> 21 & 0x1, 16));
        builder.append(Character.forDigit(i >> 20 & 0x1, 16));
        builder.append(Character.forDigit(i >> 19 & 0x1, 16));
        builder.append(Character.forDigit(i >> 18 & 0x1, 16));
        builder.append(Character.forDigit(i >> 17 & 0x1, 16));
        builder.append(Character.forDigit(i >> 16 & 0x1, 16));
        builder.append(Character.forDigit(i >> 15 & 0x1, 16));
        builder.append(Character.forDigit(i >> 14 & 0x1, 16));
        builder.append(Character.forDigit(i >> 13 & 0x1, 16));
        builder.append(Character.forDigit(i >> 12 & 0x1, 16));
        builder.append(Character.forDigit(i >> 11 & 0x1, 16));
        builder.append(Character.forDigit(i >> 10 & 0x1, 16));
        builder.append(Character.forDigit(i >> 9 & 0x1, 16));
        builder.append(Character.forDigit(i >> 8 & 0x1, 16));
        builder.append(Character.forDigit(i >> 7 & 0x1, 16));
        builder.append(Character.forDigit(i >> 6 & 0x1, 16));
        builder.append(Character.forDigit(i >> 5 & 0x1, 16));
        builder.append(Character.forDigit(i >> 4 & 0x1, 16));
        builder.append(Character.forDigit(i >> 3 & 0x1, 16));
        builder.append(Character.forDigit(i >> 2 & 0x1, 16));
        builder.append(Character.forDigit(i >> 1 & 0x1, 16));
        builder.append(Character.forDigit(i & 0x1, 16));
        return builder.toString();
    }

    public static String toBinString(long l) {
        StringBuilder builder = new StringBuilder(32);
        builder.append(Character.forDigit((int) (l >> 64 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 63 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 62 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 61 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 60 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 59 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 58 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 57 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 56 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 55 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 54 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 53 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 52 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 51 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 50 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 49 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 48 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 46 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 45 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 44 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 43 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 42 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 41 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 40 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 39 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 38 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 37 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 36 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 35 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 34 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 33 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 32 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 31 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 30 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 29 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 28 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 27 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 26 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 25 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 24 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 23 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 22 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 21 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 20 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 19 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 18 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 17 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 16 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 15 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 14 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 13 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 12 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 11 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 10 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 9 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 8 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 7 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 6 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 5 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 4 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 3 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 2 & 0x1), 16));
        builder.append(Character.forDigit((int) (l >> 1 & 0x1), 16));
        builder.append(Character.forDigit((int) (l & 0x1), 16));
        return builder.toString();
    }

    public static String toBinString(float f) {
        StringBuilder builder = new StringBuilder(32);
        int x = Float.floatToRawIntBits(f);
        builder.append(Character.forDigit(x >> 31 & 0x1, 16));
        builder.append(Character.forDigit(x >> 30 & 0x1, 16));
        builder.append(Character.forDigit(x >> 29 & 0x1, 16));
        builder.append(Character.forDigit(x >> 28 & 0x1, 16));
        builder.append(Character.forDigit(x >> 27 & 0x1, 16));
        builder.append(Character.forDigit(x >> 26 & 0x1, 16));
        builder.append(Character.forDigit(x >> 25 & 0x1, 16));
        builder.append(Character.forDigit(x >> 24 & 0x1, 16));
        builder.append(Character.forDigit(x >> 23 & 0x1, 16));
        builder.append(Character.forDigit(x >> 22 & 0x1, 16));
        builder.append(Character.forDigit(x >> 21 & 0x1, 16));
        builder.append(Character.forDigit(x >> 20 & 0x1, 16));
        builder.append(Character.forDigit(x >> 19 & 0x1, 16));
        builder.append(Character.forDigit(x >> 18 & 0x1, 16));
        builder.append(Character.forDigit(x >> 17 & 0x1, 16));
        builder.append(Character.forDigit(x >> 16 & 0x1, 16));
        builder.append(Character.forDigit(x >> 15 & 0x1, 16));
        builder.append(Character.forDigit(x >> 14 & 0x1, 16));
        builder.append(Character.forDigit(x >> 13 & 0x1, 16));
        builder.append(Character.forDigit(x >> 12 & 0x1, 16));
        builder.append(Character.forDigit(x >> 11 & 0x1, 16));
        builder.append(Character.forDigit(x >> 10 & 0x1, 16));
        builder.append(Character.forDigit(x >> 9 & 0x1, 16));
        builder.append(Character.forDigit(x >> 8 & 0x1, 16));
        builder.append(Character.forDigit(x >> 7 & 0x1, 16));
        builder.append(Character.forDigit(x >> 6 & 0x1, 16));
        builder.append(Character.forDigit(x >> 5 & 0x1, 16));
        builder.append(Character.forDigit(x >> 4 & 0x1, 16));
        builder.append(Character.forDigit(x >> 3 & 0x1, 16));
        builder.append(Character.forDigit(x >> 2 & 0x1, 16));
        builder.append(Character.forDigit(x >> 1 & 0x1, 16));
        builder.append(Character.forDigit(x & 0x1, 16));
        return builder.toString();

    }

    public static String toBinString(double d) {
        StringBuilder builder = new StringBuilder(32);
        long x = Double.doubleToRawLongBits(d);
        builder.append(Character.forDigit((int) (x >> 64 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 63 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 62 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 61 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 60 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 59 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 58 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 57 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 56 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 55 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 54 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 53 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 52 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 51 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 50 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 49 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 48 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 46 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 45 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 44 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 43 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 42 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 41 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 40 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 39 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 38 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 37 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 36 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 35 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 34 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 33 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 32 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 31 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 30 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 29 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 28 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 27 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 26 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 25 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 24 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 23 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 22 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 21 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 20 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 19 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 18 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 17 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 16 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 15 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 14 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 13 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 12 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 11 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 10 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 9 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 8 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 7 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 6 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 5 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 4 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 3 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 2 & 0x1), 16));
        builder.append(Character.forDigit((int) (x >> 1 & 0x1), 16));
        builder.append(Character.forDigit((int) (x & 0x1), 16));
        return builder.toString();
    }
    /**
     * Get the system property. If the system property is not set, or if a
     * security exception occurs, the default value is returned.
     *
     * @param key the key
     * @param defaultValue the default value
     * @return the value
     */
    public static String getProperty(String key, String defaultValue) {
        try {
            return System.getProperty(key, defaultValue);
        } catch (SecurityException se) {
            return defaultValue;
        }
    }
    /**
     * Calls a static method via reflection. This will try to use the method
     * where the most parameter classes match exactly (this algorithm is simpler
     * than the one in the Java specification, but works well for most cases).
     *
     * @param classAndMethod a string with the entire class and method name, eg.
     *            "java.lang.System.gc"
     * @param params the method parameters
     * @return the return value from this call
     */
    public static Object callStaticMethod(String classAndMethod,
            Object... params) throws Exception {
        int lastDot = classAndMethod.lastIndexOf('.');
        String className = classAndMethod.substring(0, lastDot);
        String methodName = classAndMethod.substring(lastDot + 1);
        return callMethod(null, Class.forName(className), methodName, params);
    }
    /**
     * Calls an instance method via reflection. This will try to use the method
     * where the most parameter classes match exactly (this algorithm is simpler
     * than the one in the Java specification, but works well for most cases).
     *
     * @param instance the instance on which the call is done
     * @param methodName a string with the method name
     * @param params the method parameters
     * @return the return value from this call
     */
    public static Object callMethod(
            Object instance,
            String methodName,
            Object... params) throws Exception {
        return callMethod(instance, instance.getClass(), methodName, params);
    }

    private static Object callMethod(
            Object instance, Class<?> clazz,
            String methodName,
            Object... params) throws Exception {
        Method best = null;
        int bestMatch = 0;
        boolean isStatic = instance == null;
        for (Method m : clazz.getMethods()) {
            if (Modifier.isStatic(m.getModifiers()) == isStatic &&
                    m.getName().equals(methodName)) {
                int p = match(m.getParameterTypes(), params);
                if (p > bestMatch) {
                    bestMatch = p;
                    best = m;
                }
            }
        }
        if (best == null) {
            throw new NoSuchMethodException(methodName);
        }
        return best.invoke(instance, params);
    }
    private static int match(Class<?>[] params, Object[] values) {
        int len = params.length;
        if (len == values.length) {
            int points = 1;
            for (int i = 0; i < len; i++) {
                Class<?> pc = getNonPrimitiveClass(params[i]);
                Object v = values[i];
                Class<?> vc = v == null ? null : v.getClass();
                if (pc == vc) {
                    points++;
                } else if (vc == null) {
                    // can't verify
                } else if (!pc.isAssignableFrom(vc)) {
                    return 0;
                }
            }
            return points;
        }
        return 0;
    }
    /**
     * Convert primitive class names to java.lang.* class names.
     *
     * @param clazz the class (for example: int)
     * @return the non-primitive class (for example: java.lang.Integer)
     */
    public static Class<?> getNonPrimitiveClass(Class<?> clazz) {
        if (!clazz.isPrimitive()) {
            return clazz;
        } else if (clazz == boolean.class) {
            return Boolean.class;
        } else if (clazz == byte.class) {
            return Byte.class;
        } else if (clazz == char.class) {
            return Character.class;
        } else if (clazz == double.class) {
            return Double.class;
        } else if (clazz == float.class) {
            return Float.class;
        } else if (clazz == int.class) {
            return Integer.class;
        } else if (clazz == long.class) {
            return Long.class;
        } else if (clazz == short.class) {
            return Short.class;
        } else if (clazz == void.class) {
            return Void.class;
        }
        return clazz;
    }

}
