package Main;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumberGuessTest {
	
	@Test
	public void testPredictionResult1() throws Exception {
		//Arrange
		String expectedValue = "Number guessed is more than original number";
		NumberGuess pl=new NumberGuess();
		int y = pl.x + 2;
		//Act
		String actualValue = pl.predictionResult(y);
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testPredictionResult2() throws Exception {
		//Arrange
		String expectedValue = "Number guessed is less than original number";
		NumberGuess pl=new NumberGuess();
		int y = pl.x - 2;
		//Act
		String actualValue = pl.predictionResult(y);
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testPredictionResult3() throws Exception {
		//Arrange
		String expectedValue = "Number guessed matches the original number";
		NumberGuess pl=new NumberGuess();
		int y = pl.x;
		//Act
		String actualValue = pl.predictionResult(y);
		//Assert
		assertEquals(expectedValue, actualValue);
	}
}
