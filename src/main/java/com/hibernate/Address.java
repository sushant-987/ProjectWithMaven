
package com.hibernate;

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
@Table(name="student_address")
public class Address {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(length = 50,name="STREET")
	private String Street;
	
	@Column(length = 100,name="CITY")
	private String city;
	
	@Column(name= "is_open")
    private boolean isopen;
	
	@Transient
    private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
    private Date addedDate;
	
	@Lob
    private byte[] image;
	
    
    public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(int addressId, String street, String city, boolean isopen, double x, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		Street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}


	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}


	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}


	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the isopen
	 */
	public boolean isIsopen() {
		return isopen;
	}


	/**
	 * @param isopen the isopen to set
	 */
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}


	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}


	/**
	 * @return the addedDate
	 */
	public Date getAddedDate() {
		return addedDate;
	}


	/**
	 * @param addedDate the addedDate to set
	 */
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


	/**
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}


	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}

    



}
