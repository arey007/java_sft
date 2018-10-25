package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistance (){
    Point pStart = new Point(5,11);
    Point pEnd = new Point(3,4);

    Assert.assertEquals (pStart.distance(pEnd),7.280109889280518);

  }
}
