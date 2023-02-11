package com.employeewageAdressBookManagementSystem;

class ContactPerson1 
{
	public ContactPerson1(String firstName2, String lastName2, String address2, String city2, String state2, int zip2,
			String phoneNumber2, String email2) {
		// TODO Auto-generated constructor stub
	}

	private static String firstName;
	private static String lastName;
	protected static String address;
	private static String city;
	private static String state;
	private static String email;
	static String phoneNumber;
	static int zip;

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		ContactPerson1.email = email;
	}

	public static String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String string) {
		ContactPerson1.phoneNumber = string;
	}

	public static int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		ContactPerson1.zip = zip;
	}

	public static String getState() {
		return state;
	}

	public void setState(String state) {
		ContactPerson1.state = state;
	}

	public static String getCity() {
		return city;
	}

	public void setCity(String city) {
		ContactPerson1.city = city;
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		ContactPerson1.address = address;
	}

	public void setLastName(String lastName) {
		ContactPerson1.lastName = lastName;
	}

	public static String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		ContactPerson1.firstName = firstName;
	}

	public static String getFirstName() {
		return firstName;
	}

	public  void ContactPerson(String firstName, String lastName, String address, String city, String state, int zip, String phoneNumber,String email ){
		ContactPerson1.firstName=firstName;
		ContactPerson1.lastName=lastName;
		ContactPerson1.address=address;
		ContactPerson1.city=city;
		ContactPerson1.state=state;
		ContactPerson1.zip=zip;
		ContactPerson1.phoneNumber=phoneNumber;
		ContactPerson1.email=email;
	}

	@Override
	public String toString() {
		return "Employee [name=" + ContactPerson1.firstName +" "+ ContactPerson1.lastName + ", Address=" + ContactPerson1.address + ", City="
				+ ContactPerson1.city + ", state=" + ContactPerson1.state + ", zip=" + ContactPerson1.zip
				+ ", phone=" + ContactPerson1.phoneNumber + "]";
	}
}

/*long phoneNumber;
	public ContactPerson(long phoneNumber) {
		super(phoneNumber);
		// TODO Auto-generated constructor stub
	this.phoneNumber = phoneNumber;
	}
	public long getPhoneNumber() {
		return getPhoneNumber();
	}

}*/