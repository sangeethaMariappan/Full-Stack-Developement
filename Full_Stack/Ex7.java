package Full_Stack;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1 : ");
		int x = sc.nextInt();
		System.out.print("Enter number2 : ");
		int y = sc.nextInt();
		if(x>y) {
			System.out.println("x is greater than y");
		}
		else {
			System.out.println("Y is greater than x");
		}
		sc.close();
	}
}
