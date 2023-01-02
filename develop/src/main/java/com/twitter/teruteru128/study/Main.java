package com.twitter.teruteru128.study;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

import com.twitter.teruteru128.encode.Base58;

/**
 * Main
 * 秘密鍵かな？
 * ioxhJc1lIE2m+WFdBg3ieQb6rk8sSvg3wRv/ImJz2tc=
 * cm2E2vmE0Nd8aVP/4Ph2S1R6C5bkC1H7CiUBzbcDG3U=
 * BixgbLYk35GP+XHYdK/DgSWIUXyCTwCwEtY4h/G22dw=
 * BH4RDmdo0Yq0Ftiw0lm9ej5BmpZ35kEw2kaWZlZ0Do8=
 * lMhxDh6RPpWOsnJMeS12pTJ/j7EPn+ugpdbNQCGbiwc=
 * 9hZn+KDlwjgrbyFpaX5ibuaO4QfaFbIL79NUrwJlcRQ=
 * T+tDF4I700WFkFhGieYxWgQKPO/MDcntDYzMrqQSZjzwV2DzaI1OM/CsJWE30WBqMI1SxbEQHufR1A76I7ayWN==
 * nySkaCQxGErccmiqLznSQduXgFICpjnl2bo7n3FAhQMlku79plIeL85/etpN865GAnlUpErSppEYHvn4couGh3==
 * ns2bQQ4zlnfcCTSAxEH3gDDYHcBswKw92jQeEgm+9tse74XdX+LNwgfw7OsMUjOGtLMb7R/kXNRXYv1AHi71iV==
 * NxhJ5JwWhUtUccCfJNtVqzdpCMGOaAtknmcEKLyglZFNXE66EiFi9wPFekwekx3ln8m9v5wnfv7V8jSrpZ/SHQ==
 * +3n5qDbtpicXBy+Yyol/TJkg2IoQ01vZ/U2SvgpP+Fdm4DrIYngY7X0ZS53rc/KKIHT//jVqNwNBz1sGFyYUDg==
 * cLtHGFI7X/Xl6Ly03DczMzl2bsHJmI2BMQKKCckUek5vTIiltDPfT3PxdT6zxW1LzwVqJIsQEkxxPNTswgpSFg==
 * pMQBNF+F12AXT3T0mQq7S0l1VcCr/Dw2Q54zeuHH0/1ExLgbhHEsmAHf3WR9nK/Ku1Mc/eU3vaAO78yplJB76A==
 * QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQQ==
 * D8BH6DLNJekZ5jiiIVSnyS5ziE9XJSRG5bA9OdiFdjee6HTxHxFQXyEQdhfN+E69RKToLYXGDxK2X9v9eEcbUxdSp9tbptXegxkNQgIxg97BAq9gtmxPm4Ebngl/Q/I4
 * cLJlMSoCYBgR0d/bg7zG1B77BBWy7f1KLiJG5b8mPmlD8dAJKCZSEFRdWLuxSyRjgFFeiMm4+l+2SNIhL/SBma7ABhg232DeJkbUcZJKqBfAI9taPQ5Y9bwIXrcjxqMx
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var addresses = List.<String>of("BM-FHmDQSDbdMPfupgfJRmwcrYxyXWW", "BM-FHhkCqEMdaDSfLp8NjpSXSA9H7Td",
                "BM-FHTwVyDjLbgDre5o3zjyvYyUoayE", "BM-FHHruYby8RJpzbJpwittms4EN6os", "BM-FHn4t61WjLzP1uGQjDWnYf1Uc5yA",
                "BM-FHPpyWS3v34iRzNSws6CcKJxkJyY", "BM-FJ1BVp5Xgp6AhnVrGfkRDAmZfa3R", "BM-FHjxHBupmdTJPnmPb6ttCQeRawEP",
                "BM-FHYMSFoaWtTVyLqxKtQ5cag7Hsnq", "BM-FHvUT4jcqztsbVmg5cDhEMYM4jDM", "BM-FHf27n9tgNEUJmYLCf41tgfT5ziX",
                "BM-FHx34itWM8V7VhGbxBHyRYzPGdva", "BM-FHFy9YmFaJx8KxzNprdpm2qTvj7p", "BM-FHc3RzehQ8pvHTsyhT1hACnkg7dM",
                "BM-FHXtqFFNxYD52aQsNDubqdisCNn5", "BM-FHGhmwe8e2nsaSrzLpVSSUQSCkpx", "BM-FHKWBcYPc91UUBeaw7G9o7BZAneV",
                "BM-FHSeteWKSQSUqMTJ4pQEZJ8uYxfG");
        var buffer = ByteBuffer.allocate(20);
        for (var address : addresses) {
            var a = Base58.decode(address.replaceAll("BM-", ""));
            var trimedripe = Arrays.copyOfRange(a, 2, a.length - 4);
            System.arraycopy(trimedripe, 0, buffer.array(), 20 - trimedripe.length,
                    trimedripe.length);
            System.out.printf("%d,%s%n", Long.numberOfLeadingZeros(buffer.getLong(0)), address);
        }
    }
}
