package addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	
	private List<Contact> contacts;
	
	// Setting up our AddressBook constructor
	public AddressBook() {
		this.contacts = new ArrayList<>();
	}
	
	
	//////// Section 1: Add Entry ////////
	public void addContact() {
		Scanner scanner = new Scanner(System.in);
		String firstName, lastName, phoneNumber, emailAddress;
		
		System.out.print("Please enter first name: ");
		firstName = scanner.next();
		
		System.out.print("Please enter last name: ");
		lastName = scanner.next();
		
		System.out.print("Please enter phone number: ");
		phoneNumber = scanner.next();
		
		System.out.print("Please enter email address: ");
		emailAddress = scanner.next();
		
		int emailIndex = getEmailIndex(emailAddress);
		
		if (emailIndex == -1) {
			Contact newcontact = new Contact(firstName, lastName, phoneNumber, emailAddress);
		    this.contacts.add(newcontact);
		    System.out.println("Entry added successfully.\n");
		} else {
			System.out.println("Contact already exists.\n");
		}	
		
	}
	
	
	//////// Section 2: Remove Entry ////////
	public int getEmailIndex(String emailAddress) {
	    for (int i = 0; i < this.contacts.size(); i++) {
	      if (this.contacts.get(i).getEmailAddress().equals(emailAddress)) {
	        return i;
	      }
	    }
	    return -1;
	}
	
	
	public void removeContact(String emailAddress) {
		int emailIndex = getEmailIndex(emailAddress);
		
		if (emailIndex == -1) {
			System.out.println("Contact not found.\n");
		} else {
			this.contacts.remove(emailIndex);
			System.out.println("Contact deleted successfully.\n");
		}
	}
	
	
	
	
	
	
	
	
	//////// Section 3: Search for Entry ////////
	
	public List<Contact> searchByFirstName(String firstName) {
	    List<Contact> findContact = new ArrayList<>();
	    for (Contact contact : this.contacts) {
	      if (contact.getFirstName().contains(firstName)) {
	    	  findContact.add(contact);
	    	  System.out.println(contact);
	      }
	    }
	    return findContact;
	  }

	public List<Contact> searchByLastName(String lastName) {
	    List<Contact> findContact = new ArrayList<>();
	    for (Contact contact : this.contacts) {
	      if (contact.getLastName().contains(lastName)) {
	    	  findContact.add(contact);
	    	  System.out.println(contact);
	      }
	    }
	    return findContact;
	  }

	public List<Contact> searchByPhone(String phone) {
	    List<Contact> findContact = new ArrayList<>();
	    for (Contact contact : this.contacts) {
	      if (contact.getPhoneNumber().contains(phone)) {
	    	  findContact.add(contact);
	    	  System.out.println(contact);
	      }
	    }
	    return findContact;
	  }
	
	public List<Contact> searchByEmailAddress(String emailAddress) {
	    List<Contact> findContact = new ArrayList<>();
	    for (Contact contact : this.contacts) {
	      if (contact.getEmailAddress().contains(emailAddress)) {
	    	  findContact.add(contact);
	    	  System.out.println(contact);
	      }
	    }
	    return findContact;
	  }
	
	
	
	//////// Section 4: Print All Entries ////////
	public void printAddressBook() {
		// Checks to see if there are contacts in the address book
		if (this.contacts.size() == 0) {
			System.out.println("Sorry, no contacts in address book.\n");
		} else {
			System.out.println(contacts.toString());
		}
	}
	
	
	//////// Section 5: Remove All Entries ////////
	public void deleteBook() {
		this.contacts.clear();
		System.out.println("All contacts removed from address book.\n");
	}
}
