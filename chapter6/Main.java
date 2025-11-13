import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("rpgsave.dat", true);
        fw.write('A');
        fw.flush(); // .close()の前に必ず呼び出しが必要なメソッド
        fw.close();
    }
}
