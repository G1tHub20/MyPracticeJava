package exception;

public class Main {
	public static void main(String[] args) {
		try {
		    int result = 9 / 0;
		    System.out.println(result);

		} catch (ArithmeticException e) { // 備える例外クラス
			System.out.println("計算エラー");
			System.out.println(e.getMessage()); //エラーメッセージ
		    e.printStackTrace(); //スタックトレース

		} finally {
			System.out.println("例外が発生の有無に関わらず実行");
		}
	}
}