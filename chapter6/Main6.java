import java.io.*;

public class Main6 {
    public static void main(String[] args) throws IOException {
        String msg = "第一土曜日は";
        Reader sr = new StringReader(msg);
        System.out.print((char) sr.read());
        System.out.print((char) sr.read());
    }
}
