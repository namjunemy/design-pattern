package exercise;

public class AObject {
  Ainterface ainterface;

  public AObject() {
    this.ainterface = new AinterfaceImpl();
  }

  public void funcAA() {
    ainterface.funcA();
    ainterface.funcA();
  }
}
