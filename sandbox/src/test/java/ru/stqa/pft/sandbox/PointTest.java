package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistanceOdin(){

    Point p1 = new Point(2,3);
    Point p2 = new Point(5,7);

    Assert.assertEquals(p2.distance(p1),5);
  }

  @Test
  public void testDistanceDva(){

    Point p1 = new Point(4,3);
    Point p2 = new Point(6,10);

    Assert.assertEquals(p2.distance(p1),7);
  }

}
