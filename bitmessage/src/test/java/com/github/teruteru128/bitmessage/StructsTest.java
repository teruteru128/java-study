package com.github.teruteru128.bitmessage;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;
import java.util.HexFormat;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StructsTest {

    public StructsTest() {
        super();
    }

    @ParameterizedTest
    @MethodSource("encodeVarintTest_Parameters1")
    public void encodeVarintTest1(BigInteger n, byte[] b) throws Throwable {
        assertArrayEquals(Structs.encodeVarint(n), b);
    }

    private static final HexFormat format = HexFormat.of();

    private static Arguments of(Object... arguments) {
        return Arguments.of(arguments);
    }

    private static BigInteger valueOf(long val) {
        return BigInteger.valueOf(val);
    }

    private static byte[] parseHex(String string) {
        return format.parseHex(string);
    }

    public static Stream<Arguments> encodeVarintTest_Parameters1() throws Throwable {
        return Stream.of(of(valueOf(0x0), parseHex("00")), of(valueOf(0x1), parseHex("01")),
                of(valueOf(0x10), parseHex("10")), of(valueOf(0xFC), parseHex("FC")),
                of(valueOf(0xFD), parseHex("FD00FD")), of(valueOf(0xFE), parseHex("FD00FE")),
                of(valueOf(0xFF), parseHex("FD00FF")), of(valueOf(0x100), parseHex("FD0100")),
                of(valueOf(0x1000), parseHex("FD1000")), of(valueOf(0x010000), parseHex("FE00010000")),
                of(valueOf(0x100000), parseHex("FE00100000")), of(valueOf(0x10000000), parseHex("FE10000000")),
                of(valueOf(0x1000000000L), parseHex("FF0000001000000000")),
                of(valueOf(0x100000000000L), parseHex("FF0000100000000000")),
                of(valueOf(0x10000000000000L), parseHex("FF0010000000000000")),
                of(valueOf(0x1000000000000000L), parseHex("FF1000000000000000")),
                of(valueOf(9223372036854775807L), parseHex("FF7FFFFFFFFFFFFFFF")),
                of(new BigInteger("8000000000000000", 16), parseHex("FF8000000000000000")),
                of(new BigInteger("18446744073709551615", 10), parseHex("FFFFFFFFFFFFFFFFFF")));
    }

    @ParameterizedTest
    @MethodSource("encodeVarintTest_Parameters2")
    public void encodeVarintTest2(BigInteger n) throws Throwable {
        assertThrows(IllegalArgumentException.class, () -> Structs.encodeVarint(n));
    }

    public static Stream<Arguments> encodeVarintTest_Parameters2() throws Throwable {
        return Stream.of(of(valueOf(-1)), of(new BigInteger("18446744073709551616", 10)));
    }

    @ParameterizedTest
    @MethodSource("encodeVarintTest_Parameters3")
    public void encodeVarintTest3(long n, byte[] b) throws Throwable {
        assertArrayEquals(Structs.encodeVarint(n), b);
    }

    public static Stream<Arguments> encodeVarintTest_Parameters3() throws Throwable {
        return Stream.of(of(0x0, parseHex("00")), of(0x1, parseHex("01")), of(0x10, parseHex("10")),
                of(0x100, parseHex("FD0100")), of(0x1000, parseHex("FD1000")), of(0x010000, parseHex("FE00010000")),
                of(0x100000, parseHex("FE00100000")), of(0x10000000, parseHex("FE10000000")),
                of(0x1000000000L, parseHex("FF0000001000000000")), of(0x100000000000L, parseHex("FF0000100000000000")),
                of(0x10000000000000L, parseHex("FF0010000000000000")),
                of(0x1000000000000000L, parseHex("FF1000000000000000")),
                of(0x7FFFFFFFFFFFFFFFL, parseHex("FF7FFFFFFFFFFFFFFF")));
    }

    @ParameterizedTest
    @MethodSource("encodeVarintTest_Parameters4")
    public void encodeVarintTest4(long n) throws Throwable {
        assertThrows(IllegalArgumentException.class, () -> Structs.encodeVarint(n));
    }

    public static Stream<Arguments> encodeVarintTest_Parameters4() throws Throwable {
        return Stream.of(of(-1), of(0x8000000000000000L));
    }

    @ParameterizedTest
    @MethodSource("encodeUnsignedVarintTest_Parameters")
    public void encodeUnsignedVarintTest(long n, byte[] b) throws Throwable {
        assertArrayEquals(Structs.encodeUnsignedVarint(n), b, String.format("%x, %s%n", n, format.formatHex(b)));
    }

    public static Stream<Arguments> encodeUnsignedVarintTest_Parameters() throws Throwable {
        return Stream.of(of(0x0, parseHex("00")), of(0x01, parseHex("01")), of(0x10, parseHex("10")),
                of(0xFC, parseHex("FC")), of(0xFD, parseHex("FD00FD")), of(0xFE, parseHex("FD00FE")),
                of(0xFF, parseHex("FD00FF")), of(0x0100, parseHex("FD0100")), of(0x1000, parseHex("FD1000")),
                of(0x00FFFF, parseHex("FDFFFF")), of(0x010000, parseHex("FE00010000")),
                of(0x100000, parseHex("FE00100000")), of(0x10000000, parseHex("FE10000000")),
                of(0x1000000000L, parseHex("FF0000001000000000")), of(0x100000000000L, parseHex("FF0000100000000000")),
                of(0x10000000000000L, parseHex("FF0010000000000000")),
                of(0x1000000000000000L, parseHex("FF1000000000000000")),
                of(0x7FFFFFFFFFFFFFFFL, parseHex("FF7FFFFFFFFFFFFFFF")),
                of(0x8000000000000000L, parseHex("FF8000000000000000")), of(-1L, parseHex("FFFFFFFFFFFFFFFFFF")));
    }
}
