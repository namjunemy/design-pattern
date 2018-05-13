package ex01.alton;

import ex01.abst.BikeFactory;
import ex01.abst.Body;
import ex01.abst.Wheel;

public class AltonFactory implements BikeFactory {
  @Override
  public Body createBody() {
    return new AltonBody();
  }

  @Override
  public Wheel createWheel() {
    return new AltonWheel();
  }
}
