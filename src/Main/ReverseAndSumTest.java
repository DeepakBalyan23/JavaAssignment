package Main;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseAndSumTest {

	@Test
	public void testIsNotGreaterThan25() throws Exception {
		//Arrange
		ReverseAndSum pl=new ReverseAndSum();
		//Act
		//Assert
		assertFalse(pl.isGreaterThan15("12"));
	}
	
	@Test
	public void testIsGreaterThan25() throws Exception {
		//Arrange
		ReverseAndSum pl=new ReverseAndSum();
		//Act
		//Assert
		assertTrue(pl.isGreaterThan15("18"));
	}
	
	@Test
	public void testSumOfEvenDigit() throws Exception {
		//Arrange
		int expectedValue = 30;
		ReverseAndSum pl=new ReverseAndSum();
		//Act
		int actualValue = pl.sumOfEvenDigit("3434834832");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testReverseSort() throws Exception {
		//Arrange
		String expectedValue = "8844433332";
		ReverseAndSum pl=new ReverseAndSum();
		//Act
		String actualValue = pl.reverseSort("3434834832");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
}
