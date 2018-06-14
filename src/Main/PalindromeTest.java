package Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

   @Test
   public void testValidPalindrome() throws Exception {
      //Arrange
      boolean expectedValue=true;
      Palindrome pl=new Palindrome();
      //Act
      boolean actualValue=pl.isPalindrome("2345432");
      //Assert
      assertEquals(expectedValue, actualValue);
   }
   
   @Test
   public void testInalidPalindrome() throws Exception {
      //Arrange
      boolean expectedValue=false;
      Palindrome pl=new Palindrome();
      //Act
      boolean actualValue=pl.isPalindrome("234542");
      //Assert
      assertEquals(expectedValue, actualValue);
   }
   
   @Test
   public void testGetEvenLetterSum() throws Exception {
      //Arrange
      int expectedValue=12;
      Palindrome pl=new Palindrome();
      //Act
      int actualValue=pl.getEvenLetterSum("2345432");
      //Assert
      assertEquals(expectedValue, actualValue);
   }
   
   @Test
   public void testDisplayResult1() throws Exception {
      //Arrange
      String expectedValue="2345432 is palindrome and sum of even numbers is less than 25";
      Palindrome pl=new Palindrome();
      //Act
      String actualValue=pl.displayResult("2345432");
      //Assert
      assertEquals(expectedValue, actualValue);
   }
   
   @Test
   public void testDisplayResult2() throws Exception {
      //Arrange
      String expectedValue="28634543682 is palindrome and the sum of even numbers is greater than 25";
      Palindrome pl=new Palindrome();
      //Act
      String actualValue=pl.displayResult("28634543682");
      //Assert
      assertEquals(expectedValue, actualValue);
   }
   
   @Test
   public void testDisplayResult3() throws Exception {
      //Arrange
      String expectedValue="234542 is not palindrome";
      Palindrome pl=new Palindrome();
      //Act
      String actualValue=pl.displayResult("234542");
      //Assert
      assertEquals(expectedValue, actualValue);
   }
}



