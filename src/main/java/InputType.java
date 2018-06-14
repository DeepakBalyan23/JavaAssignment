public class InputType {
	
	public String checkInputType(char ch) {
		String str = Character.toString(ch); 
		if(str.matches("[A-Z]+")) {
			return "Capital Letter";
		} else if(str.matches("[a-z]+")) {
			return "Small Letter";
		} else if(str.matches("[0-9]+")) {
			return "Digit";
		} else {
			return "Special Symbol";
		}
	}
}
