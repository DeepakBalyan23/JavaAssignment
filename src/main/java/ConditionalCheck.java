import java.util.*;

public class ConditionalCheck {
	
	public String displayString(int num) {
		if(isInBetweenRange(num)){
			if(isEven(num))
				return "Jerry";
			else
				return "Tom";
		} else {
			return "";
		}
	}
	public boolean isInBetweenRange(int num) {
		if(num <= 30 && num >= 20) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
			return false;
	}
}
