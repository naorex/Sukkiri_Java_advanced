public class Main2 {
    public static void main(String[] args) {
        Outer.Inner ic = new Outer.Inner(); // 無関係なクラスからは外部クラス名.メンバクラス名で利用
        // 利用には外部クラスのインスタンス生成が必要
    }
}
