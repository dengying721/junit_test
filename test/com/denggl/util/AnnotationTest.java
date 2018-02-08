package com.denggl.util;

import org.junit.*;
import java.net.SocketPermission;
import static org.junit.Assert.*;

// @BeforeClass和@AfterClass在类被实例化前（构造方法执行前）就被调用了，而且只执行一次，通常用来初始化和关闭资源。
// @Before和@After和在每个@Test执行前后都会被执行一次
// 被@Ignore标记的测试方法不会被执行

public class AnnotationTest{
    static int i = 0;

    public AnnotationTest(){
        System.out.println("构造方法");
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }
    @Test
    public void test1() {
        i++;
        System.out.println("test1" + i);
    }

    @Test
    public void test2() {
        i++;
        System.out.println("test2" + i);
    }

    @Ignore
    public void test3() {
        System.out.println("test3");
    }
}
