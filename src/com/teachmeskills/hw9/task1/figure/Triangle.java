package com.teachmeskills.hw9.task1.figure;

/**
 * Class for the triangle figures type
 * contains fields sideH, height, sideFirst, sideSecond
 * contains constructor
 * contains three required method calculate area, calculate perimeter, information output.
 */
public final class Triangle extends Figure {

    public double sideH;
    public double height;
    public double sideFirst;
    public double sideSecond;

    public Triangle(String name, double sideH, double height, double sideFirst, double sideSecond) {
        super(name);
        this.sideH = sideH;
        this.height = height;
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
    }

    @Override
    public void calculateArea(double area) {
        if (this.sideH <= 0 || this.height <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            area = (this.sideH * this.height) / 2;
            System.out.println("The area is: " + area);
        }

    }

    @Override
    public double calculatePerimeter(double perimeter) {
        if (this.sideH <= 0 || this.sideFirst <= 0 || this.sideSecond <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            perimeter = this.sideH + this.sideFirst + this.sideSecond;
            System.out.println("The perimeter is: " + perimeter);
            System.out.println("___________________________________");
        }
        return perimeter;
    }

    public void informationOutput() {
        System.out.println();
        System.out.println("The name of the triangle is: " + super.name + "," + " The first side of the triangle is equal to: " + this.sideFirst + "," + " The second side of the triangle is equal to: " + this.sideSecond + "," + " The third side of the triangle is equal to: " + this.sideH + "," + " The height of the triangle is: " + this.height);
        System.out.println();
    }
}
