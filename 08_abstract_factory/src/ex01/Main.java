package ex01;

import ex01.abst.BikeFactory;
import ex01.abst.Body;
import ex01.abst.Wheel;
import ex01.alton.AltonFactory;

public class Main {
  public static void main(String[] args) {
    //BikeFactory bikeFactory = new SamFactory();
    BikeFactory bikeFactory = new AltonFactory();
    Body body = bikeFactory.createBody();
    Wheel wheel = bikeFactory.createWheel();
    System.out.println(body.getClass() + " " + wheel.getClass());
  }
}
