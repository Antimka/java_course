package ru.stqa.pft.sandbox;

public class Point {

  //eto objekty klassa - koordinaty opisyvajuschie tochku v 2-uh-mernoj ploskosti i sami tochki
  public double x;
  public double y;

  //eto konstruktor dlja koordinat tochki
  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }

  //eto konstruktor iz interneta, chtoby zadatj vyvod koordinat tochki na ekran
  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }

  //eto to, chto sdelali drugie - screen v skype - opredeljaju pervuju tochku i rasstojanie nahozhu ispoljzuja kak argument vtoruju tochku
  //public static double distance(Point p1, Point p2) {
  public double distance(Point p2) {
    double x = p2.x - this.x;
    double y = p2.y - this.y;
    return Math.sqrt(x * x + y * y);
  }
}


//Math.pow(y, 2) - vozvodit chislo v ukazannuju stepenj - y vo vtoruju stepenj