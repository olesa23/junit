package by.academy.homework7Test;

import by.academy.homework7.Task3.CalculatorAddition;
import org.junit.Assert;
import org.junit.Test;

public class TestSubtraction {
    @Test
    public void subtraction() {
        Assert.assertEquals(5, CalculatorAddition.subtraction(8, 3));
    }
}



