package ex02.concrete;

import ex02.abst.GuiFactory;
import ex02.linux.LinuxGuiFactory;
import ex02.mac.MacGuiFactory;
import ex02.win.WinGuiFactory;

public class FactoryInstance {
  public static GuiFactory getGuiFactory() {
    System.out.println(System.getProperty("os.name"));
    switch (System.getProperty("os.name")) {
      case "Mac OS X":
        return new MacGuiFactory();
      case "linux":
        return new LinuxGuiFactory();
      case "windows":
        return new WinGuiFactory();
    }
    return null;
  }
}
