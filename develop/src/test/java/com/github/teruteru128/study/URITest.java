package com.github.teruteru128.study;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.junit.jupiter.api.Test;

public class URITest {
    @Test
    void test1() throws URISyntaxException {
        List<URI> bases = List.of(new URI("http://localhost"), new URI("http://localhost/"), new URI("http://localhost/test1"), new URI("http://localhost/test2/"));
        List<String> paths = List.of("path3", "/path4", "/pat5/path6", "/path7/path8/");
        for (var b : bases) {
            for (var p : paths) {
                System.out.println(b.resolve(p));
            }
        }
    }
}
