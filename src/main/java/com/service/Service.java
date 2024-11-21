package com.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.dao.Dao;
import com.entity.Address;
import com.entity.Person;

public class Service {

	Scanner sc = new Scanner(System.in);
	private List<Person> getAll() {
		return new Dao().getAll();
	}

	public void showPersonDetail() {
		List<Person> all = this.getAll();
		for (Person person : all) {
			System.out.printf("%-20s|  %-20s|  %-20s\n", person.getName(), person.getAdd().getArea(),
					person.getAdd().getPincode());
		}
	}

	public List<Address> getAddressDetail() {
		List<Person> all = this.getAll();
		Set<Address> addresses = new HashSet<>();
		for (Person person : all) {
			if(person.getAdd() != null)
				addresses.add(person.getAdd());
		}
		return new ArrayList<>(addresses);
	}
	
	public List<Person> getPresonFromAddress(){
		
		List<Address> l1 = this.getAddressDetail();
		Set<Person> l2 = new HashSet<>();
		List<Person> list = this.getAll();
		for (Person person : list) {
			for (Address address : l1) {
				for (Person person1 : address.getPerson()) {
	                if (!l2.contains(person)) {
	                    l2.add(person1);
	                }
	            }
			}
		}
		return new ArrayList<>(l2);
	}
	public void insertData(int n) {
		try {
			while(n>0) {
				System.out.print("Enter Adhar : ");
				int adhar = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Person Name : ");
				String name = sc.nextLine();
				name = name.trim();
				System.out.print("Enter voter I'd : ");
				String v_id = sc.nextLine();
				v_id = v_id.trim();
				System.out.print("Enter Constituency : ");
				String cons = sc.nextLine();
				cons = cons.trim();
				System.out.print("Enter Address I'd : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Pincode : ");
				int pin = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Area Name : ");
				String area = sc.nextLine();
				area = area.trim();
				System.out.print("Enter City : ");
				String city = sc.nextLine();
				city = city.trim();
				System.out.print("Enter State : ");
				String state = sc.nextLine();
				state = state.trim();
				new Dao().insertData(adhar, name, v_id, cons, id, pin, area, city, state);
				n--;
			}
		}catch(InputMismatchException e) {
			System.out.println("Enter Valid input !");
			sc.nextLine();
			this.insertData(n);
		}
		
	}
}
