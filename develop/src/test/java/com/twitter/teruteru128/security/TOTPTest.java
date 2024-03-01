package com.twitter.teruteru128.security;

import org.junit.jupiter.api.Test;

import java.util.HexFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TOTPTest {

    private static final HexFormat format = HexFormat.of();

    @Test
    void generateHmacSHA1() {
        var seed = format.parseHex("3132333435363738393031323334353637383930");
        var totp_hmacSha1 = new TOTP(seed, 8, "HmacSHA1");
        assertEquals("94287082", totp_hmacSha1.generate(59));
        assertEquals("07081804", totp_hmacSha1.generate(1111111109));
        assertEquals("14050471", totp_hmacSha1.generate(1111111111));
        assertEquals("89005924", totp_hmacSha1.generate(1234567890));
        assertEquals("69279037", totp_hmacSha1.generate(2000000000));
        assertEquals("65353130", totp_hmacSha1.generate(20000000000L));
    }

    @Test
    void generateHmacSHA256() {
        var seed = format.parseHex("3132333435363738393031323334353637383930313233343536373839303132");
        var totp_hmacSha1 = new TOTP(seed, 8, "HmacSHA256");
        assertEquals("46119246", totp_hmacSha1.generate(59));
        assertEquals("68084774", totp_hmacSha1.generate(1111111109));
        assertEquals("67062674", totp_hmacSha1.generate(1111111111));
        assertEquals("91819424", totp_hmacSha1.generate(1234567890));
        assertEquals("90698825", totp_hmacSha1.generate(2000000000));
        assertEquals("77737706", totp_hmacSha1.generate(20000000000L));
    }

    @Test
    void generateHmacSHA512() {
        var seed = format.parseHex("31323334353637383930313233343536373839303132333435363738393031323334353637383930313233343536373839303132333435363738393031323334");
        var totp_hmacSha1 = new TOTP(seed, 8, "HmacSHA512");
        assertEquals("90693936", totp_hmacSha1.generate(59));
        assertEquals("25091201", totp_hmacSha1.generate(1111111109));
        assertEquals("99943326", totp_hmacSha1.generate(1111111111));
        assertEquals("93441116", totp_hmacSha1.generate(1234567890));
        assertEquals("38618901", totp_hmacSha1.generate(2000000000));
        assertEquals("47863826", totp_hmacSha1.generate(20000000000L));
    }
}