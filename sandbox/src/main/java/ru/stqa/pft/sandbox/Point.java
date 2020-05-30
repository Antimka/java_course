package ru.stqa.pft.sandbox;

public class Point {

  //eto objekty klassa - koordinaty opisyvajuschie tochku v 2-uh-mernoj ploskosti i sami tochki
  public double x;
  public double y;

  //eto konstruktor
  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }

  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }

  public static double distance(Point p1, Point p2) {
    double x = p2.x - p1.x;
    double y = p2.y - p1.y;
    return Math.sqrt(x * x + y * y);
  }
}


//Math.pow(y, 2) - vozvodit chislo v ukazannuju stepenj - y vo vtoruju stepenj