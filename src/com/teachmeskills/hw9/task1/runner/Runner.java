package com.teachmeskills.hw9.task1.runner;

import com.teachmeskills.hw9.task1.figure.Circle;
import com.teachmeskills.hw9.task1.figure.Figure;
import com.teachmeskills.hw9.task1.figure.Rectangle;
import com.teachmeskills.hw9.task1.figure.Triangle;

/**
 * Class with method main to run the program
 * eight objects were created
 * variables "sumPer", "area", "perimeter" are declared
 * an array of figures has been created.
 */
public class Runner {

    public static void main(String[] args) {

        Figure triangle1 = new Triangle("First triangle", 4, 2, 3, 5);
        Figure triangle2 = new Triangle("Second triangle", 5, 7, 4, 1);
        Figure triangle3 = new Triangle("Third triangle", 0, 1, -5, 6);
        Figure rectangle1 = new Rectangle("First rectangle", 5, 7);
        Figure rectangle2 = new Rectangle("Second rectangle", 1, 2);
        Figure rectangle3 = new Rectangle("Third rectangle", 0, -7);
        Figure circle1 = new Circle("First circle", 3);
        Figure circle2 = new Circle("Second circle", -4);

        double sumPer = 0;
        double area = 0;
        double perimeter = 0;

        Figure[] array = {triangle1, triangle2, rectangle1, rectangle2, circle1};
        for (Figure figure : array) {
            figure.informationOutput();
            figure.calculateArea(area);
            sumPer += figure.calculatePerimeter(perimeter);
        }
        System.out.println();
        System.out.println("The sum of the perimeters is: " + sumPer);
        System.out.println("___________________________________");

        System.out.println();
        triangle3.calculateArea(area);
        triangle3.calculatePerimeter(perimeter);
        rectangle3.calculateArea(area);
        rectangle3.calculatePerimeter(perimeter);
        circle2.calculateArea(area);
        circle2.calculatePerimeter(perimeter);


    }
}
