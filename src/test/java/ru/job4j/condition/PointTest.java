package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when1322ThenDistance2() {
        int inX1 = 1;
        int inX2 = 3;
        int inY1 = 2;
        int inY2 = 2;
        int expected = 2;
        Point a = new Point(inX1, inY1);
        Point b = new Point(inX2, inY2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3DThen3DDistance() {
        int inX1 = 1;
        int inX2 = 3;
        int inY1 = 2;
        int inY2 = 2;
        int inZ1 = 4;
        int inZ2 = 4;
        int expected = 2;
        Point a = new Point(inX1, inY1, inZ1);
        Point b = new Point(inX2, inY2, inZ2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}