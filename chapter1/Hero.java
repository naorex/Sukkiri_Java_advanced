public class Hero {
    private String name;
    private int hp, mp;

    public Hero() {
        // コンストラクタ
        this.name = "sample";
        this.hp = 100;
        this.mp = 200;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        // Object クラスの toString() をオーバーライド
        return "勇者 (名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + "）";
    }

    public int hashCode() {
        // Object クラスの hashCode() をオーバーライド
        // 任意の個数の引数を受け取り、引数に基づきハッシュコードとして適切な整数を生成するAPI
        // hashCode() は 例えば remove() メソッドなどで指定した引数と対象物の参照・比較を行う際に内部で使用されている
        return Objects.hash(this.name, this.hp);
    }
}
