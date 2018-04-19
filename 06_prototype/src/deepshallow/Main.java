package deepshallow;

public class Main {
  public static void main(String[] args) {
    Cat navi = new Cat();
    navi.setName("navi");
    System.out.println(navi.getName());

    Cat yo = navi;
    yo.setName("yo");
    System.out.println(yo.getName());
  }
}
