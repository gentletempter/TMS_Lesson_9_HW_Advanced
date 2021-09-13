package com.android.tms.figure;

import com.android.tms.exception.figureException;
import org.apache.log4j.Logger;

public class Circle extends Figure {
    private static final Logger log = Logger.getLogger(Circle.class);
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
    public float getArea() throws figureException {
        if (checkCircle(r)) {
            log.info("Calculating area");
            return (float) (Math.PI * r * r);
        } else {
            throw new figureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }

    @Override
    public float getPerimeter() throws figureException {
        if (checkCircle(r)) {
            log.info("Calculating perimeter");
            return (float) (2 * Math.PI * r);
        } else {
            throw new figureException(exceptionMessage, this.getClass().getSimpleName());
        }
    }
}
