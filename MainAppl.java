/*
Denise Judd
*
* Copyright (c) 2018
*
*/


package phoneBookProject;

import java.util.ArrayList;
import java.util.Scanner;


/**
* Claim Academy - Full Stack Java Project 2
*
* @version 1.00 03 May 2018
* @author Denise Judd
*/

public class MainAppl {

	public static void main(String[] args) {
		
	/* Simulate a phone book where you can retrieve phone number, address etc. for person as well as add or delete items.
	
			1. Add a record
			2. Update a record (user can update phone number)
			3. Delete a record 
			4. Search for record (search by phone number)
			5. Show all records  (in ascending order by first name)
			6. Exit the Program
	
				
	*/		
			runConsole();
			
		}
	
	public static void addRecordsToArray(ArrayList<PersonObject> persons) {
		//PhonebookAddresses addr = new PhonebookAddresses();
		PersonObject pers1 = new PersonObject("Denise", "Judd");
		pers1.setPhonenumber("9844946548");
		PersonObject pers2 = new PersonObject("Jamie", "J", "Jones", "6365775000");
		PersonObject pers3 = new PersonObject("Johnny", "Paul", "Radan", "3224556789");
		PersonObject pers4 = new PersonObject("John", "Ray", "Doe", "6366435698");
		
		System.out.println(pers1.getFirstname() + " " + pers1.getLastname());
		//System.out.println(addr.getFirstname());
		
		System.out.println(pers1.getPhonenumber(""));  //???? do I send empty quotes?
		System.out.println(pers3.getPhonenumber(""));
		System.out.println(pers2.getPhonenumber(""));
		
		//set and get Address from Object
		pers1.setAddr("1234 North St", "St Louis", "MO", "63101");
		pers2.setAddr("555 Joy St", "Destin","FL", "91243");
		pers3.setAddr("324 Main St", "St Charles", "MO","63303");
		
		System.out.println(pers1.getInput().getStaddr());
		System.out.println(pers1.getInput().getCity());
		System.out.println(pers1.getInput().getState());
		System.out.println(pers1.getInput().getZip());
		
		//create Array of Persons so I can loop through to search and also to add new entries
				
		persons.add(pers1);
		persons.add(pers2);
		persons.add(pers3);
		persons.add(pers4);
		
		
					
	}

	
	public static void runConsole() {
		
	//display add a record, update a record, delete a record selections for user
		
		boolean cont = true;
		
		PhoneBookSimulation phoneBook = new PhoneBookSimulation();
		addRecordsToArray(phoneBook.getPersons() );
		
		Scanner input = new Scanner (System.in);
		
		while (cont == true) {
			System.out.println();
			System.out.println("Select an option # 1 - 7");
			System.out.println("1. Add a record");
			System.out.println("2. Update a record");
			System.out.println("3. Search using name");
			System.out.println("4. Search using phone number");
			System.out.println("5. Show all records");
			System.out.println("6. Delete a record");
			System.out.println("7. Exit the Program");
			
			int newSelection = input.nextInt();
	
		
			switch(newSelection){
				case 1:
				
					phoneBook.addNew(); 
					break;
			
				case 2:
					phoneBook.updateRec(); 
					break;
			
				case 3:
					phoneBook.searchRec(); 
					break;
					
				case 4:
					phoneBook.searchRecByNumber();
					break;
			
				case 5:
					phoneBook.showAll();
					break;
			
				case 6:
					phoneBook.delRec();
					break;
			
				case 7:
					System.out.println();
					System.out.println("Have a Good Day!");
					cont = false;
					break;
				default:
					System.out.print("Invalid entry. Please enter digit 1 through 6");
					System.out.println();
					break;
				}
			
		}
	}
}
