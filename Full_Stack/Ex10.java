package Full_Stack;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int square = n*n;
		int cube = n*n*n;
		System.out.println("Square = " + square);
		System.out.println("Cube = " + cube);

		sc.close();
	}

}
