import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Main7 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("rpgsave.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
        Element hero = doc.getDocumentElement();
        Element weapon = findChildByTag(hero, "weapon");
        Element power = findChildByTag(weapon, "power");
        String value = power.getTextContent();
    }

    static Element findChildByTag(Element self, String name) throws Exception {
        NodeList children = self.getChildNodes(); // 全ての子を取得
        for (int i = 0; i < children.getLength(); i++) {
            if (children.item(i) instanceof Element) {
                Element e = (Element)children.item(i);
                if (e.getTagName().equals(name)) { // タグ名を照合
                    return e;
                }
            }
        }
        return null;
    }
}
