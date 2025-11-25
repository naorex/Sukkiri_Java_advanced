package chapter10;
package jp.miyabiling.atm;

@SuppressWarnings("serial") // serialVersionUIDに関する警告を出さない
public class NewAccount extends Account {

  @Override // オーバーライドを宣言
  public int transfer(Bank bank, Account dest, int amount) {
  }

  @Deprecated // 以下の transfer()メソッドは非推奨である事を宣言
  public void transfer(Account dest, int amount) {
  }
}
