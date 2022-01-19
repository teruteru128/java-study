package com.twitter.teruteru128.study.trip;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TripTest {

    @Test
    public void tripTest1() {
        assertEquals("Mo3x7CyGIA", Trip.calcTrip("hayaranai"));
    }

    @Test
    public void tripTest2() {
        assertEquals("JxwPtiCS.Y", Trip.calcTrip("流行らない"));
    }

    @Test
    public void tripTest3() {
        assertEquals("/WG5qp963c", Trip.calcTrip("istrip"));
    }
}
