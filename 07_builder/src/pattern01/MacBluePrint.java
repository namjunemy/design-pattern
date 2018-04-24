package pattern01;

public class MacBluePrint extends BluePrint {
  private Computer computer;

  public MacBluePrint() {
    computer = new Computer("default", "default", "default");
  }

  @Override
  public void setCpu() {
    computer.setCpu("i5");
  }

  @Override
  public void setRam() {
    computer.setCpu("8gb");
  }

  @Override
  public void setStorage() {
    computer.setStorage("ssd-250gb");
  }

  @Override
  public Computer getComputer() {
    return this.computer;
  }
}
