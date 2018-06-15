import static org.junit.Assert.*;

import org.junit.Test;

public class NumberGuessTest {
	
	@Test
	public void testPredictionResult1() throws Exception {
		//Arrange
		String expectedValue = "Number guessed is more than original number";
		NumberGuess pl=new NumberGuess();
		//Act
		String actualValue = pl.predictionResult(50);
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testPredictionResult2() throws Exception {
		//Arrange
		String expectedValue = "Number guessed is less than original number";
		NumberGuess pl=new NumberGuess();
		//Act
		String actualValue = pl.predictionResult(30);
		//Assert
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testPredictionResult3() throws Exception {
		//Arrange
		String expectedValue = "Number guessed matches the original number";
		NumberGuess pl=new NumberGuess();
		//Act
		String actualValue = pl.predictionResult(40);
		//Assert
		assertEquals(expectedValue, actualValue);
	}
}
