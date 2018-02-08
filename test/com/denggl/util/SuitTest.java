package com.denggl.util;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                JavaTest.class,
                AnnotationTest.class,
                MathTest.class
        })

public class SuitTest {
}
