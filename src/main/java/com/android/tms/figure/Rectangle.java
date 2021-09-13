package com.android.tms.figure;

import com.android.tms.exception.figureException;
import org.apache.log4j.Logger;

public class Rectangle extends Figure {
    private float a;
    private float b;
    private final String exceptionMessage = "The rectangle does not exist";
    private static final Logger log = Logger.getLogger(Rectangle.class);

    public Rectangle(float a, float b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    private boolean checkRectangle(float a, float b) {
        return (a > 0) && (b > 0);
    }

    @Override
    public float getArea() throws figureException {
        if (checkRectangle(a, b)) {
            log.info("Calculating area");
            return a * b;
        } else {
            throw new figureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }

    @Override
    public float getPerimeter() throws figureException {
        if (checkRectangle(a, b)) {
            log.info("Calculating perimeter");
            return 2 * (a + b);
        } else {
            throw new figureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }
}