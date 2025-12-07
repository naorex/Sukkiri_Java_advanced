import java.util.*;
import java.util.concurrent.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("止めるには STOP と入力");
    System.out.println("カウントダウン開始");
    for (int i = 9; i >= 0; i--) {
      System.out.print(i + "..");

      // 1秒待つ
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        ;
      }
    }
    String input = new Scanner(System.in).nextLine();
    System.out.println("入力文字列: " + input);
  }
}
