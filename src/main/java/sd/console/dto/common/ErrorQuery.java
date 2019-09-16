package sd.console.dto.common;

import java.util.Date;

public class ErrorQuery {
	
	private String platSeqNbr;
	
	private String errorTyp;
	
	private String errorStatus;
	
	private Date startDate;
	
	private Date endDate;
	
	private Integer page;
	
	private Integer rows;

	public String getPlatSeqNbr() {
		return platSeqNbr;
	}

	public void setPlatSeqNbr(String platSeqNbr) {
		this.platSeqNbr = platSeqNbr;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getErrorTyp() {
		return errorTyp;
	}

	public void setErrorTyp(String errorTyp) {
		this.errorTyp = errorTyp;
	}

	public String getErrorStatus() {
		return errorStatus;
	}

	public void setErrorStatus(String errorStatus) {
		this.errorStatus = errorStatus;
	}

	@Override
	public String toString() {
		return "ErrorQuery [platSeqNbr=" + platSeqNbr + ", errorTyp=" + errorTyp + ", errorStatus=" + errorStatus
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", page=" + page + ", rows=" + rows + "]";
	}
	
}
