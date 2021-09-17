package com.android.tms.figure;

import com.android.tms.exception.FigureException;
import lombok.extern.log4j.Log4j;

@Log4j
public class Rectangle extends Figure {
    private float a;
    private float b;
    private final String exceptionMessage = "The rectangle does not exist";

    public Rectangle(float a, float b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    private boolean checkRectangle(float a, float b) {
        return (a > 0) && (b > 0);
    }

    @Override
    public float getArea() throws FigureException {
        if (checkRectangle(a, b)) {
            log.info("Calculating area");
            return a * b;
        } else {
            throw new FigureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }

    @Override
    public float getPerimeter() throws FigureException {
        if (checkRectangle(a, b)) {
            log.info("Calculating perimeter");
            return 2 * (a + b);
        } else {
            throw new FigureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }
}