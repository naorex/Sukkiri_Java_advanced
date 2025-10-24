// 正しく複製するために、clone()をオーバーライド

public class Hero implements Cloneable {
    String name;
    int hp;
    Sword sword;

    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword.clone();
        return result;
    }
}
