package Main;
import java.util.*;

public class ConditionalCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		if(x <= 30 && x >= 20){
			if(x%2==0){
				System.out.println("Print Tom");
			} else {
				System.out.println("Print Jerry");
			}
		}
	}
}
