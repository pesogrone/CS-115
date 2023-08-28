package Week2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class MagelightUniversity {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
	Person p1 = new Person("Rachel", "1993-05-12", "F", "801-555-1212");
	   people.add(p1);
	Person p2 = new Person("Jose", "2004-12-01", "M", "480-555-1212");
		people.add(p2);
	Person p3 = new Person("Prya","2001-02-27","F", "385-555-1212");
		people.add(p3);
	Person p4 = new Person("Bob","1984-06-06","M","916-555-1212");
		people.add(p4);
	LocalDate today = LocalDate.now();
	 System.out.printf("%-15S%-6S%-10S%-10S%n","Name", "Age", "Gender", "Phone Number");
	 System.out.println("..............................................");
	 
	 for(Person person : people)
	 {
		 
		 LocalDate dob = person.getDob(); 
		Period timeDifference = Period.between(dob, today);
	 System.out.printf("%-15s%-6s%-10s%-10s%n", person.getName(), timeDifference.getYears(), person.getGender(), person.getPhone());
	 }

	}

}
