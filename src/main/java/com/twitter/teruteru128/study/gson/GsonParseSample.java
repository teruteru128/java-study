package com.twitter.teruteru128.study.gson;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class GsonParseSample {

    public static void main(String[] args) {
        String i = "18.5";
        Gson gson = new Gson();
        double j = gson.fromJson(i, Double.TYPE);
        System.out.println(j);
        var k = gson.fromJson(i, JsonPrimitive.class);
        System.out.println(k);
        System.out.println(k.getClass());
        var obj = gson.fromJson("{\"test\": 18.5}", JsonObject.class);
        System.out.println(obj);
        System.out.println(obj.get("test"));
    }

}
