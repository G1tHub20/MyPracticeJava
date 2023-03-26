package xml;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/**
* XMLファイルの読み込み
*/
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("files\\rpgsave.xml");
        Document doc = DocumentBuilderFactory.newInstance().
        		newDocumentBuilder().parse(is);               // (1)文書全体(Document)を取得
        Element hero = doc.getDocumentElement();              // (2)一番外側のheroタグ(Element)を取得
        Element weapon = findChildByTag(hero, "weapon");    // (3)その中のweaponタグ(Element)を取得
        Element power = findChildByTag(weapon, "power");    // (4) 同上
        String value = power.getTextContent();                // (5)その中の文字列情報を取得

        System.out.println(value);
    }
    // 指定された名前を持つタグの最初の子タグを返す
    static Element findChildByTag(Element self, String name)
    		throws Exception {
        NodeList children = self.getChildNodes();               /* すべての子を取得 */
        for(int i = 0; i < children.getLength(); i++) {
            if(children.item(i) instanceof Element) {
                Element e = (Element) children.item(i);
                if(e.getTagName().equals(name)) return e;       /* タグ名を照合 */
            }
        }
        return null;
    }   /* 6～10行目のカッコ数字(1)～(5)は */
}       /* 図10-5の手順との対応を示す */