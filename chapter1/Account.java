public class Account {
    String accountNo; // 口座番号

    public boolean equals(Object o) {
        // Object クラスの equals を自身の目的に合わせてオーバーライド
        if (o == this)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Account))
            return false;
        Account r = (Account) o; // 型変換された o の参照を、新しく宣言した Account 型の変数 r に代入。次の行で accountNo の比較をするため。
        if (!this.accountNo.trim().equals(r.accountNo.trim())) {
            return false;
        }
        return true;
    }
}
