package ru.stqa.pft.sandbox;

public class Rectangle {

  public double a;
  public double b;

  //eto konstruktor
  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  //eto funkcija, kotoaja teperj metod
  public double area() {
    return this.a * this.b;
  }
}
