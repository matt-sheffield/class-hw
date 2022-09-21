package addressbook;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	
	
	// Setting up our Contact constructor
	public Contact() {};
	
	public Contact(String firstName) {
		this.firstName = firstName;
	};
	
	public Contact(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	};
	
	public Contact(String firstName,String lastName,String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	};
	
	public Contact(String firstName,String lastName,String phoneNumber, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return printContact();
	};
	
	// Just because I didn't like the default toString format...
	public String printContact() {
		return "************\n\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nPhone Number: " + phoneNumber + "\nEmail: " + emailAddress +"\n\n************";
	}
	
	
	
	

}
