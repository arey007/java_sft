package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Alex");

        Square square = new Square(8);
        System.out.println("Площадь квадрата со стороной " + square.l + " равна " + square.area());

        Rectangle rectangle = new Rectangle(5,4);
        System.out.println("Площадь прямоугольника со сторонами " +rectangle.a + " и " +rectangle.b + " равна " + rectangle.area());


    }

    public static void hello(String somebody) {

        System.out.println("hi, " + somebody);
    }







}
