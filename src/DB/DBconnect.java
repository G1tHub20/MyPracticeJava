package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	public static Connection getConnection() {
	    // ローカル用
		final String JDBC_URL = "jdbc:mysql://localhost:3306/other";
		final String DB_USER = "root";
		final String DB_PASS = "mysqlpa55";

	    // 接続の確立
	    Connection con = null;
	    try {
	    	con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
	    } catch(SQLException e) {
	    	e.printStackTrace();
	    	System.out.println("DB接続失敗");
	    }
	    return con;
	}
}
