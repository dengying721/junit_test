package com.denggl.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CalculateTest {

    private int excepted;
    private int first;
    private int second;

    public CalculateTest(int exceptedResult, int firstNumber, int secondNumber) {
        System.out.println("这里是构造方法");
        this.excepted = exceptedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    }

    @Before
    public void setUp() {
        System.out.println("执行setUp");
    }

    @After
    public void tearDown() {
        System.out.println("执行tearDown");
    }

    @Parameters
    public static Collection addedNumbers() {
        System.out.println("这里初始化参数");
        return Arrays.asList(new Integer[][]{
                {3, 1, 2},
                {5, 2, 3},
                {8, 4, 3},
                {9, 4, 5}
        });
    }

    @Test
    public void testSum() {
        Calculate add = new Calculate();
        System.out.println("相加的两个数为:" + first + " and " + second);
        assertEquals(excepted, add.sum(first, second));
    }
}