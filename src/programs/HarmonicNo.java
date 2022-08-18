package programs;
import java.util.*;
public class HarmonicNo {
	
	static float Harmonic(int N)
    {
        float harmonic = 1;

        for (int i = 2; i <= N; i++) {
            harmonic += (float)1 / i;
        }

        return harmonic;
    }
	public static void main(String[] args) {
		System.out.println("Enter N value to find harmonic no: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        System.out.print(Harmonic(N));

	}

}
