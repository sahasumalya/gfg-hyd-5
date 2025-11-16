package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // shape --> quadrilateral --> parallelogram --> square
        //

        Shape shape = new Square(2.0,4, "square");
        //Shape square = new Square(2.0,4, "square");
        //System.out.println(square.calculateCost());
        //System.out.println(square.color);
        //System.out.println(square.calculateCost(2));
       // System.out.println(square.side);

        // SOLID --> I(Interface segragations)
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton");
        System.out.println(singleton1==singleton2);

        /*Addition addition = new Addition() {
            @Override
            public int add(int a, int b) {
                return 0;
            }
        };*/
        //System.out.println(addition.add(1,2));
        Addition addition2 = (a,b)->{
            return a+b;
        };
        //Addition addition2 = Integer::sum;


        System.out.println(addition2.add(1,2));
/**
 *
 *    A  ---    C
 *    B
 *
 */
       /*try{
           System.out.println(1/0);
       } catch (ArithmeticException e) {
           System.out.println("ArithmeticException");
           e.printStackTrace();
       }
       catch (Exception e) {
           System.out.println("exception");
           System.out.println(e.getMessage());
       } catch (Throwable t){
           System.out.println("throwable");
           System.out.println(t.getMessage());
       }*/
       try{
           try{
               fun2();
           } catch (Exception e){
               System.out.println(e.getMessage());
               throw e;
           }

       } catch (Exception e){
           System.out.println(e.getMessage());
       }


       }

    public static void fun1() throws Exception{
        System.out.println("Hello, fun!");
        throw new Exception("test exception");
    }

    public static void fun2() throws Exception {
        System.out.println("Hello, fun2!");
        try{
            try{
                fun1();
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
                //throw e;
                throw new RuntimeException("something is not working");
            } catch (Exception e){
                System.out.println(e.getMessage());
                throw e;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            throw new RuntimeException("Bad Request");
        }

    }
}