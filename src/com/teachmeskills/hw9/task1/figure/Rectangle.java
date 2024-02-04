package com.teachmeskills.hw9.task1.figure;

/**
 * Class for the rectangle figures type
 * contains fields length and width
 * contains constructor
 * contains three required method calculate area, calculate perimeter, information output.
 */
public final class Rectangle extends Figure {

    public double length;
    public double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea(double area) {
        if (this.length <= 0 || this.width <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            area = this.length * this.width;
            System.out.println("The area is: " + area);
        }
    }

    @Override
    public double calculatePerimeter(double perimeter) {
        if (this.length <= 0 || this.width <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            perimeter = (this.length + this.width) * 2;
            System.out.println("The perimeter is: " + perimeter);
            System.out.println("___________________________________");
        }
        return perimeter;
    }

    public void informationOutput() {
        System.out.println();
        System.out.println("The name of the rectangle is: " + super.name + "," + " The length of the rectangle is: " + this.length + "," + " The width of the rectangle is: " + this.width);
        System.out.println();
    }
}
