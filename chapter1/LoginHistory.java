public class LoginHistroy {
    private String user;
    private int retry;
    private boolean result;

    public LoginHistroy(String user, int retry, boolean result) {
        this.user = user;
        this.retry = retry;
        this.result = result;
    }

    // クラス1つを適切に実装するのに以下のオーバーライドが必須。

    // 3フィールドの getter 定義
    // toString() のオーバーライド
    // equals() のオーバーライド
    // hashCode() のオーバーライド
}


// 上記を簡易化する特別なクラス "record"
public record LoginHistroy(String user, int retry, boolean result) {}
