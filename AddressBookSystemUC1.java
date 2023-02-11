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
	//UC2 add new contact to address book
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
	// edit existing contact person by name
	public static void modify(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name whose contact to be edited");
		String name = scanner.nextLine();
		boolean found=false;
		ListIterator<ContactPerson1> iterator = person.listIterator();
		while (iterator.hasNext()){
			ContactPerson1 contact= iterator.next();
			if (name.equals(contact.getFirstName()))
			{
				System.out.println("Edit first name");
				newPerson.setFirstName(scanner.nextLine());
				System.out.println("Edit last name");
				newPerson.setLastName(scanner.nextLine());
				System.out.println("Edit address");
				newPerson.setAddress(scanner.nextLine());
				System.out.println("Edit city");
				newPerson.setCity(scanner.nextLine());
				System.out.println("Edit state");
				newPerson.setState(scanner.nextLine());
				System.out.println("Edit zip code");
				newPerson.setZip(scanner.nextLine());
				System.out.println("Edit phone number");
				newPerson.setPhoneNumber(scanner.nextLine());
				System.out.println("Edit Email");
				newPerson.setEmail(scanner.nextLine());
				iterator.set(new ContactPerson1(newPerson.getFirstName(),newPerson.getLastName(), newPerson.getAddress(), newPerson.getCity(), newPerson.getState(), newPerson.getZip(), newPerson.getPhoneNumber(),newPerson.getEmail()));
				found=true;
			}
		}
	}
	//delete a person using person name
	public static void delete(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name whose contact to be edited");
		String name = scanner.nextLine();
		boolean found=false;
		ListIterator<ContactPerson1> iterator = person.listIterator();
		while (iterator.hasNext()){
			ContactPerson1 contact= iterator.next();
			if (name.equals(contact.getFirstName()))
			{
				System.out.println("Edit first name");
				newPerson.setFirstName(scanner.nextLine());
				System.out.println("Edit last name");
				newPerson.setLastName(scanner.nextLine());
				System.out.println("Edit address");
				newPerson.setAddress(scanner.nextLine());
				System.out.println("Edit city");
				newPerson.setCity(scanner.nextLine());
				System.out.println("Edit state");
				newPerson.setState(scanner.nextLine());
				System.out.println("Edit zip code");
				newPerson.setZip(scanner.nextLine());
				System.out.println("Edit phone number");
				newPerson.setPhoneNumber(scanner.nextLine());
				System.out.println("Edit Email");
				newPerson.setEmail(scanner.nextLine());
				iterator.set(new ContactPerson1(newPerson.getFirstName(),newPerson.getLastName(), newPerson.getAddress(), newPerson.getCity(), newPerson.getState(), newPerson.getZip(), newPerson.getPhoneNumber(),newPerson.getEmail()));
				found=true;
			}

		}
		if (found){
			System.out.println("record is update");
			System.out.println(person);
		}else {
			System.out.println("record not found");
		}
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
			if (choice == 10) {
				add();
			}
			else if (choice == 20) {
				modify();
			} else if (choice==30) {
				delete();
			} else if (choice == 40) {
				flag = 1;
			}
		}



	}
}
