package chapter11;

// 定番の import 文
import org.junit.jupiter.api.*;
import static org.junit.api.Assertions.*;

public class AccountTestJunit {
  @Test // アノテーション必須
  public void instantiate() {
    Account a = new Account("ミナト", 30000);
    assertEquals("ミナト", a.owner); // 専用の評価メソッドを使う
    assertEquals(30000, a.zandaka);
  }

  @Test
  public void transfer() {
  }
}
