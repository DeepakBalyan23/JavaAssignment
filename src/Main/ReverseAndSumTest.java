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
		ReverseAndSum pl=new ReverseAndSum();
		//Act
		//Assert
		assertEquals(30, pl.sumOfEvenDigit("3434834832"));
	}
	
	@Test
	public void testReverseSort() throws Exception {
		//Arrange
		ReverseAndSum pl=new ReverseAndSum();
		//Act
		//Assert
		assertEquals("8844433332", pl.reverseSort("3434834832"));
	}
}
