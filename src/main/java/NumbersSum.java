public class NumbersSum {
	
	public boolean isValidInput(String str) {
		if(str.matches("[0-9]+"))
			return true;
		else
			return false;
	}
	
	public String displaySum(String...strings) {
		int sum = 0;
		for(String st: strings) {
			if(isValidInput(st)) {
				sum+=Integer.parseInt(st);
			} else {
				return "Invalid Input";
			}
		}
		return sum+"";
	}
}
