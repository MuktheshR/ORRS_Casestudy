package com.RailwayReservationAdminManagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")

public class DbSequence {
	
	public DbSequence() {
		super();
	}
	public DbSequence(String trainNo, int seq) {
		super();
		this.trainNo = trainNo;
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "DbSequence [trainNo=" + trainNo + ", seq=" + seq + ", getTrainNo()=" + getTrainNo() + ", getSeq()="
				+ getSeq() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	@Id
    private String  trainNo;
    private int seq;
    
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
    
}
