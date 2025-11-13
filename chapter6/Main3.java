import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
        fos.write(65); // 2進数で0100001 = 文字A
        fos.flush();
        fos.close();
    }
}
