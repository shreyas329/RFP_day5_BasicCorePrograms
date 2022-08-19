package programs;
import java.util.*;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a alphabet: ");
		char alphabet = sc.next().charAt(0);
		
		switch(alphabet)
		{
		case 'a':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;

		case 'e':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;
		
		case 'i':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;
			
		case 'o':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;
			
		case 'u':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;
		case 'A':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;

		case 'E':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;
		
		case 'I':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;
			
		case 'O':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;
			
		case 'U':
			System.out.println("Alphabet "+alphabet+ " is a Vowel");
			break;
			
		default:
			System.out.println("Alphabet "+alphabet+" is a Consonant");
			break;

		}
	}

}
