package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

  public static void main(String[] args) {
    hello("Anna");
    hello("Friend!");

    int l = 6;
    int s = l * l;
    System.out.println("Ploschadj kvadrata so storonoj " + l + " = " + s);

    double len = 5;
    System.out.println("Ploschadj kvadrata so storonoj " + len + " = " + area(len));

    double s1 = 5;
    double s2 = 6;
    System.out.println("Ploschadj prjamougoljnika so storonami " + s1 + " i "+ s2 + " = " + area(s1,s2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b){
    return a * b;
  }


}