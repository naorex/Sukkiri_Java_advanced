import java.util.*;

public class MainWithThread2 {
  public static void main(String[] args) {
    System.out.println("止めるには STOP を入力");
    System.out.println("カウントダウン開始");
    PrintingThread2 t = new PrintingThread2();
    t.start(); // run() をオーバーライドして start() を使用
    String input = new Scanner(System.in).nextLine();
    if (input.equals("STOP")) {
      t.stopReq.set(true); // 中断要望をスレッドに伝える
    }
    try {
      t.join();
    } catch (InterruptedException e) {
      ;
    }
  }
}
