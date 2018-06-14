package Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalCheckTest {

   @Test
   public void testInsideGivenRange() throws Exception {
      //Arrange
      ConditionalCheck pl=new ConditionalCheck();
      //Act
      //Assert
      assertTrue(pl.isInBetweenRange(25));
   }
   
   @Test
   public void testOutsideGivenRange() throws Exception {
      //Arrange
      ConditionalCheck pl=new ConditionalCheck();
      //Act
      //Assert
      assertFalse(pl.isInBetweenRange(31));
   }
   
   @Test
   public void testIsEven() throws Exception {
	   //Arrange
	   ConditionalCheck pl=new ConditionalCheck();
	   //Act
	   //Assert
	   assertTrue(pl.isEven(32));
   }
   
   @Test
   public void testIsNotEven() throws Exception {
	   //Arrange
	   ConditionalCheck pl=new ConditionalCheck();
	   //Act
	   //Assert
	   assertFalse(pl.isEven(31));
	}
   
   @Test
   public void testDisplayTom() throws Exception {
	   //Arrange
	   String expectedValue="Tom";
	   ConditionalCheck pl=new ConditionalCheck();
	   //Act
	   String actualValue=pl.displayString(25);
	   //Assert
	   assertEquals(expectedValue, actualValue);
	}
   
   @Test
   public void testDisplayJerry() throws Exception {
	   //Arrange
	   String expectedValue="Jerry";
	   ConditionalCheck pl=new ConditionalCheck();
	   //Act
	   String actualValue=pl.displayString(26);
	   //Assert
	   assertEquals(expectedValue, actualValue);
	}
   
   @Test
   public void testDisplayNothing() throws Exception {
	   //Arrange
	   String expectedValue="";
	   ConditionalCheck pl=new ConditionalCheck();
	   //Act
	   String actualValue=pl.displayString(32);
	   //Assert
	   assertEquals(expectedValue, actualValue);
	}
   
}



