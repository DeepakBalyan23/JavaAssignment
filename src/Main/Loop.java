package Main;

public class Loop {
	public static String display(int n) {
		String s = "";
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				s+=i;
			}
		}
		return s;
	}
}
