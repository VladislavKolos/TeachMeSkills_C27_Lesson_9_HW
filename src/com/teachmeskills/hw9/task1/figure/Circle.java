package com.teachmeskills.hw9.task1.figure;

import com.teachmeskills.hw9.task1.util.Const;

/**
 * Final class only for the circle figures type
 * contains fields pi and radius
 * contains constructor
 * contains three required method calculate area, calculate perimeter, information output.
 */
public final class Circle extends Figure {

    public double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea(double area) {
        if (this.radius <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            area = Const.PI * this.radius * this.radius;
            System.out.println("The area is: " + area);
        }
    }

    @Override
    public double calculatePerimeter(double perimeter) {
        if (this.radius <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            perimeter = 2 * Const.PI * this.radius;
            System.out.println("The perimeter is: " + perimeter);
            System.out.println("___________________________________");
        }
        return perimeter;
    }

    public void informationOutput() {
        System.out.println();
        System.out.println("The name of the circle is: " + super.name + "," + " Pi is: " + Const.PI + "," + " The radius of the circle is: " + this.radius);
        System.out.println();
    }
}
