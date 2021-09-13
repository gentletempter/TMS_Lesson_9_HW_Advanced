package com.android.tms.figure;

import com.android.tms.exception.figureException;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test(expected = figureException.class)
    public void getPerimeter() throws figureException {
        Figure triangle = new Triangle(5, 5, 10);
        triangle.getPerimeter();
    }

    @Test(expected = AssertionError.class)
    public void getArea() throws figureException {
        Figure triangle = new Triangle(5, 5, 9);
        assertEquals(11, triangle.getArea(), 0.0001);
    }
}