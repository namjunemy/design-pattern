package ex02.mac;

import ex02.abst.Button;

public class MacButton implements Button {
  @Override
  public void click() {
    System.out.println("mac button");
  }
}
