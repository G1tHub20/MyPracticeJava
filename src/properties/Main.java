package properties;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;
/**
* Propertyファイルの読み込み
*/
public class Main {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("files\\rpgdata.properties");
        Properties p = new Properties();
        p.load(fr);                                 /* ファイル内容を読み込む */
        String name = p.getProperty("heroName");    /* キーを指定し値を取り出す */
        String strHp = p.getProperty("heroHp");
        int hp = Integer.parseInt(strHp);
        System.out.println("勇者の名前：" + name);
        System.out.println("勇者のHP：" + hp);
        fr.close();
    }
}