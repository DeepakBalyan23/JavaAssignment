package Main;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InputTypeTest {
	
	@Test
	public void testcheckInputTypeSmall() throws Exception {
		//Arrange
	    String expectedValue="Small Letter";
	    InputType pl=new InputType();
	    //Act
	    String actualValue=pl.checkInputType('a');
	    //Assert
	    assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testcheckInputTypeCapital() throws Exception {
		//Arrange
	    String expectedValue="Capital Letter";
	    InputType pl=new InputType();
	    //Act
	    String actualValue=pl.checkInputType('D');
	    //Assert
	    assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testcheckInputTypeDigit() throws Exception {
		//Arrange
	    String expectedValue="Digit";
	    InputType pl=new InputType();
	    //Act
	    String actualValue=pl.checkInputType('7');
	    //Assert
	    assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testcheckInputTypeSpecial() throws Exception {
		//Arrange
	    String expectedValue="Special Symbol";
	    InputType pl=new InputType();
	    //Act
	    String actualValue=pl.checkInputType(' ');
	    //Assert
	    assertEquals(expectedValue, actualValue);
	}
}
