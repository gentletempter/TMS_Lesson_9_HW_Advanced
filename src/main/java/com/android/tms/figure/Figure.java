package com.android.tms.figure;

import com.android.tms.exception.FigureException;
import lombok.Getter;

/**
 * Provides basic functionality
 */
public abstract class Figure {
    @Getter
    private float a;
    @Getter
    private float b;
    @Getter
    private float c;

    public Figure(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Figure(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Figure(float a) {
        this.a = a;
    }

    /**
     * Calculation of the area of the figure
     */
    public abstract float getArea() throws FigureException;

    /**
     * Calculation of the perimeter of the figure
     */
    public abstract float getPerimeter() throws FigureException;
}