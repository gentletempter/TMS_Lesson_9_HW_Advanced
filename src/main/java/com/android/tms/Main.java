package com.android.tms;

import com.android.tms.figure.Circle;
import com.android.tms.figure.Figure;
import com.android.tms.figure.Rectangle;
import com.android.tms.figure.Triangle;

/**
 * Designed to test system operation
 */
public class Main {
    public static void main(String[] args) {
        float perimeter;
        float sumOfPerimeters = 0;
        System.out.println("_________________Task 0 adv._________________");
        Figure[] figures = new Figure[]{
                new Triangle(2, 3, 3),
                new Rectangle(2, 4),
                new Circle(-5),
                new Triangle(2, 3, 4),
                new Circle(2)
        };

        for (Figure figure : figures) {
            try {
                perimeter = figure.getPerimeter();
                sumOfPerimeters += perimeter;
                System.out.println(figure.getClass().getSimpleName() + " --> Area: " + figure.getArea()
                        + " | Perimeter: " + perimeter);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The sum of the perimeters of all figures: " + sumOfPerimeters);
        System.out.println("____________________________________________");
    }
}
