package basicJavaPrograms;
import java.util.Scanner;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next();
		int vow = 0, con = 0;
		str = str.toLowerCase();
		for (char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if( "aeiou".indexOf(ch) != -1)
					vow++;
				else
					con++;
			}
		}
		System.out.println("Vowels : " + vow + " and Consonants : " + con);
	}

}
