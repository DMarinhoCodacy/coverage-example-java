package com.codacy.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewMathTest {
    @Test
    public void shouldAddNumbers() {
        NewMath math = new NewMath(23);
        

        assertEquals(7, math.magicAdd(3, 4));
        assertEquals(8, math.magicAdd(4, 4));
    }

    // Uncomment this to have 100% coverage
//    @Test
//    public void shouldSubtractIfMagicNumber() {
//        Math math = new Math(4);
//        assertEquals(1, math.magicAdd(3, 4));
//    }
}
