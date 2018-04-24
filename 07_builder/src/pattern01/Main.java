package pattern01;

public class Main {
  public static void main(String[] args) {
    ComputerFactory computerFactory = new ComputerFactory();
    computerFactory.setBluePrint(new MacBluePrint());
    computerFactory.make();
    Computer computer = computerFactory.get();
    System.out.println(computer);
  }
}
