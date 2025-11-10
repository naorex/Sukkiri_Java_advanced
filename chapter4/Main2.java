public class Main2 {
    public static void main(String[] args) throws Exception {
        System.out.println("計算を開始します");
        // 何かの処理
        System.out.println("計算終了。結果をメモ帳で表示します");

        // 起動するプログラムを指定して引数も渡す
        ProcessBuilder pb = new ProcessBuilder("notepad.exe", "calcreport.txt");
        pb.start();
    }
}
