// 適切に equals をオーバーライドしておく必要がある理由

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        Hero h1 = new Hero();
        h1.setName("ミナト");
        list.add(h1);
        System.out.println("要素数=" + list.size());
        Hero h2 = new Hero();
        h2.setName("ミナト"); // あえて同じ名称を追加してみる
        list.remove(h1);
        System.out.println("要素数=" + list.size()); // h2 が残るはずなのに要素数=0となる。remove は内部で equals メソッドを使っているが、がどのインスタンスを削除するか
                                                  // equals で適切に判定できないため。
    }
}
