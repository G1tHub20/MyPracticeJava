package debugger;
/**
* デバッガーの使い方
*/
public class Main {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 10);  //（1）
		int num2 = (int) (Math.random() * 10);  //（2）

		Addition add = new Addition();  // （3）
		int ans = add.plus(num1, num2);  //（4）

		System.out.println("答えは" + ans);  //（5）
	}
}

//Eclipseでのデバッグ方法～プロジェクトの削除と復活
//https://codezine.jp/article/detail/13509

//再開             F8
//終了             Ctrl+2
//ステップイン     F5
//ステップオーバー F6
//ステップリターン F7