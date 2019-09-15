package sd.console.dto.common;

import java.util.Date;

public class OrderQuery {
	
	private String merSeqNbr;
	
	private String platSeqNbr;
	
	private String merNo;
	
	private String checkStatus;
	
	private String orderStatus;
	
	private Date startDate;
	
	private Date endDate;
	
	private Integer page;
	
	private Integer rows;

	public String getMerSeqNbr() {
		return merSeqNbr;
	}

	public void setMerSeqNbr(String merSeqNbr) {
		this.merSeqNbr = merSeqNbr;
	}

	public String getPlatSeqNbr() {
		return platSeqNbr;
	}

	public void setPlatSeqNbr(String platSeqNbr) {
		this.platSeqNbr = platSeqNbr;
	}

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
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

	@Override
	public String toString() {
		return "OrderQuery [merSeqNbr=" + merSeqNbr + ", platSeqNbr=" + platSeqNbr + ", merNo=" + merNo
				+ ", checkStatus=" + checkStatus + ", orderStatus=" + orderStatus + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", page=" + page + ", rows=" + rows + "]";
	}
	
}
