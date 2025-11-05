public class Main3 {
    public static void main(String[] args) {
        Pocket<Object> pocket = new Pocket<>();
        System.out.println("使い捨てのインスタンスを作りpocketに入れます");
        // 匿名クラスを定義したと同時にインスタンス生成
        pocket.put(new Object() {
            String innerField;
            void innerMethod(){}
        })
    }
}
