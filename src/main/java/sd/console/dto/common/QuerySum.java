package sd.console.dto.common;

import java.util.Date;

public class QuerySum {
	
	private String merNo;
	
	private String channelCode;
	
	private Date startDate;
	
	private Date endDate;
	
	private Integer page;
	
	private Integer rows;

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

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	@Override
	public String toString() {
		return "QuerySum [merNo=" + merNo + ", channelCode=" + channelCode + ", startDate=" + startDate + ", endDate="
				+ endDate + ", page=" + page + ", rows=" + rows + "]";
	}

}
