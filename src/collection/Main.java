package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

// ■配列
    String[] week = {"日", "月", "火", "水", "木", "金", "土"}; //要素数は固定
    int days = week.length; //配列の要素数

    // 拡張for文
    for(String day : week) {
        System.out.println(day);
    }


// ■コレクション

    // □List …歴代大統領
    ArrayList<String> pres = new ArrayList<>();
    pres.add("Bush"); //0
    pres.add("Obama"); //1
    pres.add("Trump"); //2
    pres.add("Trump"); //3 重複可
    pres.set(3, "Biden"); //要素を上書き
    pres.remove(0); //削除した要素より後の要素は全て前に詰められる
    // pres.get(0); //BushではなくObama
    int num = pres.size(); //リストの要素数

    // イテレータを用いたループ処理 ※古いJavaでも使える
    Iterator<String> it = pres.iterator();
    while(it.hasNext()) {
        String s = it.next();
        System.out.println(s);
    }

    // □Set …信号の色
    Set<String> colors = new HashSet<String>();
    colors.add("青"); // 順序はなし
    colors.add("黄");
    colors.add("赤");
    colors.add("赤"); // 重複不可 ※無視される
    System.out.println("色は" + colors.size() + "種類");

    // □Map …都道府県の人口
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都", 255);
    prefs.put("東京", 1261);
    prefs.put("熊本", 181);
    int tokyo = prefs.get("東京"); //キーに対応する値を取得
    System.out.println("東京の人口:" + tokyo);

    System.out.println(prefs.keySet()); // キーの一覧を返す
  }

}
