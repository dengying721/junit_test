package com.denggl.util;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void factorial() throws Exception{
        assertEquals(120, new Math().factorial(5));
    }

    @Test
    public void fibonacci() throws Exception{
        assertEquals(21, new Math().fibonacci(9));
    }

    @Test(expected = Exception.class)
    public void testFactorialException() throws Exception {
        new Math().fibonacci(-1);
        fail("factorial参数为负数没有抛出异常");
    }

    @Test(timeout = 2000)
    public void sort() throws Exception{
        int[] arr = new int[50000];
        int arrLength = arr.length;

        Random r = new Random();
        for (int i = 0; i < arrLength; i++) {
            arr[i] = r.nextInt(arrLength);
        }

        new Math().sort(arr);
    }
}