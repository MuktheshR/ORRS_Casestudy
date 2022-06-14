package com.RailwayReservationBookingService.model;

import org.springframework.stereotype.Component;

@Component
public class canclepayment {
	private long pnrNo;
	private String mailId;
	public long getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	@Override
	public String toString() {
		return "canclepayment [pnrNo=" + pnrNo + ", mailId=" + mailId + "]";
	}

}
