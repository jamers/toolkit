package io.jamers.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticTest {
    @Test
    public void orderOfOperators() {
        int x = 1;
        x += x++;
        System.out.println(x);
        assertEquals(2, x);
    }
}