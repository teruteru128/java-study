package com.twitter.teruteru128.study;

public class Val {
    private double x0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double d;

    public Val(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Val calcD() {
        d = (y2 - y1) / (x2 - x1);
        return this;
    }

    public Val calcX0() {
        x0 = x1 - y1 / d;
        return this;
    }

    public double getX0() {
        return x0;
    }

    @Override
    public String toString() {
        return String.format("(%f(%016x), %f(%016x)), (%f(%016x), %f(%016x)) -> %f(%016x), %f(%016x)%n", x1,
                Double.doubleToLongBits(x1), y1,
                Double.doubleToLongBits(y1), x2, Double.doubleToLongBits(x2), y2, Double.doubleToLongBits(y2),
                d, Double.doubleToLongBits(d), x0, Double.doubleToLongBits(x0));
    }

}
