package by.academy.homework7Test;

import by.academy.homework7.Task3.CalculatorAddition;
import org.junit.Assert;
import org.junit.Test;

public class TestMultiplication {
    @Test
    public void multiplication(){
        Assert.assertEquals(4, CalculatorAddition.multiplication(2 , 2));
    }

}
