package com.twitter.teruteru128.bitmessage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.openapitools.jackson.nullable.JsonNullableModule;

import java.io.IOException;

public class NodeTest {

    @Test
    public void test1() throws IOException {
        new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .registerModule(new JsonNullableModule()).readerFor(Node[].class)
                .<Node[]>readValue(getClass().getResource("knownnodes.json"));
    }
}
