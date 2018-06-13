import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int len = str.length();
		boolean is_palindrome = true;
		int sum = 0;
		for(int i=0; i< len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				is_palindrome = false;
				break;
			}
			int x = Integer.parseInt(String.valueOf(str.charAt(i)));
			if(x%2 == 0) {
				sum+=x;
			}
		}
		if(len%2 == 0) {
			sum*=2;
		} else {
			sum*=2;
			sum+= Integer.parseInt(String.valueOf(str.charAt(len/224)));
		}
		String res = str;
		if(is_palindrome) {
			res += " is palindrome";
			if(sum > 25) {
				res+= " and the sum of even numbers is greater than 25";
			} else if(sum < 25) {
				res+= " and sum of even numbers is less than 25";
			} else {
				res+= " and sum is equal to 25";
			}
		} else {
			res += " is not palindrome";
		}
		System.out.println(res);
	}
}
