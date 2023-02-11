package com.employeewageAdressBookManagementSystem;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//Address book program
public class AddressBookSystemUC1 extends ContactPerson1 {
	public AddressBookSystemUC1(String firstName, String lastName, String address, String city, String state, int zip,
			String phoneNumber, String email) {
		super(firstName, lastName, address, city, state, zip, phoneNumber, email);
		// TODO Auto-generated constructor stub
	}
	public static AddressBookSystemUC1 newPerson = new AddressBookSystemUC1(address, address, address, address, address, zip, address, address);
	public static ArrayList<ContactPerson1> person = new ArrayList<>();
	public static void add(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name");
		newPerson.setFirstName(scanner.nextLine());
		System.out.println("Enter last name");
		newPerson.setLastName(scanner.nextLine());
		System.out.println("Enter address");
		newPerson.setAddress(scanner.nextLine());
		System.out.println("Enter city");
		newPerson.setCity(scanner.nextLine());
		System.out.println("Enter state");
		newPerson.setState(scanner.nextLine());
		System.out.println("Enter zip code");
		newPerson.setZip(scanner.nextLine());
		System.out.println("Enter phone number");
		newPerson.setPhoneNumber(scanner.nextLine());
		System.out.println("Enter Email");
		newPerson.setEmail(scanner.nextLine());
		ContactPerson1 contactPerson = new ContactPerson1(newPerson.getFirstName(),newPerson.getLastName(), newPerson.getAddress(), newPerson.getCity(), newPerson.getState(), newPerson.getZip(), newPerson.getPhoneNumber(),newPerson.getEmail());
		person.add(contactPerson);
		System.out.println(person);
	}

	private void setZip(String nextLine) {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int flag = 0;
		int choice;
		System.out.println("Welcome to Address Book Program");

		while (flag != 1) {
			System.out.println("Enter 10 to add contact details");
			System.out.println("Enter 20 to edit details");
			System.out.println("Enter 30 to delete contact");
			System.out.println("Enter 40 to exit");
			choice = scanner.nextInt();
			scanner.nextLine();
			//
		}
	}
}
