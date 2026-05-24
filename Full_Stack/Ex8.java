package Full_Stack;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number1 : ");
		int x=sc.nextInt();
		System.out.print("Enter the number2 : ");
		int y=sc.nextInt();
		System.out.print("Enter the number3 : ");
		int z=sc.nextInt();
		
		if(x>y && x>z) {
			System.out.println("Number1 is Greatest");
		}
		else if(y>x && y>z) {
			System.out.println("Number2 is Greatest");
		}
		else {
			System.out.println("Number3 is Greatest");
		}
		sc.close();
	}

}
