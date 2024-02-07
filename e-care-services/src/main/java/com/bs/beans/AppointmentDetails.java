package com.bs.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AppointmentDetails")
public class AppointmentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appID;
	private Integer doctorID;

	private String patientName;
	private String doctorName;

	private String appTimeStatue;
	private String meetingType;
	private String appTime;
	private Integer fees;
	private Date appDate;
	private Integer userID;
	private String city;
	private String bloodGroup;
	private Integer age;
	private Integer weight;
	private Integer height;
	private Integer bp;
	private Integer sugar;
	private String contact;
	private String patientType;

	public AppointmentDetails() {
		// TODO Auto-generated constructor stub
	}

	




	public AppointmentDetails(Integer appID, Integer doctorID, String patientName, String doctorName,
			String appTimeStatue, String meetingType, String appTime, Integer fees, Date appDate, Integer userID,
			String city, String bloodGroup, Integer age, Integer weight, Integer height, Integer bp, Integer sugar,
			String contact,String patientType) {
		super();
		this.appID = appID;
		this.doctorID = doctorID;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.appTimeStatue = appTimeStatue;
		this.meetingType = meetingType;
		this.appTime = appTime;
		this.fees = fees;
		this.appDate = appDate;
		this.userID = userID;
		this.city = city;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.bp = bp;
		this.sugar = sugar;
		this.contact = contact;
		this.patientType=patientType;
	}


	public String getPatientType() {
		return patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}


	public Integer getWeight() {
		return weight;
	}



	public void setWeight(Integer weight) {
		this.weight = weight;
	}



	public Integer getHeight() {
		return height;
	}



	public void setHeight(Integer height) {
		this.height = height;
	}



	public Integer getBp() {
		return bp;
	}



	public void setBp(Integer bp) {
		this.bp = bp;
	}



	public Integer getSugar() {
		return sugar;
	}



	public void setSugar(Integer sugar) {
		this.sugar = sugar;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public String getAppTime() {
		return appTime;
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

	public String getAppTimeStatue() {
		return appTimeStatue;
	}

	public void setAppTimeStatue(String appTimeStatue) {
		this.appTimeStatue = appTimeStatue;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getMeetingType() {
		return meetingType;
	}

	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAppID() {
		return appID;
	}

	public void setAppID(Integer appID) {
		this.appID = appID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(Integer doctorID) {
		this.doctorID = doctorID;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "AppointmentDetails [appID=" + appID + ", doctorID=" + doctorID + ", patientName=" + patientName
				+ ", doctorName=" + doctorName + ", appTimeStatue=" + appTimeStatue + ", meetingType=" + meetingType
				+ ", appTime=" + appTime + ", fees=" + fees + ", appDate=" + appDate + ", userID=" + userID + ", city="
				+ city + ", bloodGroup=" + bloodGroup + ", age=" + age + ", weight=" + weight + ", height=" + height
				+ ", bp=" + bp + ", sugar=" + sugar + ", contact=" + contact + "]";
	}

}
