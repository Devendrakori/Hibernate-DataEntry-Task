package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Address {

	@Id
	private int id;
	private int pincode;
	private String area;
	private String city;
	private String state;
	
	@OneToMany(mappedBy = "add",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Person> plist = new ArrayList<>();
	public Address() {
		super();
	}
	
	public Address(int id, int pincode, String area, String city, String state) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Person> getPerson() {
		return plist;
	}

	public void setPerson(Person person) {
		this.plist.add(person);
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", area=" + area + ", city=" + city + ", plist=" + plist + "]";
	}
}
