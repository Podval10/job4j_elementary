package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00ToMinus20Then2() {
        double expected1 = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = -2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected1, withPrecision(0.01));
    }

    @Test
    void when32To50Then2Dot82() {
        double expected2 = 2.82;
        int x1 = 3;
        int y1 = 2;
        int x2 = 5;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected2, withPrecision(0.01));
    }

    @Test
    void when00To20Then2a() {
        double itog = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance1(b);
        assertThat(distance).isEqualTo(itog, withPrecision(0.01));
    }

    @Test
    void when00ToMinus20Then2a() {
        double itog1 = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, -2);
        double distance = a.distance1(b);
        assertThat(distance).isEqualTo(itog1, withPrecision(0.01));

    }

    @Test
    void when32To50Then2Dot82a() {
        double itog2 = 2.82;
        Point a = new Point(3, 2);
        Point b = new Point(5, 0);
        double distance = a.distance1(b);
        assertThat(distance).isEqualTo(itog2, withPrecision(0.01));
    }
}