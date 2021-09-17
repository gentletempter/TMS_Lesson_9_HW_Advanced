package com.android.tms.figure;

import com.android.tms.exception.FigureException;
import lombok.extern.log4j.Log4j;

@Log4j
public class Circle extends Figure {
    private float r;
    private final String exceptionMessage = "The circle does not exist";

    public Circle(float a) {
        super(a);
        this.r = a;
    }

    private boolean checkCircle(float r) {
        return (r > 0);
    }

    @Override
    public float getArea() throws FigureException {
        if (checkCircle(r)) {
            log.info("Calculating area");
            return (float) (Math.PI * r * r);
        } else {
            throw new FigureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }

    @Override
    public float getPerimeter() throws FigureException {
        if (checkCircle(r)) {
            log.info("Calculating perimeter");
            return (float) (2 * Math.PI * r);
        } else {
            throw new FigureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }
}
