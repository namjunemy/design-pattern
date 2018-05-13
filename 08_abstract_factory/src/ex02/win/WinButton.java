package ex02.win;

import ex02.abst.Button;

public class WinButton implements Button {
  @Override
  public void click() {
    System.out.println("win button");
  }
}
