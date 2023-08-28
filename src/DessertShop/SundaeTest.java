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

class SundaeTest {

	@Test
	void testGetToppingName() {
		Sundae sun = new Sundae("Lucas", 3, 4.0, "fudge", 0.5);
		assertEquals(sun.getToppingName(), "fudge");
	}

	@Test
	void testSetToppingName() {
		Sundae sun = new Sundae("Lucas", 3, 4.0, "fudge", 0.5);
		sun.setToppingName("nuts");
		assertEquals(sun.getToppingName(), "nuts");
	}

	@Test
	void testGetToppingPrice() {
		Sundae sun = new Sundae("Lucas", 3, 4.0, "fudge", 0.5);
		assertEquals(sun.getToppingPrice(), 0.5);
	}

	@Test
	void testSetToppingPrice() {
		Sundae sun = new Sundae("Lucas", 3, 4.0, "fudge", 0.5);
		sun.setToppingPrice(0.75);
		assertEquals(sun.getToppingPrice(), 0.75);
	}
	@Test
	void testcalculateCost() {
		Sundae sun = new Sundae("Vanilla:", 3, .69, "Hot Fudge", 1.29);
		assertEquals(sun.calculateCost(),3.36);
	}
	@Test
	void testcalculateTax() {
		Sundae sun = new Sundae("Vanilla:", 3, .69, "Hot Fudge", 1.29);
		assertEquals(sun.calculateTax(),0.24359999999999998);
	}

}
