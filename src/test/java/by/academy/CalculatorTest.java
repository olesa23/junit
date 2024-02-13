package by.academy;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum(){
        Assert.assertEquals(4,2+2);

    }
    @Test
    public void testMultiply(){
        Assert.assertEquals(4, 3 * 2);
    }

}

