package Full_Stack;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i=1;i<=5;i++) {
			System.out.print("Enter number " +i+ ": ");
			int num = sc.nextInt();
			sum = sum + num;
		}
		double average = sum/5.0;
		System.out.println("Average = " + average);
		sc.close();
	}

}
