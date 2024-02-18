package by.academy.homework7Test;

import by.academy.homework7.Task3.CalculatorAddition;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
@RunWith(value = Parameterized.class)
    public class TestParametrizeMultiplication extends Assert {
        private int valueA;
        private int valueB;
        private int expected;

        public TestParametrizeMultiplication(int valueA, int valueB, int expected) {
            this.valueA = valueA;
            this.valueB = valueB;
            this.expected = expected;
        }

        @Parameterized.Parameters(name = "{index}:multiplication{0} and {1}={2}")
        public static List<Integer[]> dataForTest() {
            return Arrays.asList(new Integer[][]{
                    {1, 2, 2},
                    {2, 2, 4},
                    {2, 3, 6}});
        }

        @Test
        public void ParametrizeTest() {
            assertEquals(expected,CalculatorAddition.multiplication(valueA , valueB));

        }
    }


