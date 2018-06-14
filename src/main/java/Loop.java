public class Loop {
	public static String display(int n) {
		if(n<0) {
			return "Invalid Input";
		} else {
			String s = "0";
			for(int i=0;i<=n;i++) {
				for(int j=0;j<i;j++) {
					s+=i;
				}
			}
			return s;
		}
	}
}
