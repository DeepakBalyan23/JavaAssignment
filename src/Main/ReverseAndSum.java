package Main;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAndSum {
	
	public boolean isGreaterThan15(String num) {
		if(Integer.parseInt(num)>15)
			return true;
		else
			return false;
	}
	
	public int sumOfEvenDigit(String str) {
		int sum=0;
		for(int i=0; i<str.length();i++) {
			int x = Integer.parseInt(Character.toString(str.charAt(i)));
			if(x%2==0)
				sum+=x;
		}
		return sum;
	}
	
	public String reverseSort(String str) {
		String arr[] = str.split("");
		Arrays.sort(arr, Collections.reverseOrder());
		return Arrays.toString(arr).replaceAll("[,\\[\\] ]", "");
	}
	
	public void display(String str) {
		System.out.println("Sorted number in non-increasing order : " + reverseSort(str));
		System.out.println("Sum of even numbers : "+sumOfEvenDigit(str));
		System.out.println(isGreaterThan15(sumOfEvenDigit(str)+""));
	}
}
