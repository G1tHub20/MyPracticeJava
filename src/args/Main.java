package args;

public class Main {

	public static void main(String[] args) {

		// VM引数
		String test = System.getProperty("test"); // システムプロパティ
		System.out.println(test);

		// コマンドライン引数（プログラムの引数）
		System.out.print(args[0]);
		System.out.print(args[1]);

		// 【番外編】システムプロパティのキーと値を全て取得
		System.out.println(System.getProperties());
//		System.out.println(System.getProperty("java.version"));
	}

}

// ■j[Java] システムプロパティのメモ
// https://qiita.com/yoshi389111/items/7af43d8d21efdc32c06c
// JavaVM を起動する際、コマンドライン引数に -D でシステムプロパティを、追加・変更できる
// -Dproperty=value
// （例）VM引数に「-Dtest=HelloWorld」と指定