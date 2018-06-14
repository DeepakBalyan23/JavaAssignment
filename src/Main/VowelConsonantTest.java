package Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class VowelConsonantTest {

   @Test
   public void testValidInput() throws Exception {
      //Arrange
      VowelConsonant pl=new VowelConsonant();
      //Act
      //Assert
      assertTrue(pl.isValidInput("wedwesdcsd"));
   }
   
   @Test
   public void testInvalidInput() throws Exception {
	   //Arrange
	   VowelConsonant pl=new VowelConsonant();
	   //Act
	   //Assert
	   assertFalse(pl.isValidInput("wedwesd9csd"));
   }
   
   @Test
   public void testisVowel() throws Exception {
	   //Arrange
	   VowelConsonant pl=new VowelConsonant();
	   //Act
	   //Assert
	   assertTrue(pl.isVowel('a'));
   }
   
   @Test
   public void testisNotVowel() throws Exception {
	   //Arrange
	   VowelConsonant pl=new VowelConsonant();
	   //Act
	   //Assert
	   assertFalse(pl.isVowel('d'));
   }
   
   @Test
   public void testDisplayError() throws Exception {
	   //Arrange
	   String expectedValue="Enter valid input";
	   VowelConsonant pl=new VowelConsonant();
	   //Act
	   String actualValue=pl.display("fdvdf3");
	   //Assert
	   assertEquals(expectedValue, actualValue);
   }
   
   @Test
   public void testDisplayResult() throws Exception {
	   //Arrange
	   String expectedValue="Vowel Consonant Vowel ";
	   VowelConsonant pl=new VowelConsonant();
	   //Act
	   String actualValue=pl.display("ade");
	   //Assert
	   assertEquals(expectedValue, actualValue);
   }
}



