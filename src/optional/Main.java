package optional;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		String str = null;
//		System.out.println(str.length());

		Optional<String> strOpt = Optional.ofNullable(str); //中身がnullかもれしないと合図する。ラップされた状態

		if(strOpt.isPresent() ) {
			String message = strOpt.get(); //nullでなければ取り出す
			System.out.println(message.length());
		}

		// ラムダ式による書き方
		strOpt.ifPresent(v -> System.out.println(v.length())); //変数vにstrで宣言した文字列を格納し、System.out.println内で使用する
	}

}
