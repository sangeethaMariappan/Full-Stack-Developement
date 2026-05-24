package Full_Stack;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Principal Amount: ");
		int p = sc.nextInt();
		System.out.print("Rate of Interest: ");
		int r = sc.nextInt();
		System.out.print("Time: ");
		int n = sc.nextInt();
		int si = (p*r*n)/100;
		System.out.println("Simple Interest = " + si);
		sc.close();
	}

}
