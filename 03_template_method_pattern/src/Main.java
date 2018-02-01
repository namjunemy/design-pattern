import com.nj.library.AbstGameConnectionHelper;
import com.nj.library.DefaultGameConnectionHelper;

public class Main {
  public static void main(String[] args) {
    AbstGameConnectionHelper connectionHelper = new DefaultGameConnectionHelper();
    connectionHelper.requestConnection("김남준");
  }
}
