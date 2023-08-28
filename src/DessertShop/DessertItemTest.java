/*
 *  Program: Lab6b - 
 * Names: Porter Sykes & Mijhail Britos
 * Date: 10/25/2022
 * Instructor: Brother Light
 * Description: Comparable method
 */
package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	void testGetName() {
		Candy d1 = new Candy("Lucas", 12, 5.0);
		assertEquals(d1.getName(),"Lucas");
	}

	@Test
	void testSetName() {
		Candy d1 = new Candy("Lucas", 12, 5.0);
		d1.setName("Kaka");
		assertEquals(d1.getName(), "Kaka");
		
	}
	@Test
	void getTaxPercent() {
		Candy d1 = new Candy("Lucas", 12,5.0);
		assertEquals(d1.getTaxPercent(), 7,25);
	}
	@Test 
	void setTaxPercent() {
		Candy d1 = new Candy("Lucas", 12,5.0);
		d1.setTaxPercent(8.25);
		assertEquals(d1.getTaxPercent(), 8,25);
	}
	@Test
	void compareTo() {
		Candy d1 = new Candy("Lucas", 12,5.0);
		Cookie c1 = new Cookie("Aitron", 10, 4.0);
		assertEquals(d1.compareTo(c1), 1);

	}


}
