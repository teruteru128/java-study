package com.github.teruteru128.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.HexFormat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @see <a href="https://datatracker.ietf.org/doc/html/rfc6238">RFC6238 - TOTP: Time-Based One-Time Password Algorithm</a>
 */
class TOTPTest {

    private static final HexFormat format = HexFormat.of();
    private final TOTP totpHmacSha1 = new TOTP(format.parseHex("3132333435363738393031323334353637383930"), 8, "HmacSHA1");
    private final TOTP totpHmacSha256 = new TOTP(format.parseHex("3132333435363738393031323334353637383930313233343536373839303132"), 8, "HmacSHA256");
    private final TOTP totpHmacSha512 = new TOTP(format.parseHex("31323334353637383930313233343536373839303132333435363738393031323334353637383930313233343536373839303132333435363738393031323334"), 8, "HmacSHA512");

    static Stream<Arguments> hmacSHA1TestCaseProvider() {
        return Stream.of(arguments("94287082", 59L), arguments("07081804", 1111111109L), arguments("14050471", 1111111111L), arguments("89005924", 1234567890L), arguments("69279037", 2000000000L), arguments("65353130", 20000000000L));
    }

    static Stream<Arguments> hmacSHA256TestCaseProvider() {
        return Stream.of(arguments("46119246", 59L), arguments("68084774", 1111111109L), arguments("67062674", 1111111111L), arguments("91819424", 1234567890L), arguments("90698825", 2000000000L), arguments("77737706", 20000000000L));
    }

    static Stream<Arguments> hmacSHA512TestCaseProvider() {
        return Stream.of(arguments("90693936", 59L), arguments("25091201", 1111111109L), arguments("99943326", 1111111111L), arguments("93441116", 1234567890L), arguments("38618901", 2000000000L), arguments("47863826", 20000000000L));
    }

    @ParameterizedTest
    @MethodSource("hmacSHA1TestCaseProvider")
    void generateHmacSHA1(String password, long time) {
        assertEquals(password, totpHmacSha1.generate(time));
    }

    @ParameterizedTest
    @MethodSource("hmacSHA256TestCaseProvider")
    void generateHmacSHA256(String password, long time) {
        assertEquals(password, totpHmacSha256.generate(time));
    }

    @ParameterizedTest
    @MethodSource("hmacSHA512TestCaseProvider")
    void generateHmacSHA512(String password, long time) {
        assertEquals(password, totpHmacSha512.generate(time));
    }
}