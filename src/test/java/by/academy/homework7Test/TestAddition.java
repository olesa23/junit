package by.academy.homework7Test;

import by.academy.homework7.Task3.CalculatorAddition;
import org.junit.Assert;
import org.junit.Test;

public class TestAddition {
    @Test
    public void addition() {
        Assert.assertEquals(5, CalculatorAddition.addition(2, 3));
    }
}

