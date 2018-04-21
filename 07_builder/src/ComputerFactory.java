public class ComputerFactory {
  private BluePrint bluePrint;

  public void setBluePrint(BluePrint bluePrint) {
    this.bluePrint = bluePrint;
  }

  public void make() {
    bluePrint.setCpu();
    bluePrint.setRam();
    bluePrint.setStorage();
  }

  public Computer get() {
    return bluePrint.getComputer();
  }
}
