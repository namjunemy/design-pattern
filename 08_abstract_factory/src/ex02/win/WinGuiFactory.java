package ex02.win;

import ex02.abst.Button;
import ex02.abst.GuiFactory;
import ex02.abst.TextArea;

public class WinGuiFactory implements GuiFactory {
  @Override
  public Button createButton() {
    return new WinButton();
  }

  @Override
  public TextArea createTextArea() {
    return new WinTextArea();
  }
}
