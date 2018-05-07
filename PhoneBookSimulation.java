package phoneBookProject;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Scanner;

public class PhoneBookSimulation {

	ArrayList<PersonObject> persons;

	public PhoneBookSimulation() {
		this.persons = new ArrayList<>();
	}

	public ArrayList<PersonObject> getPersons() {
		return this.persons;
	}

	public void addNew() {
		// Get person's data to add from user and add to the ArrayList
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter new record using the following format: John Wilson Doe, 6369778245, 1234 James St, Richmond, MO, 63111");
		System.out.println("Be sure to include your Middle Initial. If you do not have one, use X.");

		String newRecord = input.nextLine();
		// persons.add(newRecord);

		String[] entries = newRecord.split(", "); // splits string enters by comma's. Index 0 will be the name,
		// Index 1 is phone number, and the rest is address information

		String[] name = entries[0].split(" "); // splits zero index of above string into first, middle and lastname

		PersonObject addPerson;

		// if person only enters first and lastname and no middle, add only first and
		// last name to Array
		// set middle just in case user does not include middlename

		String middle;
		if (name.length < 3) {
			middle = "";
			addPerson = new PersonObject(name[0], name[1], middle, entries[1]);
		} else {
			middle = name[1];
			addPerson = new PersonObject(name[0], name[1], name[2], entries[1]);
		}

		// add person to ArrayList, add/send street, city, state and zip to address
		// class

		PhonebookAddresses addPersonAddress = new PhonebookAddresses(entries[2], entries[3], entries[4], entries[5]);
		addPerson.setInput(addPersonAddress);
		persons.add(addPerson);

	}

	public void updateRec() {
		// Update phone # in record
		Scanner input = new Scanner(System.in);
		System.out.println("What is the old phone number? Follow format- 636222333");
		String oldPhone = input.next();
		System.out.println("What is the new phone number? Follow format - 636222333");
		String newPhone = input.next();

		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i).getPhonenumber(oldPhone).equals(oldPhone)) {
				System.out.println("found number" + oldPhone);
				persons.get(i).setPhonenumber(newPhone);
				System.out.println();
				System.out.println("Your number has been changed to: " + newPhone);
			} else {
				System.out.println();
				System.out.println("Unable to find number. Please try again or search for your record by name.");
			}
		}

	}

	public void searchRec() {
		// searches for person's record by last name

		boolean match = false;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name? Ex. Diane");
		String name1 = input.next();

		for (int i = 0; i < persons.size(); i++) {
			if (name1.equals(persons.get(i).getFirstname())) {

				System.out.println("The name you entered is a match to " + persons.get(i));
				match = true;
			}
		}

		if (!match) {
			System.out.println();
			System.out.println("There was NO match");
		}

	}

	public void searchRecByNumber() {
		// search using phone number

		boolean match = false;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your phone number? Ex. 6363335678");
		String number = input.next();

		for (int i = 0; i < persons.size(); i++) {
			if (number.equals(persons.get(i).getPhonenumber(number))) {
				System.out.println();
				System.out.println("The number you entered is a match to " + persons.get(i));
				match = true;

			}

		}

		if (!match) {
			System.out.println();
			System.out.println("There was NO match");
		}

	}

	// public void showAll() {
	// to show all records without ascending order
	// for (int j= 0; j<persons.size(); j++) {
	// System.out.println((persons.get(j)).toString());

	public void showAll() {
		// Compares names in the ArrayList persons and displays all of the record in
		// ascending order by firstname

		Collections.sort(persons, PersonObject.nameSort);

		for (PersonObject p : persons) {
			System.out.println(p);
		}

	}

	public void delRec() {
		// deletes person in phonebook and all of their information
		boolean found = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the phonenumber of the person you want to delete: ");
		String remove = input.next();

		for (int i = 0; i < persons.size(); i++) {
			if (persons.get(i).getPhonenumber(remove).equals(remove)) {
				persons.remove(i);
				found = true;
				System.out.println();
				System.out.println("User has been deleted.");
			}

		}
		if (!found) {
			System.out.println();
			System.out.println("Cannot find number. Please check the number and try again.");
		}

	}

	@Override
	public String toString() {
		return "[persons=" + persons + "]";
	}
}
