import java.util.function.*;

public class Main {

    // 文字列を受け取り文字列を返す関数
    public static Integer len(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        // len メソッドを関数オブジェクトとして変数funcへ代入（代入しているのは len メソッドのメモリ箇所への参照）
        Function<String, Integer> func = Main::len;

        // funcに格納されている処理ロジックを引数を与えて実行する
        int a = func.apply("Java");
        System.out.println("文字列 Java は " + a + "文字");
    }
}
