import java.io.*;
import java.util.*;

public class Main4 {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("rpgdata.properties");
        Properties p = new Properties();
        p.setProperty("heroName", "アサカ")
        p.setProperty("heroHp", "62");
        p.setProperty("heroMp", "45");
        p.store(fw, "勇者の情報");
        fw.close();
    }
}
