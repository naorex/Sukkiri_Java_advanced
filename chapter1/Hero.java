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
}
