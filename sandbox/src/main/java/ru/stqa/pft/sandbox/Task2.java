package ru.stqa.pft.sandbox;

public class Task2 {

  public static void main(String[] args) {


    Point pStart = new Point(1,2);
    Point pEnd = new Point(3,4);
    System.out.println("дистанция между точками " +pStart.x + ":" +pStart.y + " и " + pEnd.x  + ":" +pEnd.y + " равна " + pStart.distance(pEnd));

  }
}
