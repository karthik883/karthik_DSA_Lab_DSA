package stackparanthesis;

import java.util.Scanner;

public class Driver_App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression");
		String  input = sc.next();
		
		Mystack ms = new Mystack();
		if(input.length()%2==1) {
			System.out.println("Incomplete expression");
		}
		else {
			if(ms.validate(input)) {
				System.out.println("valid expression");
			}
			else {
			    System.out.println("Invalid expression");
			}
		}
		
	}

}
