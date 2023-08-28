package Week2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testGetName() {
		Person p = new Person("Jhon", "1998-07-23", "M", "385-267-8705");
		assertEquals(p.getName(),"Jhon");
	}

	@Test
	void testSetName() {
		Person p = new Person("Jhon", "1998-07-23", "M", "385-267-8705");
		p.setName("Robert");
		assertEquals(p.getName(),"Robert");
	}

	@Test
	void testGetDob() {
		Person p = new Person("Jhon", "1998-07-23", "M", "385-267-8705");
		LocalDate dob = p.getDob();
		assertEquals(dob, LocalDate.parse("1998-07-23"));
	}

	@Test
	void testSetDob() {
		Person p = new Person("Jhon", "1998-07-23", "M", "385-267-8705");
	  p.setDob("1999-07-22");
		assertEquals(p.getDob(),LocalDate.parse("1999-07-22"));
	}

	@Test
	void testGetGender() {
		Person p = new Person("Jhon", "1998-07-23", "M", "385-267-8705");
		assertEquals(p.getGender(),"M");
	}

	@Test
	
	void testSetGender() {
		Person p = new Person("Jhon", "1998-07-23", "M", "385-267-8705");
		p.setGender("F");
		assertEquals(p.getGender(),"F");
	}

	@Test
	void testGetPhone() {
		Person p = new Person("Jhon", "1998-07-23", "M", "385-267-8705");
		assertEquals(p.getPhone(),"385-267-8705");
	}

	@Test
	void testSetPhone() {
		Person p = new Person("Jhon", "1998-07-23", "M", "385-267-8705");
		p.setPhone("385-543-6576");
		assertEquals(p.getPhone(),"385-543-6576");
	}

}
