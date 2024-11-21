package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Person {

	@Id
	private int adhar;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
	@JoinColumn(name="v_id")
	VoterCard voter;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonBackReference
	private Address add;
	public Person() {
		super();
	}
	public Person(int adhar, String name, VoterCard voter, Address add) {
		super();
		this.adhar = adhar;
		this.name = name;
		this.voter = voter;
		this.add = add;
	}
	public int getAdhar() {
		return adhar;
	}
	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public VoterCard getVoter() {
		return voter;
	}
	public void setVoter(VoterCard voter) {
		this.voter = voter;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [adhar=" + adhar + ", name=" + name + "]";
	}
		
	
}
