package com.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.controller.Controller;
import com.entity.Person;

public class Client {

	static Controller c = new Controller();
	private static Scanner sc = new Scanner(System.in);

	public static void menu() {
		while (true) {
			try {
				System.out.println("1) Show Person\n2) Add Person\n3) Preson From Address \n4) Update info \n5) Exit");
				System.out.print("Enter choice : ");
				int n = sc.nextInt();
				sc.nextLine();
				switch (n) {
				case 1:
					c.showPersonDetail();
					break;
				case 2:
					System.out.print("Enter How Many Entries Do You Want : ");
					c.insertData(sc.nextInt());
					sc.nextLine();
					break;
				case 3:
					for (Person p : c.getPresonFromAddress()) {
						System.out.println(p);
					}
					break;
				case 4:
					c.updateinfo();
					break;
				case 5:
					System.out.print("Thank You");
					System.exit(0);
				}
			} catch (InputMismatchException e) {
				System.out.print("Enter valid data !");
				sc.nextLine();
				menu();
			}

		}
	}

	public static void main(String[] args) {
		menu();
	}
}
