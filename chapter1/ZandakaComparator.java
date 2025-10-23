// 残高順を実装したコンパレータ
import java.util.Comparator;

public class ZandakaComparator implements Comparator<Account2> {
    public int compare(Account2 x, Account2 y) {
        return (x.zandaka - y.zandaka);
    }
}
