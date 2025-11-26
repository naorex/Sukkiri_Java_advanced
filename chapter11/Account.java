package chapter11;

public class Account {
  String owner;
  int zandaka;

  // コンストラクタ
  public Account(String owner, int zandaka) {
    this.owner = owner;
    this.zandaka = zandaka;
  }

  // 送金メソッド
  public void transfer(Account dest, int amount) {
    dest.zandaka += amount;
    zandaka -= amount;
  }
}
