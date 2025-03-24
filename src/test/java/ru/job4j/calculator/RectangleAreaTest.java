package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }




    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.squareNew(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenP4K1Square1Dot68() {
        double expected = 1.68D;
        int p = 6;
        double k = 3;
        double output = RectangleArea.squareNew(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}