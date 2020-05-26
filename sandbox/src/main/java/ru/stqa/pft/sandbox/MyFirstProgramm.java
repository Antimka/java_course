package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

  public static void main(String[] args) {
    //tut my vyzyvaem funkciju s opredeljonnym parametrom
    hello("Anna");
    hello("Friend!");

    int l = 6;
    int m = l * l;
    System.out.println("Ploschadj kvadrata so storonoj " + l + " = " + m);

    Square s = new Square(5);
    //uzhe otdeljnoe opredelenie storony ne nuzhno, tak kak ispoljzuetsa konstruktor i teperj znachnija peredajutsa, kak parametry - s.l = 5;
    System.out.println("Ploschadj kvadrata so storonoj " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(6, 7);
    //r.a = 5;
    //r.b = 6;
    System.out.println("Ploschadj prjamougoljnika so storonami " + r.a + " i "+ r.b + " = " + r.area());
  }

  //eto funkcija
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}