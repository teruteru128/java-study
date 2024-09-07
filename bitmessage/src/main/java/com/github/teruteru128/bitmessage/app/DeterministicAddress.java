package com.github.teruteru128.bitmessage.app;

import java.util.List;

public record DeterministicAddress(String phrase, List<String> addresses, String signingKey,
                                   String encryptingKey) {

}
