package com.RailwayReservationAdminManagement.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trainDetails")
public class TrainDetails {
	   @Transient
	    public static final String SEQUENCE_NAME = "trainNumber_sequence";
	@Id
//	 @GeneratedValue(strategy=GenerationType.AUTO)
//	@NotNull(message = "Train number cannot be null")
//	@Max(value = 99999, message = "Train number cannot exceed 5 digits")
	private int trainNo;

	@NotNull
	@Size(min = 5, message = "Train name should be minimum of 5 characters")
	private String trainName;

	@NotNull
	@Size(min = 2, message = "Source Station should be minimum of 2 characters")
	private String sourceStation;

	@NotNull
	@Size(min = 2, message = "Destination Station should be minimum of 2 characters")
	private String destinationStation;

	@NotNull
	private String arrivalTime;

	@NotNull
	@Size(max = 7, message = "Departure time and Time should be maximum of 7 characters")
	private String deptTime;
	private String duration;
	private int noOfSeats;

	private int firstClassACFare;
	private int twoTierAcFare;
	private int threeTierAcFare;
	private int sleeperFare;

	public TrainDetails() {
		super();
	}

	public TrainDetails(
			@NotNull(message = "Train number cannot be null") @Max(value = 99999, message = "Train number cannot exceed 5 digits") int trainNo,
			@NotNull @Size(min = 5, message = "Train name should be minimum of 5 characters") String trainName,
			@NotNull @Size(min = 2, message = "Start Station should be minimum of 2 characters") String sourceStation,
			@NotNull String destinationStation, @NotNull String arrivalTime,
			@NotNull @Size(max = 7, message = "Departure Time should be maximum of 7 characters") String deptTime,
			String duration, int noOfSeats, int firstClassACFare, int twoTierAcFare, int threeTierAcFare,
			int sleeperFare) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.arrivalTime = arrivalTime;
		this.deptTime = deptTime;
		this.duration = duration;
		this.noOfSeats = noOfSeats;
		this.firstClassACFare = firstClassACFare;
		this.twoTierAcFare = twoTierAcFare;
		this.threeTierAcFare = threeTierAcFare;
		this.sleeperFare = sleeperFare;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDeptTime() {
		return deptTime;
	}

	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getFirstClassACFare() {
		return firstClassACFare;
	}

	public void setFirstClassACFare(int firstClassACFare) {
		this.firstClassACFare = firstClassACFare;
	}

	public int getTwoTierAcFare() {
		return twoTierAcFare;
	}

	public void setTwoTierAcFare(int twoTierAcFare) {
		this.twoTierAcFare = twoTierAcFare;
	}

	public int getThreeTierAcFare() {
		return threeTierAcFare;
	}

	public void setThreeTierAcFare(int threeTierAcFare) {
		this.threeTierAcFare = threeTierAcFare;
	}

	public int getSleeperFare() {
		return sleeperFare;
	}

	public void setSleeperFare(int sleeperFare) {
		this.sleeperFare = sleeperFare;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Override
	public String toString() {
		return "TrainDetails [trainNo=" + trainNo + ", trainName=" + trainName + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", arrivalTime=" + arrivalTime + ", deptTime="
				+ deptTime + ", duration=" + duration + ", noOfSeats=" + noOfSeats + ", firstClassACFare="
				+ firstClassACFare + ", twoTierAcFare=" + twoTierAcFare + ", threeTierAcFare=" + threeTierAcFare
				+ ", sleeperFare=" + sleeperFare + ", getTrainNo()=" + getTrainNo() + ", getTrainName()="
				+ getTrainName() + ", getSourceStation()=" + getSourceStation() + ", getDestinationStation()="
				+ getDestinationStation() + ", getArrivalTime()=" + getArrivalTime() + ", getDeptTime()="
				+ getDeptTime() + ", getDuration()=" + getDuration() + ", getNoOfSeats()=" + getNoOfSeats()
				+ ", getFirstClassACFare()=" + getFirstClassACFare() + ", getTwoTierAcFare()=" + getTwoTierAcFare()
				+ ", getThreeTierAcFare()=" + getThreeTierAcFare() + ", getSleeperFare()=" + getSleeperFare()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
