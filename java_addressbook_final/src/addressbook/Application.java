package addressbook;

import java.util.Scanner;

public class Application {
	
	AddressBook addressBook = new AddressBook();
	
	
	// Prompts the user with the main menu
	public static void menu() {
		System.out.println("Please choose what you'd like to do with the database:");
        System.out.println("1) Add an entry");
        System.out.println("2) Remove an entry");
        System.out.println("3) Search for a specific entry");
        System.out.println("4) Print Address Book");
        System.out.println("5) Delete Book");
        System.out.println("6) Quit");
	}
	
	// Prompts the user with the search menu
	public static void searchMenu() {
		System.out.println("Please select an option:");
	    System.out.println("1) Search by first name");
	    System.out.println("2) Search by last name");
	    System.out.println("3) Search by phone number");
	    System.out.println("4) Search by email");
	}
	
	
	
	// Main application!
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();	
		int option;
		String firstName, lastName, phoneNumber, emailAddress;
		Scanner scanner = new Scanner(System.in);
		
		boolean stillWorking = true;
		while (stillWorking == true) {
			menu(); // Prompts the main menu
			option = scanner.nextInt();
			switch(option) {
				case 1: // User selected add entry
					addressBook.addContact(); // prompts and stores the new contact into the database
					break;
				case 2: // User selected remove entry
					String emailToDelete;
					System.out.print("Enter email address of contact to remove: ");
					emailToDelete = scanner.next();
					addressBook.removeContact(emailToDelete);
					break;
				case 3: // User selected search for a specific entry
					int searchMethod;
					String searchValue;
					
					searchMenu(); // prompts user with all of the search options
					searchMethod = scanner.nextInt();
					switch(searchMethod) {
						case 1: // User selected search by first name
							System.out.println("Enter first name to search:");
							searchValue = scanner.next();
							addressBook.searchByFirstName(searchValue);
							break;
						case 2: // User selected search by last name
							System.out.println("Enter last name to search:");
							searchValue = scanner.next();
							addressBook.searchByLastName(searchValue);
							break;
						case 3: // User selected search by phone number
							System.out.println("Enter phone number to search:");
							searchValue = scanner.next();
							addressBook.searchByPhone(searchValue);
							break;
						case 4: // User selected search by email address
							System.out.println("Enter email to search:");
							searchValue = scanner.next();
							addressBook.searchByEmailAddress(searchValue);
							break;
						default: // error validation
			                System.out.print("Please select a valid menu number 1-4.");
					}
					break;
				case 4: // User selected print address book
					addressBook.printAddressBook();
					break;	
				case 5: // User selected delete address book
					addressBook.deleteBook();
					break;
				case 6: // User selected quit
					stillWorking = false; // tells the program to break out of the loop and ultimately quits the program
					System.out.println("Thank you, the address book is now closed.");
					break;
				default: // error validation
	                System.out.print("Please select a valid menu number 1-6.");
			}
		}

	}

}
