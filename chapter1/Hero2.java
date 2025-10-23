// clone()による複製をサポートしたHeroクラス

public class Hero2 implements Cloneable {
    // Cloneable インターフェースを実装
    String name;
    int hp;
    Sword sword;

    public Hero2 clone() {
        // clone()を public でオーバーライド
        // Object クラスは protected 修飾子のため public にする必要あり
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;
    }
}
