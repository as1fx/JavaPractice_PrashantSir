package com.exanple.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(2);
        Rectangle rec = new Rectangle(4, 6);

        double cirRadious = Math.PI * Math.pow(cir.radious, 2);
        double recArea = rec.height * rec.breath;

        System.out.printf("Area of Circle : %f Area of Rectangle : %f", cirRadious, recArea);
    }
}
