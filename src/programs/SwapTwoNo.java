package programs;
import java.util.*;

public class SwapTwoNo {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A: ");
		int A = sc.nextInt();
		
		System.out.println("Enter value of B: ");
		int B = sc.nextInt();
		
		System.out.println("Values of A and B before swaping");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		
		temp = A;
		A = B;
		B = temp;
		
		System.out.println("Values of A and B after swaping");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
	}

}
