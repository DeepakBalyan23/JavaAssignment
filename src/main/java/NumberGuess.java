public class NumberGuess {
	public String predictionResult(int num) {
		final int x = 40; 
		if(num>x)
			return "Number guessed is more than original number";
		else if(num<x)
			return "Number guessed is less than original number";
		else
			return "Number guessed matches the original number";
	}
}
