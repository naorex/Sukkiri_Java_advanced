package chapter11;

public class AccountTest {
  public static void main(String[] args) {
    testInstantiate(); // インスタンス化テスト
    testTransfer(); // 送金テスト
  }

  private static void testInstantiate() {
    System.out.println("Accountをnewできるかテストします");
    Account a = new Account("ミナト", 30000);
    if (!"ミナト".equals(a.owner)) {
      System.out.println("Failed. owner is different");
    }
    if (30000 != a.zandaka) {
      System.out.println("Failed. zandaka is not correct");
    }
    System.out.println("Finished test");
  }

  private static void testTransfer() {
  }
}
