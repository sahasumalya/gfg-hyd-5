package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Shape square = new Square(2.0,4, "square");
        System.out.println(square.calculateCost());
        System.out.println(square.color);
        //System.out.println(square.calculateCost(2));
       // System.out.println(square.side);

        // SOLID --> I(Interface segragations)

/**
 *
 *    A  ---    C
 *    B
 *
 */




    }
}