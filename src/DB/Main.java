package DB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		List<Dantai_tougou_info> infoList = new ArrayList<>();
		
		try {
			infoList = getInfo();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (Dantai_tougou_info row:infoList) {
			System.out.println(row.getDantaiIdNew());
			System.out.println(row.getDantaiIdOld());
			System.out.println(row.getResisterDate());
		}
	}


	public static List<Dantai_tougou_info> getInfo() throws SQLException {

		List<Dantai_tougou_info> infoList = new ArrayList<>();
		String sql = "SELECT dantaiIdOld, dantaiIdNew, registerDate FROM dantai_tougou_info WHERE processDate IS NULL ORDER BY dantaiIdOld DESC";

		try (Connection con = DBconnect.getConnection() ) {

			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String dantaiIdOld = rs.getString("dantaiIdOld");
				String dantaiIdNew = rs.getString("dantaiIdNew");
				Date registerDate = rs.getDate("registerDate");

				Dantai_tougou_info info = new Dantai_tougou_info(dantaiIdOld, dantaiIdNew, registerDate);
				infoList.add(info);
			}
		}
		return infoList;
	}

}


// ojdbc8.jarをインストール