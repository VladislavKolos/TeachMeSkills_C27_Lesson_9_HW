package com.teachmeskills.hw9.task1.figure;

/**
 * Abstract sealed class only for type of the figures
 * contains field name
 * contains constructor
 * contains three required abstract methods: calculate area, calculate perimeter, information output.
 */
public abstract sealed class Figure permits Circle, Rectangle, Triangle {

    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract void calculateArea(double area);

    public abstract double calculatePerimeter(double perimeter);

    public abstract void informationOutput();
}
