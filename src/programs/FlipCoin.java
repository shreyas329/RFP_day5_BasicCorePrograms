package programs;
import java.util.*;
public class FlipCoin {

	public static void main(String[] args)
	{
		int head = 0;
		int tail = 0;
		
		System.out.println("Enter how many times coin should flip : ");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		for(int i=0; i<time; i++)
		{
			float val = (float) (Math.random()%2 +0);
			if (val<0.5)
			{
				System.out.println("Tail");
				tail++;
			}
			else
			{
				System.out.println("HEad");
				head++;
			}
		}
		
		double percentage_head =  (100*head)/time;
		System.out.println("Percenatage of getting head is: "+percentage_head+"%");
		
		double percentage_tail =  (100*tail)/time;
		System.out.println("Percenatage of getting tail is: "+percentage_tail+"%");
	}

}
