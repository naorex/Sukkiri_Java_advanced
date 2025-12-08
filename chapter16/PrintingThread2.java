import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class PrintingThread2 extends Thread {

  // スレッド中断の要請を管理するフィールド
  final AtomicBoolean stopReq = new AtomicBoolean(false);

  public void run() {
    // run() メソッドのオーバーライド
    for (int i = 9; i >= 0; i--) {
      if (this.stopReq.get()) {
        break; // 中断要望が届いていたらループを抜けてrun()を終了する
      }
      System.out.print(i + "..");
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        ;
      }
    }
  }
}
