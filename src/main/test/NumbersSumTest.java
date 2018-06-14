import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersSumTest {
	
	@Test
	 public void testIsValidInput() throws Exception {
		   //Arrange
		   NumbersSum pl=new NumbersSum();
		   //Act
		   //Assert
		   assertTrue(pl.isValidInput("2323"));
	 }
	
	@Test
	 public void testIsNotValidInput() throws Exception {
		   //Arrange
		   NumbersSum pl=new NumbersSum();
		   //Act
		   //Assert
		   assertFalse(pl.isValidInput("232b"));
	 }
	
	@Test
	public void testDisplaySumError() throws Exception {
		//Arrange
	    String expectedValue="Invalid Input";
	    NumbersSum pl=new NumbersSum();
	    //Act
	    String actualValue=pl.displaySum("234", "232", "b");
	    //Assert
	    assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testDisplaySum() throws Exception {
		//Arrange
	    String expectedValue="40";
	    NumbersSum pl=new NumbersSum();
	    //Act
	    String actualValue=pl.displaySum("22", "11", "3", "4");
	    //Assert
	    assertEquals(expectedValue, actualValue);
	}
}
