package com.example.testcodewitharchitecture;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void 덧셈_연산을_할_수_있다() {
        // given
        long num1 = 3;
        String operator = "+";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(7, result); // JUnit5의 assert 방식
        assertThat(result).isEqualTo(7); // AssertJ의 assert 방식
    }

    @Test
    public void 뺄셈_연산을_할_수_있다() {
        // given
        long num1 = 3;
        String operator = "-";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(-1, result); // JUnit5의 assert 방식
        assertThat(result).isEqualTo(-1); // AssertJ의 assert 방식
    }

    @Test
    public void 곱셈_연산을_할_수_있다() {
        // given
        long num1 = 3;
        String operator = "*";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(12, result); // JUnit5의 assert 방식
        assertThat(result).isEqualTo(12); // AssertJ의 assert 방식
    }

    @Test
    public void 나눗셈_연산을_할_수_있다() {
        // given
        long num1 = 8;
        String operator = "/";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, operator, num2);

        // then
        assertEquals(2, result); // JUnit5의 assert 방식
        assertThat(result).isEqualTo(2); // AssertJ의 assert 방식
    }

    @Test
    public void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
        // given
        long num1 = 3;
        String operator = "x";
        long num2 = 4;
        Calculator calculator = new Calculator();

        // when
        // then
        assertThrows(InvalidOperaterException.class, () -> {
            calculator.calculate(num1, operator, num2);
        });


    }
}
