package ex02.linux;

import ex02.abst.TextArea;

public class LinuxTextArea implements TextArea {
  @Override
  public String getText() {
    return "linux textarea";
  }
}
