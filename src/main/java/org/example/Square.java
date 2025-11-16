package org.example;

public class Square extends ParalleloGram {
     public double side;
     public String color;
     public Square(double side, int rate, String name){
         super(name, rate);
         this.side = side;
         //this.color = "red";
         super.color = "purple";

     }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    protected double[] calculateDiagonals() {
        return new double[0];
    }

    @Override
    public double calculateCost(){
        System.out.println("from square ");
        double area = this.calculateArea();
        return area * rate * side;
    }
}
