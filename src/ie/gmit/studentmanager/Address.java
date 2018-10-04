package ie.gmit.studentmanager;

public class Address {
	
	//instance variables 
	private String eircode;
	private String county;
	private String street;
	private int houseNumber;
	
	//Constructor 
	public Address(String eircode, String county, String street, int houseNumber) {
		this.eircode = eircode;
		this.county = county;
		this.street = street;
		this.houseNumber = houseNumber;
	}

	public String getEircode() {
		return eircode;
	}

	public void setEircode(String eircode) {
		this.eircode = eircode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	
	
}
