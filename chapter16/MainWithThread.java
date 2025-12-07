import java.util.*;

public class MainWithThread {
  public static void main(String[] args) {
    System.out.println("止めるには STOP を入力");
    System.out.println("カウントダウン開始");
    Thread t = new PrintingThread();
    t.start(); // run() をオーバーライドして start() を使用
    String input = new Scanner(System.in).nextLine();
    System.out.print("入力文字列: " + input);
    System.out.println("停止処理は未作成");
  }
}
