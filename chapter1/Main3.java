import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 4, 5 };

        // 配列同士の等価判定には、以下で実施する
        System.out.println("誤った判定：" + a.equals(b));
        System.out.println("正しい判定：" + Arrays.equals(a, b));
    }
}
