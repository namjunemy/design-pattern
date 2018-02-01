public class Main {
  public static void main(String[] args) {
    Adapter adapter = new AdapterImpl();

    System.out.println(adapter.twiceOf(100F));
    System.out.println(adapter.halfOf(88F));
  }
}
