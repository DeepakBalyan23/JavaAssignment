import org.mockito.internal.util.collections.ArrayUtils;

public class VowelConsonant {
	public boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c== 'u') {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isValidInput(String s) {
		if(s.matches("[A-Za-z]+")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String display(String str) {
		if(!isValidInput(str)) {
			return "Enter valid input";
		} else {
			String s = "";
			for(int i=0; i<str.length();i++) {
				if(isVowel(str.charAt(i)))
					s+="Vowel ";
				else
					s+="Consonant ";
			}
			return s;
		}
	}
	
}
