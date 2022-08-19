package programs;
import java.util.*;
public class QuotientAndRemainder {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a Divident:");
	        int dividend = sc.nextInt();

	        Scanner sc1 = new Scanner(System.in);
	        System.out.println("Enter a Divisor:");
	        int divisor = sc1.nextInt();

	        int quotient = dividend / divisor;
	        int remainder = dividend % divisor;

	        System.out.println("Quotient = " + quotient);
	        System.out.println("Remainder = " + remainder);

	}

}
