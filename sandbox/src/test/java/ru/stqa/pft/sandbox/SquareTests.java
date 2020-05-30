package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {
    //sozdajom novij kvadrat, dlja kotorogo budem testirovatj ploschadj
    Square s = new Square(5);

    //i test dolzhen proverjatj, chtp ploschadj ravna 25
    //samij prostoj metod takoj
    //assert s.area() == 24;

    //ili s pomoschju Assert
    //s pomoschju FUNKCII assertEquals sravnivaem vychisljaemoe znachenie i ozhidaemoe znachenie
    //tak kak eta FUNKCIJA nahoditsa v klasse Assert, a ne v tekuschem klasse, pered nej v kachestve prefixa nuzhno ukazatj imja klassa
    //testovij framework kontroliruet takzhe sovpadenie tipov dannyh - int / doouble / ...
    Assert.assertEquals(s.area(),25);
  }
}
