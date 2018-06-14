import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseStringTest {
	@Test
	public void testReverse1() throws Exception {
		//Arrange
		String expectedValue = "kapeeD";
		ReverseString pl=new ReverseString();
		//Act
		String actualValue = pl.reverse("Deepak");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testReverse2() throws Exception {
		//Arrange
		String expectedValue = "";
		ReverseString pl=new ReverseString();
		//Act
		String actualValue = pl.reverse("");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testReverse3() throws Exception {
		//Arrange
		String expectedValue = "a";
		ReverseString pl=new ReverseString();
		//Act
		String actualValue = pl.reverse("a");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
}
