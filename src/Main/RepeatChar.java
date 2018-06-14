package Main;

public class RepeatChar {
	
	public String repeat(String str, String num) {
		if(!num.matches("[0-9]+")) {
			return "Invalid Number";
		}else {
			int n = Integer.parseInt(num);
			int len = str.length();
			if(len==0) {
				return "Empty String";
			} else if(len<n) {
				return "Number should be less than string length";
			} else {
				for(int i=0; i<n;i++) {
					str+=str.substring(len-n, len);
				}
				return str;
			}
		}
	}
}
