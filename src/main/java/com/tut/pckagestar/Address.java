package com.tut.pckagestar;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="student_addres")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addid;
	
	@Column(length = 50,name = "STREET")
	private String strretString;
	@Column(length = 60,name = "CITY_NAME")
	private String cityString;
	@Column(name = "is_open")
	private boolean isopen;
	
	@Transient
	private double x;
	
	@Column(name = "add_date")
	@Temporal(TemporalType.DATE)
	private Date addeddate;
	
	@Lob
	private byte[] image;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addid, String strretString, String cityString, boolean isopen, double x, Date addeddate,
			byte[] image) {
		super();
		this.addid = addid;
		this.strretString = strretString;
		this.cityString = cityString;
		this.isopen = isopen;
		this.x = x;
		this.addeddate = addeddate;
		this.image = image;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getStrretString() {
		return strretString;
	}
	public void setStrretString(String strretString) {
		this.strretString = strretString;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
}
