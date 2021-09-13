package com.android.tms.figure;

import com.android.tms.exception.figureException;
import lombok.extern.log4j.Log4j;

@Log4j
public class Triangle extends Figure {

    private float a;
    private float b;
    private float c;
    private final String exceptionMessage = "The triangle does not exist";

    public Triangle(float a, float b, float c) {
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean checkTriangle(float a, float b, float c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    @Override
    public float getPerimeter() throws figureException {
        if (checkTriangle(a, b, c)) {
            log.info("Calculating perimeter");
            return a + b + c;
        } else {
            throw new figureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }

    /**
     * Using Geron's formula
     */
    @Override
    public float getArea() throws figureException {
        if (checkTriangle(a, b, c)) {
            log.info("Calculating area");
            return (float) ((Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (b + c - a))) / 4);
        } else {
            throw new figureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }
}