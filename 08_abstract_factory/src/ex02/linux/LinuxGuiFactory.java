package ex02.linux;

import ex02.abst.Button;
import ex02.abst.GuiFactory;
import ex02.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory {
  @Override
  public Button createButton() {
    return new LinuxButton();
  }

  @Override
  public TextArea createTextArea() {
    return new LinuxTextArea();
  }
}
