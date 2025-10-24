// 正しく複製するために、clone()をオーバーライド

public class Sword implements Cloneable {
    private String name;

    public Sword clone() {
        // オーバーライド
        Sword result = new Sword();
        result.name = this.name;
        return result;
    }
}
