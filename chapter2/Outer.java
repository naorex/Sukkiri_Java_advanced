public class Outer {
    int outerField;
    static int outerStaticField;

    // メンバクラスの宣言
    static class Inner {
        void innerMethod() {
            outerStaticField = 10; // static な外部クラスメンバのみ利用可
        }
    }

    void outerMethod() {
        Inner ic = new Inner(); // 外部クラスからはクラス名で利用可
    }
}
