// 自然順序で比較するため、java.lang.Comparable インターフェースを実装。これによりcompareTo()のオーバーライドが同時に強制され、自然順序付けの方法を宣言した事になる

public class Account2 implements Comparable<Account2> {
    int number;
    int zandaka;

    public int compareTo(Account2 obj) {
        // 引数で渡されたインスタンス obj と自身を比較して大小関係を判定する
        if (this.number < obj.number) {
            return -1;
        }
        if (this.number > obj.number) {
            return 1;
        }
        return 0;
    }
}
