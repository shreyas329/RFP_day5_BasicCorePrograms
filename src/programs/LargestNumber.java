package programs;
import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is greater among three numbers");
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println(num2+" is greater among three numbers");
		}
		else
		{
			System.out.println(num3+" is greater among three numbers");
		}

	}

}
