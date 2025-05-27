package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }


    @Test
    void whenMin1To2Then1() {
        int left = 1;
        int right = 2;
        int result = Max.min(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenMax1To2Then() {
        int left = 2;
        int right = 3;
        int left2= 4;
        int result = Max.max(left, right,left2);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenMax1To2Then1() {
        int left = 2;
        int right = 3;
        int left2= 4;
        int right2 = 5;
        int result = Max.max(left, right,left2,right2);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

}
