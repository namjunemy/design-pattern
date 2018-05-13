package ex02.linux;

import ex02.abst.Button;

public class LinuxButton implements Button {
  @Override
  public void click() {
    System.out.println("linux button");
  }
}
