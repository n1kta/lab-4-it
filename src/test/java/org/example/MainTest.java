package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void Should_Return_True_For_Correct_Triangle() {
        Triangle triangle = new Triangle(2, 3, 4);

        assertTrue(triangle.getA() < triangle.getB() + triangle.getC());
        assertTrue(triangle.getB() < triangle.getC() + triangle.getA());
        assertTrue(triangle.getC() < triangle.getA() + triangle.getB());
    }

    @Test
    public void Should_Return_True_When_Object_Exist() {
        Triangle triangle = new Triangle(2, 3, 4);

        assertNotNull(triangle);
    }
}