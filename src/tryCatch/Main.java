package tryCatch;

import java.util.ArrayList;
import java.util.List;

/**
* try-catch文
*/
public class Main {
	public static void main(String[] args) {
		try { // tryブロックで例外が発生したら、catchブロックでキャッチ
			accessToList();
		} catch (Exception e) {
			System.out.println("エラー：" + e.getMessage());
		}
	}

	// IndexOutOfBoundsException発生の可能性あり。例外をキャッチせず呼び出し元に伝播
	public static void accessToList() throws IndexOutOfBoundsException {
		List<String> list = new ArrayList<>();
		list.get(0);
	}
}

//検査例外の処理方法は２パターン
//1.自分で処理				    →try-catch
//2.呼び出し元に処理を委ねる	→スロー宣言 throws ～Exception