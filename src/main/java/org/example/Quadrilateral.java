package org.example;

public abstract class Quadrilateral extends Shape {
    Quadrilateral(String name, int rate) {
        super(name, rate);
        this.numberOfSides = 4;
    }

    protected abstract double[] calculateDiagonals();
}
