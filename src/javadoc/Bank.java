package javadoc;

/**
 * 銀行クラス。
 * このクラスは銀行を表す。
 */
public class Bank {

	/** 銀行名 */
    String name;

    /** 住所 */
    String address;

	/**
	 * 銀行を開設するメソッド。
	 * このメソッドを呼び出すと、オーナー名と初期資産を持つ銀行が作成される。
	 * @param owner オーナー名
	 * @param initialBalance 初期資産
	 */
    public void addAccount(String owner, int initialBalance) { }

    public static void main(String[] args) {
        System.out.println("試験用のメインメソッドです");
    }
}

// javadocの実行
//javadoc Account.java
//
//javadoc -d "C:\Users\a7m2c\OneDrive\ドキュメント\02_プログラミング\01_Java\Java基礎\javadoc" -encoding UTF-8 -private Account.java
//
//
//javapコマンドでクラスファイルを逆アセンブルする
//javap -c test.class
//https://itsakura.com/java-javap