import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileReader fw = new FileReader("rpgsave.dat");
        System.out.println("全てのデータを読んで表示");
        int i = fw.read(); // int型で扱うのはJava開発の諸事情によるもの
        while (i != -1) { // これ以上読めるデータが無ければ -1
            char c = (char) i; // char型にキャスト
            System.out.print(c);
            i = fw.read();
        }
        System.out.println("ファイルの末尾に到達");
        fw.close();
    }
}
