package pattern02;

public class Main {
  public static void main(String[] args) {
    Computer computer = ComputerBuilder
        .start()
        .setCpu("i5")
        .setRam("8gb")
        .setStorage("256 ssd")
        .build();

    System.out.println(computer);
  }
}
