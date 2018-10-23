package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Alex");

        double l = 8;
        System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));

        double a = 5;
        double b = 4;
        System.out.println("Площадь прямоугольника со сторонами " +a + " и " +b + " равна " + area(a,b));
    }

    public static void hello(String somebody) {

        System.out.println("hi, " + somebody);
    }

    public static double area (double len){
        return len*len;
    }

    public static double area (double a, double b){
        return  a * b;
    }
}
