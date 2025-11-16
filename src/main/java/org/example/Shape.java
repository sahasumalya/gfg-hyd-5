package org.example;

public abstract class Shape {
    protected String name;
    public String color = "yellow";
    protected int rate;
    protected int numberOfSides;
    public abstract double calculateArea();

    Shape(String name, int rate){
        this.name = name;
        this.rate = rate;
    }

    Shape(String name){
        this.name = name;
        this.rate = 10;
    }

    Shape(int rate){
        this.name = "default";
        this.rate = 10;
    }

    public double calculateCost(){
        System.out.println("from shape ");
        double area = this.calculateArea();
        return area * rate;
    }

    public int calculateCost(int surgeFactor){
        double area = this.calculateArea();
        return (int)area * rate * surgeFactor;
    }


}
