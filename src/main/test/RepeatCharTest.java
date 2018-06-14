import static org.junit.Assert.*;
import org.junit.Test;

public class RepeatCharTest {
	@Test
	public void testRepeat1() throws Exception {
		//Arrange
		String expectedValue = "Deepakpakpakpak";
		RepeatChar pl=new RepeatChar();
		//Act
		String actualValue = pl.repeat("Deepak", "3");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testRepeat2() throws Exception {
		//Arrange
		String expectedValue = "dpkdpkdpkdpk";
		RepeatChar pl=new RepeatChar();
		//Act
		String actualValue = pl.repeat("dpk", "3");
		System.out.println(actualValue);
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testRepeat3() throws Exception {
		//Arrange
		String expectedValue = "Invalid Number";
		RepeatChar pl=new RepeatChar();
		//Act
		String actualValue = pl.repeat("Deepak", "a");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testRepeat4() throws Exception {
		//Arrange
		String expectedValue = "Empty String";
		RepeatChar pl=new RepeatChar();
		//Act
		String actualValue = pl.repeat("", "1");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testRepeat5() throws Exception {
		//Arrange
		String expectedValue = "Number should be less than string length";
		RepeatChar pl=new RepeatChar();
		//Act
		String actualValue = pl.repeat("dpk", "4");
		//Assert
		assertEquals(expectedValue, actualValue);
	}
}
