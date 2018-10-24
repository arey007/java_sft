package ru.stqa.pft.sandbox;

public class Point {
  public double x;
  public double y;
  double degree = 2;

  public Point (double p1, double p2){
    this.x = p1;
    this.y = p2;

  }

  public double distance(Point pEnd) {
    return Math.sqrt(Math.pow((pEnd.x - this.x),degree) + Math.pow((pEnd.y - this.y),degree) );
  }


}
