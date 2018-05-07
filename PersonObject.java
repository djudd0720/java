package phoneBookProject;

import java.util.Comparator;

public class PersonObject {

	
	private String firstname;
	private String middlename="";
	private String lastname;
	private String phonenumber;
	private PhonebookAddresses input;
	
	
	
	
	public PersonObject() {
		super();
	}




	public PersonObject(String lastname) {
		super();
		this.lastname = lastname;
	}




	public PersonObject(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	


	public PersonObject(String firstname, String middlename, String lastname) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		
	}




	public PersonObject(String firstname, String middlename, String lastname, String phonenumber) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
	}




	public PersonObject(String firstname, String middlename, String lastname, String phonenumber, PhonebookAddresses input) {
		super();
		this.firstname = firstname;
		this.middlename=middlename;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.input = input;
	}




	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getMiddlename() {
		return middlename;
	}




	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getFullname() {
		return firstname + " " + lastname;
	}




	public void setFullname(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
	}

	public String getPhonenumber(String newPhone) {
		return phonenumber;
	}




	public void setPhonenumber(String newPhone) {
		this.phonenumber = newPhone;
	}




	public PhonebookAddresses getInput() {
		return input;
	}




	public void setInput(PhonebookAddresses input) {
		this.input = input;
	}
	
	
	public void setAddr(String st, String cty, String state, String z) {
		this.input=new PhonebookAddresses(st,cty,state,z);
		
		//System.out.println(input);
	}
	
	public void searchnames(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		//for(int i= 0; i<Personlist.length; i++) {
			
			
		}
	public static Comparator<PersonObject> nameSort = new Comparator<PersonObject>() {
		public int compare (PersonObject p1, PersonObject p2) {
			String personName1 = p1.getFullname().toUpperCase();
			String personName2 = p2.getFullname().toUpperCase();
			
			return personName1.compareTo(personName2);
		}
	};



	public static void getfullnamesplit(String name) {
		// 
		String[] fullname = name.split(" ");
		//firstname will be 0 and lastname will be 1???
		PersonObject p1 = new PersonObject(fullname[1],fullname[2]);
		//this.lastname = fullname[1];
		System.out.println(p1.getFirstname());
		System.out.println(p1.getLastname());
		
		}




	@Override
	public String toString() {
		return firstname + " " + middlename + " " + lastname
				+ ", " + phonenumber + ", Address: " + input;
	}
	
	
	
	}

