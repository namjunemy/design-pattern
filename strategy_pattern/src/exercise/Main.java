package exercise;

public class Main {
  public static void main(String[] args) {
    Ainterface ainterface = new AinterfaceImpl();
    ainterface.funcA();

    AObject aObject = new AObject();
    aObject.funcAA();
  }
}
