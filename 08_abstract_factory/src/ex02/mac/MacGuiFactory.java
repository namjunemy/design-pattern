package ex02.mac;

import ex02.abst.Button;
import ex02.abst.GuiFactory;
import ex02.abst.TextArea;

public class MacGuiFactory implements GuiFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public TextArea createTextArea() {
    return new MacTextArea();
  }
}
