package com.controller;

import java.util.List;

import com.entity.Address;
import com.entity.Person;
import com.service.Service;

public class Controller {

	public void showPersonDetail() {
		new Service().showPersonDetail();
	}
	
	public List<Address> getAddressDetail(){
		return new Service().getAddressDetail();
	}
	public List<Person> getPresonFromAddress(){
		return new Service().getPresonFromAddress();
	}
	public void insertData(int n) {
		new Service().insertData(n);
	}
	public void updateinfo() {
		new Service().updateinfo();
	}
}
