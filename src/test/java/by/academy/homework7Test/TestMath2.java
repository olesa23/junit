package by.academy.homework7Test;

import org.junit.Assert;
import org.junit.Test;

public class TestMath2 {
    @Test
    public void testAddExact() {
        Assert.assertEquals(3, Math.addExact(2, 1));
    }
}
