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

class IceCreamTest {

	@Test
	void testGetScoopCount() {
		IceCream ic1 = new IceCream("Lucas", 2, 5.0);
		assertEquals(ic1.getScoopCount(), 2);
	}

	@Test
	void testSetScoopCount() {
		IceCream ic1 = new IceCream("Lucas", 2, 5.0);
		ic1.setScoopCount(8);
		assertEquals(ic1.getScoopCount(), 8);
	}

	@Test
	void testGetPricePerScoop() {
		IceCream ic1 = new IceCream("Lucas", 2, 5.0);
		assertEquals(ic1.getPricePerScoop(), 5.0);
	}

	@Test
	void testSetPricePerScoop() {
		IceCream ic1 = new IceCream("Lucas", 2, 5.0);
		ic1.setPricePerScoop(8.5);
		assertEquals(ic1.getPricePerScoop(), 8.5);
	}
	@Test
	void testcalculateCost() {
		IceCream ic1 = new IceCream("Lucas",  2, .79);
		assertEquals(ic1.calculateCost(),1.58);
	}
	@Test
	void testcalculateTax() {
		IceCream ic1 = new IceCream("Lucas",  2, .79);
		assertEquals(ic1.calculateTax(),0.11455);
	}

}
