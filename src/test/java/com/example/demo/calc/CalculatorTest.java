package com.example.demo.calc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Test
    public void should_add() {

        final Calculator calc = new Calculator();

        final long result = calc.add(1, 2);

        Assert.assertEquals(3, result);
    }
}
