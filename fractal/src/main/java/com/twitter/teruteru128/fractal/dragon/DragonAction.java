package com.twitter.teruteru128.fractal.dragon;

import java.util.concurrent.RecursiveAction;

public class DragonAction extends RecursiveAction {
    private static final long serialVersionUID = 0L;

    private int depth;
    private double dx;
    private double dy;
    private int sign;

    public DragonAction(int depth, double dx, double dy, int sign) {
        this.depth = depth;
        this.dx = dx;
        this.dy = dy;
        this.sign = sign;
    }

    @Override
    protected void compute() {
        if (depth == 0) {
                System.out.printf("l %f %f%n", dx, -dy);
        } else {
            invokeAll(new DragonAction(depth - 1, (dx - sign * dy) / 2, (dy + sign * dx) / 2, 1),
                    new DragonAction(depth - 1, (dx + sign * dy) / 2, (dy - sign * dx) / 2, -1));
        }
    }
}
