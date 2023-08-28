package Week2;

import java.time.LocalDate;

public class Person {

	//Attributes
	private String name;
	private LocalDate dob;
	private String gender;
	private String phone;
	
	//Constructors
	Person() {
		name = "";
		dob = LocalDate.parse("1900-01-01");
		gender = "";
		phone = "";		
	}//end of constructor
	
	Person(String n, String d, String g, String p) {
		name = n;
		dob = LocalDate.parse(d);
		gender = g;
		phone = p;		
	}//end of constructor Person
	
	//Methods
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(String d) {
		dob = LocalDate.parse(d);
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String g) {
		gender = g;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone (String p) {
		phone = p;
	}
	
}//end of class Person