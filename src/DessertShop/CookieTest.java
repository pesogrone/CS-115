/*
 * Program: Lab3a - Dessert Shop, Part 1—Class Structure
 * Names: Porter Sykes & Mijhail Britos
 * Date: 09/27/2022
 * Instructor: Brother Light
 * Description: Dessert Shop superclass and subclass
 */
package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void testGetCookieQty() {
		Cookie ct1 = new Cookie("Lucas",12, 5.0);
		assertEquals(ct1.getCookieQty(), 12);
	}

	@Test
	void testSetCookieQty() {
		Cookie ct1 = new Cookie("Lucas",12, 5.0);
		ct1.setCookieQty(8);
		assertEquals(ct1.getCookieQty(), 8);
	}

	@Test
	void testGetPricePerDozen() {
		Cookie ct2 = new Cookie("Lucas",12, 5.0);
		assertEquals(ct2.getPricePerDozen(),5.0);
	}

	@Test
	void testSetPricePerDozen() {
		Cookie ct2 = new Cookie("Lucas",12, 5.0);
		ct2.setPricePerDozen(6.0);
		assertEquals(ct2.getPricePerDozen(), 6.0);
	}
	@Test
	void testcalculateCost() {
		Cookie ct2 = new Cookie("Lucas",12, 3.0);
		assertEquals(ct2.calculateCost(),3.0);
	}
	@Test
	void testcalculateTax() {
		Cookie ct2 = new Cookie("Lucas", 6, 3.99);
		assertEquals(ct2.calculateTax(),0.1446375);
	}@Test
	void testisSameAs(){
		Cookie ct2 = new Cookie("Lucas", 6, 3.99);
		Cookie ct3 = new Cookie("Lucas", 5, 3.99);
		Cookie ct4 = new Cookie("Lucas", 6, 3.98);
		assertEquals(ct2.isSameAs(ct3), true);
		assertEquals(ct2.isSameAs(ct4), false);
	}

}
