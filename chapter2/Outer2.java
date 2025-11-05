public class Outer2 {
    int outerMember = 2;
    void outerMethod() {
        int a = 10;
        // ローカルクラス
        class Inner {
            public void innerMethod() {
                System.out.println("innerMethodです");
                System.out.println(outerMember + a);
            }
        }
        Inner ic = new Inner();
        ic.innerMethod;
    }
}
