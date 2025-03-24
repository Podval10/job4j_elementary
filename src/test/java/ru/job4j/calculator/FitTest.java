package ru.job4j.calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class FitTest {
    @Test
    void whenMan186Then98() {
        short input = 186;
        double expected = 98.89;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman156Then52() {
        short inputw= 156;
        double expected=52.9;
        double output=Fit.womanWeight(inputw);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}

