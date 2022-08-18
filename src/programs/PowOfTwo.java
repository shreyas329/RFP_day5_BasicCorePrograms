package programs;
import java.util.*;

public class PowOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter the power: ");
		Scanner sc = new Scanner(System.in);
		int pow = sc.nextInt();
		int i = 0;
	    int powerOfTwo = 2;
	    while (i <= pow)
	    {
	    	System.out.println( powerOfTwo);

	        powerOfTwo = 2 * powerOfTwo;

	        i = i + 1;

	    }
	}

}
