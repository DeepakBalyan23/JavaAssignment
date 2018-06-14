package Main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoopTest {
	 @Test
	 public void testDisplay() throws Exception {
		   //Arrange
		   String expectedValue="0";
		   Loop pl=new Loop();
		   //Act
		   String actualValue=pl.display(0);
		   //Assert
		   assertEquals(expectedValue, actualValue);
	 }
	 
	 @Test
	 public void testDisplayError() throws Exception {
		   //Arrange
		   String expectedValue="Invalid Input";
		   Loop pl=new Loop();
		   //Act
		   String actualValue=pl.display(-5);
		   //Assert
		   assertEquals(expectedValue, actualValue);
	 }
}
