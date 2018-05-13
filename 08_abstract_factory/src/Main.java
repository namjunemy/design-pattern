import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import alton.AltonFactory;
import sam.SamFactory;

public class Main {
  public static void main(String[] args) {
    //BikeFactory bikeFactory = new SamFactory();
    BikeFactory bikeFactory = new AltonFactory();
    Body body = bikeFactory.createBody();
    Wheel wheel = bikeFactory.createWheel();
    System.out.println(body.getClass() + " " + wheel.getClass());
  }
}
