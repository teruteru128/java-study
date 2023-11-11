package com.twitter.teruteru128.study;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public record S(long seed, UUID uuid, Instant time) implements Serializable {
}
