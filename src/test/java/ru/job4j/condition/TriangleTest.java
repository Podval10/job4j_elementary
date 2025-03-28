package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void WhenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean result = Triangle.exist(ab,ac,bc);
        assertThat(result).isTrue();
    }

    @Test
    void WhenNotExist() {
        double ab = 2;
        double ac = 2;
        double bc = 6;
        boolean result = Triangle.exist(ab,ac,bc);
        assertThat(result).isFalse();


    }
}