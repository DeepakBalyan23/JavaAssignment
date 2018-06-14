public class NumberGuess {
	public final int x =(int)(Math.random() * 100); 
	public String predictionResult(int num) {
		if(num>x)
			return "Number guessed is more than original number";
		else if(num<x)
			return "Number guessed is less than original number";
		else
			return "Number guessed matches the original number";
	}
}
