package com.wipro.oops.test;

import com.wipro.oops.circle;
import com.wipro.oops.Rectangle;
import com.wipro.oops.Square;

public class ShapeTest {
    public static void main(String[] args) {
        circle circle = new circle("Red", true, 7.5);
        Rectangle rectangle = new Rectangle("Blue", false, 10.0, 5.0);
        Square square = new Square("Green", true, 6.0);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
