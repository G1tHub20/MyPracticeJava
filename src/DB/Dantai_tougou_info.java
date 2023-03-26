package DB;

import java.sql.Date;

public class Dantai_tougou_info {
	private String dantaiIdOld;
	private String dantaiIdNew;
	private Date resisterDate;
	private Date processDate;

	public Dantai_tougou_info() {}

	public Dantai_tougou_info(String dantaiIdOld, String dantaiIdNew, Date resisterDate) {
		this.dantaiIdOld = dantaiIdOld;
		this.dantaiIdNew = dantaiIdNew;
		this.resisterDate = resisterDate;
	}

	public String getDantaiIdOld() {
		return dantaiIdOld;
	}
	public String getDantaiIdNew() {
		return dantaiIdNew;
	}
	public Date getResisterDate() {
		return resisterDate;
	}
	public Date getProcessDate() {
		return processDate;
	}
}
