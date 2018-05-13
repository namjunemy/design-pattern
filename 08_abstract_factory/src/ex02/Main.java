package ex02;

import ex02.abst.GuiFactory;
import ex02.concrete.FactoryInstance;

public class Main {
  public static void main(String[] args) {
    GuiFactory factory = FactoryInstance.getGuiFactory();
    factory.createButton().click();
    System.out.println(factory.createTextArea().getText());
  }
}
