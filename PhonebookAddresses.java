package phoneBookProject;

public class PhonebookAddresses {
	
	private String staddr;
	private String city;
	private String state;
	private String zip;
	
	//Constructors
	
	public PhonebookAddresses() {
		super();
	}


	public PhonebookAddresses(String staddr, String city, String state, String zip) {
		super();
		
		this.staddr = staddr;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	//Getters and Setters
	
	public String getStaddr() {
		return staddr;
	}


	public void setStaddr(String staddr) {
		this.staddr = staddr;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	@Override
	public String toString() {
		return staddr + ", " + city + ", " + state + ", " + zip;
	}
	
}
