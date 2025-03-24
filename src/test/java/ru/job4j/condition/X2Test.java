package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
 class X2Test {
    @Test
    void whenA10B0C0X2Then40() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int result = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(result).isEqualTo(expected);
    }
        @Test
        void whenA1B1C1X1Then3() {
            int a1 = 1;
            int b1 = 1;
            int c1 = 1;
            int x1 = 1;
            int expected1 = 3;
            int result1 = X2.calc(a1, b1, c1, x1);
            assertThat(result1).isEqualTo(expected1);
        }
     @Test
     void whenA0B1C1X1Then3() {
         int a2 = 0;
         int b2 = 1;
         int c2 = 1;
         int x2 = 1;
         int expected2 = 2;
         int result2 = X2.calc(a2, b2, c2, x2);
         assertThat(result2).isEqualTo(expected2);
     }
     @Test
     void whenA1B1C0X1Then3() {

         int a3 = 1;
         int b3 = 1;
         int c3 = 0;
         int x3 = 1;
         int expected3 = 2;
         int result3 = X2.calc(a3, b3, c3, x3);
         assertThat(result3).isEqualTo(expected3);
     }
     @Test
     void whenA1B1C1X0Then3() {

        int a4=1;
        int b4=1;
        int c4=1;
        int x4=0;
        int expected4=1;
        int result4 = X2.calc(a4, b4, c4, x4);
        assertThat(result4).isEqualTo(expected4);
    }

}
