package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void SumPlusIndexResult15() {
        int start= 0;
        int finish= 5;
        int result= Counter.sum(start,finish);
        int expected= 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void SumPlusIndexResult33() {
        int start=3;
        int finish=8;
        int result= Counter.sum(start,finish);
        int expected=33;
        assertThat(result).isEqualTo(expected);
    }
}