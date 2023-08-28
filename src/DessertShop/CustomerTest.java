package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testGetName() {
		Customer c = new Customer("Lucas");
		assertEquals(c.getName(), "Lucas");
	}

	@Test
	void testGetId() {
		Customer c = new Customer("Lucas");
		Customer u = new Customer("Lucas");
		Customer t = new Customer("Lucas");
		Customer l = new Customer("Lucas");
		Customer d = new Customer("pedro");
		Customer e = new Customer("p");
		
		assertEquals(e.getId(), 1005);
	}

	@Test
	void testSetName() {
		Customer c = new Customer("Lucas");
		c.setName("Mijhail");;
		assertEquals(c.getName(), "Mijhail");
		
	
	}

}
