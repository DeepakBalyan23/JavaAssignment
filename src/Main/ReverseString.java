package Main;

public class ReverseString {
	public String reverse(String str) {
		char arr[]=str.toCharArray();
		for(int i=0; i<arr.length/2;i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return String.valueOf(arr);
	}
}