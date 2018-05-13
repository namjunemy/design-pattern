package ex01.sam;

import ex01.abst.BikeFactory;
import ex01.abst.Body;
import ex01.abst.Wheel;

public class SamFactory implements BikeFactory {
  @Override
  public Body createBody() {
    return new SamBody();
  }

  @Override
  public Wheel createWheel() {
    return new SamWheel();
  }
}
