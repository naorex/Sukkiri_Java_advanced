import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        TimeZone tz = TimeZone.getDefault();
        System.out.print("現在のタイムゾーン: ");
        System.out.println(tz.getDisplayName());
        if (tz.useDaylightTime()) {
            System.out.println("サマータイムを採用");
        } else {
            System.out.println("サマータイムではない");
        }
        System.out.print("世界標準時との時差は");
        System.out.println(tz.getRawOffset() / 3600000 + "時間");
    }
}
