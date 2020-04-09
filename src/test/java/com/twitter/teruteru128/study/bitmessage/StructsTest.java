package com.twitter.teruteru128.study.bitmessage;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;
import java.util.stream.Stream;

import javax.xml.bind.DatatypeConverter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StructsTest {

    public StructsTest() {
        super();
    }

    @ParameterizedTest
    @MethodSource("encodeVarintTest_Parameters")
    public void encodeVarintTest(long n, byte[] b) throws Throwable {
        assertArrayEquals(Structs.encodeVarint(n), b);
    }

    public static Stream<Arguments> encodeVarintTest_Parameters() throws Throwable {
        return Stream.of(Arguments.of(0x1, DatatypeConverter.parseHexBinary("01")),
                Arguments.of(0x10, DatatypeConverter.parseHexBinary("10")),
                Arguments.of(0x100, DatatypeConverter.parseHexBinary("FD0100")),
                Arguments.of(0x1000, DatatypeConverter.parseHexBinary("FD1000")),
                Arguments.of(0x010000, DatatypeConverter.parseHexBinary("FE00010000")),
                Arguments.of(0x100000, DatatypeConverter.parseHexBinary("FE00100000")),
                Arguments.of(0x10000000, DatatypeConverter.parseHexBinary("FE10000000")),
                Arguments.of(0x1000000000L, DatatypeConverter.parseHexBinary("FF0000001000000000")),
                Arguments.of(0x100000000000L, DatatypeConverter.parseHexBinary("FF0000100000000000")),
                Arguments.of(0x10000000000000L, DatatypeConverter.parseHexBinary("FF0010000000000000")),
                Arguments.of(0x1000000000000000L, DatatypeConverter.parseHexBinary("FF1000000000000000")),
                Arguments.of(9223372036854775807L, DatatypeConverter.parseHexBinary("FF7FFFFFFFFFFFFFFF")));
    }

    @ParameterizedTest
    @MethodSource("encodeVarintTest_Parameters2")
    public void encodeVarintTest2(long n) throws Throwable {
        assertThrows(RuntimeException.class, () -> Structs.encodeVarint(n));
    }

    public static Stream<Arguments> encodeVarintTest_Parameters2() throws Throwable {
        return Stream.of(Arguments.of(0x8000000000000000L));
    }

    @ParameterizedTest
    @MethodSource("encodeVarintTest_Parameters3")
    public void encodeVarintTest3(BigInteger n, byte[] b) throws Throwable {
        assertArrayEquals(Structs.encodeVarint(n), b);
    }

    public static Stream<Arguments> encodeVarintTest_Parameters3() throws Throwable {
        return Stream.of(Arguments.of(BigInteger.valueOf(0x1), DatatypeConverter.parseHexBinary("01")),
                Arguments.of(BigInteger.valueOf(0x10), DatatypeConverter.parseHexBinary("10")),
                Arguments.of(BigInteger.valueOf(0x100), DatatypeConverter.parseHexBinary("FD0100")),
                Arguments.of(BigInteger.valueOf(0x1000), DatatypeConverter.parseHexBinary("FD1000")),
                Arguments.of(BigInteger.valueOf(0x010000), DatatypeConverter.parseHexBinary("FE00010000")),
                Arguments.of(BigInteger.valueOf(0x100000), DatatypeConverter.parseHexBinary("FE00100000")),
                Arguments.of(BigInteger.valueOf(0x10000000), DatatypeConverter.parseHexBinary("FE10000000")),
                Arguments.of(BigInteger.valueOf(0x1000000000L), DatatypeConverter.parseHexBinary("FF0000001000000000")),
                Arguments.of(BigInteger.valueOf(0x100000000000L),
                        DatatypeConverter.parseHexBinary("FF0000100000000000")),
                Arguments.of(BigInteger.valueOf(0x10000000000000L),
                        DatatypeConverter.parseHexBinary("FF0010000000000000")),
                Arguments.of(BigInteger.valueOf(0x1000000000000000L),
                        DatatypeConverter.parseHexBinary("FF1000000000000000")),
                Arguments.of(BigInteger.valueOf(9223372036854775807L),
                        DatatypeConverter.parseHexBinary("FF7FFFFFFFFFFFFFFF")),
                Arguments.of(new BigInteger("8000000000000000", 16),
                        DatatypeConverter.parseHexBinary("FF8000000000000000")),
                Arguments.of(new BigInteger("18446744073709551615", 10),
                        DatatypeConverter.parseHexBinary("FFFFFFFFFFFFFFFFFF")));
    }

    @ParameterizedTest
    @MethodSource("encodeVarintTest_Parameters4")
    public void encodeVarintTest4(BigInteger n) throws Throwable {
        assertThrows(RuntimeException.class, () -> Structs.encodeVarint(n));
    }

    public static Stream<Arguments> encodeVarintTest_Parameters4() throws Throwable {
        return Stream.of(Arguments.of(new BigInteger("18446744073709551616", 10)));
    }
}
