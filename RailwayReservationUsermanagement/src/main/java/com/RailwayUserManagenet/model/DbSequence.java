package com.RailwayUserManagenet.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_sequenceuserid")
public class DbSequence {
    public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	@Id
    private String  Id;
    private int seq;
}
